package ke2;

/* loaded from: classes.dex */
public final class m extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306965t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.util.LinkedList encryptedItems) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(encryptedItems, "encryptedItems");
        this.f306965t = "CgiFinderLiveDecrypt";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 24286;
        r45.oo1 oo1Var = new r45.oo1();
        oo1Var.set(2, encryptedItems);
        oo1Var.set(1, db2.t4.f228171a.a(24286));
        lVar.f70664a = oo1Var;
        lVar.f70665b = new r45.po1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivedecrypt";
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.po1 resp = (r45.po1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306965t, "decrypted_item_list:" + resp.getList(1));
    }
}
