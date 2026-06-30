package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class e implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.v f138262d;

    public e(com.tencent.mm.plugin.fts.ui.widget.v vVar) {
        this.f138262d = vVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout;
        int i39 = i27 - i18;
        if (i39 != i38 - i29) {
            com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f138262d;
            if (vVar.f138334z || (constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) vVar.findViewById(com.tencent.mm.R.id.v1h)) == null) {
                return;
            }
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.d(constraintLayout);
            cVar.f(vVar.f209962e.getId(), 3, 0, 3, (constraintLayout.getHeight() - i39) / 2);
            cVar.b(constraintLayout);
            constraintLayout.setConstraintSet(null);
        }
    }
}
