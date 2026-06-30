package io2;

/* loaded from: classes2.dex */
public final class l extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f293481d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f293482e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f293483f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f293484g;

    /* renamed from: h, reason: collision with root package name */
    public final int f293485h;

    /* renamed from: i, reason: collision with root package name */
    public final int f293486i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ io2.p f293487m;

    public l(io2.p pVar) {
        this.f293487m = pVar;
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f293481d = rect;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f293482e = paint;
        java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.lra);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        this.f293483f = r17;
        java.lang.String r18 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.lrh);
        kotlin.jvm.internal.o.f(r18, "getString(...)");
        this.f293484g = r18;
        paint.setColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.FG_0));
        paint.setTextSize(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 15));
        paint.setAntiAlias(true);
        paint.getTextBounds(r17, 0, 1, rect);
        this.f293485h = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479704cz) + rect.height();
        this.f293486i = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv) + (rect.height() / 2);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, int i17, androidx.recyclerview.widget.RecyclerView parent) {
        so2.j3 j3Var;
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(parent, "parent");
        io2.p pVar = this.f293487m;
        com.tencent.mm.plugin.finder.member.mine.FinderMemberCardListContract$FinderMemberCardListLoader finderMemberCardListContract$FinderMemberCardListLoader = pVar.f293491a.f293477d;
        if (finderMemberCardListContract$FinderMemberCardListLoader.f121159e) {
            if (i17 > 0) {
                java.lang.Object obj = finderMemberCardListContract$FinderMemberCardListLoader.getDataListJustForAdapter().get(i17 - 1);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
                j3Var = (so2.j3) obj;
            } else {
                j3Var = null;
            }
            java.lang.Object obj2 = pVar.f293491a.f293477d.getDataListJustForAdapter().get(i17);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
            so2.j3 j3Var2 = (so2.j3) obj2;
            if (j3Var == null || (!j3Var.a() && j3Var2.a())) {
                outRect.top = this.f293485h;
            }
        }
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        so2.j3 j3Var;
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        super.onDraw(c17, parent, state);
        io2.p pVar = this.f293487m;
        if (pVar.f293491a.f293477d.f121159e) {
            int childCount = parent.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = parent.getChildAt(i17);
                int u07 = parent.u0(childAt);
                java.lang.Object obj = pVar.f293491a.f293477d.getDataListJustForAdapter().get(u07);
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
                so2.j3 j3Var2 = (so2.j3) obj;
                if (u07 > 0) {
                    java.lang.Object obj2 = pVar.f293491a.f293477d.getDataListJustForAdapter().get(u07 - 1);
                    kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
                    j3Var = (so2.j3) obj2;
                } else {
                    j3Var = null;
                }
                if (j3Var == null || (!j3Var.a() && j3Var2.a())) {
                    kotlin.jvm.internal.o.d(childAt);
                    java.lang.String str = j3Var2.a() ? this.f293483f : this.f293484g;
                    android.graphics.Paint paint = this.f293482e;
                    paint.getTextBounds(str, 0, 1, this.f293481d);
                    android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    float f17 = fontMetrics.bottom;
                    c17.drawText(str, childAt.getPaddingLeft(), (childAt.getTop() + (((f17 - fontMetrics.top) / 2) - f17)) - this.f293486i, paint);
                    if (j3Var2.a()) {
                        return;
                    }
                }
            }
        }
    }
}
