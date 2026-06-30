package d92;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context) {
        super(1);
        this.f227506d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e79);
        int c17 = aVar.c(it, com.tencent.mm.R.id.e5i);
        int c18 = aVar.c(it, com.tencent.mm.R.id.e5t);
        android.content.Context context = this.f227506d;
        if (c17 == 1) {
            str = "," + context.getString(com.tencent.mm.R.string.clw);
        } else if (c17 != 2) {
            str = "";
        } else {
            str = "," + context.getString(com.tencent.mm.R.string.clt);
        }
        java.lang.String string = context.getString(com.tencent.mm.R.string.f9n, d17, str, java.lang.Integer.valueOf(c18));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
