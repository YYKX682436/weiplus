package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class x8 implements com.tencent.mm.plugin.sns.ui.g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView f171498a;

    public x8(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        this.f171498a = sightVideoFullScreenView;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:3:0x000c, B:5:0x001c, B:7:0x0037, B:10:0x0040, B:11:0x007f, B:13:0x008d, B:14:0x0098, B:16:0x0093, B:17:0x0067), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, blocks: (B:3:0x000c, B:5:0x001c, B:7:0x0037, B:10:0x0040, B:11:0x007f, B:13:0x008d, B:14:0x0098, B:16:0x0093, B:17:0x0067), top: B:2:0x000c }] */
    @Override // com.tencent.mm.plugin.sns.ui.g7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r9) {
        /*
            r8 = this;
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView"
            java.lang.String r0 = "SightVideoFullScreenView"
            java.lang.String r1 = "onStart"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            int r4 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.f166649x0     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = "access$300"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = r3.f166669x     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto Lbd
            java.lang.String r3 = "video onStart"
            com.tencent.mars.xlog.Log.i(r0, r3)     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            int r3 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.h(r3)     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r4 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r5 = "access$500"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r9)     // Catch: java.lang.Throwable -> Lb5
            int r4 = r4.F     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r9)     // Catch: java.lang.Throwable -> Lb5
            r5 = 0
            if (r3 >= r4) goto L67
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            int r3 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.h(r3)     // Catch: java.lang.Throwable -> Lb5
            if (r3 >= 0) goto L40
            goto L67
        L40:
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar r3 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.i(r3)     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r4 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            int r4 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.h(r4)     // Catch: java.lang.Throwable -> Lb5
            int r4 = r4 / 1000
            r3.a(r4)     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.OfflineVideoView r3 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.b(r3)     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r4 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            int r4 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.h(r4)     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r6 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            boolean r6 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.j(r6)     // Catch: java.lang.Throwable -> Lb5
            r3.s(r4, r6)     // Catch: java.lang.Throwable -> Lb5
            goto L7f
        L67:
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar r3 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.i(r3)     // Catch: java.lang.Throwable -> Lb5
            r3.a(r5)     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.OfflineVideoView r3 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.b(r3)     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r4 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            boolean r4 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.j(r4)     // Catch: java.lang.Throwable -> Lb5
            r3.s(r5, r4)     // Catch: java.lang.Throwable -> Lb5
        L7f:
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = "access$1300"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)     // Catch: java.lang.Throwable -> Lb5
            boolean r3 = r3.G     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)     // Catch: java.lang.Throwable -> Lb5
            if (r3 == 0) goto L93
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            r3.m()     // Catch: java.lang.Throwable -> Lb5
            goto L98
        L93:
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            r3.y()     // Catch: java.lang.Throwable -> Lb5
        L98:
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = "access$1402"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)     // Catch: java.lang.Throwable -> Lb5
            r3.N = r6     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView r3 = r8.f171498a     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = "access$302"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r9)     // Catch: java.lang.Throwable -> Lb5
            r3.f166669x = r5     // Catch: java.lang.Throwable -> Lb5
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r9)     // Catch: java.lang.Throwable -> Lb5
            goto Lbd
        Lb5:
            r9 = move-exception
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.e(r0, r9)
        Lbd:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.x8.a(int):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.g7
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
        try {
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.c(this.f171498a, i17 / 1000);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(dm.i4.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
    }

    @Override // com.tencent.mm.plugin.sns.ui.g7
    public boolean d(com.tencent.mm.pointers.PString pString, com.tencent.mm.pointers.PString pString2) {
        com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = this.f171498a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
        try {
            int i17 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.f166649x0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            java.lang.String str = sightVideoFullScreenView.f166650J;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            java.lang.String n17 = za4.t0.n("adId", str);
            if (!com.tencent.mm.vfs.w6.j(n17)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                java.lang.String str2 = sightVideoFullScreenView.f166650J;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                za4.t0.e("adId", str2, false, 62, 0, new com.tencent.mm.plugin.sns.ui.w8(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
                return false;
            }
            com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "streamPath is exist");
            pString.value = n17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            sightVideoFullScreenView.f166668w = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            boolean z17 = sightVideoFullScreenView.f166669x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            if (z17) {
                int h17 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.h(sightVideoFullScreenView);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                int i18 = sightVideoFullScreenView.F;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                if (h17 < i18 && com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.h(sightVideoFullScreenView) >= 0) {
                    com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.i(sightVideoFullScreenView).a(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.h(sightVideoFullScreenView) / 1000);
                    com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.b(sightVideoFullScreenView).s(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.h(sightVideoFullScreenView), com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.j(sightVideoFullScreenView));
                }
                com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.i(sightVideoFullScreenView).a(0);
                com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.b(sightVideoFullScreenView).s(0, com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.j(sightVideoFullScreenView));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
            return false;
        }
    }

    @Override // com.tencent.mm.plugin.sns.ui.g7
    public void onCompletion() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
        int i17 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.f166649x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1108", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = this.f171498a;
        sightVideoFullScreenView.S++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1108", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restart", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            sightVideoFullScreenView.f166655h.k(0, true);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restart", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$2");
    }
}
