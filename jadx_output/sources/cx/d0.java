package cx;

/* loaded from: classes7.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx.f0 f224393e;

    public d0(java.lang.String str, cx.f0 f0Var) {
        this.f224392d = str;
        this.f224393e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jc3.j0 j0Var;
        if (kotlin.jvm.internal.o.b(this.f224392d, "brandServiceBoxClick")) {
            int i17 = com.tencent.mm.storage.c2.f193803a;
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String valueOf = java.lang.String.valueOf(i17);
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate iMagicBrushMonitor$SampleRate = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$SampleRate.OneThousandth;
            iVar.Sc("MagicAdBrandServiceEnterByClick", 1, valueOf, iMagicBrushMonitor$SampleRate.getValue());
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicAdBrandServiceCardNum", ((java.util.LinkedList) ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).wi(1)).size(), java.lang.String.valueOf(i17), iMagicBrushMonitor$SampleRate.getValue());
            i95.m c17 = i95.n0.c(je3.i.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            je3.i iVar2 = (je3.i) c17;
            cx.w0 w0Var = this.f224393e.f224422e;
            je3.i.x2(iVar2, "MagicAdBrandServiceStatusOnClick", (w0Var == null || (j0Var = w0Var.f282995g) == null) ? 0 : ((rc3.w0) j0Var).f394099t, java.lang.String.valueOf(i17), 0.0f, 8, null);
        }
    }
}
