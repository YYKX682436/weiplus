package gf;

/* loaded from: classes7.dex */
public final class x0 implements com.tencent.skyline.jni.ISkylineResourceLoader {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.y f271186a;

    public x0(com.tencent.luggage.sdk.jsapi.component.service.y service) {
        kotlin.jvm.internal.o.g(service, "service");
        this.f271186a = service;
        com.tencent.mars.xlog.Log.i("Luggage.SkylineResourceLoaderImpl", service.getAppId() + " init " + service);
    }

    @Override // com.tencent.skyline.jni.ISkylineResourceLoader
    public android.graphics.Bitmap loadBitmap(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.skyline.jni.ISkylineResourceLoader
    public void loadBitmapAsync(java.lang.String str, com.tencent.skyline.jni.ISkylineResourceLoader.BitmapLoadCallback bitmapLoadCallback) {
    }

    @Override // com.tencent.skyline.jni.ISkylineResourceLoader
    public byte[] loadResource(java.lang.String str) {
        if (str == null || r26.n0.N(str)) {
            return new byte[0];
        }
        boolean y17 = r26.i0.y(str, "wxlibfile://", false);
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f271186a;
        if (y17) {
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x17 = yVar.x();
            if (x17 == null) {
                com.tencent.mars.xlog.Log.e("Luggage.SkylineResourceLoaderImpl", "loadResource fail: " + str + ", libReader is null");
                return new byte[0];
            }
            java.lang.String substring = str.substring(12);
            kotlin.jvm.internal.o.f(substring, "substring(...)");
            java.io.InputStream a17 = x17.a(substring);
            if (a17 != null) {
                return ik1.f.b(a17);
            }
            com.tencent.mars.xlog.Log.e("Luggage.SkylineResourceLoaderImpl", "loadResource, fileStream: " + str + " is null");
            return new byte[0];
        }
        try {
            com.tencent.mm.plugin.appbrand.appstorage.u1 fileSystem = yVar.getFileSystem();
            java.io.InputStream readStream = fileSystem != null ? fileSystem.readStream(str) : null;
            if (readStream == null) {
                com.tencent.mars.xlog.Log.e("Luggage.SkylineResourceLoaderImpl", "loadResource, fileStream: " + str + " is null");
                return new byte[0];
            }
            byte[] b17 = ik1.f.b(readStream);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadResource path:");
            sb6.append(str);
            sb6.append(": ");
            sb6.append(b17 != null ? java.lang.Integer.valueOf(b17.length) : null);
            sb6.append(" success");
            com.tencent.mars.xlog.Log.i("Luggage.SkylineResourceLoaderImpl", sb6.toString());
            return b17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Luggage.SkylineResourceLoaderImpl", "loadResource fail: " + e17 + ", fileStream: " + str);
            return new byte[0];
        }
    }

    @Override // com.tencent.skyline.jni.ISkylineResourceLoader
    public void loadResourceAsync(java.lang.String str, com.tencent.skyline.jni.ISkylineResourceLoader.ResourceLoadCallback resourceLoadCallback) {
        ((ku5.t0) ku5.t0.f312615d).a(new gf.w0(this, str, resourceLoadCallback));
    }
}
