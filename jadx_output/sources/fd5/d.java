package fd5;

/* loaded from: classes15.dex */
public final class d implements fd5.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager f261344a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f261345b;

    public d(com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager lm6) {
        kotlin.jvm.internal.o.g(lm6, "lm");
        this.f261344a = lm6;
    }

    @Override // fd5.a
    public void a(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int b17;
        if (!this.f261345b || h3Var == null || h3Var.f12065g || (b17 = h3Var.b()) <= 0) {
            return;
        }
        com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager chattingLinearLayoutManager = this.f261344a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(b17 - 1));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(chattingLinearLayoutManager, arrayList.toArray(), "com/tencent/mm/ui/chatting/layoutmanager/WeClawMDScrollLMComponent", "beforeOnLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        chattingLinearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(chattingLinearLayoutManager, "com/tencent/mm/ui/chatting/layoutmanager/WeClawMDScrollLMComponent", "beforeOnLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    @Override // fd5.a
    public void b(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        int b17;
        com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager chattingLinearLayoutManager;
        android.view.View findViewByPosition;
        if (!this.f261345b || h3Var == null || h3Var.f12065g || (b17 = h3Var.b()) <= 0 || (findViewByPosition = (chattingLinearLayoutManager = this.f261344a).findViewByPosition(b17 - 1)) == null) {
            return;
        }
        int height = (chattingLinearLayoutManager.getHeight() - chattingLinearLayoutManager.getPaddingBottom()) - chattingLinearLayoutManager.getDecoratedBottom(findViewByPosition);
        if (height >= 0) {
            return;
        }
        chattingLinearLayoutManager.offsetChildrenVertical(height);
    }

    public final void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawMDScrollLMComponent", "setLayoutToLast: " + z17);
        this.f261345b = z17;
    }
}
