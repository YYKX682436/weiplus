package sm2;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(sm2.o4 o4Var) {
        super(1);
        this.f409662d = o4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        r45.yz1 micPkInfo = (r45.yz1) obj;
        kotlin.jvm.internal.o.g(micPkInfo, "micPkInfo");
        sm2.o4 o4Var = this.f409662d;
        mm2.o4 o4Var2 = (mm2.o4) o4Var.c(mm2.o4.class);
        java.lang.String string = micPkInfo.getString(2);
        r45.xn1 xn1Var = (r45.xn1) micPkInfo.getCustom(3);
        java.lang.String str = null;
        java.lang.String headUrl = (xn1Var == null || (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact5.getHeadUrl();
        r45.xn1 xn1Var2 = (r45.xn1) micPkInfo.getCustom(3);
        java.lang.String username = (xn1Var2 == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact4.getUsername();
        r45.xn1 xn1Var3 = (r45.xn1) micPkInfo.getCustom(3);
        o4Var2.L7(new km2.q(string, headUrl, username, (xn1Var3 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact3.getNickname(), 2, micPkInfo.getString(0), null, true, micPkInfo.getInteger(6), null, null, 0, 0, false, null, false, 0L, (r45.xn1) micPkInfo.getCustom(3), false, null, null, 0, 0, 0L, null, null, 0L, null, 0, 0L, null, null, null, -131584, 1, null));
        com.tencent.mars.xlog.Log.i(o4Var.f409610f, "checkLinkMicStateWhenJoin has unfinished mic pk, will close. curPkUser:" + ((mm2.o4) o4Var.c(mm2.o4.class)).l7());
        r45.xn1 xn1Var4 = (r45.xn1) micPkInfo.getCustom(3);
        java.lang.String username2 = (xn1Var4 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null) ? null : finderContact2.getUsername();
        mk2.h hVar = mk2.h.f327133a;
        hVar.d(username2);
        hVar.f();
        sm2.o4 o4Var3 = this.f409662d;
        r45.xn1 xn1Var5 = (r45.xn1) micPkInfo.getCustom(3);
        if (xn1Var5 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) != null) {
            str = finderContact.getUsername();
        }
        sm2.o4.o(o4Var3, str, false, false, null, 14, null);
        return jz5.f0.f302826a;
    }
}
