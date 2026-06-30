package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gj f117897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(com.tencent.mm.plugin.finder.live.widget.gj gjVar) {
        super(1);
        this.f117897d = gjVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.live.widget.gj gjVar = this.f117897d;
        gjVar.f118451o.setEnabled(booleanValue);
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.widget.TextView textView = gjVar.f118451o;
        kotlin.jvm.internal.o.f(textView, "access$getOkBtn$p(...)");
        r4Var.Y2(textView, booleanValue, true);
        return jz5.f0.f302826a;
    }
}
