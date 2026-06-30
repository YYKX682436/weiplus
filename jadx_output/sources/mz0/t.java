package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.m implements yz5.l {
    public t(java.lang.Object obj) {
        super(1, obj, mz0.b2.class, "performSwitchMusic", "performSwitchMusic(Ljava/lang/String;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.e5 e5Var;
        com.tencent.maas.model.MJMusicInfo mJMusicInfo;
        java.lang.String p07 = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        mz0.b2 b2Var = (mz0.b2) this.receiver;
        ty0.b1 b1Var = b2Var.f332889m;
        java.lang.String musicID = (b1Var == null || (e5Var = b1Var.f422792b) == null || (mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) e5Var.getValue()) == null) ? null : mJMusicInfo.getMusicID();
        if (musicID == null) {
            musicID = "";
        }
        if (kotlin.jvm.internal.o.b(p07, musicID)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "same music, no need to switch");
        } else {
            py0.f0 f76 = b2Var.f7();
            f76.c(b2Var.getString(com.tencent.mm.R.string.gvu));
            f76.e(false);
            kotlinx.coroutines.l.d(b2Var.getMainScope(), null, null, new mz0.n1(b2Var, p07, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
