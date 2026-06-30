package mi2;

/* loaded from: classes10.dex */
public final class k implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mi2.l f326770a;

    public k(mi2.l lVar) {
        this.f326770a = lVar;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.i(this.f326770a.f326756m, "set mic setting fail, errType:" + i17 + " errCode:" + i18);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        mi2.l lVar = this.f326770a;
        com.tencent.mars.xlog.Log.i(lVar.f326756m, "set mic setting success micSettingFlag:" + j18);
        ((mm2.o4) lVar.f326753h.g().a(mm2.o4.class)).U.f377129d = j18;
        ((mm2.o4) lVar.f326753h.g().a(mm2.o4.class)).U.f377131f = lVar.B.f337319u;
    }
}
