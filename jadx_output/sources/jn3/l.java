package jn3;

/* loaded from: classes8.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn3.m f300789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jn3.m mVar) {
        super(1);
        this.f300789d = mVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        ra0.b0 state = (ra0.b0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        jn3.m mVar = this.f300789d;
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof sa0.k)) {
            sa0.k kVar = (sa0.k) dVar;
            int i17 = kVar.f405256c;
            int i18 = kVar.f405257d;
            com.tencent.mm.protobuf.g gVar = kVar.f405255b;
            if (gVar == null || (str = gVar.toString()) == null) {
                str = "";
            }
            mVar.T6(4, i17, i18, false, str);
        }
        jn3.m mVar2 = this.f300789d;
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof sa0.j)) {
            mVar2.T6(4, 1005, 3, true, null);
        }
        jn3.m mVar3 = this.f300789d;
        j75.d dVar3 = state.f298066d;
        if (dVar3 != null && (dVar3 instanceof sa0.m)) {
            mVar3.T6(4, ((sa0.m) dVar3).f405258b, 3, true, null);
        }
        jn3.m mVar4 = this.f300789d;
        j75.d dVar4 = state.f298066d;
        if (dVar4 != null && (dVar4 instanceof sa0.l)) {
            mVar4.T6(4, 1008, 7, true, null);
        }
        return jz5.f0.f302826a;
    }
}
