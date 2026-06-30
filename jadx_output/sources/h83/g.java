package h83;

@j95.b
/* loaded from: classes9.dex */
public final class g extends i95.w implements gk0.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f279553d;

    static {
        new h83.f(null);
        f279553d = jz5.h.b(h83.e.f279552d);
    }

    public void Ai(android.widget.ImageView imageView, java.lang.String localPath, gk0.k bitmapOptions) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(localPath, "localPath");
        kotlin.jvm.internal.o.g(bitmapOptions, "bitmapOptions");
        gk0.j jVar = new gk0.j(kz5.c0.k(gk0.l.class, gk0.r.class, gk0.f.class, gk0.w.class, gk0.o.class));
        g75.z x66 = gk0.n0.x6(this, Di(localPath, bitmapOptions), bitmapOptions, imageView, null, 8, null);
        x66.l("Common_TempFolder", Vi());
        x66.l("Common_TargetPath", localPath);
        jVar.a(x66, null);
    }

    public java.lang.String Bi(gk0.h httpParams, gk0.k bitmapOptions) {
        kotlin.jvm.internal.o.g(httpParams, "httpParams");
        kotlin.jvm.internal.o.g(bitmapOptions, "bitmapOptions");
        return Di(httpParams.f272424a, bitmapOptions);
    }

    public java.lang.String Di(java.lang.String targetPath, gk0.k bitmapOptions) {
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        kotlin.jvm.internal.o.g(bitmapOptions, "bitmapOptions");
        java.lang.String str = bitmapOptions.f272431b + '_' + bitmapOptions.f272430a + '_' + bitmapOptions.f272432c + '_' + bitmapOptions.f272433d + '_' + targetPath;
        try {
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("utf8");
            kotlin.jvm.internal.o.f(forName, "forName(...)");
            byte[] bytes = str.getBytes(forName);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            kotlin.jvm.internal.o.d(g17);
            return g17;
        } catch (java.lang.Exception unused) {
            java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
            kotlin.jvm.internal.o.f(defaultCharset, "defaultCharset(...)");
            byte[] bytes2 = str.getBytes(defaultCharset);
            kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
            java.lang.String g18 = kk.k.g(bytes2);
            kotlin.jvm.internal.o.d(g18);
            return g18;
        }
    }

    public gk0.b Ni() {
        return new gk0.b(kz5.c0.k(gk0.c.class, gk0.r.class, gk0.f.class, gk0.g.class));
    }

    public gk0.j Ri() {
        return new gk0.j(kz5.c0.k(gk0.l.class, gk0.r.class, gk0.f.class, gk0.w.class, gk0.g.class, gk0.o.class));
    }

    public g75.z Ui(java.lang.String imageKey, gk0.k bitmapOptions, android.widget.ImageView imageView, java.lang.String targetPath) {
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        kotlin.jvm.internal.o.g(bitmapOptions, "bitmapOptions");
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        g75.z zVar = new g75.z();
        zVar.l("Common_ImageKey", imageKey);
        zVar.l("Common_TempFolder", Vi());
        zVar.l("Common_ImageViewRef", new d75.c(imageView));
        zVar.l("Common_TargetPath", targetPath);
        zVar.l("Common_BitmapOptions", bitmapOptions);
        zVar.l("Common_ImageViewRefMap", (java.util.HashMap) ((jz5.n) f279553d).getValue());
        zVar.l("Common_StartTimestamp", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        return zVar;
    }

    public com.tencent.mm.vfs.r6 Vi() {
        java.lang.String str = gm0.j1.b().j() + "_CommonImageLoader";
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        return lp0.b.h0(str);
    }

    public void wi(android.widget.ImageView imageView, java.lang.String url, gk0.k bitmapOptions) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(bitmapOptions, "bitmapOptions");
        gk0.h hVar = new gk0.h(url);
        g75.z x66 = gk0.n0.x6(this, Bi(hVar, bitmapOptions), bitmapOptions, imageView, null, 8, null);
        x66.l("Common_TempFolder", Vi());
        x66.l("Common_HttpParams", hVar);
        x66.l("Common_ImageViewRefMap", (java.util.HashMap) ((jz5.n) f279553d).getValue());
        gk0.j.b(Ri(), x66, null, 2, null);
    }
}
