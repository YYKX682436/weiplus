package gc0;

/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: o, reason: collision with root package name */
    public static final gc0.z0 f270141o = new gc0.z0(null);

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f270142a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f270143b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f270144c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f270145d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f270146e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f270147f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f270148g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f270149h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f270150i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f270151j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f270152k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f270153l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f270154m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f270155n;

    public e1(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f270142a = activity;
        this.f270143b = jz5.h.b(new gc0.c1(this));
        this.f270144c = jz5.h.b(new gc0.d1(this));
        this.f270146e = new java.util.LinkedHashMap();
        this.f270147f = new java.util.ArrayList();
        this.f270148g = new java.util.ArrayList();
        this.f270149h = "";
        this.f270152k = "";
        this.f270153l = "";
        this.f270154m = new java.util.ArrayList();
        this.f270155n = new java.util.ArrayList();
    }

    public final void a(r45.kl5 kl5Var, android.view.View view, int i17, java.lang.String talker) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(talker, "talker");
        if (kl5Var == null) {
            return;
        }
        gc0.z0 z0Var = f270141o;
        z0Var.a(this.f270146e, i17, kl5Var);
        long j17 = kl5Var.getLong(3);
        int b17 = z0Var.b(kl5Var);
        r45.ll5 ll5Var = (r45.ll5) kl5Var.getCustom(5);
        java.lang.Integer valueOf = ll5Var != null ? java.lang.Integer.valueOf(ll5Var.getInteger(1)) : null;
        int i18 = (!((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 4)) && (valueOf == null || valueOf.intValue() != 3)) ? 0 : 1;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "notes_candidate");
        aVar.ik(view, 40, 33926);
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("note_type", java.lang.Integer.valueOf(i17));
        lVarArr[1] = new jz5.l("add_username", talker);
        lVarArr[2] = new jz5.l("note_sid", (java.lang.String) ((jz5.n) this.f270143b).getValue());
        lVarArr[3] = new jz5.l("candidate_source_type", java.lang.Integer.valueOf(b17));
        lVarArr[4] = new jz5.l("candidate_output_type", java.lang.Integer.valueOf(i18));
        lVarArr[5] = new jz5.l("default_note_type", java.lang.Integer.valueOf(j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendNickname()) == 1 ? 1 : 0));
        java.util.Map l17 = kz5.c1.l(lVarArr);
        if (i17 == 1) {
            l17.put("candidate_type", java.lang.Long.valueOf(j17));
        }
        aVar.gk(view, l17);
    }

    public final void b(java.lang.String str, java.util.List list, java.util.List list2, com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText) {
        java.lang.CharSequence text;
        boolean z17 = false;
        this.f270150i = mMLimitedClearEditText != null && mMLimitedClearEditText.getHasFocused();
        if (!r26.n0.N(this.f270152k)) {
            if (kotlin.jvm.internal.o.b((mMLimitedClearEditText == null || (text = mMLimitedClearEditText.getText()) == null) ? null : r26.n0.u0(text), r26.n0.u0(this.f270152k).toString())) {
                z17 = true;
            }
        }
        this.f270151j = z17;
        this.f270153l = str == null ? "" : str;
        if (list != null) {
            ((java.util.ArrayList) this.f270154m).addAll(list);
        }
        if (list2 != null) {
            ((java.util.ArrayList) this.f270155n).addAll(list2);
        }
        boolean isDebug = com.tencent.mars.xlog.Log.isDebug();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f270142a;
        if (!isDebug) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkReport", "onFinishClick() called page:".concat(appCompatActivity.getClass().getSimpleName()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkReport", "onFinishClick() called page:" + appCompatActivity.getClass().getSimpleName() + " remark:" + str + " phoneList:" + list + " img:" + list2);
    }
}
