package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class ui implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.xi f200076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f200077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f200078c;

    public ui(com.tencent.mm.ui.chatting.component.xi xiVar, java.util.List list, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f200076a = xiVar;
        this.f200077b = list;
        this.f200078c = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.ui.chatting.component.xi xiVar = this.f200076a;
        xiVar.getClass();
        java.util.List<t35.a> itemList = this.f200077b;
        kotlin.jvm.internal.o.g(itemList, "itemList");
        java.lang.String x17 = xiVar.f198580d.x();
        if (x17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PasteComponent", "talkerName is null");
        } else {
            java.lang.String f17 = itemList.size() > 1 ? dh3.c.f232489a.f(x17, dh3.d.f232496e) : "";
            for (t35.a aVar : itemList) {
                long k17 = com.tencent.mm.vfs.w6.k(java.lang.String.valueOf(aVar.f415434c));
                ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).getClass();
                if (k17 > ez.v0.f257777a.h()) {
                    xiVar.n0(aVar, x17, f17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.PasteComponent", "file size too large, send as file");
                } else {
                    int i17 = aVar.f415432a;
                    if (i17 != 1) {
                        android.net.Uri uri = aVar.f415434c;
                        if (i17 == 2) {
                            ((com.tencent.mm.ui.chatting.component.lk) ((sb5.w1) xiVar.f198580d.f460708c.a(sb5.w1.class))).o0(0, 0, 0, java.lang.String.valueOf(uri), f17);
                        } else if (i17 == 3) {
                            android.content.Intent intent = new android.content.Intent();
                            intent.setData(uri);
                            intent.putExtra("MsgRevokeBatchId", f17);
                            ((com.tencent.mm.ui.chatting.component.jo) ((sb5.p2) xiVar.f198580d.f460708c.a(sb5.p2.class))).p0(intent, x17);
                        } else if (i17 != 4) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.PasteComponent", "unknown type, type = " + java.lang.Integer.valueOf(i17));
                        } else {
                            xiVar.n0(aVar, x17, f17);
                        }
                    } else {
                        ((com.tencent.mm.ui.chatting.component.sk) ((sb5.f2) xiVar.f198580d.f460708c.a(sb5.f2.class))).q0(aVar.f415433b, f17);
                    }
                }
            }
        }
        this.f200078c.B();
    }
}
