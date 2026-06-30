package wj5;

/* loaded from: classes9.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xj5.h f446837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj5.u f446838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f446839f;

    public s(xj5.h hVar, wj5.u uVar, in5.s0 s0Var) {
        this.f446837d = hVar;
        this.f446838e = uVar;
        this.f446839f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xj5.h hVar = this.f446837d;
        java.lang.String msg_svrId = hVar.f454905u.f376769d;
        kotlin.jvm.internal.o.f(msg_svrId, "msg_svrId");
        long parseLong = java.lang.Long.parseLong(msg_svrId);
        com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        wj5.u uVar = this.f446838e;
        com.tencent.mm.storage.f9 o27 = cj6.o2(uVar.f446842e.x(), parseLong);
        if ((o27 == null || o27.getMsgId() == 0 || o27.getType() == 268445456) ? false : true) {
            kotlin.jvm.internal.o.d(view);
            uVar.getClass();
            if (o27 != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27193, 1, 2);
                yb5.d dVar = uVar.f446842e;
                int b17 = i65.a.b(dVar.g(), 120);
                sb5.z zVar = (sb5.z) dVar.f460708c.a(sb5.z.class);
                java.lang.String Q0 = o27.Q0();
                long msgId = o27.getMsgId();
                hd5.n nVar = hd5.n.ACTION_POSITION;
                sb5.y yVar = new sb5.y();
                yVar.f405597b = true;
                yVar.f405598c = true;
                yVar.f405600e = b17;
                yVar.f405601f = true;
                ((com.tencent.mm.ui.chatting.adapter.k) zVar).T0(Q0, msgId, nVar, yVar);
            }
            uVar.f446844g.m0();
        } else {
            in5.s0 s0Var = this.f446839f;
            db5.t7.i(s0Var.itemView.getContext(), s0Var.itemView.getContext().getString(com.tencent.mm.R.string.b6_), com.tencent.mm.R.raw.icons_outlined_info);
        }
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ni(uVar.f446842e.x(), hVar.f454905u);
        hVar.f454897e = 1;
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/PayPluginTopMsgTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
