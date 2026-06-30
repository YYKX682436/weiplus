package kh2;

/* loaded from: classes10.dex */
public final class a implements com.tme.karaoke.lib_singscore.IScoreResultCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kh2.l f307985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ om2.u f307986b;

    public a(kh2.l lVar, om2.u uVar) {
        this.f307985a = lVar;
        this.f307986b = uVar;
    }

    @Override // com.tme.karaoke.lib_singscore.IScoreResultCallback
    public void scoreResultCallback(com.tme.karaoke.lib_singscore.ScoreResult scoreResult, float f17) {
        com.tme.karaoke.lib_singscore.MIDIScoreResult acfScoreResult;
        com.tme.karaoke.lib_singscore.MIDIScoreResult pYinScoreResult;
        com.tme.karaoke.lib_singscore.MIDIScoreResult acfScoreResult2;
        com.tme.karaoke.lib_singscore.MIDIScoreResult pYinScoreResult2;
        kh2.l lVar = this.f307985a;
        long j17 = lVar.f308017n;
        if (j17 >= 0) {
            long j18 = lVar.f308018o;
            if (j18 > 0 && (f17 < ((float) j17) || f17 > ((float) j18))) {
                return;
            }
        }
        lVar.f308019p++;
        com.tencent.mars.xlog.Log.i(lVar.f308004a, "KTVScore sentenceCount: " + lVar.f308019p);
        lVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getScoreResult pYin: ");
        com.tme.karaoke.lib_singscore.MIDIScoreResult mIDIScoreResult = null;
        sb6.append((scoreResult == null || (pYinScoreResult2 = scoreResult.getPYinScoreResult()) == null) ? null : java.lang.Integer.valueOf(pYinScoreResult2.getTotalScore()));
        sb6.append(" acf: ");
        sb6.append((scoreResult == null || (acfScoreResult2 = scoreResult.getAcfScoreResult()) == null) ? null : java.lang.Integer.valueOf(acfScoreResult2.getTotalScore()));
        com.tencent.mars.xlog.Log.i(lVar.f308004a, sb6.toString());
        if (((scoreResult == null || (pYinScoreResult = scoreResult.getPYinScoreResult()) == null) ? 0 : pYinScoreResult.getTotalScore()) > ((scoreResult == null || (acfScoreResult = scoreResult.getAcfScoreResult()) == null) ? 0 : acfScoreResult.getTotalScore())) {
            if (scoreResult != null) {
                mIDIScoreResult = scoreResult.getPYinScoreResult();
            }
        } else if (scoreResult != null) {
            mIDIScoreResult = scoreResult.getAcfScoreResult();
        }
        int score = mIDIScoreResult != null ? mIDIScoreResult.getScore() : 0;
        int totalScore = mIDIScoreResult != null ? mIDIScoreResult.getTotalScore() : 0;
        float f18 = totalScore / lVar.f308019p;
        jh2.a aVar = lVar.f308005b;
        if (aVar != null) {
            aVar.v1(this.f307986b.f346383a, score, totalScore, f18, scoreResult != null ? scoreResult.getSentenceIndex() : 0, f17);
        }
    }
}
