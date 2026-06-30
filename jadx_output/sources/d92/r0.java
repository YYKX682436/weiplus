package d92;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.content.Context context) {
        super(1);
        this.f227503d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = it instanceof android.widget.TextView ? (android.widget.TextView) it : null;
        java.lang.CharSequence text = textView != null ? textView.getText() : null;
        java.lang.String str = "";
        if (text == null) {
            text = "";
        }
        int c17 = e92.b.f250347d.c(it, com.tencent.mm.R.id.f484409e62);
        android.content.Context context = this.f227503d;
        if (c17 == 1) {
            str = "," + context.getString(com.tencent.mm.R.string.clw);
        } else if (c17 == 2) {
            str = "," + context.getString(com.tencent.mm.R.string.clt);
        }
        if (!(str.length() > 0)) {
            return text.toString();
        }
        return ((java.lang.Object) text) + str;
    }
}
