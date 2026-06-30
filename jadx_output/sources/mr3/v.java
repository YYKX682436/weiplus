package mr3;

/* loaded from: classes5.dex */
public final class v extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f330905e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f330906f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f330907g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f330908h;

    public v(kotlinx.coroutines.y0 scope, boolean z17, yz5.l onDelete, yz5.l onClick) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(onDelete, "onDelete");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        this.f330905e = scope;
        this.f330906f = z17;
        this.f330907g = onDelete;
        this.f330908h = onClick;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e3u;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        mr3.l item = (mr3.l) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) holder.p(com.tencent.mm.R.id.f485321ha5);
        if (mMRoundCornerImageView == null) {
            return;
        }
        mMRoundCornerImageView.setVisibility(4);
        holder.o().post(new mr3.o(holder, mMRoundCornerImageView));
        java.lang.String str = item.f330879h;
        if (str == null) {
            return;
        }
        if (!item.o()) {
            mMRoundCornerImageView.setBackgroundColor(i65.a.d(holder.f293121e, com.tencent.mm.R.color.f478490b));
            return;
        }
        android.content.Context context = holder.f293121e;
        kotlinx.coroutines.l.d(this.f330905e, kotlinx.coroutines.q1.f310570c, null, new mr3.q(str, mMRoundCornerImageView, null), 2, null);
        if (!this.f330906f) {
            mMRoundCornerImageView.setOnLongClickListener(new mr3.t(context, mMRoundCornerImageView, this, item, holder));
        }
        mMRoundCornerImageView.setOnClickListener(new mr3.u(this, item));
    }
}
