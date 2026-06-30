package wu;

/* loaded from: classes9.dex */
public final class e1 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f449561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rl5.r f449562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f449563c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.j1 f449564d;

    public e1(android.content.Context context, rl5.r rVar, android.text.SpannableString spannableString, wu.j1 j1Var) {
        this.f449561a = context;
        this.f449562b = rVar;
        this.f449563c = spannableString;
        this.f449564d = j1Var;
    }

    @Override // db5.n4
    public void a(db5.g4 contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        kotlin.jvm.internal.o.g(contextMenu, "contextMenu");
        android.content.Context context = this.f449561a;
        contextMenu.c(0, 1, 0, context.getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.icons_filled_copy);
        int i17 = ct.r2.B0;
        i95.m c17 = i95.n0.c(ct.r2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        rl5.r rVar = this.f449562b;
        android.content.res.Resources resources = context.getResources();
        android.text.SpannableString spannableString = this.f449563c;
        wu.j1 j1Var = this.f449564d;
        java.lang.String q17 = j1Var.f449610e.q();
        java.lang.String o17 = j1Var.f449610e.o();
        java.lang.Long p17 = j1Var.f449610e.p();
        te5.x0.a(rVar, contextMenu, resources, spannableString, q17, o17, p17 != null ? p17.longValue() : 0L, 2);
    }
}
