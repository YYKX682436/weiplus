package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class c0 implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.d0 f190212d;

    public c0(com.tencent.mm.pluginsdk.ui.chat.d0 d0Var, com.tencent.mm.pluginsdk.ui.chat.b0 b0Var) {
        this.f190212d = d0Var;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "attachment_plus";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f190212d.f190253a;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean y(boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.d0 d0Var = this.f190212d;
        android.widget.ImageView imageView = d0Var.f190254b;
        if (imageView == null) {
            return false;
        }
        imageView.setVisibility(z17 ? 0 : 8);
        if (!z17) {
            d0Var.f190256d = d0Var.f190256d.replace("#chat_attachment_item_voice_input", "").replace("chat_attachment_item_voice_input#", "").replace("chat_attachment_item_voice_input", "");
            return true;
        }
        if (d0Var.f190256d.contains("chat_attachment_item_voice_input")) {
            return true;
        }
        if (d0Var.f190256d.isEmpty()) {
            d0Var.f190256d = "chat_attachment_item_voice_input";
            return true;
        }
        d0Var.f190256d += ((java.lang.Object) "#chat_attachment_item_voice_input");
        return true;
    }
}
