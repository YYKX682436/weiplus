package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hp f120455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(com.tencent.mm.plugin.finder.live.widget.hp hpVar) {
        super(0);
        this.f120455d = hpVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        qo0.c cVar;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.lang.String nickname;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f120455d;
        r45.xn1 xn1Var = hpVar.P;
        java.lang.String str2 = "";
        if (xn1Var == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (str = finderContact3.getUsername()) == null) {
            str = "";
        }
        bundle.putString("PARAM_FINDER_LIVE_LINK_USERNAME", str);
        r45.xn1 xn1Var2 = hpVar.P;
        if (xn1Var2 != null && (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) != null && (nickname = finderContact2.getNickname()) != null) {
            str2 = nickname;
        }
        bundle.putString("PARAM_FINDER_LIVE_LINK_NICKNAME", str2);
        r45.xn1 xn1Var3 = hpVar.P;
        bundle.putString("PARAM_FINDER_LIVE_LINK_AVATAR", (xn1Var3 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact.getHeadUrl());
        com.tencent.mm.plugin.finder.live.plugin.l lVar = hpVar.H;
        if (lVar != null && (cVar = lVar.f113325g) != null) {
            cVar.statusChange(qo0.b.S1, bundle);
        }
        return bundle;
    }
}
