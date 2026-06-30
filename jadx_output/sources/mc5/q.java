package mc5;

/* loaded from: classes9.dex */
public final class q implements com.tencent.mm.ui.chatting.gallery.d1 {
    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public boolean Fc(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        kotlin.jvm.internal.o.g(sourceImgInfo, "sourceImgInfo");
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Qe).getValue()).r()).booleanValue() && sourceImgInfo.f71259e == 12) {
            java.lang.String str = sourceImgInfo.f71258d;
            if (c(str) || b(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public void Ob(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo, boolean z17) {
        if (sourceImgInfo != null) {
            i95.m c17 = i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ya2.e1 e1Var = ya2.e1.f460472a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            e1Var.p(context, sourceImgInfo.f71258d, false, z17 ? 3 : 2, 51);
        }
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public void Y9(java.lang.String eventId, java.lang.String imgSourceUrl, int i17) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(imgSourceUrl, "imgSourceUrl");
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).ij(eventId, imgSourceUrl, i17, zy2.oa.f477522f);
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String Ze(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        return f(sourceImgInfo);
    }

    public final boolean b(java.lang.String str) {
        java.lang.String str2 = "";
        try {
            java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter(dm.i4.COL_USERNAME);
            if (queryParameter != null) {
                str2 = queryParameter;
            }
        } catch (java.lang.UnsupportedOperationException unused) {
        }
        return str2.length() > 0;
    }

    public final boolean c(java.lang.String str) {
        java.lang.String str2 = "";
        try {
            java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("feedid");
            if (queryParameter != null) {
                str2 = queryParameter;
            }
        } catch (java.lang.UnsupportedOperationException unused) {
        }
        return str2.length() > 0;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String dd(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        return f(sourceImgInfo);
    }

    public final java.lang.String f(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        if (sourceImgInfo == null) {
            return "";
        }
        java.lang.String str = sourceImgInfo.f71258d;
        if (c(str)) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nif);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (!b(str)) {
            return "";
        }
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.o9n);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }

    @Override // com.tencent.mm.ui.chatting.gallery.d1
    public java.lang.String ge(com.tencent.mm.modelmulti.SourceImgInfo sourceImgInfo) {
        if (sourceImgInfo == null) {
            return "";
        }
        java.lang.String str = sourceImgInfo.f71258d;
        if (c(str)) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.o9m);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (!b(str)) {
            return "";
        }
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.o9o);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }
}
