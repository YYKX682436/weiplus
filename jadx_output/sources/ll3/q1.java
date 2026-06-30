package ll3;

/* loaded from: classes11.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public ql3.a f319218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ll3.r1 f319219e;

    public q1(ll3.r1 r1Var, ql3.a aVar) {
        this.f319219e = r1Var;
        this.f319218d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ql3.a aVar;
        r45.jj4 jj4Var = new r45.jj4();
        ql3.a aVar2 = this.f319218d;
        jj4Var.f377855d = aVar2.field_songMediaId;
        java.lang.String str = aVar2.field_songAlbumUrl;
        jj4Var.f377860i = str;
        jj4Var.f377862m = aVar2.field_songAlbumType;
        jj4Var.f377858g = str;
        android.graphics.Bitmap s17 = ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).s(jj4Var);
        if (s17 != null) {
            android.graphics.Bitmap X = com.tencent.mm.sdk.platformtools.x.X(s17, 10);
            ql3.a aVar3 = this.f319218d;
            ll3.r1 r1Var = this.f319219e;
            r1Var.c(aVar3, X);
            int[] c17 = com.tencent.mm.ui.bk.c(X, 4, 4);
            ql3.a aVar4 = this.f319218d;
            if (!(aVar4.field_songBgColor == c17[0] && aVar4.field_songLyricColor == c17[1])) {
                this.f319218d = ll3.o2.Ai().L0(this.f319218d.field_musicId, c17[0], c17[1]);
            }
            ll3.p1 p1Var = r1Var.f319224b;
            if (p1Var == null || (aVar = this.f319218d) == null) {
                return;
            }
            ((com.tencent.mm.plugin.music.ui.u) p1Var).d(aVar, c17);
        }
    }
}
