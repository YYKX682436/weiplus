package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public final class d5 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f200416d;

    public d5(java.util.List list) {
        this.f200416d = list;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        if (i17 == 6786 && i18 == -1) {
            java.util.List<com.tencent.mm.storage.f9> list = this.f200416d;
            long size = list.size();
            long size2 = list.size() - com.tencent.mm.ui.chatting.n3.f(list);
            com.tencent.mm.ui.chatting.w3 w3Var = com.tencent.mm.ui.chatting.x3.f206228a;
            pm0.v.K(null, new yd5.l(5L, size, size2, w3Var.f206207g, w3Var.f206208h, w3Var.f206209i));
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (com.tencent.mm.storage.f9 f9Var : list) {
                if (f9Var.k2()) {
                    java.lang.String j17 = f9Var.j();
                    if (j17 == null) {
                        j17 = "";
                    }
                    ot0.q v17 = ot0.q.v(j17);
                    if (v17 != null && ((i19 = v17.f348666i) == 51 || i19 == 106 || i19 == 129)) {
                        zy2.i iVar = (zy2.i) v17.y(zy2.i.class);
                        if (iVar != null) {
                            java.lang.String string = iVar.f477411b.getString(0);
                            if (string == null) {
                                string = "";
                            }
                            java.lang.String string2 = iVar.f477411b.getString(8);
                            linkedList.add(new android.util.Pair(string, string2 != null ? string2 : ""));
                        }
                    }
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).nj(linkedList, false);
            }
            if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
                return;
            }
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).nj(linkedList2, true);
        }
    }
}
