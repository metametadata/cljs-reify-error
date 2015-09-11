**Steps:**

1) Auto build:

```
$ lein trampoline run -m clojure.main watch.clj
```

2) Run:

```
$ node js/out.js
```

**Expected:** No errors.

**Actual output:**

<pre>
hey!
/Users/yuri/Dropbox/dev/cljs-reify-error/js/out.js:19660
ersistentVector(null, 4, 5, cljs.core.PersistentVector.EMPTY_NODE, [self__.v, 
                                                                    ^
ReferenceError: self__ is not defined
    at obj_7251.undefined.my.core.t_my$core7247.my.core.t_my$core7247.meth.a (/Users/yuri/Dropbox/dev/cljs-reify-error/js/out.js:19660:99)
    at obj_7251.undefined.my.core.t_my$core7247.my.core.t_my$core7247.meth.c [as meth] (/Users/yuri/Dropbox/dev/cljs-reify-error/js/out.js:19669:18)
    at Object.<anonymous> (/Users/yuri/Dropbox/dev/cljs-reify-error/js/out.js:19697:39)
    at Module._compile (module.js:460:26)
    at Object.Module._extensions..js (module.js:478:10)
    at Module.load (module.js:355:32)
    at Function.Module._load (module.js:310:12)
    at Function.Module.runMain (module.js:501:10)
    at startup (node.js:129:16)
    at node.js:814:3
</pre>
