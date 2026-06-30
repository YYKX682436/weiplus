package je2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vq1 f299240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ je2.n f299241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r45.vq1 vq1Var, je2.n nVar) {
        super(0);
        this.f299240d = vq1Var;
        this.f299241e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        r45.vq1 vq1Var = this.f299240d;
        java.lang.String string = vq1Var.getString(0);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) vq1Var.getCustom(1);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) vq1Var.getCustom(1);
        jz5.f0 f0Var = null;
        java.lang.String ext_info = finderJumpInfo2 != null ? finderJumpInfo2.getExt_info() : null;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        je2.n nVar = this.f299241e;
        if (string != null && finderJumpInfo != null && ext_info != null) {
            r45.wq1 O6 = nVar.O6(ext_info);
            java.lang.String str = nVar.f299245f;
            if (O6 != null) {
                java.util.Iterator it = nVar.Q6().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((je2.j) obj).f299237a, string)) {
                        break;
                    }
                }
                je2.j jVar = (je2.j) obj;
                kotlinx.coroutines.flow.i2 i2Var = nVar.f299250n;
                if (jVar != null) {
                    if (O6.getLong(2) > jVar.f299238b.getLong(2)) {
                        com.tencent.mars.xlog.Log.i(str, "FinderLiveGameDataBannerData update game data:" + jVar + " to version:" + O6.getLong(2) + '!');
                        jVar.f299238b = O6;
                        jVar.f299239c = finderJumpInfo;
                        if (jVar.a()) {
                            ((kotlinx.coroutines.flow.q2) i2Var).e(java.lang.Boolean.TRUE);
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "FinderLiveGameDataBannerData addGameDataBanner fail, old game data:" + jVar + " \n new game version:" + O6.getLong(2) + '!');
                    }
                    f0Var = f0Var2;
                }
                if (f0Var == null) {
                    je2.j jVar2 = new je2.j(string, O6, finderJumpInfo);
                    nVar.Q6().add(jVar2);
                    com.tencent.mars.xlog.Log.i(str, "FinderLiveGameDataBannerData add game data " + jVar2 + '!');
                    if (jVar2.a()) {
                        ((kotlinx.coroutines.flow.q2) i2Var).e(java.lang.Boolean.TRUE);
                    }
                }
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e(str, "FinderLiveGameDataBannerData add game data fail,remote ext_info:" + ext_info + " can't convert!");
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(nVar.f299245f, "FinderLiveGameDataBannerData addGameData fail,id:" + vq1Var.getString(0));
        }
        return f0Var2;
    }
}
