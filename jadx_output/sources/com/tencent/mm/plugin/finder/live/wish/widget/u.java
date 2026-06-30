package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.x f120790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vu1 f120791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.finder.live.wish.widget.x xVar, r45.vu1 vu1Var) {
        super(1);
        this.f120790d = xVar;
        this.f120791e = vu1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        r45.z94 it = (r45.z94) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("send gift: ");
        r45.kv1 kv1Var = (r45.kv1) it.getCustom(0);
        sb6.append(kv1Var != null ? kv1Var.getString(0) : null);
        sb6.append(" name: ");
        r45.kv1 kv1Var2 = (r45.kv1) it.getCustom(0);
        sb6.append(kv1Var2 != null ? kv1Var2.getString(8) : null);
        com.tencent.mars.xlog.Log.i("WishAudiencePanelWidget", sb6.toString());
        com.tencent.mm.plugin.finder.live.wish.widget.x xVar = this.f120790d;
        kn2.d dVar = xVar.f120799o;
        r45.kv1 kv1Var3 = (r45.kv1) it.getCustom(0);
        if (kv1Var3 == null || (str = kv1Var3.getString(0)) == null) {
            str = "";
        }
        java.lang.String string = this.f120791e.getString(6);
        java.lang.String str2 = string != null ? string : "";
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = (com.tencent.mm.plugin.finder.live.plugin.wn0) dVar;
        wn0Var.getClass();
        boolean m76 = ((mm2.c1) wn0Var.P0(mm2.c1.class)).m7();
        r45.i82 i82Var = (r45.i82) ((mm2.f7) wn0Var.P0(mm2.f7.class)).f329058f.getValue();
        boolean z17 = i82Var != null ? i82Var.getBoolean(0) : false;
        com.tencent.mars.xlog.Log.i("FinderLiveWishPanelPlug", "sendGift enableGiftSwitch: " + m76 + " isEnableWish: " + z17);
        android.view.ViewGroup viewGroup = wn0Var.f365323d;
        if (!m76) {
            db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dk_));
        } else if (z17) {
            qo0.c.a(wn0Var.f114973p, qo0.b.R1, null, 2, null);
            ((mm2.s2) wn0Var.P0(mm2.s2.class)).f329408m.postValue(new mm2.r2(str, str2));
        } else {
            db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dka));
        }
        xVar.a();
        return jz5.f0.f302826a;
    }
}
