package mc5;

/* loaded from: classes9.dex */
public final class t implements com.tencent.mm.ui.chatting.gallery.d1 {
    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public boolean Fc(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        kotlin.jvm.internal.o.g(sourceImgInfo, "sourceImgInfo");
        return sourceImgInfo.f71259e == 15;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public void Ob(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo, boolean z17) {
        java.lang.String str;
        if (sourceImgInfo != null) {
            try {
                str = sourceImgInfo.f71258d;
            } catch (java.lang.Exception e17) {
                e17.toString();
                return;
            }
        } else {
            str = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        cl0.g gVar = new cl0.g(str);
        java.lang.String optString = gVar.optString("appId", "");
        java.lang.String optString2 = gVar.optString("query", "");
        java.lang.String optString3 = gVar.optString("minVersion", "");
        java.lang.String optString4 = gVar.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
        boolean optBoolean = gVar.optBoolean("isTransparent", false);
        q80.d0 d0Var = new q80.d0();
        d0Var.f360649a = optString;
        d0Var.f360651c = optString2;
        d0Var.f360654f = optString3;
        d0Var.f360650b = optString4;
        d0Var.f360652d = java.lang.Boolean.valueOf(optBoolean);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(com.tencent.mm.sdk.platformtools.x2.f193071a, d0Var, new mc5.s(d0Var));
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String Ze(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        java.lang.Integer valueOf = sourceImgInfo != null ? java.lang.Integer.valueOf(sourceImgInfo.f71259e) : null;
        if (valueOf == null || valueOf.intValue() != 15) {
            return "";
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nit);
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String dd(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        java.lang.Integer valueOf = sourceImgInfo != null ? java.lang.Integer.valueOf(sourceImgInfo.f71259e) : null;
        if (valueOf == null || valueOf.intValue() != 15) {
            return "";
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nit);
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String ge(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        java.lang.Integer valueOf = sourceImgInfo != null ? java.lang.Integer.valueOf(sourceImgInfo.f71259e) : null;
        if (valueOf == null || valueOf.intValue() != 15) {
            return "";
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nit);
        kotlin.jvm.internal.o.d(string);
        return string;
    }
}
