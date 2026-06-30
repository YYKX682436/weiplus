package j12;

/* loaded from: classes15.dex */
public abstract class c {
    public static void a(java.util.ArrayList arrayList, j12.f fVar) {
        if (c01.z1.y() && fVar != null && arrayList != null && arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.pluginsdk.model.q3 q3Var = (com.tencent.mm.pluginsdk.model.q3) it.next();
                if (q3Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiGoogleMarketTool", "endSeachGoogleMarket: %s", q3Var);
                    com.tencent.mm.storage.f5 e17 = fVar.e(q3Var.f189412b);
                    int i17 = q3Var.f189416f;
                    if (i17 == 10232) {
                        e17.f193922e = q3Var.f189413c;
                        new java.math.BigDecimal(q3Var.f189415e).divide(new java.math.BigDecimal(1000000)).toString();
                        e17.f193920c = 12;
                        int i18 = e17.f193919b;
                        if (!(i18 == 7)) {
                            if (!(i18 == 6)) {
                                e17.a(4);
                            }
                        }
                    } else {
                        e17.f193920c = 10;
                        e17.f193921d = i17;
                        int i19 = e17.f193919b;
                        if (!(i19 == 7)) {
                            if (!(i19 == 6)) {
                                if (!(i19 == 3)) {
                                    e17.a(10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void b(j12.f fVar, ec0.e eVar) {
        if (c01.z1.y() && fVar != null) {
            java.util.ArrayList arrayList = fVar.f297158d;
            if ((arrayList == null ? 0 : arrayList.size()) <= 0 || eVar == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = fVar.iterator();
            while (true) {
                j12.e eVar2 = (j12.e) it;
                if (!eVar2.hasNext()) {
                    break;
                }
                j12.i iVar = (j12.i) eVar2.next();
                if (iVar != null) {
                    if (iVar.f297166a != j12.h.cellset) {
                        r45.zj0 zj0Var = iVar.f297167b;
                        boolean c17 = j12.g.c(zj0Var);
                        boolean a17 = j12.g.a(zj0Var);
                        if (!c17 && !a17) {
                            arrayList2.add(zj0Var.f392128d);
                            fVar.e(zj0Var.f392128d).f193920c = 11;
                        }
                    }
                }
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (arrayList2.size() <= 0 || com.tencent.mm.sdk.platformtools.a0.c()) {
                return;
            }
            ec0.f fVar2 = (ec0.f) i95.n0.c(ec0.f.class);
            java.lang.String[] strArr = (java.lang.String[]) arrayList2.toArray(new java.lang.String[arrayList2.size()]);
            ((dc0.e) fVar2).getClass();
            com.tencent.mm.pluginsdk.model.i2.a(context, strArr, eVar);
        }
    }
}
