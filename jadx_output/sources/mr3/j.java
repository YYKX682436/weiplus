package mr3;

/* loaded from: classes5.dex */
public final class j extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f330869e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f330870f;

    /* renamed from: g, reason: collision with root package name */
    public final mr3.d f330871g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f330872h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f330873i;

    public j(kotlinx.coroutines.y0 scope, yz5.l onClickRecommendImage, mr3.d addClicker, yz5.a shouldHighlight) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(onClickRecommendImage, "onClickRecommendImage");
        kotlin.jvm.internal.o.g(addClicker, "addClicker");
        kotlin.jvm.internal.o.g(shouldHighlight, "shouldHighlight");
        this.f330869e = scope;
        this.f330870f = onClickRecommendImage;
        this.f330871g = addClicker;
        this.f330872h = shouldHighlight;
        this.f330873i = true;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e3t;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        mr3.l item = (mr3.l) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.uxb);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.uxa);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) holder.p(com.tencent.mm.R.id.uxc);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.cdj);
        linearLayout3.setVisibility(4);
        holder.o().post(new mr3.e(holder, linearLayout3, linearLayout2));
        if (((java.lang.Boolean) this.f330872h.invoke()).booleanValue() && this.f330873i) {
            sa5.d.e(linearLayout3, i65.a.h(holder.f293121e, com.tencent.mm.R.dimen.f479738dv), (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
        }
        this.f330873i = false;
        linearLayout3.setOnClickListener(new mr3.f(holder, this));
        if (!item.o()) {
            linearLayout.setVisibility(8);
            return;
        }
        java.lang.String str = item.f330879h;
        if (str == null) {
            return;
        }
        linearLayout.setVisibility(0);
        kotlinx.coroutines.l.d(this.f330869e, kotlinx.coroutines.q1.f310570c, null, new mr3.h(str, mMRoundCornerImageView, null), 2, null);
        linearLayout2.setOnClickListener(new mr3.i(this, item));
    }
}
