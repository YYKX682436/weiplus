package gx;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx.e f276169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f276170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276171f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gx.e eVar, java.util.HashMap hashMap, java.lang.String str) {
        super(2);
        this.f276169d = eVar;
        this.f276170e = hashMap;
        this.f276171f = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        gx.e eVar = this.f276169d;
        java.util.HashMap hashMap = this.f276170e;
        if (z17) {
            eVar.s().invoke(eVar.l(hashMap));
        } else {
            com.tencent.mars.xlog.Log.i("MBJsApiGetBrandServiceInfo", "bobkw getBrandServiceInfo sessionId=" + this.f276171f + ", path=" + str2);
            hashMap.put("jumpPaths", str2);
            hashMap.put("jumpPathDepth", java.lang.String.valueOf(yw.h1.f466343l));
            eVar.s().invoke(eVar.l(hashMap));
        }
        return jz5.f0.f302826a;
    }
}
