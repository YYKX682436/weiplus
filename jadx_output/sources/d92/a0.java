package d92;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.content.Context context) {
        super(1);
        this.f227453d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object tag = it.getTag();
        java.lang.String string = this.f227453d.getString(kotlin.jvm.internal.o.b(tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null, java.lang.Boolean.TRUE) ? com.tencent.mm.R.string.gyu : com.tencent.mm.R.string.gyy);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
