package gf;

/* loaded from: classes7.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.x0 f271182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.skyline.jni.ISkylineResourceLoader.ResourceLoadCallback f271184f;

    public w0(gf.x0 x0Var, java.lang.String str, com.tencent.skyline.jni.ISkylineResourceLoader.ResourceLoadCallback resourceLoadCallback) {
        this.f271182d = x0Var;
        this.f271183e = str;
        this.f271184f = resourceLoadCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] loadResource = this.f271182d.loadResource(this.f271183e);
        com.tencent.skyline.jni.ISkylineResourceLoader.ResourceLoadCallback resourceLoadCallback = this.f271184f;
        if (resourceLoadCallback != null) {
            resourceLoadCallback.onResourceLoaded(loadResource);
        }
    }
}
