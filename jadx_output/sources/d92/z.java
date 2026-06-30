package d92;

/* loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context) {
        super(1);
        this.f227524d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = this.f227524d.getString(com.tencent.mm.R.string.d0s);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string + ' ' + ((java.lang.Object) e92.b.f250347d.d(it, com.tencent.mm.R.id.f484406pw0));
    }
}
