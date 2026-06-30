package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class tg implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI f129880d;

    public tg(com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI finderSettingInfoUI) {
        this.f129880d = finderSettingInfoUI;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("FinderSettingInfoUI", "modifyMpIdentity onModifyResult: ret = " + ret.getInteger(1));
        int integer = ret.getInteger(1);
        com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI finderSettingInfoUI = this.f129880d;
        if (integer != 0) {
            com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) finderSettingInfoUI.getPreferenceScreen()).h("settings_mp_identity_switch");
            kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
            androidx.appcompat.app.AppCompatActivity context = finderSettingInfoUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            int i17 = com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI.f128721p;
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) h17).O(finderSettingInfoUI.V6(context));
            db5.t7.makeText(finderSettingInfoUI, finderSettingInfoUI.getString(com.tencent.mm.R.string.f9b), 0).show();
        } else {
            g92.b bVar = g92.b.f269769e;
            ya2.b2 b2Var = finderSettingInfoUI.f128723e;
            java.lang.String str = b2Var != null ? b2Var.field_username : null;
            if (str == null) {
                str = "";
            }
            m92.b j37 = g92.a.j3(bVar, str, false, 2, null);
            int i18 = j37 != null ? j37.field_extFlag : 0;
            int i19 = req.getInteger(21) == 1 ? 16777216 | i18 : (-16777217) & i18;
            ya2.b2 b2Var2 = finderSettingInfoUI.f128723e;
            java.lang.String str2 = b2Var2 != null ? b2Var2.field_username : null;
            m92.c cVar = new m92.c(str2 != null ? str2 : "");
            cVar.field_extFlag = i19;
            bVar.C(cVar, m92.j.f324997o);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("NEED_REFRESH_CONTACT", true);
            intent.putExtra("ACCOUNT_USERNAME", finderSettingInfoUI.f128722d);
            finderSettingInfoUI.setResult(-1, intent);
        }
        az2.f fVar = finderSettingInfoUI.f128726h;
        if (fVar != null) {
            fVar.b();
        }
    }
}
