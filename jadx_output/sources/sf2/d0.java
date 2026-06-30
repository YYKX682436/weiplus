package sf2;

/* loaded from: classes3.dex */
public final class d0 implements ek2.j2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf2.e0 f407094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407095b;

    public d0(sf2.e0 e0Var, java.lang.String str) {
        this.f407094a = e0Var;
        this.f407095b = str;
    }

    @Override // ek2.j2
    public void a(int i17, int i18, java.lang.String str, r45.u82 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        pm0.v.X(new sf2.c0(i18, this.f407094a, this.f407095b, resp));
    }
}
