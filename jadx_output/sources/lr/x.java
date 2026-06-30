package lr;

/* loaded from: classes15.dex */
public final class x extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final ir.h f320600d;

    /* renamed from: e, reason: collision with root package name */
    public final ir.x0 f320601e;

    /* renamed from: f, reason: collision with root package name */
    public final lr.o0 f320602f;

    /* renamed from: g, reason: collision with root package name */
    public final lr.o0 f320603g;

    /* renamed from: h, reason: collision with root package name */
    public final ym5.f0 f320604h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f320605i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f320606m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.recyclerview.widget.y2 f320607n;

    /* renamed from: o, reason: collision with root package name */
    public lr.k0 f320608o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.k0 f320609p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f320610q;

    public x(ir.h config, ir.x0 lifeCycle, lr.o0 smileyItemSize, lr.o0 emojiItemSize, ym5.f0 indicatorWrapper) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(lifeCycle, "lifeCycle");
        kotlin.jvm.internal.o.g(smileyItemSize, "smileyItemSize");
        kotlin.jvm.internal.o.g(emojiItemSize, "emojiItemSize");
        kotlin.jvm.internal.o.g(indicatorWrapper, "indicatorWrapper");
        this.f320600d = config;
        this.f320601e = lifeCycle;
        this.f320602f = smileyItemSize;
        this.f320603g = emojiItemSize;
        this.f320604h = indicatorWrapper;
        this.f320605i = "MicroMsg.EmojiPanelGroupAdapter";
        this.f320606m = new java.util.ArrayList();
        androidx.recyclerview.widget.y2 y2Var = new androidx.recyclerview.widget.y2();
        this.f320607n = y2Var;
        y2Var.e(0, 50);
        y2Var.e(1, 30);
        y2Var.e(2, 3);
        y2Var.e(3, 1);
        y2Var.e(4, 2);
        y2Var.e(5, 3);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f320606m.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return this.f320606m.get(i17) instanceof ir.c1 ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        lr.u holder = (lr.u) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("smiley_log onBindViewHolder ");
        java.util.ArrayList arrayList = this.f320606m;
        sb6.append(arrayList.size());
        sb6.append(" , ");
        sb6.append(((ir.t0) arrayList.get(i17)).b().p().c());
        com.tencent.mars.xlog.Log.i(this.f320605i, sb6.toString());
        java.lang.Object obj = arrayList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        holder.j((ir.t0) obj);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 1) {
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.a6v, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new lr.w(this, inflate);
        }
        android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.a6u, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new lr.v(this, inflate2);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 k3Var) {
        lr.u holder = (lr.u) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewRecycled(holder);
        holder.k();
    }
}
