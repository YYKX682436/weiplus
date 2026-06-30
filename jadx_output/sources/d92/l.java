package d92;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.r f227488d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(d92.r rVar) {
        super(1);
        this.f227488d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.String string = this.f227488d.getContext().getString(com.tencent.mm.R.string.cpp, aVar.d(it, com.tencent.mm.R.id.e79), aVar.d(it, com.tencent.mm.R.id.e5n), aVar.d(it, com.tencent.mm.R.id.e5l), java.lang.Integer.valueOf(aVar.c(it, com.tencent.mm.R.id.f484408e61)));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
