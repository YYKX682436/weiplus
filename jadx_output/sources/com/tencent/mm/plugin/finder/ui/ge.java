package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class ge implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129298d;

    public ge(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f129298d = finderSelectCoverUI;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129298d;
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = finderSelectCoverUI.f128678u;
        if (cropLayout == null) {
            kotlin.jvm.internal.o.o("cropLayout");
            throw null;
        }
        cropLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        java.lang.String string = finderSelectCoverUI.getContext().getResources().getString(com.tencent.mm.R.string.nke);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = finderSelectCoverUI.getContext().getResources().getString(com.tencent.mm.R.string.f491273ni3);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = finderSelectCoverUI.getContext().getResources().getString(com.tencent.mm.R.string.f491272ni2);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        db5.e1.D(finderSelectCoverUI.getContext(), string, "", string2, string3, true, new com.tencent.mm.plugin.finder.ui.Cif(finderSelectCoverUI), com.tencent.mm.plugin.finder.ui.jf.f129398d, com.tencent.mm.R.color.f478621cg);
    }
}
