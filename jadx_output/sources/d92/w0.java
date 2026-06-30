package d92;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.content.Context context) {
        super(1);
        this.f227516d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.CharSequence text;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = it instanceof android.widget.TextView ? (android.widget.TextView) it : null;
        if (textView == null || (text = textView.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        android.content.Context context = this.f227516d;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f491484d81);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.efz, r26.i0.t(str, "**", string, false));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }
}
