package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qn extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.zn f119538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f119540f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn(com.tencent.mm.plugin.finder.live.widget.zn znVar, java.lang.String str, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f119538d = znVar;
        this.f119539e = str;
        this.f119540f = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.f119538d;
        com.tencent.mars.xlog.Log.i(znVar.f120582b, "showBlurBg username:" + this.f119539e + ",thumbUrl:" + ((java.lang.String) this.f119540f.f310123d) + " blurBgView.elevation:" + znVar.f120584d.getElevation());
        return jz5.f0.f302826a;
    }
}
