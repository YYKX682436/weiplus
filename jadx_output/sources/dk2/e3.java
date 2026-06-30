package dk2;

/* loaded from: classes3.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(dk2.r4 r4Var, yz5.p pVar) {
        super(2);
        this.f233348d = r4Var;
        this.f233349e = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.q62 q62Var = (r45.q62) obj2;
        if (booleanValue) {
            dk2.r4 r4Var = this.f233348d;
            db5.t7.h(r4Var.M(), i65.a.r(r4Var.M(), com.tencent.mm.R.string.edk));
        }
        yz5.p pVar = this.f233349e;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.valueOf(booleanValue), q62Var);
        }
        return jz5.f0.f302826a;
    }
}
