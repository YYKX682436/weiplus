package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var) {
        super(0);
        this.f154371d = s4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = this.f154371d;
        textPaint.setTextSize(s4Var.f154553e.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3) * i65.a.q(s4Var.f154553e));
        return textPaint;
    }
}
