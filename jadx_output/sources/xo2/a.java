package xo2;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f455764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.content.Context context) {
        super(1);
        this.f455764d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e6t);
        int c17 = aVar.c(it, com.tencent.mm.R.id.e5i);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.e79);
        java.lang.CharSequence d19 = aVar.d(it, com.tencent.mm.R.id.e6s);
        android.content.Context context = this.f455764d;
        if (c17 == 1) {
            str = "," + context.getString(com.tencent.mm.R.string.clw);
        } else if (c17 != 2) {
            str = "";
        } else {
            str = "," + context.getString(com.tencent.mm.R.string.clt);
        }
        java.lang.String string = context.getString(com.tencent.mm.R.string.eqx, d17, str, d18, d19);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
