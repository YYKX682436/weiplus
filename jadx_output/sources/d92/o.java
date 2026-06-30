package d92;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.r f227496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d92.r rVar) {
        super(1);
        this.f227496d = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        int c17 = aVar.c(it, com.tencent.mm.R.id.f484408e61);
        boolean a17 = aVar.a(it, com.tencent.mm.R.id.e5w);
        java.lang.String string = this.f227496d.getContext().getString(com.tencent.mm.R.string.cpr, java.lang.Integer.valueOf(c17));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return a17 ? string.concat("已赞") : string.concat("未赞");
    }
}
