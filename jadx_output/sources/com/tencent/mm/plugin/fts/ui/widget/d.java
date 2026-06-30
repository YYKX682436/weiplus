package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class d implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.v f138259d;

    public d(com.tencent.mm.plugin.fts.ui.widget.v vVar) {
        this.f138259d = vVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f138259d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(vVar.f209962e.getLineCount());
        if (!(vVar.f138334z && valueOf.intValue() != vVar.B)) {
            valueOf = null;
        }
        if (valueOf != null) {
            vVar.B = valueOf.intValue();
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) vVar.findViewById(com.tencent.mm.R.id.v1h);
            if (constraintLayout != null) {
                android.transition.AutoTransition autoTransition = new android.transition.AutoTransition();
                autoTransition.setDuration(200L);
                autoTransition.setOrdering(0);
                android.transition.TransitionManager.beginDelayedTransition(constraintLayout, autoTransition);
                constraintLayout.getLayoutParams().height = vVar.r();
                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                cVar.d(constraintLayout);
                cVar.b(constraintLayout);
                constraintLayout.setConstraintSet(null);
            }
        }
    }
}
