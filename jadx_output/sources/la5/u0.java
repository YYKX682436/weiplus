package la5;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final la5.u0 f317643d = new la5.u0();

    public u0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        java.lang.CharSequence text;
        java.lang.String obj2;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.ViewParent parent = it.getParent().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        return (viewGroup == null || (textView = (android.widget.TextView) viewGroup.findViewById(android.R.id.title)) == null || (text = textView.getText()) == null || (obj2 = text.toString()) == null) ? "" : obj2;
    }
}
