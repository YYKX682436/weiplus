package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class cj extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f160916d;

    /* renamed from: e, reason: collision with root package name */
    public int f160917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI f160918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI settingsMusicUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f160918f = settingsMusicUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.setting.ui.setting.cj(this.f160918f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.setting.ui.setting.cj) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI settingsMusicUI;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f160917e;
        com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI settingsMusicUI2 = this.f160918f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI.f160577o;
            settingsMusicUI2.f160579e = com.tencent.mm.ui.widget.dialog.u3.f(settingsMusicUI2, settingsMusicUI2.getString(com.tencent.mm.R.string.ggc), false, 0, null);
            qk.o8 o8Var = (qk.o8) i95.n0.c(qk.o8.class);
            this.f160916d = settingsMusicUI2;
            this.f160917e = 1;
            obj = ((ef0.y2) o8Var).Zi(settingsMusicUI2, this);
            if (obj == aVar) {
                return aVar;
            }
            settingsMusicUI = settingsMusicUI2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            settingsMusicUI = (com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI) this.f160916d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        settingsMusicUI.f160585n = (bw5.lc0) obj;
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = settingsMusicUI2.f160579e;
        if ((u3Var2 != null && u3Var2.isShowing()) && (u3Var = settingsMusicUI2.f160579e) != null) {
            u3Var.dismiss();
        }
        java.lang.Boolean aj6 = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).aj();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = kotlin.jvm.internal.o.b(aj6, bool);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsMusicUI", "updateMusicRecommend openMusicRecommend: " + b17);
        settingsMusicUI2.W6("settings_music_recommend", true);
        settingsMusicUI2.W6("settings_music_recommend_tips", true);
        com.tencent.mm.ui.base.preference.r rVar = settingsMusicUI2.f160578d;
        com.tencent.mm.ui.base.preference.Preference h17 = rVar != null ? ((com.tencent.mm.ui.base.preference.h0) rVar).h("settings_music_recommend") : null;
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = h17 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h17 : null;
        if (checkBoxPreference != null) {
            checkBoxPreference.f197785v = false;
            checkBoxPreference.O(b17);
        }
        com.tencent.mm.ui.base.preference.r rVar2 = settingsMusicUI2.f160578d;
        if (rVar2 != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar2).notifyDataSetChanged();
        }
        if (urgen.ur_0025.UR_29AB.UR_4AB6()) {
            bw5.lc0 Ui = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Ui();
            boolean b18 = kotlin.jvm.internal.o.b(Ui != null ? java.lang.Boolean.valueOf(Ui.f29740g) : null, bool);
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsMusicUI", "updateMusicQuality open: " + b18);
            settingsMusicUI2.W6("settings_music_quality", true);
            settingsMusicUI2.W6("settings_music_quality_desc", true);
            com.tencent.mm.ui.base.preference.r rVar3 = settingsMusicUI2.f160578d;
            java.lang.Object h18 = rVar3 != null ? ((com.tencent.mm.ui.base.preference.h0) rVar3).h("settings_music_quality") : null;
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = h18 instanceof com.tencent.mm.ui.base.preference.CheckBoxPreference ? (com.tencent.mm.ui.base.preference.CheckBoxPreference) h18 : null;
            if (checkBoxPreference2 != null) {
                checkBoxPreference2.f197785v = false;
                checkBoxPreference2.O(b18);
            }
            com.tencent.mm.ui.base.preference.r rVar4 = settingsMusicUI2.f160578d;
            if (rVar4 != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar4).notifyDataSetChanged();
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsMusicUI", "abtest not open");
        }
        settingsMusicUI2.Y6();
        return jz5.f0.f302826a;
    }
}
