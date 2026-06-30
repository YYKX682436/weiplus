package y94;

/* loaded from: classes10.dex */
public final class f0 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f460364f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f460365g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f460366h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        this.f460364f = jz5.h.b(new y94.c0(this));
        this.f460365g = jz5.h.b(new y94.b0(this));
    }

    public final com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEffectView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = (com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout) ((jz5.n) this.f460364f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEffectView", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        return mMTPEffectVideoLayout;
    }

    @Override // yt3.r2
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        kk4.b player = A().getPlayer();
        if (player != null) {
            kk4.b.i(player, false, false, 3, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
    }

    @Override // yt3.r2
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        kk4.b player = A().getPlayer();
        if (player != null) {
            ((kk4.v) player).O();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
    }

    @Override // yt3.r2
    public void release() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        kk4.b player = A().getPlayer();
        if (player != null) {
            ((kk4.v) player).P();
        }
        kk4.b player2 = A().getPlayer();
        if (player2 != null) {
            player2.recycle();
        }
        A().g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        dk4.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f460366h = configProvider;
        java.lang.String str = com.tencent.mm.vfs.w6.j(configProvider.A) ? configProvider.A : configProvider.D;
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareAndPlayVideo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        ot5.g.c("MicroMsg.SnsCoverEffectPreviewPlugin", "prepareAndPlayVideo path:".concat(str));
        A().f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalTPMediaInfo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 == null) {
            aVar = new dk4.a("", "", str, 0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalTPMediaInfo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        } else {
            dk4.a aVar2 = new dk4.a("", str, "", d17.f162384c, d17.f162385d);
            aVar2.f234468e = true;
            aVar2.f234474k = d17.f162395n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalTPMediaInfo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            aVar = aVar2;
        }
        A().setMediaInfo(aVar);
        kk4.b player = A().getPlayer();
        if (player != null) {
            ((kk4.v) player).f308585j = true;
        }
        kk4.b player2 = A().getPlayer();
        if (player2 != null) {
            ((kk4.v) player2).A(true);
        }
        kk4.b player3 = A().getPlayer();
        if (player3 != null) {
            ((kk4.v) player3).O();
        }
        A().getEffectRenderReport().f429213b = 1;
        int i17 = aVar.f234485v;
        if (i17 > 0 || aVar.f234486w > 0) {
            int i18 = aVar.f234474k;
            if (((i18 == 90 || i18 == 270) ? (i17 * 1.0f) / aVar.f234486w : (aVar.f234486w * 1.0f) / i17) < 1.7777778f) {
                A().getEffectManager().d();
            }
            A().setOnFirstFrameAvailable(new y94.d0(str, this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareAndPlayVideo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareAndPlayVideo", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLogic", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
    }

    public final android.content.Context z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        android.content.Context context = (android.content.Context) ((jz5.n) this.f460365g).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
        return context;
    }
}
