package wh5;

/* loaded from: classes12.dex */
public final class l0 implements kg3.o {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.media.view.ShrinkBox f446075d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.flexbox.FlexboxLayout.LayoutParams f446076e;

    public l0(com.tencent.mm.plugin.media.view.ShrinkBox view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f446075d = view;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.f446076e = layoutParams instanceof com.google.android.flexbox.FlexboxLayout.LayoutParams ? (com.google.android.flexbox.FlexboxLayout.LayoutParams) layoutParams : null;
    }

    @Override // kg3.o
    public void b(boolean z17) {
        com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams = this.f446076e;
        if (layoutParams == null) {
            return;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox shrinkBox = this.f446075d;
        if (!z17) {
            shrinkBox.setLayoutParams(layoutParams);
            return;
        }
        com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams2 = new com.google.android.flexbox.FlexboxLayout.LayoutParams(layoutParams);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
        shrinkBox.setLayoutParams(layoutParams2);
    }
}
