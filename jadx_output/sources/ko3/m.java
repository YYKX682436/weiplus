package ko3;

/* loaded from: classes13.dex */
public final class m extends ko3.o {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.InvocationHandler f309987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko3.u f309988d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ko3.u uVar, android.os.IInterface iInterface) {
        super(uVar, iInterface);
        this.f309988d = uVar;
        this.f309987c = new ko3.l(this);
    }

    @Override // ko3.o
    public android.os.IBinder a() {
        return (android.os.IBinder) java.lang.reflect.Proxy.newProxyInstance(ko3.u.f310001g, new java.lang.Class[]{android.os.IBinder.class}, this.f309987c);
    }

    @Override // ko3.o, java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        ko3.j0 j0Var;
        if (ko3.u.f310009o.equals(method.getName()) && objArr != null && objArr.length >= 2) {
            java.lang.Object obj2 = objArr[1];
            try {
                java.lang.String str = ko3.u.f310008n;
                android.util.LruCache lruCache = ko3.k0.f309980a;
                try {
                    if (!java.lang.Class.forName(str).isAssignableFrom(obj2.getClass())) {
                        throw new java.lang.IllegalStateException("mismatched conn class: " + obj2.getClass() + ", give up intercepting.");
                    }
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ko3.k0.e(obj2, ko3.u.f310007m);
                    java.lang.Object obj3 = weakReference.get();
                    if (obj3 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AED", "lost viewRootImpl instance, give up intercepting.");
                    } else {
                        java.lang.Object e17 = ko3.k0.e(ko3.k0.a(obj3, ko3.u.f310010p, null, new java.lang.Object[0]), "mHandler");
                        java.lang.String str2 = ko3.u.f310006l;
                        android.os.Handler.Callback callback = (android.os.Handler.Callback) ko3.k0.e(e17, str2);
                        if (!(callback instanceof ko3.k)) {
                            ko3.k0.f(e17, str2, new ko3.k(this.f309988d, obj3, callback));
                        }
                        synchronized (this.f309988d.f310022b) {
                            android.os.IBinder iBinder = (android.os.IBinder) ((java.util.WeakHashMap) this.f309988d.f310022b).get(obj3);
                            if (iBinder == null) {
                                ko3.i iVar = new ko3.i(this.f309988d, weakReference.get(), ((android.os.IInterface) obj2).asBinder());
                                ((java.util.WeakHashMap) this.f309988d.f310022b).put(obj3, iVar);
                                iBinder = iVar;
                            }
                            try {
                                objArr[1] = (android.os.IInterface) ko3.k0.b(java.lang.Class.forName(str + "$Stub"), "asInterface", new java.lang.Class[]{android.os.IBinder.class}, iBinder);
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AED", th6, "unexpected exception.", new java.lang.Object[0]);
                ko3.u.d(this.f309988d, th6);
                objArr[1] = obj2;
            }
        }
        return super.invoke(obj, method, objArr);
    }
}
