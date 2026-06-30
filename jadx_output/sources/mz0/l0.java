package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class l0 extends kotlin.jvm.internal.m implements yz5.p {
    public l0(java.lang.Object obj) {
        super(2, obj, mz0.b2.class, "performSwitchMusicV2", "performSwitchMusicV2(Ljava/lang/String;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/component/IMaasSnsMusicPickerBizNotify;)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.e5 e5Var;
        com.tencent.maas.model.MJMusicInfo mJMusicInfo;
        java.lang.String p07 = (java.lang.String) obj;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c cVar = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c) obj2;
        kotlin.jvm.internal.o.g(p07, "p0");
        mz0.b2 b2Var = (mz0.b2) this.receiver;
        ty0.b1 b1Var = b2Var.f332889m;
        java.lang.String musicID = (b1Var == null || (e5Var = b1Var.f422792b) == null || (mJMusicInfo = (com.tencent.maas.model.MJMusicInfo) e5Var.getValue()) == null) ? null : mJMusicInfo.getMusicID();
        if (musicID == null) {
            musicID = "";
        }
        if (kotlin.jvm.internal.o.b(p07, musicID)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "same music, no need to switch");
            if (cVar != null) {
                ((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k1) cVar).a(new cw3.h(null, 1, null), p07);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "performSwitchMusicV2: musicId " + p07 + " ready");
            kotlinx.coroutines.l.d(b2Var.getMainScope(), null, null, new mz0.s1(p07, b2Var, cVar, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
