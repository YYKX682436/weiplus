package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class k5 implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f207807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yf5.n f207808c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f207810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.o5 f207811f;

    public k5(int i17, android.view.ViewGroup.LayoutParams layoutParams, yf5.n nVar, int i18, float f17, com.tencent.mm.ui.conversation.o5 o5Var) {
        this.f207806a = i17;
        this.f207807b = layoutParams;
        this.f207808c = nVar;
        this.f207809d = i18;
        this.f207810e = f17;
        this.f207811f = o5Var;
    }

    @Override // oa5.a
    public final void a(float f17) {
        com.tencent.mm.plugin.taskbar.ui.r rVar;
        int i17 = this.f207806a;
        android.view.ViewGroup.LayoutParams layoutParams = this.f207807b;
        layoutParams.height = (int) (i17 + ((0 - i17) * f17));
        yf5.n nVar = this.f207808c;
        android.view.View view = nVar.f461931r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f - f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$2", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/FolderHelper$performItemCollapse$2", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        nVar.f461930q.setLayoutParams(layoutParams);
        nVar.f461929p = layoutParams.height;
        nVar.f461930q.requestLayout();
        int i18 = this.f207809d;
        float f18 = i18 + (f17 * (this.f207810e - i18));
        com.tencent.mm.ui.conversation.ConversationListView conversationListView = this.f207811f.f207926f;
        if (conversationListView != null) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) conversationListView.T.getLayoutParams();
            boolean z17 = f18 < 0.0f;
            int i19 = layoutParams2.height;
            android.view.View findViewById = conversationListView.getRootView().findViewById(com.tencent.mm.R.id.huj);
            if (findViewById != null) {
                findViewById.getHeight();
            }
            int dimension = (int) conversationListView.getResources().getDimension(com.tencent.mm.R.dimen.f479896i9);
            int height = findViewById != null ? findViewById.getHeight() : 0;
            if (height <= 0) {
                height = conversationListView.f207329w;
            }
            if (z17) {
                layoutParams2.height = height;
            } else {
                float f19 = height;
                if (f18 < f19) {
                    f18 = f19;
                }
                layoutParams2.height = (int) f18;
            }
            if (i19 != layoutParams2.height) {
                conversationListView.r();
                if ((!z17 || java.lang.Math.abs(f18) <= height + dimension) && !conversationListView.r() && (rVar = conversationListView.f207318m) != null) {
                    ((com.tencent.mm.plugin.taskbar.ui.z) rVar).d(true);
                }
                conversationListView.T.requestLayout();
            }
        }
    }
}
