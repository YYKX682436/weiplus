package y73;

/* loaded from: classes11.dex */
public class w extends c83.a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y73.q f459765h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y73.q qVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        super(str, str2, str3, z17);
        this.f459765h = qVar;
    }

    @Override // wu5.e
    public void a(java.lang.Object obj) {
        y73.q qVar = this.f459765h;
        c83.a aVar = qVar.f459746d;
        java.lang.String str = aVar.f39674d;
        if (aVar.f39677g) {
            y73.z.b(1);
        } else {
            y73.z.c(1);
            rf0.m mVar = (rf0.m) i95.n0.c(rf0.m.class);
            java.lang.String str2 = qVar.f459746d.f39675e;
            ((qf0.n) mVar).getClass();
            if (str2 != null) {
                ((ku5.t0) ku5.t0.f312615d).g(new qf0.m(str2, ""));
            }
            qVar.b(qVar.f459746d.f39675e);
        }
        qVar.f459746d = null;
    }

    @Override // wu5.e
    public /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
    }
}
