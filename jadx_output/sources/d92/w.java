package d92;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227515d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context) {
        super(1);
        this.f227515d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View v17 = (android.view.View) obj;
        kotlin.jvm.internal.o.g(v17, "v");
        e92.a aVar = e92.b.f250347d;
        int c17 = aVar.c(v17, com.tencent.mm.R.id.tb9);
        int c18 = aVar.c(v17, com.tencent.mm.R.id.tb7);
        boolean b17 = aVar.b(v17, com.tencent.mm.R.id.tb8, true);
        android.content.Context context = this.f227515d;
        java.lang.String string = b17 ? context.getString(com.tencent.mm.R.string.f29) : context.getString(com.tencent.mm.R.string.etf);
        kotlin.jvm.internal.o.d(string);
        if (c17 <= 0) {
            return string;
        }
        java.lang.String valueOf = java.lang.String.valueOf(e06.p.f((int) ((c18 * 100.0f) / c17), 0, 100));
        zl2.q4 q4Var = zl2.q4.f473933a;
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.o8w, valueOf, q4Var.l(c18), q4Var.l(c17));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string + ", " + string2;
    }
}
