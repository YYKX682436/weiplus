package me5;

/* loaded from: classes4.dex */
public class e extends ih3.n {
    public static void e(me5.e eVar, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, java.lang.String str4) {
        eVar.getClass();
        if (context == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14516, 1, 0, 0, 0);
        android.content.Intent putExtra = new android.content.Intent().putExtra("Contact_User", str);
        putExtra.putExtra("Contact_ChatRoomId", str2);
        putExtra.putExtra("AntispamTicket", str3);
        putExtra.putExtra("room_name", str2);
        putExtra.putExtra("Contact_Scene", 14);
        putExtra.putExtra("key_msg_id", j17);
        putExtra.putExtra("key_msg_talker", str4);
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", putExtra, null);
    }

    @Override // ih3.n
    public java.lang.String a() {
        return "link_profile";
    }

    @Override // ih3.n
    public java.lang.CharSequence b(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.CharSequence charSequence = (java.lang.String) map.get(str + ".separator");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (charSequence == null) {
            charSequence = "、";
        }
        java.lang.CharSequence charSequence2 = charSequence;
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".memberlist.member");
            sb6.append(i17 != 0 ? java.lang.Integer.valueOf(i17) : "");
            java.lang.String sb7 = sb6.toString();
            if (map.get(sb7) == null) {
                return spannableStringBuilder;
            }
            if (i17 != 0) {
                spannableStringBuilder.append(charSequence2);
            }
            java.lang.String str2 = (java.lang.String) map.get(sb7 + ".username");
            java.lang.String str3 = (java.lang.String) map.get(sb7 + ".nickname");
            java.lang.String str4 = (java.lang.String) map.get(sb7 + ".antispam_ticket");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SysMsgHandlerProfile", "hy: can not resolve username or nickname");
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                ((ke0.e) xVar).getClass();
                android.text.SpannableString i18 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3);
                me5.d dVar = new me5.d(this, 1, null, map, bundle, weakReference, weakReference2, str2, str4);
                dVar.setTextBold(true);
                i18.setSpan(dVar, 0, str3.length(), 33);
                spannableStringBuilder.append((java.lang.CharSequence) i18);
            }
            i17++;
        }
    }
}
