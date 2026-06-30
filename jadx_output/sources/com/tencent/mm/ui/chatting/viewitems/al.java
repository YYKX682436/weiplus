package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class al {
    public al(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(com.tencent.mm.ui.chatting.viewitems.al alVar, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.ao aoVar, java.util.Map map) {
        alVar.getClass();
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.giftinfo.attrcontent");
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.giftinfo.tip");
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.giftinfo.object_id");
        long Z = str3 != null ? pm0.v.Z(str3) : 0L;
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.giftinfo.gift_id");
        r45.tq4 tq4Var = new r45.tq4();
        tq4Var.f386704e = str4;
        tq4Var.f386703d = Z;
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putByteArray("KEY_FINDER_LIVE_JUMP_DATA", tq4Var.toByteArray());
            java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.finder_appmsg_type");
            bundle.putInt("KEY_FINDER_LIVE_JUMP_TYPE", str5 != null ? java.lang.Integer.parseInt(str5) : 0);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("ChattingItemFinderLiveLotteryGift", "putByteArray error:" + th6);
        }
        aoVar.f203393p.setText(str2);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int textSize = (int) aoVar.f203379b.getTextSize();
        ((ke0.e) xVar).getClass();
        aoVar.f203379b.c(com.tencent.mm.pluginsdk.ui.span.c0.l(context, str, textSize, 4, bundle, true), android.widget.TextView.BufferType.SPANNABLE, null);
    }
}
