package mm2;

/* loaded from: classes3.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f329219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(r45.ch1 ch1Var) {
        super(3);
        this.f329219d = ch1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        java.util.List micUserLst = (java.util.List) obj;
        r45.yt4 anchorInfo = (r45.yt4) obj2;
        java.lang.String str = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(micUserLst, "micUserLst");
        kotlin.jvm.internal.o.g(anchorInfo, "anchorInfo");
        pm0.v.G(micUserLst, new mm2.k3(anchorInfo));
        java.lang.String string = anchorInfo.getString(1);
        r45.xn1 xn1Var = (r45.xn1) anchorInfo.getCustom(0);
        java.lang.String headUrl = (xn1Var == null || (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact5.getHeadUrl();
        r45.xn1 xn1Var2 = (r45.xn1) anchorInfo.getCustom(0);
        java.lang.String username = (xn1Var2 == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact4.getUsername();
        r45.xn1 xn1Var3 = (r45.xn1) anchorInfo.getCustom(0);
        java.lang.String nickname = (xn1Var3 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact3.getNickname();
        java.lang.String string2 = this.f329219d.getString(7);
        int integer = anchorInfo.getInteger(2);
        r45.xn1 xn1Var4 = (r45.xn1) anchorInfo.getCustom(0);
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo = (xn1Var4 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null) ? null : finderContact2.getAuthInfo();
        r45.xn1 xn1Var5 = (r45.xn1) anchorInfo.getCustom(0);
        java.lang.String signature = (xn1Var5 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) == null) ? null : finderContact.getSignature();
        r45.xn1 xn1Var6 = (r45.xn1) anchorInfo.getCustom(0);
        java.lang.String string3 = xn1Var6 != null ? xn1Var6.getString(8) : null;
        r45.xn1 xn1Var7 = (r45.xn1) anchorInfo.getCustom(0);
        r45.xn1 xn1Var8 = (r45.xn1) anchorInfo.getCustom(0);
        micUserLst.add(new km2.q(string, headUrl, username, nickname, 2, string2, null, true, integer, authInfo, signature, 0, 0, false, string3, false, 0L, xn1Var7, false, null, xn1Var8 != null ? (r45.ba4) xn1Var8.getCustom(16) : null, 0, 0, 0L, str, null, 0L, null, 0, anchorInfo.getLong(4), null, null, anchorInfo.getString(3), -554846208, 0, null));
        return jz5.f0.f302826a;
    }
}
