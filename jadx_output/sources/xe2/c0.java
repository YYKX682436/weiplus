package xe2;

/* loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe2.h0 f453840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xe2.h0 h0Var) {
        super(1);
        this.f453840d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.ch1 it = (r45.ch1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        xe2.h0 h0Var = this.f453840d;
        gk2.e eVar = h0Var.f445267a;
        if (!((mm2.c1) eVar.a(mm2.c1.class)).f328921y4) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            r45.xn1 xn1Var = (r45.xn1) it.getCustom(0);
            if (r4Var.c2((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername())) {
                ((mm2.c1) eVar.a(mm2.c1.class)).f328921y4 = true;
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Pk();
            }
        }
        com.tencent.mm.plugin.finder.live.util.l1 l1Var = new com.tencent.mm.plugin.finder.live.util.l1(it);
        com.tencent.mars.xlog.Log.i(h0Var.f453866c, "filterGiftMsg: giftShowInfo=" + l1Var.hashCode() + ", " + l1Var + ", client_msg_id=" + it.getString(2) + ", local_client_msg_id=" + it.getString(14) + ", quoted_msg_seq=" + it.getLong(3) + ", seq=" + it.getLong(12));
        return l1Var;
    }
}
