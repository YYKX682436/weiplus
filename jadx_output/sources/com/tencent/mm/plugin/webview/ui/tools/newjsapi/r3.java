package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/r3;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/fav/api/DelFavoriteData;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
public final class r3 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.fav.api.DelFavoriteData delFavoriteData = (com.tencent.mm.plugin.fav.api.DelFavoriteData) obj;
        if (delFavoriteData == null) {
            return new com.tencent.mm.ipcinvoker.type.IPCInteger(2);
        }
        java.lang.String str = delFavoriteData.f100215d;
        if (str == null) {
            kotlin.jvm.internal.o.o("excerptKeys");
            throw null;
        }
        java.lang.String str2 = delFavoriteData.f100216e;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("pageKey");
            throw null;
        }
        java.lang.String str3 = delFavoriteData.f100217f;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("initUrl");
            throw null;
        }
        java.lang.String str4 = delFavoriteData.f100218g;
        if (str4 == null) {
            kotlin.jvm.internal.o.o("srcDisplayName");
            throw null;
        }
        java.lang.String str5 = delFavoriteData.f100219h;
        if (str5 == null) {
            kotlin.jvm.internal.o.o("itemShowTypeStr");
            throw null;
        }
        java.lang.String str6 = delFavoriteData.f100220i;
        if (str6 == null) {
            kotlin.jvm.internal.o.o("srcUserName");
            throw null;
        }
        java.lang.String str7 = delFavoriteData.f100221m;
        if (str7 != null) {
            return new com.tencent.mm.ipcinvoker.type.IPCInteger(com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186304d.l(str, str2, str3, str4, str5, str6, str7));
        }
        kotlin.jvm.internal.o.o("jsUserName");
        throw null;
    }
}
