package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f207738d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.ConversationListView f207740f;

    public i3(com.tencent.mm.ui.conversation.ConversationListView conversationListView, int i17) {
        this.f207740f = conversationListView;
        this.f207739e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207740f;
        android.view.View view = conversationListView.C;
        if (view == null) {
            return;
        }
        if (view.getTop() != 0) {
            conversationListView.E = conversationListView.C.getTop();
        }
        int i17 = conversationListView.E;
        int i18 = this.f207739e;
        if (i17 <= 0) {
            int i19 = this.f207738d;
            if (i19 <= 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "initActionBarView try again tryCount: %d", java.lang.Integer.valueOf(i19));
                conversationListView.post(this);
            } else {
                int[] iArr = new int[2];
                conversationListView.C.getLocationOnScreen(iArr);
                int i27 = iArr[1];
                int[] iArr2 = new int[2];
                conversationListView.getLocationOnScreen(iArr2);
                int i28 = iArr2[1];
                android.view.ViewGroup.LayoutParams layoutParams = conversationListView.getLayoutParams();
                int i29 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? ((android.widget.RelativeLayout.LayoutParams) layoutParams).topMargin : 0;
                java.lang.String str = android.os.Build.MANUFACTURER;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                java.lang.String lowerCase = str.toLowerCase();
                boolean z18 = lowerCase.contains("vivo") && android.os.Build.VERSION.SDK_INT == 28;
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "initActionBarView actionBarTopOnScreen: %d, listTopOnScreen: %d, listTopMargin: %d, manufacturer: %s, isVivoAbove28: %b", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), lowerCase, java.lang.Boolean.valueOf(z18));
                if (i28 - i29 == i27 && z18) {
                    conversationListView.E = 0;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ConversationListView", "initActionBarView set top to 0");
                    conversationListView.x(0, i18);
                    conversationListView.v(0, true);
                } else {
                    int h17 = com.tencent.mm.ui.bl.h(conversationListView.getContext());
                    conversationListView.E = h17;
                    com.tencent.mars.xlog.Log.e("MicroMsg.ConversationListView", "initActionBarView get default status bar height: %d", java.lang.Integer.valueOf(h17));
                    conversationListView.x(conversationListView.E, i18);
                    conversationListView.v(conversationListView.E, false);
                }
            }
        } else {
            conversationListView.x(i17, i18);
            conversationListView.v(conversationListView.E, false);
        }
        this.f207738d++;
    }
}
