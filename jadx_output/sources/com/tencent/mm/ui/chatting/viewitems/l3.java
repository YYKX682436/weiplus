package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.n3 f204386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f204388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.ui.chatting.viewitems.n3 n3Var, yb5.d dVar, rd5.d dVar2) {
        super(1);
        this.f204386d = n3Var;
        this.f204387e = dVar;
        this.f204388f = dVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.e3 holder = (com.tencent.mm.ui.chatting.viewitems.e3) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (te5.f.f418634a.a()) {
            holder.clickArea.setBackgroundResource(com.tencent.mm.R.drawable.f481244ob);
            holder.clickArea.setForeground(com.tencent.mm.sdk.platformtools.x2.f193075e.getDrawable(com.tencent.mm.R.drawable.f481171me));
            holder.clickArea.setPadding(0, 0, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 5), 0);
        }
        holder.clickArea.setOnClickListener(this.f204386d.w(this.f204387e));
        holder.clickArea.setOnLongClickListener(this.f204386d.u(this.f204387e));
        android.view.View view = holder.clickArea;
        sb5.z zVar = (sb5.z) this.f204387e.f460708c.a(sb5.z.class);
        view.setOnTouchListener(zVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1 : null);
        holder.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(this.f204388f, this.f204387e.D(), holder, null));
        return jz5.f0.f302826a;
    }
}
