package hr3;

/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final hr3.f0 f283535d = new hr3.f0();

    public f0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) it.findViewById(com.tencent.mm.R.id.aro);
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.arp);
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.cbk);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        fq1.e eVar = fq1.e.f265507a;
        kotlin.jvm.internal.o.d(mMNeat7extView);
        sb6.append(mMNeat7extView.getVisibility() == 0 ? mMNeat7extView.a().toString() : "");
        sb6.append(", ");
        kotlin.jvm.internal.o.d(textView);
        sb6.append(eVar.f(textView));
        sb6.append(", ");
        kotlin.jvm.internal.o.d(textView2);
        sb6.append(eVar.f(textView2));
        return sb6.toString();
    }
}
