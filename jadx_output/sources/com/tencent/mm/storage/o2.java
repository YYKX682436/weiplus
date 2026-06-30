package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.s1 f195191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f195192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f195193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f195194g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.tencent.mm.storage.s1 s1Var, java.util.Map map, int i17, android.content.Context context) {
        super(0);
        this.f195191d = s1Var;
        this.f195192e = map;
        this.f195193f = i17;
        this.f195194g = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.storage.s1 s1Var = this.f195191d;
        if (!(e0Var.n(s1Var.field_talker, s1Var.field_msgId).getMsgId() == 0)) {
            java.lang.String str = s1Var.field_talker;
            java.lang.String str2 = (java.lang.String) this.f195192e.get(".msg.appmsg.mmreader." + com.tencent.mm.storage.s2.g(this.f195193f) + ".publisher_username");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str = str2;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", true);
            intent.putExtra("from_global_search", true);
            intent.putExtra("msg_local_id", s1Var.field_msgId);
            intent.putExtra("specific_chat_from_scene", 9);
            intent.putExtra("preChatTYPE", 13);
            j45.l.u(this.f195194g, ".ui.chatting.ChattingUI", intent, null);
        }
        return jz5.f0.f302826a;
    }
}
