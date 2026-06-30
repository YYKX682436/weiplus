package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvWxRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lcom/tencent/mm/plugin/mv/ui/view/f4;", "j2", "Lcom/tencent/mm/plugin/mv/ui/view/f4;", "getChangeListener", "()Lcom/tencent/mm/plugin/mv/ui/view/f4;", "setChangeListener", "(Lcom/tencent/mm/plugin/mv/ui/view/f4;)V", "changeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class MusicMvWxRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.mv.ui.view.f4 changeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvWxRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final com.tencent.mm.plugin.mv.ui.view.f4 getChangeListener() {
        return this.changeListener;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        com.tencent.mm.plugin.mv.ui.view.f4 f4Var = this.changeListener;
        if (f4Var != null) {
            com.tencent.mm.plugin.mv.ui.uic.s1 s1Var = ((com.tencent.mm.plugin.mv.ui.uic.l1) f4Var).f151266a;
            com.tencent.mars.xlog.Log.i(s1Var.f151413d, "onViewAdded");
            com.tencent.mm.plugin.mv.ui.uic.s1.O6(s1Var, view);
        }
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        com.tencent.mm.plugin.mv.ui.view.f4 f4Var = this.changeListener;
        if (f4Var != null) {
            com.tencent.mm.plugin.mv.ui.uic.s1 s1Var = ((com.tencent.mm.plugin.mv.ui.uic.l1) f4Var).f151266a;
            com.tencent.mars.xlog.Log.i(s1Var.f151413d, "onViewRemoved");
            com.tencent.mm.plugin.mv.ui.uic.s1.P6(s1Var, view);
        }
    }

    public final void setChangeListener(com.tencent.mm.plugin.mv.ui.view.f4 f4Var) {
        this.changeListener = f4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvWxRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
