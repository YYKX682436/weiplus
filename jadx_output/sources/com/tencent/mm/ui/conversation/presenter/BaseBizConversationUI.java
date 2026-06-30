package com.tencent.mm.ui.conversation.presenter;

/* loaded from: classes11.dex */
public abstract class BaseBizConversationUI extends com.tencent.mm.ui.conversation.BaseConversationUI {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.da f207976e = null;

    @Override // com.tencent.mm.ui.conversation.BaseConversationUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.da daVar = this.f207976e;
        if (daVar == null) {
            super.onActivityResult(i17, i18, intent);
        } else {
            daVar.mmOnActivityResult(i17, i18, intent);
            this.f207976e = null;
        }
    }
}
