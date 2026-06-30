package d92;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.j f227481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d92.j jVar) {
        super(1);
        this.f227481d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(it, com.tencent.mm.R.id.e79);
        java.lang.CharSequence d18 = aVar.d(it, com.tencent.mm.R.id.e5o);
        java.lang.CharSequence d19 = aVar.d(it, com.tencent.mm.R.id.e5n);
        int c17 = aVar.c(it, com.tencent.mm.R.id.e76);
        d92.j jVar = this.f227481d;
        if (kotlin.jvm.internal.o.b(d17, jVar.getContext().getString(com.tencent.mm.R.string.cqn))) {
            if (c17 > 0) {
                java.lang.String string = jVar.getContext().getString(com.tencent.mm.R.string.cqu, d18);
                kotlin.jvm.internal.o.d(string);
                return string;
            }
            java.lang.String string2 = jVar.getContext().getString(com.tencent.mm.R.string.cqt, d18);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        if (kotlin.jvm.internal.o.b(d17, jVar.getContext().getString(com.tencent.mm.R.string.cqo))) {
            if (c17 > 0) {
                java.lang.String string3 = jVar.getContext().getString(com.tencent.mm.R.string.cqs, d18);
                kotlin.jvm.internal.o.d(string3);
                return string3;
            }
            java.lang.String string4 = jVar.getContext().getString(com.tencent.mm.R.string.cqr, d18);
            kotlin.jvm.internal.o.d(string4);
            return string4;
        }
        if (c17 > 0) {
            java.lang.String string5 = jVar.getContext().getString(com.tencent.mm.R.string.cqq, java.lang.Integer.valueOf(c17), d17, d18, d19);
            kotlin.jvm.internal.o.d(string5);
            return string5;
        }
        java.lang.String string6 = jVar.getContext().getString(com.tencent.mm.R.string.cqp, d17, d18, d19);
        kotlin.jvm.internal.o.d(string6);
        return string6;
    }
}
