package rc5;

/* loaded from: classes5.dex */
public final class g extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f394158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rc5.m f394159e;

    public g(kotlin.jvm.internal.h0 h0Var, rc5.m mVar) {
        this.f394158d = h0Var;
        this.f394159e = mVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f394159e.f394183v = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        int y17;
        android.view.View findViewByPosition;
        kotlin.jvm.internal.o.g(animation, "animation");
        rc5.x xVar = this.f394159e.f394170f;
        jz5.g gVar = rc5.x.D;
        java.lang.Object listView = ((com.tencent.mm.ui.chatting.ChattingUIFragment) xVar.W6().f198152f.f460719n).B.getListView();
        jz5.l lVar = null;
        androidx.recyclerview.widget.RecyclerView recyclerView = listView instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) listView : null;
        if (recyclerView != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition((y17 = linearLayoutManager.y()))) != null) {
                lVar = new jz5.l(java.lang.Integer.valueOf(y17), java.lang.Integer.valueOf(recyclerView.getHeight() - findViewByPosition.getBottom()));
            }
        }
        this.f394158d.f310123d = lVar;
    }
}
