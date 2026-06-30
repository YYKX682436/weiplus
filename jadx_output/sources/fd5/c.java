package fd5;

/* loaded from: classes9.dex */
public final class c implements fd5.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager f261340a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f261341b;

    /* renamed from: c, reason: collision with root package name */
    public int f261342c;

    /* renamed from: d, reason: collision with root package name */
    public int f261343d;

    public c(com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager lm6) {
        kotlin.jvm.internal.o.g(lm6, "lm");
        this.f261340a = lm6;
        this.f261342c = -1;
    }

    @Override // fd5.a
    public void a(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (!this.f261341b || h3Var == null || h3Var.f12065g) {
            return;
        }
        int i17 = this.f261342c;
        if (i17 != -1) {
            com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager chattingLinearLayoutManager = this.f261340a;
            int i18 = this.f261343d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(chattingLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/ui/chatting/layoutmanager/MediaGroupLMComponent", "beforeOnLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            chattingLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(chattingLinearLayoutManager, "com/tencent/mm/ui/chatting/layoutmanager/MediaGroupLMComponent", "beforeOnLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        this.f261341b = false;
        this.f261342c = -1;
        this.f261343d = 0;
    }

    public final boolean c() {
        com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager chattingLinearLayoutManager = this.f261340a;
        int t17 = chattingLinearLayoutManager.t();
        if (t17 == -1) {
            this.f261341b = false;
            return false;
        }
        android.view.View findViewByPosition = chattingLinearLayoutManager.findViewByPosition(t17);
        if (findViewByPosition == null) {
            this.f261341b = false;
            return false;
        }
        this.f261342c = t17;
        this.f261343d = findViewByPosition.getTop();
        this.f261341b = true;
        return true;
    }
}
