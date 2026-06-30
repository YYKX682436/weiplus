package sh2;

/* loaded from: classes3.dex */
public final class j extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final sh2.a f408026f;

    public j(sh2.a action) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f408026f = action;
    }

    @Override // fp0.d
    public void a() {
        sh2.i iVar = new sh2.i(this);
        sh2.c cVar = (sh2.c) this.f408026f;
        cVar.getClass();
        cVar.f408009b++;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.util.y.n(k0Var, kotlinx.coroutines.internal.b0.f310484a, null, new sh2.b(cVar, iVar, null), 2, null);
        }
    }

    @Override // fp0.d
    public java.lang.String d() {
        sh2.c cVar = (sh2.c) this.f408026f;
        return "id_" + cVar.f408014d + '_' + cVar.f408015e + '_' + cVar.f408016f;
    }
}
