package com.tencent.mm.plugin.profile.ui.tab.view;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\u000bB'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0003\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfilePicTabRecyclerView;", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/MRecyclerView;", "Landroid/view/View;", "view", "Ljz5/f0;", "setLoadingView", "", dm.i4.COL_ID, "Las3/n;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnLoadingStateChangedListener", "Las3/o;", "setOnScrollToTopListener", "g2", "Las3/o;", "getMOnScrollToTopListener", "()Las3/o;", "setMOnScrollToTopListener", "(Las3/o;)V", "mOnScrollToTopListener", "Landroidx/recyclerview/widget/LinearLayoutManager;", "h2", "Ljz5/g;", "getLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "", "i2", "Z", "getHasTopic", "()Z", "setHasTopic", "(Z)V", "hasTopic", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BizProfilePicTabRecyclerView extends com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView {

    /* renamed from: f2, reason: collision with root package name */
    public android.view.View f154644f2;

    /* renamed from: g2, reason: collision with root package name and from kotlin metadata */
    public as3.o mOnScrollToTopListener;

    /* renamed from: h2, reason: collision with root package name and from kotlin metadata */
    public final jz5.g layoutManager;

    /* renamed from: i2, reason: collision with root package name and from kotlin metadata */
    public boolean hasTopic;

    /* renamed from: j2, reason: collision with root package name */
    public final android.graphics.Paint f154648j2;

    /* renamed from: k2, reason: collision with root package name */
    public final int f154649k2;

    /* renamed from: l2, reason: collision with root package name */
    public final int f154650l2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BizProfilePicTabRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.recyclerview.widget.LinearLayoutManager getLayoutManager() {
        return (androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) this.layoutManager).getValue();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void a1(int i17) {
        super.a1(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView
    public void addFooterView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        int x17 = this.f92098b2.x() - 1;
        if (this.f154644f2 == null || x17 < 0) {
            super.addFooterView(view);
            return;
        }
        vl1.g gVar = this.f92098b2;
        ((java.util.LinkedList) gVar.f437798h).add(x17, view);
        gVar.notifyItemRangeChanged(gVar.getItemCount() - 1, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void c1(int i17) {
        as3.o oVar;
        super.c1(i17);
        if (i17 != 0 || (oVar = this.mOnScrollToTopListener) == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabPicFragment bizProfileTabPicFragment = ((wr3.n1) oVar).f448850a;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = bizProfileTabPicFragment.f154415h;
        if (m0Var != null) {
            m0Var.l(true);
        }
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfilePicTabRecyclerView J0 = bizProfileTabPicFragment.J0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(J0, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabPicFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
        J0.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(J0, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabPicFragment$onCreateView$1", "onScrollToTop", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    public final boolean getHasTopic() {
        return this.hasTopic;
    }

    public final as3.o getMOnScrollToTopListener() {
        return this.mOnScrollToTopListener;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView
    public boolean k1() {
        return this.f154644f2 != null ? this.f92098b2.getItemCount() == 1 && this.f92098b2.x() == 1 : super.k1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        int i17 = this.hasTopic ? this.f154649k2 : 0;
        int color = getContext().getColor(com.tencent.mm.R.color.f478491c);
        int color2 = getContext().getColor(com.tencent.mm.R.color.f478489a);
        boolean z17 = this.hasTopic;
        android.graphics.Paint paint = this.f154648j2;
        if (z17 && i17 > 0) {
            paint.setShader(null);
            paint.setColor(color);
            canvas.drawRect(0.0f, 0.0f, getWidth(), i17, paint);
        }
        float f17 = i17;
        int i18 = this.f154650l2;
        paint.setShader(new android.graphics.LinearGradient(0.0f, f17, 0.0f, i17 + i18, color, color2, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, f17, getWidth(), i17 + i18, paint);
    }

    public final void setHasTopic(boolean z17) {
        this.hasTopic = z17;
    }

    public final void setLoadingView(android.view.View view) {
        android.view.View view2 = this.f154644f2;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            if (!(!kotlin.jvm.internal.o.b(view2, view))) {
                view2 = null;
            }
            if (view2 != null) {
                i1(view2);
            }
        }
        this.f154644f2 = view;
        if (view != null) {
            addFooterView(view);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/view/BizProfilePicTabRecyclerView", "setLoadingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfilePicTabRecyclerView", "setLoadingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void setMOnScrollToTopListener(as3.o oVar) {
        this.mOnScrollToTopListener = oVar;
    }

    public final void setOnLoadingStateChangedListener(as3.n nVar) {
    }

    public final void setOnScrollToTopListener(as3.o listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.mOnScrollToTopListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizProfilePicTabRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.layoutManager = jz5.h.b(new as3.p(this));
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f154648j2 = paint;
        this.f154649k2 = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479718db);
        this.f154650l2 = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df);
        super.setLayoutManager(getLayoutManager());
        i(new as3.q(this));
        this.f92098b2.registerAdapterDataObserver(new as3.r(this));
    }

    public final void setLoadingView(int i17) {
        setLoadingView(android.view.LayoutInflater.from(getContext()).inflate(i17, (android.view.ViewGroup) this, false));
    }
}
