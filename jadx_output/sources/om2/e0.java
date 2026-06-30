package om2;

/* loaded from: classes10.dex */
public final class e0 extends om2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final om2.o f346299a;

    /* renamed from: b, reason: collision with root package name */
    public final om2.p f346300b;

    public e0(om2.o songInfo, om2.p pVar) {
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        this.f346299a = songInfo;
        this.f346300b = pVar;
    }

    @Override // om2.d0
    public boolean a(om2.d0 newState) {
        r45.xn1 xn1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.xn1 xn1Var2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        kotlin.jvm.internal.o.g(newState, "newState");
        if (om2.e0.class != newState.getClass()) {
            return true;
        }
        om2.e0 e0Var = (om2.e0) newState;
        java.lang.String str = null;
        om2.o oVar = this.f346299a;
        java.lang.String username = (oVar == null || (xn1Var2 = oVar.f346361b) == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact2.getUsername();
        om2.o oVar2 = e0Var.f346299a;
        if (oVar2 != null && (xn1Var = oVar2.f346361b) != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
            str = finderContact.getUsername();
        }
        return (kotlin.jvm.internal.o.b(username, str) && kotlin.jvm.internal.o.b(this.f346300b, e0Var.f346300b)) ? false : true;
    }
}
