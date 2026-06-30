package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class p0 implements com.tencent.mm.plugin.sns.ui.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ArtistUI f170136a;

    public p0(com.tencent.mm.plugin.sns.ui.ArtistUI artistUI) {
        this.f170136a = artistUI;
    }

    public void a(r45.za zaVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
        com.tencent.mm.plugin.sns.ui.ArtistUI artistUI = this.f170136a;
        if (com.tencent.mm.plugin.sns.ui.ArtistUI.U6(artistUI) != null) {
            com.tencent.mm.plugin.sns.ui.ArtistUI.U6(artistUI).setVisibility(0);
            com.tencent.mm.plugin.sns.ui.ArtistUI.U6(artistUI).setUserName(zaVar);
            java.lang.String str = zaVar.f391841d;
            if (str != null && !str.equals("")) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                android.content.SharedPreferences sharedPreferences = artistUI.f166207i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.ArtistUI");
                sharedPreferences.edit().putString("artist_name", str).commit();
            }
            if (com.tencent.mm.plugin.sns.ui.ArtistUI.T6(artistUI) != null) {
                com.tencent.mm.plugin.sns.ui.ArtistUI.T6(artistUI).notifyDataSetChanged();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = artistUI.f166206h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.ArtistUI");
        u3Var.dismiss();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
    }
}
