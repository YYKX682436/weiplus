package r14;

/* loaded from: classes8.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r14.y f368610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r14.y yVar, java.lang.String str) {
        super(1);
        this.f368610d = yVar;
        this.f368611e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String imgPath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(imgPath, "imgPath");
        java.lang.String str = this.f368611e;
        r14.y yVar = this.f368610d;
        r14.c cVar = new r14.c(str, yVar, imgPath);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.a aVar = new jd5.a();
        aVar.p(imgPath);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        com.tencent.mm.ui.MMActivity mMActivity = yVar.f368633a;
        n13.t tVar = new n13.t();
        tVar.f334133a = cVar;
        tVar.f334138f.f334139a = 8;
        ((dk5.y) a0Var).wi(mMActivity, aVar, str, tVar);
        return jz5.f0.f302826a;
    }
}
