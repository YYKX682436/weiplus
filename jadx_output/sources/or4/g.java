package or4;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or4.h f347700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(or4.h hVar) {
        super(1);
        this.f347700d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.pyg);
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.pyh);
        android.widget.TextView textView3 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.pye);
        or4.h hVar = this.f347700d;
        java.lang.String string = hVar.getContext().getString(com.tencent.mm.R.string.lgl, textView.getText(), textView3.getText());
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.CharSequence text = textView2.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        java.util.List f07 = r26.n0.f0(text, new java.lang.String[]{" "}, false, 0, 6, null);
        if (!f07.isEmpty()) {
            string = string + ' ' + ((java.lang.String) f07.get(0));
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{2})");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.CharSequence text2 = textView2.getText();
        kotlin.jvm.internal.o.f(text2, "getText(...)");
        java.util.regex.Matcher matcher = compile.matcher(text2);
        kotlin.jvm.internal.o.f(matcher, "matcher(...)");
        r26.m a17 = r26.u.a(matcher, 0, text2);
        if (a17 == null) {
            return string;
        }
        r26.q qVar = (r26.q) a17;
        java.lang.String string2 = hVar.getContext().getString(com.tencent.mm.R.string.lgk, (java.lang.String) qVar.a().get(1), (java.lang.String) qVar.a().get(2));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string + ' ' + string2;
    }
}
