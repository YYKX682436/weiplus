package com.tencent.mm.plugin.forcenotify.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI;", "Lcom/tencent/mm/plugin/forcenotify/ui/BaseForceNotifyShowUI;", "<init>", "()V", "plugin-force-notify_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ForceNotifyShowUI extends com.tencent.mm.plugin.forcenotify.ui.BaseForceNotifyShowUI {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f137342s = 0;

    /* renamed from: h, reason: collision with root package name */
    public android.media.MediaPlayer f137345h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f137346i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Runnable f137347m;

    /* renamed from: p, reason: collision with root package name */
    public boolean f137350p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f137351q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f137352r;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f137343f = jz5.h.b(new k13.e0(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f137344g = jz5.h.b(new k13.k0(this));

    /* renamed from: n, reason: collision with root package name */
    public final android.media.AudioManager.OnAudioFocusChangeListener f137348n = k13.d0.f303202d;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f137349o = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public ForceNotifyShowUI() {
        jz5.h.b(new k13.f0(this));
    }

    public final android.media.AudioManager T6() {
        return (android.media.AudioManager) ((jz5.n) this.f137343f).getValue();
    }

    public final void U6() {
        java.lang.String str = this.f137327d;
        com.tencent.mars.xlog.Log.i(str, "reset");
        if (this.f137352r) {
            this.f137350p = false;
            this.f137351q = false;
        }
        getWindow().getDecorView().setKeepScreenOn(false);
        getWindow().clearFlags(128);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f137349o;
        n3Var.removeCallbacksAndMessages(null);
        try {
            n3Var.removeCallbacks(this.f137346i);
            V6();
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "", new java.lang.Object[0]);
        }
    }

    public final void V6() {
        try {
            ((android.os.Vibrator) ((jz5.n) this.f137344g).getValue()).cancel();
            android.media.MediaPlayer mediaPlayer = this.f137345h;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            android.media.MediaPlayer mediaPlayer2 = this.f137345h;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            getWindow().getDecorView().setKeepScreenOn(false);
            getWindow().clearFlags(128);
            T6().abandonAudioFocus(this.f137348n);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bbi;
    }

    @Override // com.tencent.mm.plugin.forcenotify.ui.BaseForceNotifyShowUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.tencent.mars.xlog.Log.i(this.f137327d, "[onBackPressed]");
        i13.c cVar = this.f137328e;
        if (cVar == null || !(cVar instanceof i13.p)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        i13.p pVar = (i13.p) cVar;
        long j17 = 1000;
        sb6.append(pVar.f287316n / j17);
        sb6.append(pVar.f287313h);
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ai(cVar.f287275d, sb6.toString(), 8, c01.id.c() / j17);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0334  */
    @Override // com.tencent.mm.plugin.forcenotify.ui.BaseForceNotifyShowUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.forcenotify.ui.BaseForceNotifyShowUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.lang.String str;
        super.onDestroy();
        U6();
        this.f137347m = null;
        this.f137346i = null;
        i13.c cVar = this.f137328e;
        if (cVar == null || (str = cVar.f287275d) == null) {
            return;
        }
        j13.a.f297177d.d(str);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i(this.f137327d, "[onKeyDown] keyCode:" + i17);
        U6();
        return super.onKeyDown(i17, event);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i(this.f137327d, "onPause");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i(this.f137327d, "onResume");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i(this.f137327d, "onStart");
        if (this.f137350p || this.f137351q) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f137349o;
            n3Var.postDelayed(this.f137347m, 1000L);
            n3Var.postDelayed(this.f137346i, 60000L);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        U6();
        com.tencent.mars.xlog.Log.i(this.f137327d, "onStop");
    }
}
