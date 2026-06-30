package wu;

/* loaded from: classes9.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s15.d0 f449600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f449601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu.b f449602f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s15.d0 d0Var, android.content.Context context, hu.b bVar) {
        super(1);
        this.f449600d = d0Var;
        this.f449601e = context;
        this.f449602f = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.CharSequence charSequence;
        android.widget.TextView it = (android.widget.TextView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        s15.d0 d0Var = this.f449600d;
        java.lang.String displayName = d0Var.getDisplayName();
        boolean N = r26.n0.N(displayName);
        hu.b bVar = this.f449602f;
        if (N) {
            displayName = bVar.f285000h.toString();
        }
        java.lang.String t17 = r26.i0.t(r26.i0.v(d0Var.getContent(), "&lt;", "<", false, 4, null), "&gt;", ">", false);
        if (!r26.n0.N(t17)) {
            i95.m c17 = i95.n0.c(ct.r2.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            int type = d0Var.getType();
            int i17 = ti3.i.f419588a;
            android.content.Context context = it.getContext();
            int currentTextColor = it.getCurrentTextColor();
            float textSize = it.getPaint().getTextSize();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            sb6.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.j(context, displayName, textSize));
            sb6.append("：");
            java.lang.String i18 = ti3.i.i(context, type, t17, false);
            l15.c cVar = new l15.c();
            cVar.fromXml(t17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(i18)) {
                android.graphics.drawable.Drawable g17 = ti3.i.g(context, type, cVar);
                com.tencent.mm.ui.uk.f(g17, currentTextColor);
                charSequence = sb6;
                if (g17 != null) {
                    charSequence = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Ai(context, sb6, g17, true);
                }
            } else {
                android.graphics.drawable.Drawable g18 = ti3.i.g(context, type, cVar);
                com.tencent.mm.ui.uk.f(g18, currentTextColor);
                if (g18 != null) {
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                    android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, i18, textSize);
                    ((ke0.e) xVar).getClass();
                    charSequence = com.tencent.mm.pluginsdk.ui.span.c0.b(context, sb6, j17, g18, true, true);
                } else {
                    ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                    sb6.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.j(context, i18, textSize));
                    charSequence = sb6;
                }
            }
        } else {
            charSequence = "";
        }
        java.lang.CharSequence charSequence2 = charSequence;
        if (d0Var.getType() == 47) {
            java.lang.CharSequence concat = android.text.TextUtils.concat(charSequence, this.f449601e.getString(com.tencent.mm.R.string.f490382tf));
            kotlin.jvm.internal.o.f(concat, "concat(...)");
            charSequence2 = concat;
        }
        boolean z17 = !r26.n0.N(charSequence2);
        java.lang.CharSequence charSequence3 = charSequence2;
        if (!z17) {
            if (!r26.n0.N(d0Var.j())) {
                charSequence3 = d0Var.j();
            } else {
                s15.h hVar = bVar.f284997e;
                charSequence3 = hVar.getString(hVar.f303422d + 1);
            }
        }
        it.setText(charSequence3);
        return jz5.f0.f302826a;
    }
}
