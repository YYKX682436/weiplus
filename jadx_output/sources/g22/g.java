package g22;

/* loaded from: classes15.dex */
public final class g implements ec0.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g22.i f267814d;

    public g(g22.i iVar) {
        this.f267814d = iVar;
    }

    @Override // ec0.e
    public void i3(java.util.ArrayList arrayList) {
        com.tencent.mm.plugin.emoji.model.q qVar = this.f267814d.f267823e;
        if (c01.z1.y() && arrayList != null && arrayList.size() > 0 && qVar != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.pluginsdk.model.q3 q3Var = (com.tencent.mm.pluginsdk.model.q3) it.next();
                if (q3Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3GoogleMarketTool", "endSeachV3GoogleMarket: %s", q3Var);
                    com.tencent.mm.storage.f5 b17 = qVar.b(q3Var.f189412b);
                    int i17 = q3Var.f189416f;
                    if (i17 == 10232) {
                        b17.f193922e = q3Var.f189413c;
                        new java.math.BigDecimal(q3Var.f189415e).divide(new java.math.BigDecimal(1000000)).toString();
                        b17.f193920c = 12;
                        int i18 = b17.f193919b;
                        if (!(i18 == 7)) {
                            if (!(i18 == 6)) {
                                b17.a(4);
                            }
                        }
                    } else {
                        b17.f193920c = 10;
                        b17.f193921d = i17;
                        int i19 = b17.f193919b;
                        if (!(i19 == 7)) {
                            if (!(i19 == 6)) {
                                if (!(i19 == 3)) {
                                    b17.a(10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
