package st2;

/* loaded from: classes3.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(st2.h1 h1Var) {
        super(1);
        this.f412440d = h1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        st2.h1 h1Var = this.f412440d;
        if (!h1Var.w()) {
            dk2.q4 q4Var = dk2.q4.f233938a;
            android.content.Context context = h1Var.f412333d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            q4Var.b(context, h1Var.f412335f, longValue);
        }
        return jz5.f0.f302826a;
    }
}
