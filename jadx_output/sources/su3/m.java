package su3;

/* loaded from: classes5.dex */
public final class m extends androidx.recyclerview.widget.f2 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f412795f;

    /* renamed from: o, reason: collision with root package name */
    public yz5.p f412801o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f412793d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f412794e = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f412796g = com.tencent.mm.R.drawable.f480930fn;

    /* renamed from: h, reason: collision with root package name */
    public int f412797h = com.tencent.mm.R.raw.finder_bgm_gif_first_page;

    /* renamed from: i, reason: collision with root package name */
    public int f412798i = com.tencent.mm.R.color.f479527a75;

    /* renamed from: m, reason: collision with root package name */
    public int f412799m = com.tencent.mm.R.color.a7b;

    /* renamed from: n, reason: collision with root package name */
    public int f412800n = com.tencent.mm.R.color.a77;

    public final void B(java.util.List audios) {
        kotlin.jvm.internal.o.g(audios, "audios");
        java.util.ArrayList arrayList = this.f412793d;
        arrayList.clear();
        arrayList.addAll(audios);
        this.f412794e = -1;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f412793d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo x17 = x(i17);
        if (x17 != null) {
            return x17.f155718o;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        int i18;
        su3.f holder = (su3.f) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo x17 = x(holder.getOldPosition());
        wt3.c1 c1Var = wt3.c1.f449387b;
        c1Var.f(x17);
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo x18 = x(i17);
        kotlin.jvm.internal.o.d(x18);
        if (!x18.f155716m && ((i18 = x18.f155718o) == 1 || i18 == 3)) {
            android.content.Context context = holder.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            c1Var.b(context, x18, new su3.l(x18));
        }
        holder.i(i17, x18);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 2) {
            android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.cwt, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            return new su3.i(this, inflate);
        }
        if (i17 == 3) {
            android.view.View inflate2 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.cwv, parent, false);
            kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
            return new su3.k(this, inflate2);
        }
        if (i17 == 4) {
            android.view.View inflate3 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.cws, parent, false);
            kotlin.jvm.internal.o.f(inflate3, "inflate(...)");
            return new su3.g(this, inflate3);
        }
        if (i17 == 5) {
            android.view.View inflate4 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.cwu, parent, false);
            kotlin.jvm.internal.o.f(inflate4, "inflate(...)");
            return new su3.j(this, inflate4);
        }
        android.view.View inflate5 = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.cwr, parent, false);
        kotlin.jvm.internal.o.f(inflate5, "inflate(...)");
        return new su3.h(this, inflate5);
    }

    public final com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo x(int i17) {
        return (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) kz5.n0.a0(this.f412793d, i17);
    }

    public final void y(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5) {
        if (num != null && num.intValue() != 0) {
            this.f412796g = num.intValue();
        }
        if (num2 != null && num2.intValue() != 0) {
            this.f412797h = num2.intValue();
        }
        if (num3 != null && num3.intValue() != 0) {
            this.f412798i = num3.intValue();
        }
        if (num4 != null && num4.intValue() != 0) {
            this.f412799m = num4.intValue();
        }
        if (num5 == null || num5.intValue() == 0) {
            return;
        }
        this.f412800n = num5.intValue();
    }

    public final void z(java.lang.Integer num) {
        if (num == null) {
            notifyItemChanged(this.f412794e);
            this.f412794e = -1;
            notifyItemChanged(-1);
        } else {
            notifyItemChanged(this.f412794e);
            int intValue = num.intValue();
            this.f412794e = intValue;
            notifyItemChanged(intValue);
        }
    }
}
