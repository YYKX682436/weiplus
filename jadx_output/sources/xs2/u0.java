package xs2;

/* loaded from: classes3.dex */
public final class u0 implements rl5.n {

    /* renamed from: a, reason: collision with root package name */
    public static final xs2.u0 f456389a = new xs2.u0();

    @Override // rl5.n
    public final android.view.View a(android.content.Context context, android.view.MenuItem menuItem) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.c_6, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.cg7);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById3).getLayoutParams().width = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479734dr);
        weImageView.setImageDrawable(menuItem.getIcon());
        textView.setText(menuItem.getTitle());
        db5.h4 h4Var = (db5.h4) menuItem;
        int i17 = h4Var.f228378v;
        int i18 = h4Var.f228370n;
        if (i17 != 0) {
            weImageView.setIconColor(i17);
        }
        if (i18 != 0) {
            textView.setTextColor(i18);
        }
        return inflate;
    }
}
