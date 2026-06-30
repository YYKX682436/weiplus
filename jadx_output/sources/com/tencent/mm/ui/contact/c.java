package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f206635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.e f206636e;

    public c(com.tencent.mm.ui.contact.e eVar, java.util.LinkedList linkedList) {
        this.f206636e = eVar;
        this.f206635d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        com.tencent.mm.ui.contact.e eVar = this.f206636e;
        android.database.Cursor A = ((com.tencent.mm.storage.k4) q17).A(eVar.f206672v, eVar.f206673w, eVar.f206674x, this.f206635d, eVar.u(), eVar.f206671J);
        if (A != null) {
            try {
                if (A instanceof e95.j) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    e95.h hVar = ((e95.j) A).f250423f[0];
                    int position = hVar.getPosition();
                    while (hVar.moveToNext()) {
                        com.tencent.mm.storage.g gVar = new com.tencent.mm.storage.g();
                        gVar.a(hVar);
                        arrayList.add(gVar.e());
                    }
                    hVar.moveToPosition(position);
                    ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
                    java.util.List list = ef4.i.f252446a;
                    s75.d.b(ef4.h.f252444d, "FavourUserChecker_StoryStateChecker");
                }
            } finally {
                A.close();
            }
        }
        if (A != null) {
        }
    }
}
