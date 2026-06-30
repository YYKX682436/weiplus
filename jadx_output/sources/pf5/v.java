package pf5;

/* loaded from: classes5.dex */
public final class v extends androidx.lifecycle.j1 {

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.m1 f353938c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f353939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.lifecycle.m1 owner, androidx.lifecycle.f1 factory) {
        super(owner.getViewModel(), factory);
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(factory, "factory");
        this.f353938c = owner;
        java.lang.Object obj = pf5.z.f353951d.get(owner.getViewModel());
        kotlin.jvm.internal.o.d(obj);
        this.f353939d = obj;
    }

    public final pf5.c c(java.lang.Class apiClass) {
        kotlin.jvm.internal.o.g(apiClass, "apiClass");
        pf5.z zVar = pf5.z.f353948a;
        java.lang.Object obj = pf5.z.f353949b.get(apiClass.getName());
        if (obj != null) {
            java.lang.Object a17 = a((java.lang.Class) obj);
            kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type T of com.tencent.mm.ui.component.UICProviderImpl.ViewModelProviderProxy.api");
            return (pf5.c) a17;
        }
        throw new java.lang.RuntimeException(apiClass + " never import any instance.");
    }

    public final pf5.c d(java.lang.Class apiClass) {
        kotlin.jvm.internal.o.g(apiClass, "apiClass");
        pf5.z zVar = pf5.z.f353948a;
        java.lang.Object obj = pf5.z.f353949b.get(apiClass.getName());
        if (obj == null) {
            return null;
        }
        java.lang.Object e17 = e((java.lang.Class) obj);
        if (e17 instanceof pf5.c) {
            return (pf5.c) e17;
        }
        return null;
    }

    public final pf5.b0 e(java.lang.Class uicClass) {
        kotlin.jvm.internal.o.g(uicClass, "uicClass");
        java.lang.Object obj = this.f353939d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, T of com.tencent.mm.ui.component.UICProviderImpl.ViewModelProviderProxy.getOrNull>");
        java.lang.Object obj2 = ((java.util.Map) obj).get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + uicClass.getCanonicalName());
        if (obj2 == null) {
            androidx.lifecycle.l1 viewModel = this.f353938c.getViewModel();
            pf5.v0 v0Var = viewModel instanceof pf5.v0 ? (pf5.v0) viewModel : null;
            if (v0Var != null) {
                jz5.g gVar = v0Var.f353944f;
                if (((java.util.HashSet) ((jz5.n) gVar).getValue()).contains(uicClass)) {
                    java.lang.String str = "getOrNull: new instance uicClass=" + uicClass + ", lazyInitSize=" + ((java.util.HashSet) ((jz5.n) gVar).getValue()).size();
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    if (pf5.t.f353933a != null) {
                        java.lang.Object[] obj3 = java.util.Arrays.copyOf(objArr, 0);
                        kotlin.jvm.internal.o.g(obj3, "obj");
                        com.tencent.mars.xlog.Log.i("UICProvider", str, obj3);
                    }
                    obj2 = a(uicClass);
                }
            }
        }
        return (pf5.b0) obj2;
    }
}
