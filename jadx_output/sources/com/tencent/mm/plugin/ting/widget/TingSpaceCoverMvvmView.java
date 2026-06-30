package com.tencent.mm.plugin.ting.widget;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/ting/widget/TingSpaceCoverMvvmView;", "Landroid/widget/FrameLayout;", "", "getDefaultImageResId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nm4/q", "ting-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TingSpaceCoverMvvmView extends android.widget.FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f174882g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f174883d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f174884e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f174885f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TingSpaceCoverMvvmView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(java.lang.String str, android.graphics.Bitmap bitmap) {
        try {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).cj(str, bitmap, new nm4.t(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingSpaceCoverMvvmView", "pickColorFromBitmap error: %s", e17.getMessage());
        }
    }

    public final int getDefaultImageResId() {
        return (getContext().getResources().getConfiguration().uiMode & 48) == 32 ? com.tencent.mm.R.drawable.f482246da : com.tencent.mm.R.drawable.f482245bk;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        float f17 = i19 - i17;
        float f18 = i27 - i18;
        java.util.List list = this.f174883d;
        int size = ((java.util.ArrayList) list).size();
        float f19 = 0.262f * f17;
        float f27 = 0.0238f * f17;
        float f28 = 0.0417f * f17;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ((android.widget.ImageView) it.next()).setOutlineProvider(new nm4.q(f28));
        }
        float f29 = 0.88f * f17;
        int i28 = (int) ((f17 - f29) / 2.0f);
        int i29 = (int) ((f18 - f29) / 2.0f);
        android.view.View view = this.f174884e;
        int i37 = (int) f29;
        view.layout(i28, i29, i28 + i37, i37 + i29);
        view.setOutlineProvider(new nm4.q(0.04f * f17));
        view.setClipToOutline(true);
        float f37 = 0.68f * f17;
        int i38 = (int) ((f17 - f37) / 2.0f);
        int i39 = (int) ((f18 - f37) / 2.0f);
        android.view.View view2 = this.f174885f;
        int i47 = (int) f37;
        view2.layout(i38, i39, i38 + i47, i47 + i39);
        view2.setOutlineProvider(new nm4.q(0.06f * f17));
        view2.setClipToOutline(true);
        int i48 = (int) f19;
        int i49 = (int) f27;
        if (size == 1) {
            int i57 = (int) ((f17 - f19) / 2.0f);
            int i58 = (int) ((f18 - f19) / 2.0f);
            ((android.widget.ImageView) ((java.util.ArrayList) list).get(0)).layout(i57, i58, i57 + i48, i48 + i58);
            return;
        }
        if (size == 2) {
            int i59 = i48 * 2;
            int i66 = (int) ((f17 - (i59 + i49)) / 2.0f);
            int i67 = (int) ((f18 - f19) / 2.0f);
            int i68 = i66 + i48;
            int i69 = i48 + i67;
            ((android.widget.ImageView) ((java.util.ArrayList) list).get(0)).layout(i66, i67, i68, i69);
            ((android.widget.ImageView) ((java.util.ArrayList) list).get(1)).layout(i68 + i49, i67, i66 + i59 + i49, i69);
            return;
        }
        if (size == 3) {
            int i76 = i48 * 2;
            float f38 = i76 + i49;
            int i77 = (int) ((f17 - f38) / 2.0f);
            int i78 = (int) ((f18 - f38) / 2.0f);
            int i79 = ((int) ((r13 - i48) / 2.0f)) + i77;
            int i86 = i78 + i48;
            ((android.widget.ImageView) ((java.util.ArrayList) list).get(0)).layout(i79, i78, i79 + i48, i86);
            int i87 = i86 + i49;
            int i88 = i77 + i48;
            int i89 = i48 + i87;
            ((android.widget.ImageView) ((java.util.ArrayList) list).get(1)).layout(i77, i87, i88, i89);
            ((android.widget.ImageView) ((java.util.ArrayList) list).get(2)).layout(i88 + i49, i87, i77 + i76 + i49, i89);
            return;
        }
        if (size != 4) {
            return;
        }
        int i96 = i48 * 2;
        float f39 = i96 + i49;
        int i97 = (int) ((f17 - f39) / 2.0f);
        int i98 = (int) ((f18 - f39) / 2.0f);
        int i99 = i97 + i48;
        int i100 = i48 + i98;
        ((android.widget.ImageView) ((java.util.ArrayList) list).get(0)).layout(i97, i98, i99, i100);
        int i101 = i99 + i49;
        int i102 = i97 + i96 + i49;
        ((android.widget.ImageView) ((java.util.ArrayList) list).get(1)).layout(i101, i98, i102, i100);
        int i103 = i100 + i49;
        int i104 = i98 + i96 + i49;
        ((android.widget.ImageView) ((java.util.ArrayList) list).get(2)).layout(i97, i103, i99, i104);
        ((android.widget.ImageView) ((java.util.ArrayList) list).get(3)).layout(i101, i103, i102, i104);
    }

    public /* synthetic */ TingSpaceCoverMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TingSpaceCoverMvvmView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f174883d = new java.util.ArrayList();
        setClipToPadding(false);
        setClipChildren(false);
        setBackgroundColor(0);
        android.view.View view = new android.view.View(context);
        view.setBackgroundColor(android.graphics.Color.argb(13, 255, 255, 255));
        this.f174884e = view;
        addView(view);
        android.view.View view2 = new android.view.View(context);
        view2.setBackgroundColor(android.graphics.Color.argb(13, 255, 255, 255));
        this.f174885f = view2;
        addView(view2);
    }
}
