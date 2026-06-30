package cz3;

/* loaded from: classes15.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f225017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kotlin.jvm.internal.h0 h0Var) {
        super(3);
        this.f225017d = h0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        ((java.lang.Number) obj3).longValue();
        if (booleanValue) {
            cz3.b.f225018a.c(true, longValue);
            com.tencent.mm.sdk.platformtools.o4 o4Var = cz3.b.f225020c;
            if (o4Var != null) {
                o4Var.remove("key_crash_info");
            }
        } else {
            cz3.b.f225018a.c(false, 0L);
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = cz3.b.f225020c;
            if (o4Var2 != null) {
                o4Var2.H("key_crash_info", ((r45.tu5) this.f225017d.f310123d).toByteArray());
            }
        }
        return jz5.f0.f302826a;
    }
}
