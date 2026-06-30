package oy5;

/* loaded from: classes10.dex */
public final class j implements com.tme.karaoke.lib_singscore.IScoreResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oy5.h f350137a;

    public j(oy5.h hVar) {
        this.f350137a = hVar;
    }

    @Override // com.tme.karaoke.lib_singscore.IScoreResultCallback
    public void scoreResultCallback(com.tme.karaoke.lib_singscore.ScoreResult scoreResult, float f17) {
        com.tme.karaoke.lib_singscore.IScoreResultCallback iScoreResultCallback = this.f350137a.f350119h;
        if (iScoreResultCallback != null) {
            iScoreResultCallback.scoreResultCallback(scoreResult, f17);
        }
    }
}
