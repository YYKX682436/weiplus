package la5;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ la5.l0 f317624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(la5.l0 l0Var) {
        super(1);
        this.f317624d = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String obj2 = it.findViewById(com.tencent.mm.R.id.spo).getVisibility() == 0 ? ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.spn)).getText().toString() : ((com.tencent.mm.ui.base.NoMeasuredTextView) it.findViewById(com.tencent.mm.R.id.kbq)).getText().toString();
        java.lang.String obj3 = ((com.tencent.mm.ui.base.NoMeasuredTextView) it.findViewById(com.tencent.mm.R.id.f485478ht5)).getText().toString();
        java.lang.String obj4 = ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.otg)).getText().toString();
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.o_u);
        android.view.View findViewById = it.findViewById(com.tencent.mm.R.id.h_5);
        java.lang.Object parent = it.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        boolean b17 = kotlin.jvm.internal.o.b(((android.view.View) parent).getTag(com.tencent.mm.R.id.ciq), java.lang.Boolean.TRUE);
        la5.l0 l0Var = this.f317624d;
        java.lang.String string = l0Var.getString(com.tencent.mm.R.string.bl8);
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = obj2;
        if (textView.getVisibility() != 0 || textView.getText().toString().compareTo("0") <= 0) {
            str = "";
        } else {
            str = java.lang.String.format(l0Var.getString(com.tencent.mm.R.string.bld), java.util.Arrays.copyOf(new java.lang.Object[]{textView.getText()}, 1));
            kotlin.jvm.internal.o.f(str, "format(...)");
        }
        objArr[1] = str;
        objArr[2] = obj3;
        objArr[3] = obj4;
        objArr[4] = findViewById.getVisibility() == 0 ? l0Var.getString(com.tencent.mm.R.string.blb) : "";
        objArr[5] = b17 ? l0Var.getString(com.tencent.mm.R.string.blc) : "";
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 6));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
