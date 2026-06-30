package py0;

/* loaded from: classes5.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.m implements yz5.l {
    public e(java.lang.Object obj) {
        super(1, obj, py0.y.class, "performSwitchMusic", "performSwitchMusic(Ljava/lang/String;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.e5 e5Var;
        com.tencent.maas.model.MJMusicInfo mJMusicInfo;
        java.lang.String p07 = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        py0.y yVar = (py0.y) this.receiver;
        yVar.getClass();
        ty0.b1 b1Var = yVar.f359033h;
        java.lang.String musicID = (b1Var == null || (e5Var = b1Var.f422792b) == null || (mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) e5Var.getValue()) == null) ? null : mJMusicInfo.getMusicID();
        if (musicID == null) {
            musicID = "";
        }
        if (kotlin.jvm.internal.o.b(p07, musicID)) {
            com.tencent.mars.xlog.Log.i("MaasBaseUILogicUIC", "same music, no need to switch");
        } else {
            py0.f0 P6 = yVar.P6();
            P6.c(yVar.getString(com.tencent.mm.R.string.gvu));
            P6.e(false);
            kotlinx.coroutines.l.d(yVar.getMainScope(), null, null, new py0.s(yVar, p07, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
