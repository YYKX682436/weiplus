package rt1;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final rt1.k f399432d = new rt1.k();

    public k() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView = (android.widget.TextView) obj;
        kotlin.jvm.internal.o.d(textView);
        java.lang.String t17 = u46.l.t(textView.getText().toString(), 0, 1);
        return t17 == null ? "" : t17;
    }
}
