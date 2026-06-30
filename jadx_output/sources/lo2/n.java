package lo2;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI f320157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI finderMemberFanListUI) {
        super(2);
        this.f320157d = finderMemberFanListUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String str;
        r45.lz0 msgInfo;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        r45.lz0 msgInfo2;
        java.lang.String wx_username_v5;
        r45.hz0 extInfo;
        r45.hz0 extInfo2;
        r45.hz0 extInfo3;
        r45.hz0 extInfo4;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g((android.view.View) obj, "<anonymous parameter 0>");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (!z17) {
            com.tencent.mm.plugin.finder.member.ui.FinderMemberFanListUI finderMemberFanListUI = this.f320157d;
            java.lang.Object obj3 = finderMemberFanListUI.f121394x.f320123e.get(intValue);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            r45.ag2 ag2Var = (r45.ag2) obj3;
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = ag2Var.f369989d;
            java.lang.String str8 = "";
            if ((finderContact2 == null || (str = finderContact2.getUsername()) == null) && ((finderContact = ag2Var.f369989d) == null || (msgInfo = finderContact.getMsgInfo()) == null || (str = msgInfo.getString(0)) == null)) {
                str = "";
            }
            intent.putExtra("Username", str);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = ag2Var.f369989d;
            if (finderContact3 == null || (str2 = finderContact3.getNickname()) == null) {
                str2 = "";
            }
            intent.putExtra("Nickname", str2);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = ag2Var.f369989d;
            if (finderContact4 == null || (str3 = finderContact4.getHeadUrl()) == null) {
                str3 = "";
            }
            intent.putExtra("Avatar", str3);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact5 = ag2Var.f369989d;
            if (finderContact5 == null || (str4 = finderContact5.getSignature()) == null) {
                str4 = "";
            }
            intent.putExtra("Signature", str4);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact6 = ag2Var.f369989d;
            intent.putExtra("Sex", (finderContact6 == null || (extInfo4 = finderContact6.getExtInfo()) == null) ? 0 : extInfo4.getInteger(3));
            com.tencent.mm.protocal.protobuf.FinderContact finderContact7 = ag2Var.f369989d;
            if (finderContact7 == null || (extInfo3 = finderContact7.getExtInfo()) == null || (str5 = extInfo3.getString(1)) == null) {
                str5 = "";
            }
            intent.putExtra("Province", str5);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact8 = ag2Var.f369989d;
            if (finderContact8 == null || (extInfo2 = finderContact8.getExtInfo()) == null || (str6 = extInfo2.getString(2)) == null) {
                str6 = "";
            }
            intent.putExtra("City", str6);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact9 = ag2Var.f369989d;
            if (finderContact9 == null || (extInfo = finderContact9.getExtInfo()) == null || (str7 = extInfo.getString(0)) == null) {
                str7 = "";
            }
            intent.putExtra("Country", str7);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact10 = ag2Var.f369989d;
            if (finderContact10 != null && (wx_username_v5 = finderContact10.getWx_username_v5()) != null) {
                str8 = wx_username_v5;
            }
            intent.putExtra("V5UserName", str8);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact11 = ag2Var.f369989d;
            intent.putExtra("ContactMsgInfo", (finderContact11 == null || (msgInfo2 = finderContact11.getMsgInfo()) == null) ? null : msgInfo2.toByteArray());
            intent.putExtra("IsPoster", true);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact12 = ag2Var.f369989d;
            i0Var.pl(finderMemberFanListUI, finderContact12 != null ? finderContact12.getUsername() : null, intent, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
