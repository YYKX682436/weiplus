package df2;

/* loaded from: classes3.dex */
public final class i6 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.t6 f230382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(df2.t6 t6Var) {
        super(5);
        this.f230382d = t6Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        r45.jr1 jr1Var;
        java.lang.String gestureId = (java.lang.String) obj;
        float floatValue = ((java.lang.Number) obj2).floatValue();
        float floatValue2 = ((java.lang.Number) obj3).floatValue();
        float floatValue3 = ((java.lang.Number) obj4).floatValue();
        float floatValue4 = ((java.lang.Number) obj5).floatValue();
        kotlin.jvm.internal.o.g(gestureId, "gestureId");
        float f17 = -floatValue;
        float f18 = -floatValue3;
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.nanoTime());
        df2.t6 t6Var = this.f230382d;
        java.lang.String m86 = ((mm2.c1) t6Var.business(mm2.c1.class)).m8();
        if (m86 == null) {
            m86 = "";
        }
        java.lang.String str = m86;
        boolean booleanValue = ((java.lang.Boolean) ((df2.k6) t6Var.f231419q).V(str, java.lang.Float.valueOf(0.5f), gestureId, valueOf, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(floatValue2), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(floatValue4), t6Var.f231420r, "")).booleanValue();
        java.lang.String str2 = t6Var.f231420r;
        r45.ir1 a17 = sg2.a0.f407882a.a(com.tencent.mm.sdk.platformtools.b8.a(gestureId));
        return new in0.a(booleanValue, str, 0.5f, gestureId, valueOf, f17, floatValue2, f18, floatValue4, str2, (a17 == null || (jr1Var = (r45.jr1) a17.getCustom(7)) == null) ? -1 : jr1Var.getInteger(3));
    }
}
