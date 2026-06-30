package e23;

/* loaded from: classes12.dex */
public class p0 extends u13.g {
    public static final boolean A = j62.e.g().l("clicfg_android_fts_enable_multi_msg_show_details", true, true, true);

    /* renamed from: q, reason: collision with root package name */
    public p13.y f246925q;

    /* renamed from: r, reason: collision with root package name */
    public int f246926r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f246927s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f246928t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.CharSequence f246929u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.CharSequence f246930v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.CharSequence f246931w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f246932x;

    /* renamed from: y, reason: collision with root package name */
    public final e23.o0 f246933y;

    /* renamed from: z, reason: collision with root package name */
    public final e23.n0 f246934z;

    public p0(int i17) {
        super(5, i17);
        this.f246933y = new e23.o0(this);
        this.f246934z = new e23.n0(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        e23.n0 n0Var = (e23.n0) eVar;
        this.f246927s = this.f246925q.f351187e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String d17 = o13.n.d(this.f246927s);
        float textSize = n0Var.f246910d.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f246928t = com.tencent.mm.pluginsdk.ui.span.c0.n(context, d17, textSize);
        java.lang.Object obj = this.f246925q.f351197o;
        if (obj instanceof java.lang.Integer) {
            this.f246926r = ((java.lang.Integer) obj).intValue();
        }
        if (!A) {
            int i17 = this.f246926r;
            if (i17 > 1) {
                this.f246929u = context.getResources().getString(com.tencent.mm.R.string.idj, java.lang.Integer.valueOf(this.f246926r));
                return;
            } else {
                if (i17 == 1) {
                    o(context);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("FTSMessageDataItem", "fts multi_msg_show_details enabled");
        o(context);
        if (this.f246926r <= 1) {
            android.view.View view = n0Var.f246908b;
            if (view != null) {
                view.setMinimumHeight(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ane));
                n0Var.f246912f.setVisibility(8);
                return;
            }
            return;
        }
        this.f246930v = context.getResources().getString(com.tencent.mm.R.string.ogg, java.lang.Integer.valueOf(this.f246926r));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.f246930v);
        this.f246930v = spannableStringBuilder;
        int i18 = 0;
        while (true) {
            if (i18 >= spannableStringBuilder.length()) {
                i18 = -1;
                break;
            } else if (java.lang.Character.isDigit(spannableStringBuilder.charAt(i18))) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 != -1) {
            ((android.text.SpannableStringBuilder) this.f246930v).setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478502m)), i18, ((int) java.lang.Math.log10(this.f246926r)) + i18 + 1, 33);
        }
        android.view.View view2 = n0Var.f246908b;
        if (view2 != null) {
            view2.setMinimumHeight(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.anb));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) n0Var.f246909c.getLayoutParams();
            marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ana);
            n0Var.f246909c.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // u13.g
    public int h() {
        return this.f246926r < 2 ? 0 : 1;
    }

    @Override // u13.g
    public int j() {
        return this.f246925q.f351200r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246933y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0352, code lost:
    
        if (r0 == null) goto L148;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e23.p0.o(android.content.Context):void");
    }
}
