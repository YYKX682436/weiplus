package oh1;

/* loaded from: classes9.dex */
public class a2 implements tg3.c1 {
    @Override // tg3.c1
    public java.lang.CharSequence Ya(java.util.Map map, java.lang.String str, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (!gm0.j1.a()) {
            return null;
        }
        if (map == null || map.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaSysTemplateMsgHandler", "values map is null or nil");
            return null;
        }
        android.content.Context context = (android.content.Context) weakReference.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaSysTemplateMsgHandler", "context is null");
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        java.lang.String str3 = (java.lang.String) map.get(str + ".username");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".type"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(str + ".wxaapp_type"), 0);
        java.lang.String str4 = (java.lang.String) map.get(str + ".path");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".forbids");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(sb6.toString()), 0) == 1;
        java.lang.String string = bundle != null ? bundle.getString("conv_talker_username") : "";
        int i17 = bundle != null ? bundle.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) : 0;
        long j17 = bundle != null ? bundle.getLong("msg_sever_id") : 0L;
        java.lang.String string2 = bundle != null ? bundle.getString("send_msg_username") : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaSysTemplateMsgHandler", "link title is null or nil");
            return null;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str2);
        oh1.z1 z1Var = new oh1.z1(this, 1, null, str2, str3, str4, string, weakReference, i17, j17, string2, P, map, bundle, weakReference2);
        z1Var.setTextBold(true);
        spannableString.setSpan(z1Var, 0, str2.length(), 17);
        if (z17 || P2 == 2) {
            return spannableString;
        }
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(P2 != 1 ? com.tencent.mm.R.raw.spannable_app_brand_link_logo : com.tencent.mm.R.raw.spannable_wxa_game_link_logo);
        drawable.setBounds(0, 0, ik1.j0.a(16), ik1.j0.a(16));
        yl1.b bVar = new yl1.b(drawable, 1);
        android.text.SpannableString spannableString2 = new android.text.SpannableString("@ ");
        spannableString2.setSpan(bVar, 0, 1, 33);
        return android.text.TextUtils.concat(spannableString2, spannableString);
    }
}
