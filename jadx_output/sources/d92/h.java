package d92;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.j f227477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d92.j jVar) {
        super(1);
        this.f227477d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.f484408e61);
        java.lang.CharSequence d19 = aVar.d(it, com.tencent.mm.R.id.e5o);
        int c17 = aVar.c(it, com.tencent.mm.R.id.e5i);
        int c18 = aVar.c(it, com.tencent.mm.R.id.f484416e73);
        boolean b17 = aVar.b(it, com.tencent.mm.R.id.e5v, false);
        d92.f fVar = d92.f.f227470a;
        d92.j jVar = this.f227477d;
        java.lang.CharSequence c19 = fVar.c(jVar.getContext(), c17);
        java.lang.CharSequence f17 = fVar.f(jVar.getContext(), c18);
        if (((java.lang.String) f17).length() == 0) {
            return "";
        }
        if (b17) {
            str = "";
        } else {
            java.lang.String string = jVar.getContext().getString(com.tencent.mm.R.string.ci6);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            str = string;
        }
        java.lang.String string2 = jVar.getContext().getString(com.tencent.mm.R.string.f2e, d17, f17, c19, str, d18, d19);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }
}
