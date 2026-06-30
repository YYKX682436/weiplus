package ls0;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f320958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ls0.r0 r0Var) {
        super(0);
        this.f320958d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runAudioMix, mixType:");
        ls0.r0 r0Var = this.f320958d;
        int i17 = r0Var.f320891c;
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = r0Var.f320916t;
        com.tencent.mars.xlog.Log.i(str, sb7);
        hs0.a aVar = r0Var.f320886J;
        if (aVar != null) {
            aVar.f();
        }
        if (i17 == 1) {
            ls0.b1.d(r0Var.H, r0Var.f320886J, 0L, 0L, 6, null);
            r0Var.g(false);
        } else if (kz5.c0.i(2, 3).contains(java.lang.Integer.valueOf(i17))) {
            try {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                ds0.d0 d0Var = new ds0.d0(i17, r0Var.f320903i, r0Var.f320905j, new ls0.o0(r0Var));
                r0Var.E = d0Var;
                hs0.a aVar2 = r0Var.f320886J;
                hs0.a aVar3 = r0Var.I;
                ls0.b1 b1Var = r0Var.H;
                d0Var.j(aVar2, aVar3, b1Var.f320800a, b1Var.f320801b);
                hs0.a aVar4 = r0Var.I;
                android.media.MediaFormat mediaFormat = aVar4 != null ? aVar4.f284552f : null;
                kotlin.jvm.internal.o.d(mediaFormat);
                if (!mediaFormat.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                    mediaFormat.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, r0Var.f320901h);
                }
                mediaFormat.setInteger("channel-count", r0Var.f320905j);
                ds0.d0 d0Var2 = r0Var.E;
                if (d0Var2 != null) {
                    d0Var2.k(mediaFormat);
                }
                ds0.d0 d0Var3 = r0Var.E;
                if (d0Var3 != null) {
                    d0Var3.m(new ls0.p0(r0Var, elapsedRealtime));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "mix audio error: " + e17.getMessage(), new java.lang.Object[0]);
                r0Var.g(false);
            }
        } else if (i17 == 0) {
            r0Var.g(false);
        }
        return jz5.f0.f302826a;
    }
}
