package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class f3 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190307b;

    public f3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, java.lang.String str) {
        this.f190307b = chatFooter;
        this.f190306a = str;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.chat.d0 d0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190307b;
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        hashMap.put("chat_username", y4Var != null ? y4Var.c() : "");
        fl5.i iVar = chatFooter.f190021m;
        hashMap.put("has_input", (iVar == null || iVar.getText() == null || com.tencent.mm.sdk.platformtools.t8.K0(chatFooter.f190021m.getText().toString())) ? "0" : "1");
        int i17 = 0;
        hashMap.put("in_voice_mode", chatFooter.f190039p.getVisibility() != 0 ? 0 : "1");
        if ("chat_plus_btn".equals(this.f190306a)) {
            com.tencent.mm.pluginsdk.ui.chat.d0 d0Var2 = chatFooter.B;
            if (d0Var2 != null) {
                android.widget.ImageView imageView = d0Var2.f190254b;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i17 = 1;
                }
            }
            hashMap.put("is_red_dot", java.lang.Integer.valueOf(i17));
            hashMap.put("log_version", "20260409");
            if (i17 == 1 && (d0Var = chatFooter.B) != null) {
                hashMap.put("red_dot_source_list", d0Var.f190256d);
            }
        }
        return hashMap;
    }
}
