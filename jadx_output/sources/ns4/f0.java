package ns4;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.y1 f339518a;

    public f0(java.util.List wording, android.content.Context context) {
        kotlin.jvm.internal.o.g(wording, "wording");
        kotlin.jvm.internal.o.g(context, "context");
        this.f339518a = new com.tencent.mm.ui.widget.dialog.y1(context);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f489613d61, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.c_3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.Button) findViewById).setOnClickListener(new ns4.e0(this));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f487323oa0);
        java.util.Iterator it = wording.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setLayoutParams(layoutParams);
            textView.setText(str);
            linearLayout.addView(textView);
        }
        this.f339518a.k(inflate);
    }
}
