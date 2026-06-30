package k23;

/* loaded from: classes12.dex */
public final class b1 implements k23.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k23.c1 f303524a;

    public b1(k23.c1 c1Var) {
        this.f303524a = c1Var;
    }

    @Override // k23.v2
    public void b(java.lang.String result, java.lang.String voiceID) {
        com.tencent.mm.ui.MMActivity mMActivity;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(voiceID, "voiceID");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSFloatingVoiceV3UIC", "onResult(" + result + ')');
        if (result.length() > 0) {
            z13.a aVar = z13.f.f469397s;
            k23.c1 c1Var = this.f303524a;
            aVar.a(c1Var.getContext()).h7(result, k23.r2.f303684f, voiceID, false);
            z50.c.f470162a.e(c1Var.getContext(), result, k23.s2.a(aVar.a(c1Var.getContext()).f469406o) ? com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS : 17, 238, aVar.a(c1Var.getContext()).a7(), aVar.a(c1Var.getContext()).c7());
        }
        k23.z zVar = com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138204f;
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.fts.ui.voice.FTSFloatingVoiceHalfScreenActivity.f138206h;
        if (weakReference == null || (mMActivity = (com.tencent.mm.ui.MMActivity) weakReference.get()) == null) {
            return;
        }
        mMActivity.finish();
    }

    @Override // k23.v2
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSFloatingVoiceV3UIC", "onCancel");
    }
}
