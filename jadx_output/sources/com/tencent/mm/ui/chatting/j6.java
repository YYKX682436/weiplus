package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class j6 extends com.tencent.mm.ui.chatting.b6 {
    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        int i17 = erVar.f203919o;
        java.lang.String str = erVar.f203920p;
        java.lang.String str2 = erVar.f203921q;
        java.lang.String str3 = erVar.f203922r;
        java.lang.String str4 = erVar.f203923s;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DesignerClickListener", "topic id is zero.");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("geta8key_username", dVar.x());
        intent.putExtra("rawUrl", erVar.f203926v);
        intent.putExtra("topic_id", i17);
        intent.putExtra("topic_name", str);
        intent.putExtra("topic_desc", str2);
        intent.putExtra("topic_icon_url", str3);
        intent.putExtra("topic_ad_url", str4);
        intent.putExtra("extra_scence", 22);
        j45.l.j(dVar.g(), "emoji", ".ui.EmojiStoreTopicUI", intent, null);
    }
}
