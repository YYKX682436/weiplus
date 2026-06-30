package ej4;

/* loaded from: classes4.dex */
public final class y extends ej4.r {

    /* renamed from: d, reason: collision with root package name */
    public final bi4.c f253390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.lang.String userName, android.widget.TextView iconTV, bi4.c iconScene) {
        super(iconTV, userName, null, 4, null);
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(iconTV, "iconTV");
        kotlin.jvm.internal.o.g(iconScene, "iconScene");
        this.f253390d = iconScene;
        b();
    }

    @Override // ej4.r
    public void b() {
        java.lang.Object obj = a().get();
        android.widget.TextView textView = obj instanceof android.widget.TextView ? (android.widget.TextView) obj : null;
        if (textView == null) {
            return;
        }
        java.lang.CharSequence O = bk4.i.a().O(textView, this.f253374a, textView.getText(), (int) textView.getTextSize(), bi4.d.OUTLINED, this.f253390d);
        if (O == null || kotlin.jvm.internal.o.b(textView.getText(), O)) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.n(context, O, textSize));
    }
}
