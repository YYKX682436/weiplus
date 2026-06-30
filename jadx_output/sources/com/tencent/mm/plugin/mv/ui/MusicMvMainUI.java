package com.tencent.mm.plugin.mv.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvMainUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvMainUI extends com.tencent.mm.plugin.mv.ui.BaseMusicMvUI {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f150860h = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f150861e = "MicroMsg.Mv.MusicMvMainUI";

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.MusicMvMainUI$musicPlayEventListener$1 f150862f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f150863g;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.mv.ui.MusicMvMainUI$musicPlayEventListener$1] */
    public MusicMvMainUI() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f150862f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.mv.ui.MusicMvMainUI$musicPlayEventListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.jk jkVar = event.f54512g;
                java.lang.Integer valueOf = jkVar != null ? java.lang.Integer.valueOf(jkVar.f7036b) : null;
                if (valueOf == null || valueOf.intValue() != 4) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.mv.ui.MusicMvMainUI.this.f150861e, "musicPlayEventListener error");
                il4.l lVar = il4.l.f292142a;
                return false;
            }
        };
        this.f150863g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicCheckErrorEvent>(a0Var) { // from class: com.tencent.mm.plugin.mv.ui.MusicMvMainUI$musicCheckErrorListener$1
            {
                this.__eventId = -1443570203;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicCheckErrorEvent musicCheckErrorEvent) {
                com.tencent.mm.autogen.events.MusicCheckErrorEvent event = musicCheckErrorEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.mv.ui.MusicMvMainUI musicMvMainUI = com.tencent.mm.plugin.mv.ui.MusicMvMainUI.this;
                com.tencent.mars.xlog.Log.i(musicMvMainUI.f150861e, "musicCheckErrorListener check error");
                if (event.f54511g.f6956a == 0) {
                    com.tencent.mars.xlog.Log.e(musicMvMainUI.f150861e, "musicCheckErrorListener, must has error.");
                    return false;
                }
                il4.l lVar = il4.l.f292142a;
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489323c52;
    }

    @Override // com.tencent.mm.plugin.mv.ui.BaseMusicMvUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.mv.ui.uic.n0.class, com.tencent.mm.plugin.mv.ui.uic.q7.class, com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC.class, com.tencent.mm.plugin.mv.ui.uic.e1.class, com.tencent.mm.plugin.mv.ui.uic.d0.class, com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class, dv2.f2.class, com.tencent.mm.plugin.mv.ui.uic.t0.class, com.tencent.mm.plugin.mv.ui.uic.s1.class, com.tencent.mm.plugin.mv.ui.uic.k0.class, com.tencent.mm.plugin.mv.ui.uic.y0.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.mv.ui.BaseMusicMvUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!(kl3.t.f308843g != null)) {
            finish();
            com.tencent.mars.xlog.Log.e(this.f150861e, "MusicPlayerManager is not init!");
            return;
        }
        tl3.a.f420297b = "2.0";
        ka0.h0 h0Var = (ka0.h0) i95.n0.c(ka0.h0.class);
        android.os.Bundle extras = getIntent().getExtras();
        ((ja0.c0) h0Var).getClass();
        ll3.q0.f(extras);
        if (getIntent().getStringExtra("key_mv_thumb_path") == null) {
            ka0.h0 h0Var2 = (ka0.h0) i95.n0.c(ka0.h0.class);
            java.lang.String stringExtra = getIntent().getStringExtra("key_mv_album_cover_url");
            ((ja0.c0) h0Var2).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.GlobalMusicFloatBallManager", "updateCurrentMusicCover %s", stringExtra);
            ll3.b1.f319141b.v0(stringExtra, true);
        }
        hideTitleView();
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
        hideActionbarLine();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        setBounceEnabled(false);
        super.onCreateBeforeSetContentView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        tl3.a.f420297b = "1.0";
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mars.xlog.Log.i(this.f150861e, "onNewIntent");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        dead();
        this.f150863g.dead();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        alive();
        this.f150863g.alive();
    }
}
