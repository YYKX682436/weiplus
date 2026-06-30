package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class ri implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135798d;

    public ri(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135798d = blVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View findViewById = this.f135798d.findViewById(com.tencent.mm.R.id.nuq);
        if (findViewById != null) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = 0;
            findViewById.setLayoutParams(layoutParams2);
        }
    }
}
