package nj2;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj2.n f337839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(nj2.n nVar) {
        super(0);
        this.f337839d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nj2.n nVar = this.f337839d;
        java.lang.String str = nVar.f337844g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTimerUpdateData linkMicVisitorUserList:");
        gk2.e eVar = nVar.f337842e;
        sb6.append(eVar != null ? ((mm2.o4) eVar.a(mm2.o4.class)).f329318o : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        nVar.m(((mm2.o4) eVar.a(mm2.o4.class)).U.f377129d);
        return jz5.f0.f302826a;
    }
}
