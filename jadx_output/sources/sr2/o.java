package sr2;

/* loaded from: classes.dex */
public final class o extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f411647d;

    /* renamed from: e, reason: collision with root package name */
    public ya2.b2 f411648e;

    /* renamed from: f, reason: collision with root package name */
    public final int f411649f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f411650g;

    /* renamed from: h, reason: collision with root package name */
    public y9.i f411651h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411647d = "";
        this.f411649f = 3;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        android.view.View decorView;
        android.view.Window window2;
        java.lang.String e17 = xy2.c.e(getActivity());
        this.f411647d = e17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            this.f411648e = ya2.h.f460484a.b(this.f411647d);
        }
        ya2.b2 b2Var = this.f411648e;
        long j17 = b2Var != null ? b2Var.field_additionalFlag : 0L;
        boolean z17 = (64 & j17) > 0;
        boolean z18 = (128 & j17) > 0;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_AD_COMMENT_APPLY_DIALOG_SHOW_COUNT_INT_SYNC;
        int r17 = c17.r(u3Var, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkShowApplyDialog extFlag=");
        sb6.append(j17);
        sb6.append(" isAlreadyJoin=");
        sb6.append(z17);
        sb6.append(" isAdCheckPass=");
        sb6.append(z18);
        sb6.append(" dialogShowCount=");
        sb6.append(r17);
        sb6.append(" showMaxCount=");
        int i17 = this.f411649f;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.PostAdCommentApplyUIC", sb6.toString());
        if (z17 || !z18 || r17 >= i17) {
            return;
        }
        if (this.f411651h == null) {
            android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b5i, (android.view.ViewGroup) null, false);
            y9.i iVar = new y9.i(getContext(), com.tencent.mm.R.style.f30do);
            this.f411651h = iVar;
            iVar.setContentView(inflate);
            y9.i iVar2 = this.f411651h;
            if (iVar2 != null && (window2 = iVar2.getWindow()) != null) {
                window2.setDimAmount(0.5f);
            }
            y9.i iVar3 = this.f411651h;
            if (iVar3 != null && (window = iVar3.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setBackgroundResource(com.tencent.mm.R.drawable.ayr);
            }
            y9.i iVar4 = this.f411651h;
            if (iVar4 != null) {
                iVar4.setOnDismissListener(new sr2.n(this));
            }
            kotlin.jvm.internal.o.d(inflate);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.e9j);
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.e9k);
            android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.e9l);
            com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) inflate.findViewById(com.tencent.mm.R.id.e9o);
            com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
            kotlin.jvm.internal.o.d(findViewById);
            com.tencent.mm.plugin.finder.report.d2.m(d2Var, findViewById, "join_original_split", 0, 0, null, null, 60, null);
            findViewById.setOnClickListener(new sr2.i(this));
            kotlin.jvm.internal.o.d(findViewById2);
            com.tencent.mm.plugin.finder.report.d2.m(d2Var, findViewById2, "nojoin_original_split", 0, 0, null, null, 60, null);
            findViewById2.setOnClickListener(new sr2.j(this));
            checkBox.setOnCheckedChangeListener(new sr2.k(this, findViewById));
            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.cjv);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.cjw, string);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string2);
            int L = r26.n0.L(string2, string, 0, false, 6, null);
            spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(string2, getContext().getResources().getColor(com.tencent.mm.R.color.Link_100), getContext().getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new sr2.l(this)), L, string.length() + L, 17);
            neatTextView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(getContext()));
            neatTextView.b(spannableString);
            neatTextView.setOnClickListener(new sr2.m(checkBox));
            y9.i iVar5 = this.f411651h;
            if (iVar5 != null) {
                iVar5.show();
            }
        }
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
    }
}
