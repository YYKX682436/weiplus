package wj5;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.e0 f446785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.anim.content.AnimTextView f446786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xj5.n f446787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f446788g;

    public c0(wj5.e0 e0Var, com.tencent.mm.ui.anim.content.AnimTextView animTextView, xj5.n nVar, in5.s0 s0Var) {
        this.f446785d = e0Var;
        this.f446786e = animTextView;
        this.f446787f = nVar;
        this.f446788g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.anim.content.AnimTextView tvCancel = this.f446786e;
        kotlin.jvm.internal.o.f(tvCancel, "$tvCancel");
        wj5.e0 e0Var = this.f446785d;
        if (e0Var.q(tvCancel)) {
            kotlin.jvm.internal.o.f(tvCancel, "$tvCancel");
            e0Var.p(tvCancel, true);
            yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        xj5.n nVar = this.f446787f;
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2("msginfo@fakeuser", nVar.f454915u.w0().f372605f);
        boolean z17 = !c01.v1.C(e0Var.f446794e.x(), en1.a.a());
        if ((o27 == null || o27.getMsgId() == 0 || o27.getType() == 268445456) ? false : true) {
            kotlin.jvm.internal.o.d(view);
            if (o27 == null) {
                e0Var.getClass();
            } else {
                yb5.d dVar = e0Var.f446794e;
                int b17 = i65.a.b(dVar.g(), 120);
                sb5.z zVar = (sb5.z) dVar.f460708c.a(sb5.z.class);
                java.lang.String Q0 = o27.Q0();
                long msgId = o27.getMsgId();
                hd5.n nVar2 = hd5.n.ACTION_POSITION;
                sb5.y yVar = new sb5.y();
                yVar.f405597b = true;
                yVar.f405598c = true;
                yVar.f405600e = b17;
                yVar.f405601f = true;
                ((com.tencent.mm.ui.chatting.adapter.k) zVar).T0(Q0, msgId, nVar2, yVar);
            }
            e0Var.f446796g.m0();
        } else {
            in5.s0 s0Var = this.f446788g;
            db5.t7.i(s0Var.itemView.getContext(), s0Var.itemView.getContext().getString(com.tencent.mm.R.string.b6_), com.tencent.mm.R.raw.icons_outlined_info);
        }
        if (z17) {
            ak5.g0 g0Var = (ak5.g0) i95.n0.c(ak5.g0.class);
            java.lang.String t07 = nVar.f454915u.t0();
            kotlin.jvm.internal.o.f(t07, "getChatRoomName(...)");
            g0Var.wi(t07, nVar.f454915u.u0());
            nVar.f454897e = 1;
        }
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/TopMsgTipsBarConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
