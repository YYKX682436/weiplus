package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class s70 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f114228d;

    public s70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var) {
        this.f114228d = v70Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String format;
        long longValue = ((java.lang.Number) obj).longValue();
        android.widget.TextView textView = this.f114228d.f114690x;
        if (longValue < 0) {
            format = "00:00";
        } else if (longValue >= 59999000) {
            format = "999:59";
        } else {
            long j17 = longValue / 1000;
            long j18 = 60;
            format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) (j17 / j18)), java.lang.Integer.valueOf((int) (j17 % j18))}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
        }
        textView.setText(format);
        return jz5.f0.f302826a;
    }
}
