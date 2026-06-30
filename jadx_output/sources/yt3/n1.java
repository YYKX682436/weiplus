package yt3;

/* loaded from: classes10.dex */
public final class n1 implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.o1 f465546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f465547e;

    public n1(yt3.o1 o1Var, ju3.d0 d0Var) {
        this.f465546d = o1Var;
        this.f465547e = d0Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCompletion, startTime:");
        yt3.o1 o1Var = this.f465546d;
        sb6.append(o1Var.f465567o);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPlayPlugin", sb6.toString());
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = o1Var.f465559d;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.a(o1Var.f465567o, true);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MMRecordUI", "%d on error what %d extra %d", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPlayPlugin", "video onPrepared");
        yt3.o1 o1Var = this.f465546d;
        if (o1Var.f465569q) {
            com.tencent.mm.ui.bl.b(o1Var.f465562g);
            lt3.n nVar = lt3.n.f321260a;
            android.graphics.Rect rect = lt3.n.f321263d;
            int i17 = vt3.q.f440037a;
            rect.set(new android.graphics.Rect(0, 0, vt3.q.f440037a, vt3.q.f440038b));
        } else {
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = o1Var.f465559d;
            if (videoPlayerTextureView != null) {
                videoPlayerTextureView.invalidate();
            }
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView2 = o1Var.f465559d;
            if (videoPlayerTextureView2 != null) {
                videoPlayerTextureView2.post(new yt3.k1(o1Var));
            }
        }
        o1Var.f465563h = -1L;
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView3 = o1Var.f465559d;
        if (videoPlayerTextureView3 != null) {
            videoPlayerTextureView3.start();
        }
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView4 = o1Var.f465559d;
        if (videoPlayerTextureView4 != null) {
            videoPlayerTextureView4.setLoop(true);
        }
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView5 = o1Var.f465559d;
        ju3.d0 d0Var = this.f465547e;
        if (videoPlayerTextureView5 != null) {
            videoPlayerTextureView5.setOneTimeVideoTextureUpdateCallback(new yt3.m1(o1Var, d0Var));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (o1Var.f465568p - o1Var.f465567o > o1Var.f465565m + 750) {
            bundle.putBoolean("PARAM_VIDEO_NEED_CROP", true);
        }
        d0Var.w(ju3.c0.C1, bundle);
        int i18 = o1Var.f465568p - o1Var.f465567o;
        int i19 = o1Var.f465565m;
        if (i18 > i19 + 750) {
            o1Var.f465568p = i19 + 250;
            ju3.d0.k(d0Var, ju3.c0.f301912x0, null, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r0) >= 1000) goto L6;
     */
    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int q(int r7, int r8) {
        /*
            r6 = this;
            yt3.o1 r7 = r6.f465546d
            long r0 = r7.f465563h
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L17
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 < 0) goto L2f
        L17:
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f465559d
            if (r8 == 0) goto L1e
            r8.isPlaying()
        L1e:
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f465559d
            if (r8 == 0) goto L25
            r8.getCurrentPosition()
        L25:
            int r8 = r7.f465568p
            boolean r8 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7.f465563h = r0
        L2f:
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f465559d
            kotlin.jvm.internal.o.d(r8)
            boolean r8 = r8.isPlaying()
            if (r8 == 0) goto Le0
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f465559d
            kotlin.jvm.internal.o.d(r8)
            int r8 = r8.getCurrentPosition()
            int r0 = r7.f465568p
            if (r8 < r0) goto L9c
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f465559d
            kotlin.jvm.internal.o.d(r8)
            int r8 = r8.getDuration()
            if (r0 >= r8) goto L9c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "currentPosition:"
            r8.<init>(r0)
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r0 = r7.f465559d
            if (r0 == 0) goto L66
            int r0 = r0.getCurrentPosition()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L67
        L66:
            r0 = 0
        L67:
            r8.append(r0)
            java.lang.String r0 = " reach endTime:"
            r8.append(r0)
            int r0 = r7.f465568p
            r8.append(r0)
            java.lang.String r0 = ", seekTo startTime:"
            r8.append(r0)
            int r0 = r7.f465567o
            r8.append(r0)
            java.lang.String r0 = ", isClipMode:"
            r8.append(r0)
            boolean r0 = r7.f465566n
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "MicroMsg.EditVideoPlayPlugin"
            com.tencent.mars.xlog.Log.i(r0, r8)
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r8 = r7.f465559d
            if (r8 == 0) goto L9c
            int r0 = r7.f465567o
            double r0 = (double) r0
            r4 = 1
            r8.a(r0, r4)
        L9c:
            boolean r8 = r7.f465566n
            ju3.d0 r0 = r6.f465547e
            java.lang.String r1 = "EDIT_CROP_VIDEO_CURRENT_TIME_INT"
            if (r8 == 0) goto Lbb
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r7 = r7.f465559d
            kotlin.jvm.internal.o.d(r7)
            int r7 = r7.getCurrentPosition()
            r8.putInt(r1, r7)
            ju3.c0 r7 = ju3.c0.f301885l1
            r0.w(r7, r8)
            goto Le0
        Lbb:
            long r4 = java.lang.System.currentTimeMillis()
            r7.getClass()
            long r4 = r4 - r2
            int r8 = r7.f465570r
            long r2 = (long) r8
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 < 0) goto Le0
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView r7 = r7.f465559d
            kotlin.jvm.internal.o.d(r7)
            int r7 = r7.getCurrentPosition()
            r8.putInt(r1, r7)
            ju3.c0 r7 = ju3.c0.f301885l1
            r0.w(r7, r8)
        Le0:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yt3.n1.q(int, int):int");
    }
}
