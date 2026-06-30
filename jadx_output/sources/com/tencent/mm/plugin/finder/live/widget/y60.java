package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yb f120419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f120421f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y60(com.tencent.mm.plugin.finder.live.widget.yb ybVar, java.lang.String str, com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        super(0);
        this.f120419d = ybVar;
        this.f120420e = str;
        this.f120421f = z60Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f120419d.H.f120117a.f118090d;
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "showCoLiveSettingDialog: creating task, settlementMode=" + i17);
        re2.h1 h1Var = new re2.h1(i17, this.f120420e);
        re2.j1.f394437a.b(h1Var);
        az2.c cVar = az2.f.f16125d;
        com.tencent.mm.plugin.finder.live.widget.z60 z60Var = this.f120421f;
        android.content.Context context = z60Var.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        az2.f a17 = az2.c.a(cVar, context, null, 0L, null, 8, null);
        a17.a();
        h1Var.k(new com.tencent.mm.plugin.finder.live.widget.v60(z60Var, a17, h1Var), new com.tencent.mm.plugin.finder.live.widget.x60(z60Var, a17, h1Var));
        return jz5.f0.f302826a;
    }
}
