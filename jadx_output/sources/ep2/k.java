package ep2;

/* loaded from: classes2.dex */
public class k extends tb2.f {

    /* renamed from: m, reason: collision with root package name */
    public final int f255724m;

    /* renamed from: n, reason: collision with root package name */
    public final int f255725n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f255726o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i17, float f17, boolean z17, boolean z18, android.content.Context baseContext, float f18, int i18) {
        super(f17, z17, z18, f18, new ep2.f(baseContext, i17));
        kotlin.jvm.internal.o.g(baseContext, "baseContext");
        this.f255724m = i17;
        this.f255725n = i18;
        this.f255726o = kotlinx.coroutines.z0.b();
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.TextView textView;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.q(holder, item, i17, i18, z17, list);
        r(holder, item);
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Z3).getValue()).r()).intValue() == 1) {
            java.lang.String u17 = pm0.v.u(item.getFeedObject().field_id);
            com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", "#bindActivityIcon feedId=".concat(u17));
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hmm);
            if (imageView == null) {
                com.tencent.mars.xlog.Log.i("NearbyLiveViewCallback", "#bindActivityIcon feedId=" + u17 + " iconView is null!");
            } else {
                java.lang.Object tag = imageView.getTag(com.tencent.mm.R.id.fuo);
                if (tag instanceof kotlinx.coroutines.r2) {
                    kotlinx.coroutines.p2.a((kotlinx.coroutines.r2) tag, null, 1, null);
                }
                android.view.View itemView = holder.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                ym5.a1.h(itemView, new ep2.g(imageView));
                imageView.setTag(com.tencent.mm.R.id.fuo, kotlinx.coroutines.l.d(this.f255726o, null, null, new ep2.h(holder, item, imageView, null), 3, null));
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fuv);
        if (textView2 == null || (textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f487684pg0)) == null) {
            return;
        }
        textView.setImportantForAccessibility(2);
        textView2.setContentDescription(holder.itemView.getContext().getString(com.tencent.mm.R.string.efq, textView2.getText().toString(), textView.getText().toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(in5.s0 r31, com.tencent.mm.plugin.finder.model.BaseFinderFeed r32) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep2.k.r(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }
}
