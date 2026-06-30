package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class y implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.z f208249d;

    public y(com.tencent.mm.ui.conversation.z zVar) {
        this.f208249d = zVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        if (windowInsets == null) {
            return windowInsets;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseConversationUI", "OnApplyWindowInsetsListener %s", windowInsets);
        windowInsets.consumeSystemWindowInsets();
        com.tencent.mm.ui.conversation.z zVar = this.f208249d;
        zVar.f208281h.V6(zVar.f208279f, windowInsets.getSystemWindowInsetTop(), new android.graphics.Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom()), zVar.f208280g);
        return windowInsets;
    }
}
