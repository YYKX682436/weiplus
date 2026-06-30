package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class h6 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.i6 f206754d;

    public h6(com.tencent.mm.ui.contact.i6 i6Var) {
        this.f206754d = i6Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17 = vVar.f351158c;
        com.tencent.mm.ui.contact.i6 i6Var = this.f206754d;
        p13.u uVar = vVar.f351156a;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiSearchContactAdapter", "search query:%s, err:%s", uVar.f351141c, java.lang.Integer.valueOf(i17));
            if (uVar.f351141c.equals(i6Var.f206800u.get(i6Var.f206801v))) {
                i6Var.w();
                return;
            }
            return;
        }
        if (i17 != 0 || i6Var.f206799t == null || vVar.f351159d == null) {
            return;
        }
        java.util.List list = vVar.f351160e;
        java.util.List list2 = i6Var.f206798s;
        if (list2 != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                p13.y yVar = (p13.y) list.get(size);
                if (!list2.contains(yVar.f351187e)) {
                    int i18 = yVar.f351184b;
                    if (i18 == 131072 || i18 == 131075 || i18 == 131076 || i18 == 2097171 || i18 == 2097173 || i18 == 131081) {
                    }
                }
                list.remove(size);
            }
        }
        java.lang.String str = vVar.f351159d.f351129a;
        if (((java.util.HashMap) i6Var.f206793n).get(str) == null) {
            ((java.util.HashMap) i6Var.f206793n).put(str, new java.util.LinkedList());
            if (((java.util.HashMap) i6Var.f206794o).get(str) == null) {
                ((java.util.HashMap) i6Var.f206794o).put(str, java.lang.Boolean.FALSE);
            }
            ((java.util.HashMap) i6Var.f206795p).put(str, vVar.f351159d);
        }
        if (vVar.f351160e.size() > 0) {
            if (((p13.y) vVar.f351160e.get(0)).f351184b != 131072) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiSearchContactAdapter", "not support search type");
            } else {
                ((java.util.List) ((java.util.HashMap) i6Var.f206793n).get(vVar.f351159d.f351129a)).addAll(vVar.f351160e);
            }
        }
        i6Var.A(uVar.f351141c, i6Var.w(), true);
    }
}
