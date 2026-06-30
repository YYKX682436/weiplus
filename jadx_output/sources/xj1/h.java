package xj1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f454790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList f454791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f454792f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f454793g;

    public h(java.util.List list, com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList, boolean z17, yz5.a aVar) {
        this.f454790d = list;
        this.f454791e = appBrandCollectionDisplayVerticalList;
        this.f454792f = z17;
        this.f454793g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list = this.f454790d;
        boolean isEmpty = list.isEmpty();
        com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList appBrandCollectionDisplayVerticalList = this.f454791e;
        if (isEmpty) {
            androidx.activity.k activity = appBrandCollectionDisplayVerticalList.getActivity();
            zj1.a aVar = activity instanceof zj1.a ? (zj1.a) activity : null;
            if (aVar != null) {
                aVar.H3(false);
            }
        } else {
            xj1.b0 b0Var = appBrandCollectionDisplayVerticalList.f89640i;
            kotlin.jvm.internal.o.d(b0Var);
            synchronized (b0Var.f454780d) {
                b0Var.f454780d.clear();
                b0Var.f454780d.addAll(list);
            }
            if (this.f454792f) {
                xj1.b0 b0Var2 = appBrandCollectionDisplayVerticalList.f89640i;
                kotlin.jvm.internal.o.d(b0Var2);
                b0Var2.notifyItemRangeChanged(0, list.size());
            } else {
                xj1.b0 b0Var3 = appBrandCollectionDisplayVerticalList.f89640i;
                kotlin.jvm.internal.o.d(b0Var3);
                b0Var3.notifyItemRangeInserted(0, list.size());
            }
        }
        java.lang.Runnable runnable = (java.lang.Runnable) this.f454793g.invoke();
        if (runnable != null) {
            runnable.run();
        }
    }
}
