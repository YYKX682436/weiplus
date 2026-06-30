package ky;

/* loaded from: classes14.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky.a f313331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f313332e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ky.a aVar, float f17) {
        super(1);
        this.f313331d = aVar;
        this.f313332e = f17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ky.d0 gestureState = (ky.d0) obj;
        kotlin.jvm.internal.o.g(gestureState, "gestureState");
        boolean z17 = gestureState instanceof ky.y;
        float f17 = this.f313332e;
        ky.a aVar = this.f313331d;
        if (z17) {
            ((n0.q4) aVar.f313329b).setValue(java.lang.Boolean.valueOf(((ky.y) gestureState).f313447b > ((float) i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, f17))));
        } else if (!(gestureState instanceof ky.z)) {
            if (gestureState instanceof ky.a0) {
                ky.m0 m0Var = ky.m0.f313393e;
                aVar.getClass();
                ((n0.q4) aVar.f313328a).setValue(m0Var);
            } else if (gestureState instanceof ky.c0) {
                ((n0.q4) aVar.f313329b).setValue(java.lang.Boolean.FALSE);
            } else if (gestureState instanceof ky.x) {
                ky.m0 m0Var2 = ((ky.x) gestureState).f313445b > ((float) i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, f17)) ? ky.m0.f313394f : ky.m0.f313392d;
                aVar.getClass();
                ((n0.q4) aVar.f313328a).setValue(m0Var2);
            } else if (gestureState instanceof ky.b0) {
                ky.m0 m0Var3 = ky.m0.f313392d;
                aVar.getClass();
                ((n0.q4) aVar.f313328a).setValue(m0Var3);
            }
        }
        return jz5.f0.f302826a;
    }
}
