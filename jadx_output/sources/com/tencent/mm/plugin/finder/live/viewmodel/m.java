package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.n f117231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout.LayoutParams f117232e;

    public m(com.tencent.mm.plugin.finder.live.viewmodel.n nVar, android.widget.LinearLayout.LayoutParams layoutParams) {
        this.f117231d = nVar;
        this.f117232e = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[2];
        com.tencent.mm.plugin.finder.live.viewmodel.n nVar = this.f117231d;
        android.view.View view = nVar.f117261f;
        if (view == null) {
            kotlin.jvm.internal.o.o("optionRoot");
            throw null;
        }
        view.getLocationInWindow(iArr);
        int i17 = iArr[1];
        android.view.View view2 = nVar.f117261f;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("optionRoot");
            throw null;
        }
        int c17 = (com.tencent.mm.ui.bl.b(nVar.getActivity()).y - com.tencent.mm.ui.bl.c(nVar.getActivity())) - (i17 + view2.getHeight());
        android.widget.LinearLayout linearLayout = nVar.f117260e;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("btnContainer");
            throw null;
        }
        int height = c17 - linearLayout.getHeight();
        if (height >= 0) {
            android.widget.LinearLayout.LayoutParams layoutParams = this.f117232e;
            layoutParams.topMargin = height;
            android.widget.LinearLayout linearLayout2 = nVar.f117260e;
            if (linearLayout2 != null) {
                linearLayout2.setLayoutParams(layoutParams);
            } else {
                kotlin.jvm.internal.o.o("btnContainer");
                throw null;
            }
        }
    }
}
