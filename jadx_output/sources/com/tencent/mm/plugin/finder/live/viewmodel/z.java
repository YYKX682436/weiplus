package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f117553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117554e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var, java.lang.String str) {
        super(0);
        this.f117553d = a1Var;
        this.f117554e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean w17;
        java.lang.String string;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpGame ");
        com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var = this.f117553d;
        r45.z53 z53Var = a1Var.f116887w;
        sb6.append(z53Var != null ? z53Var.getString(4) : null);
        sb6.append(", ");
        r45.z53 z53Var2 = a1Var.f116887w;
        sb6.append(z53Var2 != null ? z53Var2.getString(0) : null);
        sb6.append(", ");
        java.lang.String str = this.f117554e;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = a1Var.f116871d;
        com.tencent.mars.xlog.Log.i(str2, sb7);
        java.lang.String t17 = r26.i0.t(r26.i0.t(str, "=", "%3d", false), "&", "%26", false);
        java.lang.String concat = "JUNMFORM_Pandora_WeChatLive_ShiPinHao_".concat(t17);
        r45.xl6 xl6Var = a1Var.f116888x;
        if (xl6Var != null && (string = xl6Var.getString(4)) != null) {
            concat = "JUNMFORM_Pandora_WeChatLive_ShiPinHao_AuthCode_" + string + "_Start_" + t17;
        }
        com.tencent.mars.xlog.Log.i(str2, "jumpGame buff:" + concat);
        com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = new com.tencent.mm.opensdk.modelmsg.WXAppExtendObject();
        wXAppExtendObject.extInfo = concat;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXAppExtendObject);
        wXMediaMessage.sdkVer = com.tencent.mm.opensdk.constants.Build.SDK_INT;
        wXMediaMessage.messageExt = concat;
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str3 = a1Var.f116884t;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m i17 = com.tencent.mm.pluginsdk.model.app.w.i(str3, Integer.MAX_VALUE);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("jumpGame, openId:");
        sb8.append(i17 != null ? i17.field_openId : null);
        sb8.append(", appInfo:");
        sb8.append(i17 == null);
        com.tencent.mars.xlog.Log.i(str2, sb8.toString());
        com.tencent.mm.plugin.finder.live.viewmodel.q0 q0Var = new com.tencent.mm.plugin.finder.live.viewmodel.q0(a1Var);
        r45.xl6 xl6Var2 = a1Var.f116888x;
        if ((xl6Var2 != null && xl6Var2.getInteger(2) == 1) || a1Var.A) {
            java.lang.String str4 = i17.field_packageName;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = str4;
            com.tencent.mars.xlog.Log.i(str2, "jumpGame without openId, pkg:".concat(str5));
            lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
            android.app.Activity context = a1Var.getContext();
            java.lang.String str6 = a1Var.f116884t;
            android.os.Bundle bundle = new android.os.Bundle();
            ((kt.c) i0Var2).getClass();
            w17 = com.tencent.mm.pluginsdk.model.app.w.w(context, str5, wXMediaMessage, str6, "", 2, q0Var, bundle);
        } else {
            w17 = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(a1Var.getContext(), a1Var.f116884t, wXMediaMessage, 2, q0Var, new android.os.Bundle());
        }
        if (!w17) {
            com.tencent.mars.xlog.Log.w(str2, "launchAppByWeChat failed, request and toast");
            lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str7 = a1Var.f116884t;
            r45.z53 z53Var3 = a1Var.f116887w;
            ((kt.c) i0Var3).Ri(str7, z53Var3 != null ? z53Var3.getString(4) : null, null);
            db5.t7.makeText(a1Var.getContext(), com.tencent.mm.R.string.dgq, 0).show();
        }
        return jz5.f0.f302826a;
    }
}
