package sf2;

/* loaded from: classes3.dex */
public final class f implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mm2.c1 f407126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407127b;

    public f(mm2.c1 c1Var, sf2.x xVar) {
        this.f407126a = c1Var;
        this.f407127b = xVar;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.e("FinderLiveAnchorMusicSingSongController", "enableSongListDisplayForNewVersion: CGI failed, errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", "enableSongListDisplayForNewVersion: CGI success");
        this.f407126a.Z9((int) r1.f328866q);
        ((mm2.m6) this.f407127b.business(mm2.m6.class)).f329245m.postValue(java.lang.Boolean.TRUE);
    }
}
