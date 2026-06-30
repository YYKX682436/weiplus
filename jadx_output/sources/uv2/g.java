package uv2;

/* loaded from: classes10.dex */
public final class g implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.k f431387d;

    public g() {
        if (!dn.k.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(dn.k.class.getClassLoader(), new java.lang.Class[]{dn.k.class}, pm0.v.f356803b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.cdn.keep_TaskInfo.TaskCallback");
        }
        this.f431387d = (dn.k) newProxyInstance;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        this.f431387d.O(str, byteArrayOutputStream);
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[preUploadCallback] mediaId:");
        sb6.append(str);
        sb6.append(" startRet:");
        sb6.append(i17);
        sb6.append(" sceneResult:");
        sb6.append(hVar != null ? hVar.toString() : null);
        com.tencent.mars.xlog.Log.i("LogPost.FinderMediaUploadManager", sb6.toString());
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return this.f431387d.w(str, bArr);
    }
}
