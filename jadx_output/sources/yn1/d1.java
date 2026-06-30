package yn1;

/* loaded from: classes9.dex */
public final class d1 implements vn1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463637a;

    public d1(yn1.r2 r2Var) {
        this.f463637a = r2Var;
    }

    @Override // vn1.n
    public void a() {
        com.tencent.wechat.aff.migration.g gVar = this.f463637a.f463810a;
        if (gVar != null) {
            gVar.p();
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }

    @Override // vn1.n
    public void b() {
        com.tencent.wechat.aff.migration.g gVar = this.f463637a.f463810a;
        if (gVar != null) {
            gVar.t();
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }
}
