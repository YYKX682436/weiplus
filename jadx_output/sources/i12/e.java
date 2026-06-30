package i12;

/* loaded from: classes15.dex */
public final class e extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f287206d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f287207e;

    /* renamed from: f, reason: collision with root package name */
    public final int f287208f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f287209g;

    /* renamed from: h, reason: collision with root package name */
    public i22.p0 f287210h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f287211i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f287212m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f287213n;

    public e(java.lang.String finderUserName, java.lang.String sdkRequestID, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        kotlin.jvm.internal.o.g(sdkRequestID, "sdkRequestID");
        this.f287206d = finderUserName;
        this.f287207e = sdkRequestID;
        this.f287208f = i17;
        this.f287209g = z17;
        this.f287212m = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        this.f287213n = new java.util.LinkedList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f287213n.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        yz5.a aVar;
        i12.x holder = (i12.x) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        i22.m0 m0Var = new i22.m0();
        bw5.ra raVar = (bw5.ra) kz5.n0.a0(this.f287213n, i17);
        j12.i iVar = new j12.i(raVar);
        iVar.c(3);
        com.tencent.mm.plugin.emoji.model.p pVar = com.tencent.mm.plugin.emoji.model.q.f97591c;
        iVar.b(pVar.b(), null, pVar.a(raVar != null ? raVar.f32456d : null));
        m0Var.f288004a = iVar;
        holder.f288003e = m0Var;
        holder.i(m0Var, new java.util.ArrayList());
        if (i17 < getItemCount() - 3 || (aVar = this.f287211i) == null) {
            return;
        }
        aVar.invoke();
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dby, parent, false);
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = marginLayoutParams.getMarginEnd();
        inflate.setLayoutParams(marginLayoutParams);
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new i12.x(context, inflate, this.f287210h, this.f287206d, this.f287207e, this.f287208f, this.f287212m, this.f287209g);
    }
}
