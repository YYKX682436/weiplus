package zw;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final zw.a f476485a = new zw.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f476486b = com.tencent.mm.vfs.q7.c("bizcache") + "/media_tmp/";

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(q75.g.d(str2));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        java.lang.String str3 = (java.lang.String) m521constructorimpl;
        if (str3 == null) {
            str3 = q75.g.c(str2);
        }
        java.lang.String a17 = q75.g.a(str3);
        if (a17 == null || a17.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizFlutterSelectPhotoFileHelper", "resolveVideoExt fallback, mime=" + str3 + " path=" + str2);
            a17 = "mp4";
        } else {
            kotlin.jvm.internal.o.d(a17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append("_parse_");
        byte[] bytes = (str2 + java.lang.System.currentTimeMillis()).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append('.');
        sb6.append(a17);
        return sb6.toString();
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str2);
            m521constructorimpl = kotlin.Result.m521constructorimpl(n07 != null ? n07.outMimeType : null);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.String str3 = (java.lang.String) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
        if (str3 == null) {
            str3 = q75.g.c(str2);
        }
        java.lang.String a17 = q75.g.a(str3);
        if (a17 == null || a17.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizFlutterSelectPhotoFileHelper", "resolveImageExt fallback, mime=" + str3 + " path=" + str2);
            a17 = "jpeg";
        } else {
            kotlin.jvm.internal.o.d(a17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        byte[] bytes = (str2 + java.lang.System.currentTimeMillis()).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append('.');
        sb6.append(a17);
        return sb6.toString();
    }

    public final java.lang.String c(java.lang.String mediaUniqueKey) {
        kotlin.jvm.internal.o.g(mediaUniqueKey, "mediaUniqueKey");
        java.lang.String str = f476486b + mediaUniqueKey + '/';
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterSelectPhotoFileHelper", "create biz livePhoto dir:" + str + " result:" + com.tencent.mm.vfs.w6.u(str));
        }
        return str;
    }

    public final long d(java.lang.String fromPath, java.lang.String toPath) {
        kotlin.jvm.internal.o.g(fromPath, "fromPath");
        kotlin.jvm.internal.o.g(toPath, "toPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterSelectPhotoFileHelper", "copyFile >> fromPath: " + fromPath + " toPath: " + toPath);
        if (!r26.n0.B(fromPath, f476486b, false)) {
            return com.tencent.mm.vfs.w6.d(fromPath, toPath, false);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BizFlutterSelectPhotoFileHelper", "is already copy");
        return -1L;
    }
}
