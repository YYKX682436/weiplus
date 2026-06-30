package com.tencent.mm.storage;

@j95.b
/* loaded from: classes15.dex */
public final class h5 extends i95.w implements com.tencent.mm.feature.emoji.api.c6 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.storage.h5 f195006d = new com.tencent.mm.storage.h5();

    public boolean Ai() {
        return wi() && (c01.z1.i() & 17592186044416L) != 0;
    }

    public final boolean Bi() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoticon_enable_bubble_recommend, false)) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_emoticon_privacy_setting, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPrivacy", "match shouldShowPrivacyPolicy");
                return true;
            }
            if (Ui()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPrivacy", "match shouldShowPrivacyPolicy");
                return true;
            }
        }
        if (wi()) {
            return (c01.z1.i() & 2097152) != 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPrivacy", "match isEmojiRecommendAllowed");
        return false;
    }

    public final void Di(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPrivacy", "setEmojiRecommendFromPersonalizedEnabled: enabled=" + z17);
        long i17 = c01.z1.i();
        c01.z1.P(z17 ? i17 | 17592186044416L : i17 & (-17592186044417L));
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 102;
        p53Var.f382762e = z17 ? 1 : 2;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        com.tencent.mm.storage.z4.f196391j.g();
    }

    public final void Ni(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPrivacy", "setEmojiRecommendFromUnsavedEnabled: enabled=" + z17);
        long i17 = c01.z1.i();
        c01.z1.P(z17 ? i17 | 2097152 : i17 & (-2097153));
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 86;
        p53Var.f382762e = z17 ? 1 : 2;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
    }

    public final void Ri(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPrivacy", "setUserAcceptation: agreed=" + z17);
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 85;
        p53Var.f382762e = z17 ? 1 : 2;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        long i17 = c01.z1.i();
        c01.z1.P(z17 ? i17 | 17592188141568L : i17 & (-17592188141569L));
        com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct customEmotionRecognitionSwitchStruct = new com.tencent.mm.autogen.mmdata.rpt.CustomEmotionRecognitionSwitchStruct();
        customEmotionRecognitionSwitchStruct.f55765d = 3;
        customEmotionRecognitionSwitchStruct.f55766e = z17 ? 2L : 3L;
        customEmotionRecognitionSwitchStruct.k();
    }

    public final boolean Ui() {
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.emoji.RepairerConfigEmojiShowCustomEmojiPrivacyNotice()) == 1) {
            return true;
        }
        return wi() && (c01.z1.i() & 1048576) == 0;
    }

    public final boolean wi() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return false;
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_emoticon_privacy_setting, false) || ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            return false;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
        if (l17 == null) {
            return false;
        }
        java.lang.String str = (java.lang.String) l17;
        return !com.tencent.mm.sdk.platformtools.t8.K0(str) && str.toUpperCase().equals("CN");
    }
}
