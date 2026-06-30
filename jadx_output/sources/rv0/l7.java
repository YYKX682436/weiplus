package rv0;

/* loaded from: classes5.dex */
public final class l7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f400105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(rv0.o7 o7Var) {
        super(1);
        this.f400105d = o7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        android.content.res.Resources a17 = j65.q.a(this.f400105d.getContext());
        if (floatValue > 0.0f) {
            java.lang.ThreadLocal threadLocal = d3.q.f226108a;
            return d3.l.a(a17, com.tencent.mm.R.drawable.f481036cn1, null);
        }
        java.lang.ThreadLocal threadLocal2 = d3.q.f226108a;
        return d3.l.a(a17, com.tencent.mm.R.drawable.cni, null);
    }
}
