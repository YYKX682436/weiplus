package zw3;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final zw3.f f476877d = new zw3.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = it instanceof android.widget.TextView ? (android.widget.TextView) it : null;
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(java.lang.String.valueOf(textView != null ? textView.getText() : null), "I am warning!"));
    }
}
