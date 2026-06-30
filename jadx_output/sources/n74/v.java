package n74;

/* loaded from: classes4.dex */
public abstract class v {
    public static final boolean a(android.content.Context context, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, int i17, com.tencent.mm.modelsns.SnsAdClick snsAdClick) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
            return false;
        }
        if (adClickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = adClickActionInfo.M;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        boolean z18 = adClickActionInfo.f162600p0 == 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doJumpContact, userName is ");
        sb6.append(str);
        sb6.append(", openVideoTab is ");
        sb6.append(z18);
        sb6.append(", source is ");
        sb6.append(i17);
        sb6.append(", snsAdClick clickPos is ");
        sb6.append(snsAdClick != null ? java.lang.Integer.valueOf(snsAdClick.f71469g) : null);
        sb6.append(", snsAdClick clickAction is ");
        sb6.append(snsAdClick != null ? java.lang.Integer.valueOf(snsAdClick.f71470h) : null);
        com.tencent.mars.xlog.Log.i("AdJumpContactHelper", sb6.toString());
        intent.putExtra("Contact_User", str);
        intent.putExtra("KSnsAdTag", snsAdClick);
        intent.putExtra("Contact_Scene", 78);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", i17 == 0 ? 6 : 1);
        if (z18) {
            intent.putExtra("biz_profile_tab_type", 1);
        }
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpContact", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdJumpContactHelper");
        return true;
    }
}
