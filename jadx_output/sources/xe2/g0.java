package xe2;

/* loaded from: classes3.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe2.h0 f453863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(xe2.h0 h0Var) {
        super(1);
        this.f453863d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        r45.ch1 it = (r45.ch1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        xe2.h0 h0Var = this.f453863d;
        h0Var.getClass();
        zl2.r4 r4Var = zl2.r4.f473950a;
        r45.xn1 xn1Var = (r45.xn1) it.getCustom(13);
        java.lang.String str = null;
        boolean c27 = r4Var.c2((xn1Var == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact4.getUsername());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filterGiftMsg isMySelfMsg:");
        sb6.append(c27);
        sb6.append(", fromUserName:");
        r45.xn1 xn1Var2 = (r45.xn1) it.getCustom(13);
        sb6.append((xn1Var2 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact3.getUsername());
        sb6.append(", client_msg_id:");
        sb6.append(it.getString(2));
        sb6.append(", type:");
        sb6.append(it.getInteger(1));
        sb6.append(", fromNickName:");
        r45.xn1 xn1Var3 = (r45.xn1) it.getCustom(13);
        sb6.append((xn1Var3 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact2.getNickname());
        sb6.append(",toNickName:");
        r45.xn1 xn1Var4 = (r45.xn1) it.getCustom(0);
        if (xn1Var4 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) != null) {
            str = finderContact.getNickname();
        }
        sb6.append(str);
        com.tencent.mars.xlog.Log.i(h0Var.f453866c, sb6.toString());
        return java.lang.Boolean.valueOf(!c27);
    }
}
