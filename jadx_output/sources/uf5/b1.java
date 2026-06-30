package uf5;

/* loaded from: classes10.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f427202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.FinderBlockListUI f427203e;

    public b1(com.tencent.mm.ui.contact.privacy.FinderBlockListUI finderBlockListUI, java.util.List list) {
        this.f427203e = finderBlockListUI;
        this.f427202d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.ui.contact.privacy.FinderBlockListUI finderBlockListUI = this.f427203e;
        finderBlockListUI.A = true;
        for (java.lang.String str : this.f427202d) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
                finderContact.setUsername(n17.d1());
                finderContact.setCoverImgUrl(n17.f236591z1);
                arrayList.add(finderContact);
            }
        }
        finderBlockListUI.f207120J = finderBlockListUI.G.j(arrayList, null);
    }
}
