package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f208277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f208278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView f208279f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f208280g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.BaseConversationUI f208281h;

    public z(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI, android.view.View view, int[] iArr, com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView, android.view.ViewGroup viewGroup) {
        this.f208281h = baseConversationUI;
        this.f208277d = view;
        this.f208278e = iArr;
        this.f208279f = fitSystemWindowLayoutView;
        this.f208280g = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f208277d;
        int[] iArr = this.f208278e;
        view.getLocationInWindow(iArr);
        int i17 = iArr[1];
        com.tencent.mm.ui.HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView = this.f208279f;
        if (i17 > 0) {
            this.f208281h.V6(fitSystemWindowLayoutView, i17, new android.graphics.Rect(0, i17, 0, 0), this.f208280g);
        } else if (fp.h.c(20)) {
            fitSystemWindowLayoutView.setOnApplyWindowInsetsListener(new com.tencent.mm.ui.conversation.y(this));
        }
    }
}
