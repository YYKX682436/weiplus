package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class a10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f133702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f133703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t10 f133704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f133705g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f133706h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a10(boolean z17, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.viewmodel.component.t10 t10Var, in5.s0 s0Var, com.tencent.mm.ui.MMActivity mMActivity) {
        super(0);
        this.f133702d = z17;
        this.f133703e = baseFinderFeed;
        this.f133704f = t10Var;
        this.f133705g = s0Var;
        this.f133706h = mMActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f133702d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f133703e;
        if (z17) {
            r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
            if (object_extend != null) {
                object_extend.set(30, java.lang.Long.valueOf(object_extend.getLong(30) & (-2049)));
            }
            baseFinderFeed.getFeedObject().getFeedObject().setPermissionFlag(baseFinderFeed.getFeedObject().getFeedObject().getPermissionFlag() | 2048);
        } else {
            baseFinderFeed.getFeedObject().getFeedObject().setPermissionFlag(baseFinderFeed.getFeedObject().getFeedObject().getPermissionFlag() & (-2049));
        }
        com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f133704f.f135962h;
        in5.s0 s0Var = this.f133705g;
        if (k8Var != null) {
            com.tencent.mm.ui.MMActivity activity = this.f133706h;
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.u4 u4Var = com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.A;
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) a17).O6(s0Var, k8Var, true);
        }
        bb2.p0 p0Var = bb2.p0.f18940a;
        android.view.View itemView = s0Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        bb2.a1 a18 = p0Var.a(itemView);
        if (a18 != null) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            androidx.lifecycle.c1 a19 = pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
            kotlin.jvm.internal.o.f(a19, "get(...)");
            java.lang.Object obj = s0Var.f293125i;
            kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.u4 u4Var2 = com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.A;
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) a19).e7(s0Var, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj, false);
            a18.a(true);
        }
        return jz5.f0.f302826a;
    }
}
