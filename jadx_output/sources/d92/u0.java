package d92;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.content.Context context) {
        super(1);
        this.f227510d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        boolean a17 = aVar.a(it, com.tencent.mm.R.id.e6n);
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e6o);
        it.setClickable(a17);
        if (!a17) {
            return d17.toString();
        }
        java.lang.String string = this.f227510d.getString(com.tencent.mm.R.string.dfp, d17);
        kotlin.jvm.internal.o.d(string);
        return string;
    }
}
