package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ag extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f117764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gg f117765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(int i17, com.tencent.mm.plugin.finder.live.widget.gg ggVar) {
        super(1);
        this.f117764d = i17;
        this.f117765e = ggVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l wecoinClickCallBack;
        ((java.lang.Boolean) obj).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showWecoinInfo charge ok:");
        sb6.append(this.f117764d);
        sb6.append(", ");
        com.tencent.mm.plugin.finder.live.widget.gg ggVar = this.f117765e;
        sb6.append(ggVar.f118432m);
        com.tencent.mars.xlog.Log.i("FinderLiveFansJoinWidget", sb6.toString());
        if (ggVar.f118432m == null && (wecoinClickCallBack = ggVar.getWecoinClickCallBack()) != null) {
            wecoinClickCallBack.invoke(ggVar.f118443x);
        }
        return jz5.f0.f302826a;
    }
}
