package ln;

/* loaded from: classes11.dex */
public class p implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f319632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f319633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ln.q f319634c;

    public p(ln.q qVar, java.lang.String str, java.lang.String str2) {
        this.f319634c = qVar;
        this.f319632a = str;
        this.f319633b = str2;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.IMUnionRoom2AssociateRoomNewXmlConsumer", "getContactCallBack username:%s succ:%s", objArr);
        if (z17) {
            com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
            java.lang.String str2 = this.f319632a;
            this.f319634c.b(a17.z0(str2), str2, this.f319633b);
        }
    }
}
