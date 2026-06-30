package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class rb extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ct0.b f174247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout f174248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(ct0.b bVar, com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout) {
        super(3);
        this.f174247d = bVar;
        this.f174248e = textStatusEditVideoPluginLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i17;
        java.lang.String mixVideo = (java.lang.String) obj;
        java.lang.String mixThumb = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(mixVideo, "mixVideo");
        kotlin.jvm.internal.o.g(mixThumb, "mixThumb");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusEditVideoPluginLayout", "is in main thread:" + com.tencent.mm.sdk.platformtools.u3.e());
        if (booleanValue) {
            ct0.b bVar = this.f174247d;
            if (com.tencent.mm.vfs.w6.j(bVar != null ? bVar.f222204a : null)) {
                e60.k1 k1Var = (e60.k1) i95.n0.c(e60.k1.class);
                kotlin.jvm.internal.o.d(bVar);
                java.lang.String str = bVar.f222204a;
                ((d60.c0) k1Var).getClass();
                com.tencent.mm.plugin.sight.base.b c17 = j33.s.f297456a.c(str);
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_text_state_image_size, 1920);
                int i18 = c17.f162384c;
                int i19 = c17.f162385d;
                if (i18 > i19) {
                    int i27 = (i19 * Ni) / i18;
                    i17 = Ni;
                    Ni = i27;
                } else {
                    i17 = (i18 * Ni) / i19;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("outputHeight:");
                sb6.append(Ni);
                sb6.append(" outputWidth:");
                sb6.append(i17);
                sb6.append(" startTime:");
                int i28 = com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout.G;
                com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout textStatusEditVideoPluginLayout = this.f174248e;
                sb6.append(textStatusEditVideoPluginLayout.getPreviewPlugin().f465567o);
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusEditVideoPluginLayout", sb6.toString());
                r90.l lVar = (r90.l) i95.n0.c(r90.l.class);
                java.lang.String str2 = bVar.f222204a;
                long j17 = textStatusEditVideoPluginLayout.getPreviewPlugin().f465567o;
                ((q90.i) lVar).getClass();
                android.graphics.Bitmap q17 = ai3.d.q(str2, j17);
                if (Ni < c17.f162385d || i17 < c17.f162384c) {
                    android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(q17, i17, Ni, true);
                    q17.recycle();
                    q17 = createScaledBitmap;
                }
                if (q17 != null) {
                    com.tencent.mm.vfs.w6.h(mixThumb);
                    com.tencent.mm.sdk.platformtools.x.D0(q17, 100, android.graphics.Bitmap.CompressFormat.JPEG, mixThumb, true);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
