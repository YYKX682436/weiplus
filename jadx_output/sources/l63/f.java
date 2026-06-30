package l63;

/* loaded from: classes8.dex */
public class f implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m63.e f316772d;

    public f(l63.h hVar, m63.e eVar) {
        this.f316772d = eVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        m63.e eVar = this.f316772d;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity = ((com.tencent.mm.plugin.base.stub.z0) eVar).f93826b;
            if (str != null) {
                int i19 = com.tencent.mm.plugin.base.stub.WXEntryActivity.f93685y;
                wXEntryActivity.l7(str);
                return 0;
            }
            java.lang.String string = wXEntryActivity.getResources().getString(com.tencent.mm.R.string.f493129j46);
            int i27 = com.tencent.mm.plugin.base.stub.WXEntryActivity.f93685y;
            wXEntryActivity.l7(string);
            return 0;
        }
        r45.og3 og3Var = (r45.og3) oVar.f70711b.f70700a;
        if (og3Var == null) {
            return 0;
        }
        r45.l74 l74Var = og3Var.f382234e;
        com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo liteAppBizDataInfo = new com.tencent.mm.plugin.gamesharecard.LiteAppBizDataInfo(l74Var.f379191d, l74Var.f379192e, l74Var.f379193f, l74Var.f379194g, java.lang.Integer.valueOf(l74Var.f379195h), og3Var.f382234e.f379196i);
        java.lang.String str2 = og3Var.f382233d;
        com.tencent.mm.plugin.base.stub.z0 z0Var = (com.tencent.mm.plugin.base.stub.z0) eVar;
        com.tencent.mm.plugin.base.stub.WXEntryActivity wXEntryActivity2 = z0Var.f93826b;
        if (str2 == null) {
            java.lang.String string2 = wXEntryActivity2.getResources().getString(com.tencent.mm.R.string.f493129j46);
            int i28 = com.tencent.mm.plugin.base.stub.WXEntryActivity.f93685y;
            wXEntryActivity2.l7(string2);
            return 0;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("kWXEntryActivity_bundle_game_share_card_msgid", str2);
        bundle.putParcelable("kWXEntryActivity_bundle_game_share_card_liteapp", liteAppBizDataInfo);
        int i29 = com.tencent.mm.plugin.base.stub.WXEntryActivity.f93685y;
        wXEntryActivity2.b7(z0Var.f93825a, bundle);
        return 0;
    }
}
