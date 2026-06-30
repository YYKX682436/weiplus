package t24;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final t24.v f415341d = new t24.v();

    public v() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string = (java.lang.String) obj;
        android.widget.TextView view = (android.widget.TextView) obj2;
        kotlin.jvm.internal.o.g(string, "string");
        kotlin.jvm.internal.o.g(view, "view");
        view.setText(string);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.ajw);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), valueOf == null ? view.getPaddingRight() : i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, valueOf.intValue()), view.getPaddingBottom());
        return jz5.f0.f302826a;
    }
}
