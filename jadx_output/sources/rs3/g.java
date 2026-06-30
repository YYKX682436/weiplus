package rs3;

/* loaded from: classes5.dex */
public class g implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs3.h f399337d;

    public g(rs3.h hVar) {
        this.f399337d = hVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.i();
        if (com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) != 0) {
            rs3.h.wi(this.f399337d);
            gm0.j1.d().q(138, this);
        }
    }
}
