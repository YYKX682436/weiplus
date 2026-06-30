package d92;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.j f227473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d92.j jVar) {
        super(1);
        this.f227473d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = this.f227473d.getContext().getString(com.tencent.mm.R.string.f8p, e92.b.f250347d.d(it, com.tencent.mm.R.id.e7l));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
