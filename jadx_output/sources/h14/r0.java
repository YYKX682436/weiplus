package h14;

/* loaded from: classes.dex */
public class r0 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (map != null) {
            java.lang.String str2 = (java.lang.String) map.get(".sysmsg.showtrustedfriends.wording");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("trust_friend_show_tips", str2);
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "setting", ".ui.setting.SettingsTrustFriendUI", intent, null);
        }
    }
}
