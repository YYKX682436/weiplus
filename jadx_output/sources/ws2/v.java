package ws2;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.y f449147d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ws2.y yVar) {
        super(0);
        this.f449147d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ws2.y yVar = this.f449147d;
        r45.i72 i72Var = (r45.i72) ((mm2.e1) yVar.c(mm2.e1.class)).f328988r.getCustom(44);
        long j17 = i72Var != null ? i72Var.getLong(1) : 0L;
        if (j17 <= 0) {
            return "";
        }
        java.lang.String string = yVar.f449092b.getString(com.tencent.mm.R.string.dtv);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{zl2.r4.S(zl2.r4.f473950a, j17, 0, 2, null)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
