package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class t0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w0 f114323d;

    public t0(com.tencent.mm.plugin.finder.live.plugin.w0 w0Var) {
        this.f114323d = w0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.k kVar = (mm2.k) obj;
        long j17 = kVar.f329186b;
        if (j17 > 0) {
            long j18 = (j17 - kVar.f329185a) / 1000;
            long j19 = 60;
            java.lang.String format = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j18 / j19)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            java.lang.String format2 = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j18 % j19)}, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            com.tencent.mm.plugin.finder.live.plugin.w0 w0Var = this.f114323d;
            java.lang.String string = w0Var.f114834p.getContext().getResources().getString(com.tencent.mm.R.string.d2u);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            w0Var.f114835q.setText(string + ' ' + format + ':' + format2);
        }
    }
}
