package rk4;

/* loaded from: classes11.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ll4.c f396857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rk4.q3 f396858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396860g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396861h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(ll4.c cVar, rk4.q3 q3Var, java.lang.String str, java.lang.String str2, yz5.l lVar) {
        super(0);
        this.f396857d = cVar;
        this.f396858e = q3Var;
        this.f396859f = str;
        this.f396860g = str2;
        this.f396861h = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        rk4.q3 q3Var = this.f396858e;
        ll4.c cVar = this.f396857d;
        if (cVar != null) {
            com.tencent.pigeon.ting.TingMVTextureUpdateListenerApi tingMVTextureUpdateListenerApi = q3Var.f396931h;
            java.lang.String str2 = q3Var.f396933m;
            if (tingMVTextureUpdateListenerApi == null) {
                rk4.k5.d("prepared, " + cVar + ", but api not ready, plugin:" + cVar.hashCode(), str2);
            } else {
                int videoWidth = cVar.videoWidth();
                int videoHeight = cVar.videoHeight();
                rk4.k5.e("prepared, plugin:" + cVar.hashCode() + ", " + cVar + ", width:" + videoWidth + ", height:" + videoHeight, str2);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str3 = this.f396859f;
                sb6.append(str3);
                sb6.append('_');
                java.lang.String str4 = this.f396860g;
                sb6.append(str4);
                java.lang.String sb7 = sb6.toString();
                java.util.HashMap hashMap = q3Var.f396927d;
                java.lang.Object obj = hashMap.get(sb7);
                boolean z17 = obj == null;
                if (z17) {
                    rk4.k5.e("creating new SurfaceProducer for key=" + sb7 + ", plugin:" + cVar.hashCode(), str2);
                    io.flutter.view.TextureRegistry textureRegistry = q3Var.f396930g;
                    obj = textureRegistry != null ? textureRegistry.createSurfaceProducer() : null;
                    str = str3;
                } else {
                    str = str3;
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("reusing existing SurfaceProducer for key=");
                    sb8.append(sb7);
                    sb8.append(", entryId:");
                    io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = (io.flutter.view.TextureRegistry.SurfaceProducer) obj;
                    sb8.append(surfaceProducer != null ? java.lang.Long.valueOf(surfaceProducer.id()) : null);
                    sb8.append(", plugin:");
                    sb8.append(cVar.hashCode());
                    rk4.k5.e(sb8.toString(), str2);
                }
                io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer2 = (io.flutter.view.TextureRegistry.SurfaceProducer) obj;
                if (surfaceProducer2 != null) {
                    hashMap.put(sb7, obj);
                    surfaceProducer2.setSize(videoWidth, videoHeight);
                    cVar.setSurface(surfaceProducer2.getSurface());
                    com.tencent.pigeon.ting.TingTextureInfo tingTextureInfo = new com.tencent.pigeon.ting.TingTextureInfo(java.lang.Long.valueOf(surfaceProducer2.id()), java.lang.Long.valueOf(videoWidth), java.lang.Long.valueOf(videoHeight));
                    this.f396861h.invoke(tingTextureInfo);
                    rk4.k5.e("TextureInfo created: plugin:" + surfaceProducer2.hashCode() + ", textureId:" + tingTextureInfo.getTextureId() + ", width:" + tingTextureInfo.getTextureWidth() + ", height:" + tingTextureInfo.getTextureHeight() + ", isNewEntry:" + z17 + ", sending onTextureUpdate", str2);
                    com.tencent.pigeon.ting.TingMVTextureUpdateListenerApi tingMVTextureUpdateListenerApi2 = q3Var.f396931h;
                    if (tingMVTextureUpdateListenerApi2 != null) {
                        tingMVTextureUpdateListenerApi2.onTextureUpdate(str, str4, tingTextureInfo, rk4.m3.f396843d);
                    }
                } else {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder("createOnPrepared onPrepared, entry is null, textureRegistry=");
                    sb9.append(q3Var.f396930g != null);
                    sb9.append(", plugin:");
                    sb9.append(cVar.hashCode());
                    rk4.k5.e(sb9.toString(), str2);
                }
            }
        } else {
            rk4.k5.e("createOnPrepared: onPrepared called with null handler, plugin:" + q3Var.hashCode(), q3Var.f396933m);
        }
        return jz5.f0.f302826a;
    }
}
