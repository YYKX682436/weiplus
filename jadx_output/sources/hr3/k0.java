package hr3;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final hr3.k0 f283708d = new hr3.k0();

    public k0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.dyw);
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.dyx);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        fq1.e eVar = fq1.e.f265507a;
        kotlin.jvm.internal.o.d(textView2);
        sb6.append(eVar.f(textView2));
        sb6.append(", ");
        kotlin.jvm.internal.o.d(textView);
        sb6.append(eVar.f(textView));
        return sb6.toString();
    }
}
