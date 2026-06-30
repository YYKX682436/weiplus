package sf2;

/* loaded from: classes10.dex */
public final class m implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407198d;

    public m(sf2.x xVar) {
        this.f407198d = xVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.j7 j7Var = (mm2.j7) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchor openSongListLocateInfo: songName=");
        sb6.append(j7Var != null ? j7Var.f329183a : null);
        sb6.append(", uniqueAddId=");
        sb6.append(j7Var != null ? j7Var.f329184b : null);
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMusicSingSongController", sb6.toString());
        if ((j7Var != null && (j7Var.a() ^ true)) && dk2.ef.f233384g) {
            this.f407198d.s7(true);
        }
    }
}
