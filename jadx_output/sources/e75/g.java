package e75;

/* loaded from: classes12.dex */
public abstract class g {
    public static final e75.b Companion = new e75.b(null);
    public static final java.lang.String DefaultThread = "%DefaultThread%";
    public static final java.lang.String MainThread = "%MainThread%";
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver> observerMap = new java.util.concurrent.ConcurrentHashMap<>(1);

    public static /* synthetic */ com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver createLifecycleBoundObserver$default(e75.g gVar, androidx.lifecycle.y yVar, e75.a aVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLifecycleBoundObserver");
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        return gVar.createLifecycleBoundObserver(yVar, aVar, str);
    }

    public com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver createLifecycleBoundObserver(androidx.lifecycle.y owner, e75.a observer, java.lang.String str) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        return new com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver(this, owner, observer, str);
    }

    public abstract java.lang.String getLogTag();

    public boolean hasObserver() {
        boolean z17;
        synchronized (this.observerMap) {
            z17 = !this.observerMap.isEmpty();
        }
        return z17;
    }

    public void notify(java.lang.Object event) {
        kotlin.jvm.internal.o.g(event, "event");
        notify(kz5.b0.c(event));
    }

    public void notifyAny(java.lang.Object event) {
        kotlin.jvm.internal.o.g(event, "event");
        notify(event);
    }

    public void observe(androidx.lifecycle.y lifecycleOwner, e75.a observer) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(observer, "observer");
        synchronized (this.observerMap) {
            com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver mvvmObserverOwner$LifecycleBoundObserver = this.observerMap.get(java.lang.Integer.valueOf(observer.hashCode()));
            if (mvvmObserverOwner$LifecycleBoundObserver != null) {
                androidx.lifecycle.y yVar = mvvmObserverOwner$LifecycleBoundObserver.f192405d;
                if (!(!kotlin.jvm.internal.o.b(yVar, lifecycleOwner))) {
                    yVar = null;
                }
                if (yVar != null) {
                    com.tencent.mars.xlog.Log.e(getLogTag(), "Cannot add the same observer with different lifecycles");
                    return;
                } else {
                    com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver remove = this.observerMap.remove(java.lang.Integer.valueOf(observer.hashCode()));
                    if (remove != null) {
                        d75.b.g(new e75.d(remove));
                    }
                }
            }
            com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver createLifecycleBoundObserver$default = createLifecycleBoundObserver$default(this, lifecycleOwner, observer, null, 4, null);
            d75.b.g(new e75.c(createLifecycleBoundObserver$default, createLifecycleBoundObserver$default.f192408g));
            this.observerMap.put(java.lang.Integer.valueOf(observer.hashCode()), createLifecycleBoundObserver$default);
            getLogTag();
            observer.hashCode();
        }
    }

    public void removeObserver(e75.a observer) {
        kotlin.jvm.internal.o.g(observer, "observer");
        synchronized (this.observerMap) {
            com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver remove = this.observerMap.remove(java.lang.Integer.valueOf(observer.hashCode()));
            if (remove != null) {
                d75.b.g(new e75.d(remove));
                getLogTag();
                observer.hashCode();
            }
        }
    }

    public void uiObserve(androidx.lifecycle.y lifecycleOwner, e75.a observer) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(observer, "observer");
        observe(lifecycleOwner, MainThread, observer);
    }

    public void notify(java.util.List<java.lang.Object> eventList) {
        kotlin.jvm.internal.o.g(eventList, "eventList");
        try {
            if ((!this.observerMap.isEmpty()) && (!eventList.isEmpty())) {
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver> concurrentHashMap = this.observerMap;
                java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.size());
                java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver>> it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    ((com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver) ((java.util.Map.Entry) it6.next()).getValue()).a(eventList);
                }
                getLogTag();
                arrayList.size();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(getLogTag(), e17, "doNotify", new java.lang.Object[0]);
        }
    }

    public void observe(androidx.lifecycle.y lifecycleOwner, java.lang.String threadTag, e75.a observer) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(threadTag, "threadTag");
        kotlin.jvm.internal.o.g(observer, "observer");
        synchronized (this.observerMap) {
            com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver mvvmObserverOwner$LifecycleBoundObserver = this.observerMap.get(java.lang.Integer.valueOf(observer.hashCode()));
            if (mvvmObserverOwner$LifecycleBoundObserver != null) {
                androidx.lifecycle.y yVar = mvvmObserverOwner$LifecycleBoundObserver.f192405d;
                if (!(!kotlin.jvm.internal.o.b(yVar, lifecycleOwner))) {
                    yVar = null;
                }
                if (yVar != null) {
                    com.tencent.mars.xlog.Log.e(getLogTag(), "Cannot add the same observer with different lifecycles");
                    return;
                } else {
                    com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver remove = this.observerMap.remove(java.lang.Integer.valueOf(observer.hashCode()));
                    if (remove != null) {
                        d75.b.g(new e75.d(remove));
                    }
                }
            }
            com.tencent.mm.sdk.observer.MvvmObserverOwner$LifecycleBoundObserver createLifecycleBoundObserver = createLifecycleBoundObserver(lifecycleOwner, observer, threadTag);
            d75.b.g(new e75.c(createLifecycleBoundObserver, createLifecycleBoundObserver.f192408g));
            this.observerMap.put(java.lang.Integer.valueOf(observer.hashCode()), createLifecycleBoundObserver);
            getLogTag();
            observer.hashCode();
        }
    }
}
