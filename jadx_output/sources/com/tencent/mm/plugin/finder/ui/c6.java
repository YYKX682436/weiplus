package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public abstract class c6 {
    public static final com.tencent.mm.plugin.finder.view.e3 a(r45.q21 fansContact, android.content.Context context, yz5.l lVar) {
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
        kotlin.jvm.internal.o.g(fansContact, "fansContact");
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) fansContact.getCustom(0);
        java.lang.String str8 = "";
        if ((finderContact2 == null || (str = finderContact2.getUsername()) == null) && ((finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) fansContact.getCustom(0)) == null || (msgInfo = finderContact.getMsgInfo()) == null || (str = msgInfo.getString(0)) == null)) {
            str = "";
        }
        intent.putExtra("Username", str);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) fansContact.getCustom(0);
        if (finderContact3 == null || (str2 = finderContact3.getNickname()) == null) {
            str2 = "";
        }
        intent.putExtra("Nickname", str2);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) fansContact.getCustom(0);
        if (finderContact4 == null || (str3 = finderContact4.getHeadUrl()) == null) {
            str3 = "";
        }
        intent.putExtra("Avatar", str3);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) fansContact.getCustom(0);
        if (finderContact5 == null || (str4 = finderContact5.getSignature()) == null) {
            str4 = "";
        }
        intent.putExtra("Signature", str4);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) fansContact.getCustom(0);
        intent.putExtra("Sex", (finderContact6 == null || (extInfo4 = finderContact6.getExtInfo()) == null) ? 0 : extInfo4.getInteger(3));
        com.tencent.mm.protocal.protobuf.FinderContact finderContact7 = (com.tencent.mm.protocal.protobuf.FinderContact) fansContact.getCustom(0);
        if (finderContact7 == null || (extInfo3 = finderContact7.getExtInfo()) == null || (str5 = extInfo3.getString(1)) == null) {
            str5 = "";
        }
        intent.putExtra("Province", str5);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact8 = (com.tencent.mm.protocal.protobuf.FinderContact) fansContact.getCustom(0);
        if (finderContact8 == null || (extInfo2 = finderContact8.getExtInfo()) == null || (str6 = extInfo2.getString(2)) == null) {
            str6 = "";
        }
        intent.putExtra("City", str6);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact9 = (com.tencent.mm.protocal.protobuf.FinderContact) fansContact.getCustom(0);
        if (finderContact9 == null || (extInfo = finderContact9.getExtInfo()) == null || (str7 = extInfo.getString(0)) == null) {
            str7 = "";
        }
        intent.putExtra("Country", str7);
        if (fansContact.getInteger(4) == 0) {
            intent.putExtra("Action", 1);
        }
        intent.putExtra("FansId", fansContact.getString(2));
        com.tencent.mm.protocal.protobuf.FinderContact finderContact10 = (com.tencent.mm.protocal.protobuf.FinderContact) fansContact.getCustom(0);
        if (finderContact10 != null && (wx_username_v5 = finderContact10.getWx_username_v5()) != null) {
            str8 = wx_username_v5;
        }
        intent.putExtra("V5UserName", str8);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact11 = (com.tencent.mm.protocal.protobuf.FinderContact) fansContact.getCustom(0);
        intent.putExtra("ContactMsgInfo", (finderContact11 == null || (msgInfo2 = finderContact11.getMsgInfo()) == null) ? null : msgInfo2.toByteArray());
        intent.putExtra("IsPoster", true);
        return ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).pl(context, fansContact.getString(5), intent, 1, lVar);
    }
}
