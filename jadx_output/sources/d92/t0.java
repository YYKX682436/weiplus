package d92;

/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(android.content.Context context) {
        super(1);
        this.f227507d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.String string = this.f227507d.getString(com.tencent.mm.R.string.f491828ed1, aVar.d(it, com.tencent.mm.R.id.e6w).toString(), aVar.d(it, com.tencent.mm.R.id.e6u), aVar.d(it, com.tencent.mm.R.id.e6x), aVar.d(it, com.tencent.mm.R.id.e6v));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
