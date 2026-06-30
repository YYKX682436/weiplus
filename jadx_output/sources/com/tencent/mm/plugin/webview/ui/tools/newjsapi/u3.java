package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/u3;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/fav/api/DoFavoriteData;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes8.dex */
public final class u3 implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.fav.api.DoFavoriteData doFavoriteData = (com.tencent.mm.plugin.fav.api.DoFavoriteData) obj;
        if (doFavoriteData == null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_result_code", 2);
            return bundle;
        }
        java.lang.String str = doFavoriteData.f100222d;
        if (str == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            throw null;
        }
        java.lang.String str2 = doFavoriteData.f100223e;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("excerptJson");
            throw null;
        }
        java.lang.String str3 = doFavoriteData.f100224f;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("cover");
            throw null;
        }
        java.lang.String str4 = doFavoriteData.f100225g;
        if (str4 == null) {
            kotlin.jvm.internal.o.o("initUrl");
            throw null;
        }
        java.lang.String str5 = doFavoriteData.f100226h;
        if (str5 == null) {
            kotlin.jvm.internal.o.o("pageKey");
            throw null;
        }
        java.lang.String str6 = doFavoriteData.f100227i;
        if (str6 == null) {
            kotlin.jvm.internal.o.o("displayName");
            throw null;
        }
        java.lang.String str7 = doFavoriteData.f100228m;
        if (str7 == null) {
            kotlin.jvm.internal.o.o("itemShowTypeStr");
            throw null;
        }
        java.lang.String str8 = doFavoriteData.f100229n;
        if (str8 == null) {
            kotlin.jvm.internal.o.o("srcUserName");
            throw null;
        }
        java.lang.String str9 = doFavoriteData.f100230o;
        if (str9 == null) {
            kotlin.jvm.internal.o.o("jsUserName");
            throw null;
        }
        int q17 = com.tencent.mm.plugin.webview.ui.tools.newjsapi.k5.f186304d.q(str, str2, str3, str4, str5, str6, str7, str8, str9);
        o72.a5 a5Var = (o72.a5) i95.n0.c(o72.a5.class);
        java.lang.String str10 = doFavoriteData.f100226h;
        if (str10 == null) {
            kotlin.jvm.internal.o.o("pageKey");
            throw null;
        }
        ((com.tencent.mm.plugin.fav.ui.la) a5Var).getClass();
        o72.r2 rc6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(str10);
        long j17 = rc6 != null ? rc6.field_localId : -1L;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("key_result_code", q17);
        bundle2.putLong("key_result_id", j17);
        return bundle2;
    }
}
