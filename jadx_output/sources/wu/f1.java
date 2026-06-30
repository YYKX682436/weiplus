package wu;

/* loaded from: classes9.dex */
public final class f1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f449572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f449573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f449574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wu.j1 f449575g;

    public f1(android.widget.TextView textView, android.content.Context context, android.text.SpannableString spannableString, wu.j1 j1Var) {
        this.f449572d = textView;
        this.f449573e = context;
        this.f449574f = spannableString;
        this.f449575g = j1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            com.tencent.mm.sdk.platformtools.b0.e(this.f449572d.getText());
            android.content.Context context = this.f449573e;
            db5.e1.W(context, context.getString(com.tencent.mm.R.string.f490361st));
        } else {
            if (itemId != 101) {
                return;
            }
            int i18 = ct.r2.B0;
            i95.m c17 = i95.n0.c(ct.r2.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context2 = this.f449573e;
            android.text.SpannableString spannableString = this.f449574f;
            wu.j1 j1Var = this.f449575g;
            java.lang.String q17 = j1Var.f449610e.q();
            java.lang.String o17 = j1Var.f449610e.o();
            java.lang.Long p17 = j1Var.f449610e.p();
            te5.x0.b(context2, spannableString, q17, o17, p17 != null ? p17.longValue() : 0L, 2, true);
        }
    }
}
