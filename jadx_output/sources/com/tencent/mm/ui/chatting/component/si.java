package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class si extends com.tencent.mm.ui.chatting.component.a implements yn.e {
    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        android.content.Intent intent = this.f198580d.g().getIntent();
        if (intent.getIntExtra("SendAppMessageWrapper_Scene", 0) != 3) {
            return;
        }
        intent.setClass(this.f198580d.g(), com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.class);
        intent.putExtra("Select_Conv_User", this.f198580d.x());
        yb5.d dVar = this.f198580d;
        dVar.f460709d.a(intent, 228, new com.tencent.mm.ui.chatting.component.ri(this, intent));
    }
}
