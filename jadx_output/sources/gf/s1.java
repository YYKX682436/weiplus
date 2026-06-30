package gf;

/* loaded from: classes7.dex */
public final class s1 extends ef.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gf.a2 f271171a;

    public s1(gf.a2 a2Var) {
        this.f271171a = a2Var;
    }

    @Override // ef.b
    public android.content.Context b() {
        com.tencent.luggage.sdk.jsapi.component.b bVar = (com.tencent.luggage.sdk.jsapi.component.b) this.f271171a.f271013e.F();
        if (bVar != null) {
            return bVar.v1();
        }
        return null;
    }
}
