package p50;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final p50.b f351992d = new p50.b();

    public b() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        android.widget.TextView textView;
        java.lang.CharSequence text;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Context context = it.getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.view.ViewParent parent = it.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null || (textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.kbq)) == null || (text = textView.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        objArr[0] = str;
        java.lang.String string = context.getString(com.tencent.mm.R.string.o3k, objArr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
