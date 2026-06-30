package s50;

/* loaded from: classes12.dex */
public final class h1 implements k23.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f403062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f403063b;

    public h1(s50.l1 l1Var, java.lang.ref.WeakReference weakReference) {
        this.f403062a = l1Var;
        this.f403063b = weakReference;
    }

    @Override // k23.v2
    public void a() {
        s50.x0 x0Var = s50.x0.f403138e;
        s50.l1 l1Var = this.f403062a;
        l1Var.getClass();
        l1Var.f403085i = x0Var;
        l1Var.aj(this.f403063b);
    }

    @Override // k23.v2
    public void b(java.lang.String result, java.lang.String voiceID) {
        com.tencent.mm.ui.MMActivity mMActivity;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(voiceID, "voiceID");
        s50.l1 l1Var = this.f403062a;
        s50.l1.wi(l1Var, this.f403063b, result, true, voiceID);
        k23.z zVar = com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138204f;
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138206h;
        androidx.activity.ComponentActivity componentActivity = weakReference != null ? (com.tencent.mm.ui.MMActivity) weakReference.get() : null;
        com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity fTSFloatingVoiceHalfScreenActivity = componentActivity instanceof com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity ? (com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity) componentActivity : null;
        if (fTSFloatingVoiceHalfScreenActivity != null) {
            k23.v0 v0Var = fTSFloatingVoiceHalfScreenActivity.f138212d;
            v0Var.w(8, "", result);
            v0Var.w(9, "", result);
        }
        java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138206h;
        if (weakReference2 != null && (mMActivity = (com.tencent.mm.ui.MMActivity) weakReference2.get()) != null) {
            mMActivity.finish();
        }
        l1Var.f403085i = s50.x0.f403137d;
    }

    @Override // k23.v2
    public void onCancel() {
        s50.x0 x0Var = s50.x0.f403142i;
        s50.l1 l1Var = this.f403062a;
        l1Var.getClass();
        l1Var.f403085i = x0Var;
        l1Var.Vi(this.f403063b);
        s50.x0 x0Var2 = s50.x0.f403137d;
        l1Var.getClass();
        l1Var.f403085i = x0Var2;
    }
}
