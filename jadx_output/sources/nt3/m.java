package nt3;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f339797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(nt3.a0 a0Var) {
        super(0);
        this.f339797d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runAudioMix, mixType:");
        nt3.a0 a0Var = this.f339797d;
        int i17 = a0Var.f339712c;
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = a0Var.f339722m;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (i17 == 1) {
            ls0.b1.d(a0Var.f339730u, null, 0L, 0L, 6, null);
            a0Var.g(false);
        } else if (kz5.c0.i(2, 3).contains(java.lang.Integer.valueOf(i17))) {
            try {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                ds0.d0 d0Var = new ds0.d0(i17, a0Var.f339718i, 1, new nt3.y(a0Var));
                a0Var.f339729t = d0Var;
                hs0.a aVar = a0Var.f339731v;
                ls0.b1 b1Var = a0Var.f339730u;
                d0Var.j(null, aVar, b1Var.f320800a, b1Var.f320801b);
                hs0.a aVar2 = a0Var.f339731v;
                android.media.MediaFormat mediaFormat = aVar2 != null ? aVar2.f284552f : null;
                kotlin.jvm.internal.o.d(mediaFormat);
                if (!mediaFormat.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                    mediaFormat.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, a0Var.f339717h);
                }
                mediaFormat.setInteger("channel-count", 1);
                ds0.d0 d0Var2 = a0Var.f339729t;
                if (d0Var2 != null) {
                    d0Var2.k(mediaFormat);
                }
                ds0.d0 d0Var3 = a0Var.f339729t;
                if (d0Var3 != null) {
                    d0Var3.m(new nt3.z(a0Var, elapsedRealtime));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "mix audio error: " + e17.getMessage(), new java.lang.Object[0]);
                a0Var.g(false);
            }
        } else if (i17 == 0) {
            a0Var.g(false);
        }
        return jz5.f0.f302826a;
    }
}
