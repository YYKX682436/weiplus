package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabMyPostFragment;", "Lcom/tencent/mm/plugin/mv/ui/view/MusicMvTabFragment;", "Lcom/tencent/mm/modelbase/u0;", "", "getFeedFrom", "getType", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvTabMyPostFragment extends com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment {

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f151730w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MusicMvTabMyPostFragment(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public void c(dm.i8 i8Var, java.lang.String str) {
        this.music = i8Var;
        this.keyword = str;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, 93);
        qt2Var.set(7, 93);
        com.tencent.mm.plugin.mv.ui.view.a4 a4Var = new com.tencent.mm.plugin.mv.ui.view.a4(this);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        cq.j1.n((cq.k) c17, e17, 0L, this.f151730w, 0, qt2Var, 0, 0L, false, null, 0L, null, null, null, false, false, null, false, null, null, null, null, new com.tencent.mm.plugin.mv.ui.view.x3(this, a4Var), new com.tencent.mm.plugin.mv.ui.view.z3(this, a4Var), 2097024, null);
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public int getFeedFrom() {
        return 4;
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.MusicMvTabFragment
    public int getType() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvTabMyPostFragment(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
