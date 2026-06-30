package xj1;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList f454809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f454810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.c0 f454811f;

    public o(com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList, java.util.List list, androidx.recyclerview.widget.c0 c0Var) {
        this.f454809d = appBrandCollectionDisplayVerticalList;
        this.f454810e = list;
        this.f454811f = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xj1.b0 b0Var = this.f454809d.f89640i;
        if (b0Var != null) {
            java.util.List list = this.f454810e;
            kotlin.jvm.internal.o.g(list, "list");
            synchronized (b0Var.f454780d) {
                b0Var.f454780d.clear();
                b0Var.f454780d.addAll(list);
            }
            this.f454811f.b(b0Var);
        }
    }
}
