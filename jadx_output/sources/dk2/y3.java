package dk2;

/* loaded from: classes3.dex */
public final class y3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f234367a;

    public y3(cm2.f0 f0Var) {
        this.f234367a = f0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && (k0Var = dk2.ef.f233380e) != null) {
            qo0.b bVar = qo0.b.N2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 J2 = zl2.r4.f473950a.J2(this.f234367a);
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", J2 != null ? J2.toByteArray() : null);
            k0Var.statusChange(bVar, bundle);
        }
        return jz5.f0.f302826a;
    }
}
