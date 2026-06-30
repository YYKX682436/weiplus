package com.tencent.mm.plugin.game.luggage.jsapi;

@mk0.a
/* loaded from: classes.dex */
class p5 implements com.tencent.mm.ipcinvoker.j {
    private p5() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("chatVcSelectTab");
        java.lang.String string = bundle.getString("game_msg_ui_from_msgid");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.GAME_ENTRANCE_MSG_TAB_TYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.GAME_INTERACTIVE_MSG_ID_STRING_SYNC, string);
        rVar.a(new android.os.Bundle());
    }
}
