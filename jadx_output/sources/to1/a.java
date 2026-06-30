package to1;

/* loaded from: classes15.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ to1.c f420902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ro1.d f420903g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, java.lang.String str2, to1.c cVar, ro1.d dVar) {
        super(0);
        this.f420900d = str;
        this.f420901e = str2;
        this.f420902f = cVar;
        this.f420903g = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f420900d;
        java.io.File file = new java.io.File(str);
        long length = file.length();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("copyLocal2UDisk, localPath=");
        sb6.append(str);
        sb6.append(", remotePath=");
        java.lang.String str2 = this.f420901e;
        sb6.append(str2);
        sb6.append(", exist=");
        sb6.append(file.exists());
        sb6.append(", len=");
        sb6.append(length);
        com.tencent.mars.xlog.Log.i("MicroMsg.SAFUDiskChannel", sb6.toString());
        to1.k kVar = this.f420902f.f420905a;
        if (kVar == null) {
            kotlin.jvm.internal.o.o("documentLruCache");
            throw null;
        }
        to1.r a17 = kVar.a(str2, true);
        if (a17 == null) {
            return ro1.f.f397981g;
        }
        android.net.Uri fromFile = android.net.Uri.fromFile(file);
        kotlin.jvm.internal.o.d(fromFile);
        if (a17.f420937b) {
            return ro1.f.f397982h;
        }
        to1.i iVar = to1.i.f420915a;
        android.net.Uri destUri = a17.f420936a;
        kotlin.jvm.internal.o.g(destUri, "destUri");
        return (ro1.f) bm5.v1.a("copyFile", new to1.h(fromFile, destUri, this.f420903g));
    }
}
