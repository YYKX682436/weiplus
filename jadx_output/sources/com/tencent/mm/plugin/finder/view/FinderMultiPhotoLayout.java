package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderMultiPhotoLayout;", "Landroid/view/ViewGroup;", "", "getMultiThumbDisplaySize", "", "Landroid/view/View;", "getChildList", "", "h", "Z", "getAddMode", "()Z", "setAddMode", "(Z)V", "addMode", "i", "I", "getThumbDisplaySize", "()I", "setThumbDisplaySize", "(I)V", "thumbDisplaySize", "o", "getMULTI_THUMB_MAX_SIZE", "setMULTI_THUMB_MAX_SIZE", "MULTI_THUMB_MAX_SIZE", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderMultiPhotoLayout extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f131320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f131321e;

    /* renamed from: f, reason: collision with root package name */
    public final int f131322f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f131323g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean addMode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int thumbDisplaySize;

    /* renamed from: m, reason: collision with root package name */
    public final int f131326m;

    /* renamed from: n, reason: collision with root package name */
    public final int f131327n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int MULTI_THUMB_MAX_SIZE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMultiPhotoLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131321e = i65.a.b(getContext(), 3);
        this.f131322f = getMultiThumbDisplaySize();
        this.f131323g = new java.util.ArrayList();
        this.f131326m = 150;
        this.f131327n = 37;
        this.MULTI_THUMB_MAX_SIZE = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 130.0f);
        this.f131322f = getMultiThumbDisplaySize();
    }

    private final int getMultiThumbDisplaySize() {
        int i17;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z17 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        int b17 = ((i18 - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f131327n)) / 3) - this.f131321e;
        this.thumbDisplaySize = b17;
        int i19 = this.MULTI_THUMB_MAX_SIZE;
        if (b17 > i19) {
            b17 = i19;
        } else if (b17 <= 10) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImproveMultiPhotoLayout", "can not get multiThumbDisplaySize or the multiThumbDisplaySize < 10");
            b17 = this.f131326m;
        }
        this.thumbDisplaySize = b17;
        return b17;
    }

    public final void a(int i17, int i18, int i19) {
        int i27 = this.f131321e;
        int i28 = this.f131322f;
        int i29 = i27 + i28;
        int i37 = i19 + i18;
        int i38 = 0;
        while (i18 < i37) {
            int i39 = i38 + 1;
            int i47 = i38 * i29;
            int i48 = i29 * i17;
            getChildAt(i18).layout(i47, i48, i47 + i28, i48 + i28);
            i18++;
            i38 = i39;
        }
    }

    public final void b(int i17) {
        java.util.ArrayList arrayList;
        this.f131320d = i17;
        while (true) {
            int i18 = this.f131320d;
            int childCount = getChildCount();
            arrayList = this.f131323g;
            if (i18 <= childCount) {
                break;
            }
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            frameLayout.setBackgroundColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.BW_97));
            com.tencent.mm.ui.MMImageView mMImageView = new com.tencent.mm.ui.MMImageView(getContext());
            mMImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            frameLayout.addView(mMImageView);
            arrayList.add(mMImageView);
            int i19 = this.f131322f;
            addView(frameLayout, i19, i19);
        }
        while (this.f131320d < getChildCount()) {
            int childCount2 = getChildCount() - 1;
            removeViewAt(childCount2);
            arrayList.remove(childCount2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMultiPhotoLayout", "updateMediaList media size:" + i17 + " child count:" + getChildCount());
    }

    public final boolean getAddMode() {
        return this.addMode;
    }

    public final java.util.List<android.view.View> getChildList() {
        return this.f131323g;
    }

    public final int getMULTI_THUMB_MAX_SIZE() {
        return this.MULTI_THUMB_MAX_SIZE;
    }

    public final int getThumbDisplaySize() {
        return this.thumbDisplaySize;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (this.addMode) {
            int childCount = getChildCount();
            if (childCount >= 0 && childCount < 4) {
                a(0, 0, getChildCount());
                return;
            }
            if (4 <= childCount && childCount < 7) {
                a(0, 0, 3);
                a(1, 3, getChildCount() - 3);
                return;
            } else {
                a(0, 0, 3);
                a(1, 3, 3);
                a(2, 6, getChildCount() - 6);
                return;
            }
        }
        int childCount2 = getChildCount();
        if (childCount2 >= 0 && childCount2 < 4) {
            a(0, 0, getChildCount());
            return;
        }
        if (childCount2 == 4) {
            a(0, 0, 2);
            a(1, 2, 2);
            return;
        }
        if (5 <= childCount2 && childCount2 < 7) {
            a(0, 0, 3);
            a(1, 3, getChildCount() - 3);
            return;
        }
        if (7 <= childCount2 && childCount2 < 10) {
            a(0, 0, 3);
            a(1, 3, 3);
            a(2, 6, getChildCount() - 6);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = getChildAt(i19);
            measureChild(childAt, 1073741824, 1073741824);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMultiPhotoLayout", "measure child size:" + childAt.getMeasuredWidth() + ' ' + childAt.getMeasuredHeight());
        }
        int childCount2 = (getChildCount() / 3) + (getChildCount() % 3 > 0 ? 1 : 0);
        int i27 = this.f131322f;
        int i28 = this.f131321e;
        int i29 = childCount2 * (i27 + i28);
        if (i29 > 0) {
            i29 -= i28;
        }
        setMeasuredDimension(i17, i29);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveMultiPhotoLayout", "measure parent size:" + getMeasuredWidth() + ' ' + getMeasuredHeight());
    }

    public final void setAddMode(boolean z17) {
        this.addMode = z17;
    }

    public final void setMULTI_THUMB_MAX_SIZE(int i17) {
        this.MULTI_THUMB_MAX_SIZE = i17;
    }

    public final void setThumbDisplaySize(int i17) {
        this.thumbDisplaySize = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMultiPhotoLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131321e = i65.a.b(getContext(), 3);
        this.f131322f = getMultiThumbDisplaySize();
        this.f131323g = new java.util.ArrayList();
        this.f131326m = 150;
        this.f131327n = 37;
        this.MULTI_THUMB_MAX_SIZE = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 130.0f);
        this.f131322f = getMultiThumbDisplaySize();
    }
}
