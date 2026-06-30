package jn2;

/* loaded from: classes5.dex */
public final class f0 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public sf2.x f300598d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.y0 f300599e;

    /* renamed from: f, reason: collision with root package name */
    public jn2.c1 f300600f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f300601g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f300602h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ScrollView f300603i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.LinearLayout f300604m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ch6 f300605n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f300606o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f300607p;

    /* renamed from: q, reason: collision with root package name */
    public final r45.in f300608q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f300609r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f300610s;

    /* renamed from: t, reason: collision with root package name */
    public int f300611t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Set f300612u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f0(android.content.Context r1, android.util.AttributeSet r2, int r3, r45.in r4, int r5, kotlin.jvm.internal.i r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto La
            r3 = 0
        La:
            java.lang.String r5 = "context"
            kotlin.jvm.internal.o.g(r1, r5)
            java.lang.String r5 = "tabData"
            kotlin.jvm.internal.o.g(r4, r5)
            r0.<init>(r1, r2, r3)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r0.f300612u = r2
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131495342(0x7f0c09ae, float:1.8614218E38)
            r3 = 1
            r1.inflate(r2, r0, r3)
            r1 = 2131322003(0x7f096493, float:1.8262645E38)
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r0.f300603i = r1
            r3 = 2131312662(0x7f094016, float:1.8243699E38)
            android.view.View r1 = r1.findViewById(r3)
            kotlin.jvm.internal.o.f(r1, r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f300604m = r1
            r1 = 2131297278(0x7f0903fe, float:1.8212496E38)
            android.view.View r1 = r0.findViewById(r1)
            kotlin.jvm.internal.o.f(r1, r2)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r0.f300602h = r1
            r1 = 2131300724(0x7f091174, float:1.8219486E38)
            android.view.View r1 = r0.findViewById(r1)
            kotlin.jvm.internal.o.f(r1, r2)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r0.f300606o = r1
            r1 = 2131323426(0x7f096a22, float:1.826553E38)
            android.view.View r1 = r0.findViewById(r1)
            kotlin.jvm.internal.o.f(r1, r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f300607p = r1
            r0.f300608q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.f0.<init>(android.content.Context, android.util.AttributeSet, int, r45.in, int, kotlin.jvm.internal.i):void");
    }

    public final void a(int i17, r45.zw1 zw1Var, kotlinx.coroutines.y0 y0Var) {
        n3.t1 t1Var = new n3.t1(this.f300604m);
        int i18 = 0;
        while (true) {
            if (!t1Var.hasNext()) {
                java.util.LinkedList sub_board_type_info_list = this.f300608q.f377158f;
                kotlin.jvm.internal.o.f(sub_board_type_info_list, "sub_board_type_info_list");
                this.f300605n = (r45.ch6) kz5.n0.a0(sub_board_type_info_list, i17);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select sub tab ");
                r45.ch6 ch6Var = this.f300605n;
                sb6.append(ch6Var != null ? ch6Var.f371556e : null);
                com.tencent.mars.xlog.Log.i("FinderLiveAnchorSingSongAddPanelTabView", sb6.toString());
                this.f300612u.clear();
                if (y0Var != null) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new jn2.d0(zw1Var, this, null), 3, null);
                    return;
                }
                return;
            }
            java.lang.Object next = t1Var.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View findViewById = ((android.view.View) next).findViewById(com.tencent.mm.R.id.vhl);
            android.widget.TextView textView = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
            if (textView != null) {
                if (i17 == i18) {
                    com.tencent.mm.ui.fk.a(textView);
                    textView.setTextColor(getContext().getColor(com.tencent.mm.R.color.f478714f5));
                } else {
                    com.tencent.mm.ui.fk.c(textView);
                    textView.setTextColor(getContext().getColor(com.tencent.mm.R.color.f478520a84));
                }
            }
            i18 = i19;
        }
    }

    public final androidx.recyclerview.widget.RecyclerView getSongRv() {
        return this.f300602h;
    }
}
