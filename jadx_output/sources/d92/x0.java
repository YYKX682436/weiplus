package d92;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227519d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(android.content.Context context) {
        super(1);
        this.f227519d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e6l);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.e6k);
        java.lang.CharSequence d19 = aVar.d(it, com.tencent.mm.R.id.e6j);
        int c17 = aVar.c(it, com.tencent.mm.R.id.e6m);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean J0 = com.tencent.mm.sdk.platformtools.t8.J0(d17);
        android.content.Context context = this.f227519d;
        if (!J0) {
            sb6.append(context.getString(com.tencent.mm.R.string.dyp));
            sb6.append(d17);
            sb6.append(" ");
        }
        sb6.append(d18);
        if (!com.tencent.mm.sdk.platformtools.t8.J0(d19)) {
            sb6.append(" ");
            sb6.append(context.getString(com.tencent.mm.R.string.dtr, d19));
        }
        if (c17 > 0) {
            sb6.append(" ");
            sb6.append(context.getString(com.tencent.mm.R.string.dtt, java.lang.Integer.valueOf(c17)));
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
