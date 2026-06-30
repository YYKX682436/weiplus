package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v6 f114528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f114529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(com.tencent.mm.plugin.finder.live.plugin.v6 v6Var, long j17) {
        super(0);
        this.f114528d = v6Var;
        this.f114529e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = this.f114528d;
        v6Var.f114669r.setText(zl2.r4.S(zl2.r4.f473950a, this.f114529e, 0, 2, null));
        android.widget.TextView textView = v6Var.f114669r;
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        return jz5.f0.f302826a;
    }
}
