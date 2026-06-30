package cu0;

/* loaded from: classes5.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f222351a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f222352b;

    /* renamed from: c, reason: collision with root package name */
    public volatile ev0.t f222353c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f222354d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo f222355e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f222356f;

    /* renamed from: g, reason: collision with root package name */
    public int f222357g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f222358h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f222359i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f222360j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.q f222361k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f222362l;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f222363m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.l f222364n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f222365o;

    public x(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, android.content.Context context, yz5.l ignoreBackgroundTouchEvent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(ignoreBackgroundTouchEvent, "ignoreBackgroundTouchEvent");
        this.f222351a = context;
        this.f222352b = jz5.h.b(new cu0.o(this, ignoreBackgroundTouchEvent));
        this.f222353c = new ev0.t();
        this.f222358h = jz5.h.b(cu0.p.f222330d);
        this.f222359i = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f222360j = kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f222365o = true;
        if (recordConfigProvider != null) {
            java.lang.String string = recordConfigProvider.M.getString("post_id");
            i().putString("post_id", string);
            i().putString("KEY_EDIT_ID", string);
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = recordConfigProvider.I;
            if (videoCaptureReportInfo != null) {
                i().putString("FINDER_CONTEXT_ID", videoCaptureReportInfo.f155697n);
                i().putString("key_click_tab_context_id", videoCaptureReportInfo.f155698o);
                i().putInt("key_from_comment_scene", videoCaptureReportInfo.f155693g);
                i().putLong("key_ref_feed_id", videoCaptureReportInfo.f155694h);
                i().putString("key_ref_feed_dup_flag", videoCaptureReportInfo.f155695i);
                i().putInt("key_ref_comment_scene", videoCaptureReportInfo.f155700q);
                i().putInt("key_ref_enter_scene", videoCaptureReportInfo.f155696m);
                com.tencent.mars.xlog.Log.i(j(), "[initReportBundle] postId:" + string + " finderContextId=" + videoCaptureReportInfo.f155697n + " finderTabContextId:" + videoCaptureReportInfo.f155698o + " commentScene:" + videoCaptureReportInfo.f155693g + " feedId:" + videoCaptureReportInfo.f155694h + " enterScene:" + videoCaptureReportInfo.f155696m);
            }
        }
        g().f222576i = new cu0.d(this);
        g().setCallback(new cu0.f(this, i(), h()));
        com.tencent.mm.plugin.recordvideo.ui.editor.music.MusicPickerComponentLayout e17 = g().e();
        e17.setMusicClipInitialRangeProvider(cu0.g.f222315d);
        e17.setOnMusicClipChange(new cu0.h(this));
        e17.setMusicClipPlayProgressListenerRegistrar(new cu0.i(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(cu0.x r5, yz5.a r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof cu0.q
            if (r0 == 0) goto L16
            r0 = r7
            cu0.q r0 = (cu0.q) r0
            int r1 = r0.f222333f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f222333f = r1
            goto L1b
        L16:
            cu0.q r0 = new cu0.q
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f222331d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f222333f
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L48
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.p0 r7 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r7 = kotlinx.coroutines.internal.b0.f310484a
            cu0.s r2 = new cu0.s
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f222333f = r3
            java.lang.Object r7 = kotlinx.coroutines.l.g(r7, r2, r0)
            if (r7 != r1) goto L48
            goto L4e
        L48:
            java.lang.String r5 = "withContext(...)"
            kotlin.jvm.internal.o.f(r7, r5)
            r1 = r7
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cu0.x.a(cu0.x, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(yz5.a provideInitVolumes, yz5.l lVar, yz5.l lVar2, int i17) {
        kotlin.jvm.internal.o.g(provideInitVolumes, "provideInitVolumes");
        cu0.j jVar = lVar != null ? new cu0.j(this, i17, lVar) : null;
        cu0.k kVar = new cu0.k(provideInitVolumes, lVar, this, i17);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0) g().e().b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0.class);
        if (e0Var != null) {
            e0Var.A = kVar;
            e0Var.B = jVar;
            e0Var.C = lVar2;
            e0Var.D = i17;
        }
    }

    public boolean c(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo) {
        return false;
    }

    public abstract cu0.y d(yz5.l lVar);

    public final void e() {
        pv3.n nVar = pv3.n.f358619a;
        com.tencent.mm.plugin.vlog.model.i0 scene = h();
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicPlayFirstFrameEventManager", "removeEvent " + scene);
        pv3.n.f358620b.remove(scene);
        ev0.t tVar = this.f222353c;
        kotlinx.coroutines.l.d(tVar.f256878a, null, null, new ev0.s(tVar, null), 3, null);
        g().destroy();
    }

    public final int f() {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.fragment.MusicPickerDataFragment musicPickerDataFragment;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0 h0Var = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0) g().e().b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.h0.class);
        if (h0Var == null || (musicPickerDataFragment = h0Var.f156239p) == null) {
            return 0;
        }
        return musicPickerDataFragment.n0();
    }

    public final cu0.y g() {
        return (cu0.y) this.f222352b.getValue();
    }

    public com.tencent.mm.plugin.vlog.model.i0 h() {
        return g().e().getPageType();
    }

    public final android.os.Bundle i() {
        return (android.os.Bundle) this.f222358h.getValue();
    }

    public abstract java.lang.String j();

    public void k() {
        if (l()) {
            return;
        }
        ev0.t tVar = this.f222353c;
        kotlinx.coroutines.l.d(tVar.f256878a, null, null, new ev0.r(this.f222355e, this.f222363m, tVar, null, null), 3, null);
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        if (this.f222355e != null) {
            i95.m c17 = i95.n0.c(m40.k0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            m40.k0 k0Var = (m40.k0) c17;
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = this.f222355e;
            if (!((c61.p7) k0Var).ij(audioCacheInfo != null ? audioCacheInfo.f155715i : null)) {
                return true;
            }
        }
        return false;
    }

    public void n(boolean z17, java.util.List lyricsInfos) {
        kotlin.jvm.internal.o.g(lyricsInfos, "lyricsInfos");
    }
}
