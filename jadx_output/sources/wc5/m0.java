package wc5;

/* loaded from: classes10.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.y0 f444607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(wc5.y0 y0Var) {
        super(1);
        this.f444607d = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String word = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(word, "word");
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView i76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) this.f444607d.U6()).i7();
        if (i76 != null) {
            i76.setSearchText(word);
        }
        return jz5.f0.f302826a;
    }
}
