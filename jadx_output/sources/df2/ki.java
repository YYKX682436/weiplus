package df2;

/* loaded from: classes3.dex */
public final class ki extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wi f230582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(df2.wi wiVar, java.lang.String str) {
        super(0);
        this.f230582d = wiVar;
        this.f230583e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        boolean w17;
        r45.z53 z53Var;
        java.lang.String str2;
        java.lang.String str3;
        r45.z53 z53Var2;
        r45.z53 z53Var3;
        r45.z53 z53Var4;
        r45.z53 z53Var5;
        java.lang.String string;
        r45.z53 z53Var6;
        r45.z53 z53Var7;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpGame ");
        df2.wi wiVar = this.f230582d;
        r45.n73 c76 = wiVar.c7();
        sb6.append((c76 == null || (z53Var7 = (r45.z53) c76.getCustom(1)) == null) ? null : z53Var7.getString(4));
        sb6.append(", ");
        r45.n73 c77 = wiVar.c7();
        sb6.append((c77 == null || (z53Var6 = (r45.z53) c77.getCustom(1)) == null) ? null : z53Var6.getString(0));
        sb6.append(", ");
        java.lang.String str4 = this.f230583e;
        sb6.append(str4);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str5 = wiVar.f231690m;
        com.tencent.mars.xlog.Log.i(str5, sb7);
        java.lang.String t17 = r26.i0.t(r26.i0.t(str4, "=", "%3d", false), "&", "%26", false);
        java.lang.String concat = "JUNMFORM_Pandora_WeChatLive_ShiPinHao_".concat(t17);
        r45.xl6 e76 = wiVar.e7();
        if (e76 != null && (string = e76.getString(4)) != null) {
            concat = "JUNMFORM_Pandora_WeChatLive_ShiPinHao_AuthCode_" + string + "_Start_" + t17;
        }
        com.tencent.mars.xlog.Log.i(str5, "jumpGame buff:" + concat);
        com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
        wXAppExtendObject.extInfo = concat;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageExt = concat;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        r45.n73 c78 = wiVar.c7();
        if (c78 == null || (z53Var5 = (r45.z53) c78.getCustom(1)) == null || (str = z53Var5.getString(0)) == null) {
            str = "";
        }
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m i17 = com.tencent.mm.pluginsdk.model.app.w.i(str, Integer.MAX_VALUE);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("jumpGame, openId:");
        sb8.append(i17 != null ? i17.field_openId : null);
        sb8.append(", appInfo:");
        sb8.append(i17 == null);
        com.tencent.mars.xlog.Log.i(str5, sb8.toString());
        df2.si siVar = new df2.si(wiVar);
        r45.xl6 e77 = wiVar.e7();
        if ((e77 != null && e77.getInteger(2) == 1) || wiVar.f231691n) {
            java.lang.String str6 = i17.field_packageName;
            java.lang.String str7 = str6 == null ? "" : str6;
            com.tencent.mars.xlog.Log.i(str5, "jumpGame without openId, pkg:".concat(str7));
            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
            android.content.Context O6 = wiVar.O6();
            r45.n73 c79 = wiVar.c7();
            java.lang.String string2 = (c79 == null || (z53Var = (r45.z53) c79.getCustom(1)) == null) ? null : z53Var.getString(0);
            android.os.Bundle bundle = new android.os.Bundle();
            ((kt.c) i0Var2).getClass();
            w17 = com.tencent.mm.pluginsdk.model.app.w.w(O6, str7, wXMediaMessage, string2, "", 2, siVar, bundle);
        } else {
            lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
            android.content.Context O62 = wiVar.O6();
            r45.n73 c710 = wiVar.c7();
            w17 = ((kt.c) i0Var3).fj(O62, (c710 == null || (z53Var4 = (r45.z53) c710.getCustom(1)) == null) ? null : z53Var4.getString(0), wXMediaMessage, 2, siVar, new android.os.Bundle());
        }
        if (!w17) {
            com.tencent.mars.xlog.Log.w(str5, "launchAppByWeChat failed, request and toast");
            lt.i0 i0Var4 = (lt.i0) i95.n0.c(lt.i0.class);
            r45.n73 c711 = wiVar.c7();
            if (c711 == null || (z53Var3 = (r45.z53) c711.getCustom(1)) == null || (str2 = z53Var3.getString(0)) == null) {
                str2 = "";
            }
            r45.n73 c712 = wiVar.c7();
            if (c712 == null || (z53Var2 = (r45.z53) c712.getCustom(1)) == null || (str3 = z53Var2.getString(4)) == null) {
                str3 = "";
            }
            ((kt.c) i0Var4).Ri(str2, str3, null);
            db5.t7.makeText(wiVar.O6(), com.tencent.mm.R.string.dgq, 0).show();
        }
        return jz5.f0.f302826a;
    }
}
