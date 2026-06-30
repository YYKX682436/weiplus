package uf5;

/* loaded from: classes10.dex */
public class d1 extends uf5.w0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.privacy.FinderBlockListUI f427212s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.ui.contact.privacy.FinderBlockListUI finderBlockListUI, com.tencent.mm.ui.contact.l4 l4Var) {
        super(finderBlockListUI, l4Var);
        this.f427212s = finderBlockListUI;
    }

    @Override // uf5.w0
    public com.tencent.mm.ui.contact.item.d t(int i17, java.lang.String str) {
        com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
        n0Var.f206903y = str;
        return n0Var;
    }

    @Override // uf5.w0
    public java.lang.String v() {
        int i17 = this.f427212s.F;
        if (i17 == 2) {
            return "@finder.block.my.liked.android";
        }
        if (i17 == 1) {
            return "@finder.block.his.liked.android";
        }
        return null;
    }
}
