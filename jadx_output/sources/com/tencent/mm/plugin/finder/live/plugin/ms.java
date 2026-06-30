package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ms extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f113563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f113564g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms(com.tencent.mm.plugin.finder.live.plugin.et etVar, java.lang.String str, r45.ch1 ch1Var, r45.y23 y23Var) {
        super(4);
        this.f113561d = etVar;
        this.f113562e = str;
        this.f113563f = ch1Var;
        this.f113564g = y23Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String string;
        df2.xw xwVar;
        java.lang.String str;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        r45.tp2 resp = (r45.tp2) obj4;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113561d;
        java.lang.String str2 = this.f113562e;
        com.tencent.mm.plugin.finder.live.plugin.et.G1(etVar, intValue, intValue2, str2.toString(), resp.getString(1), null, 16, null);
        r45.ch1 msg = this.f113563f;
        if (intValue == 0 && intValue2 == 0) {
            df2.nw nwVar = df2.xw.f231808w;
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("msg_id", java.lang.String.valueOf(msg.getString(2)));
            lVarArr[1] = new jz5.l("msg_text", str2);
            r45.y23 y23Var = this.f113564g;
            if (y23Var == null || (str = java.lang.Long.valueOf(y23Var.getLong(0)).toString()) == null) {
                str = "";
            }
            lVarArr[2] = new jz5.l("product_id", str);
            lVarArr[3] = new jz5.l("has_emoji", zl2.r4.f473950a.p1(str2) ? "1" : "0");
            lVarArr[4] = new jz5.l("has_at", (r26.n0.D(str2, "\u2005", false, 2, null) && r26.n0.C(str2, '@', false, 2, null)) ? "1" : "0");
            nwVar.a(2, kz5.c1.k(lVarArr));
        } else {
            r45.zm6 zm6Var = (r45.zm6) resp.getCustom(7);
            if (zm6Var != null && zm6Var.getBoolean(1)) {
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eby);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                zl2.q4 q4Var = zl2.q4.f473933a;
                r45.zm6 zm6Var2 = (r45.zm6) resp.getCustom(7);
                if (zm6Var2 != null && (string = zm6Var2.getString(0)) != null) {
                    string2 = string;
                }
                q4Var.P(string2);
            }
        }
        if (((java.lang.Boolean) ae2.in.S6.r()).booleanValue() && (xwVar = (df2.xw) this.f113561d.U0(df2.xw.class)) != null) {
            kotlin.jvm.internal.o.g(msg, "msg");
            com.tencent.mm.autogen.events.FinderLiveShopMsgEvent finderLiveShopMsgEvent = new com.tencent.mm.autogen.events.FinderLiveShopMsgEvent();
            am.vb vbVar = new am.vb();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            so0.c cVar = new so0.c();
            cVar.f410208e = java.lang.Long.valueOf(xwVar.c7());
            cVar.f410209f = msg.toByteArray();
            linkedList.add(cVar);
            vbVar.f8186a = linkedList;
            vbVar.f8187b = false;
            finderLiveShopMsgEvent.f54291g = vbVar;
            com.tencent.mm.sdk.event.IListener iListener = xwVar.f231817u;
            if (iListener != null) {
                iListener.callback(finderLiveShopMsgEvent);
            }
        }
        return jz5.f0.f302826a;
    }
}
