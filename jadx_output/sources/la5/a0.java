package la5;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final la5.a0 f317597d = new la5.a0();

    public a0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.k9f);
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.k7t);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        fq1.e eVar = fq1.e.f265507a;
        kotlin.jvm.internal.o.d(textView);
        sb6.append(eVar.f(textView));
        sb6.append(", ");
        kotlin.jvm.internal.o.d(textView2);
        sb6.append(eVar.f(textView2));
        return sb6.toString();
    }
}
