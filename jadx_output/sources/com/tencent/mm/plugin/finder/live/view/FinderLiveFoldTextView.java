package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView;", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Z", "isFolding", "()Z", "setFolding", "(Z)V", "Lkotlin/Function0;", "Ljz5/f0;", androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "Lyz5/a;", "getUnFoldListener", "()Lyz5/a;", "setUnFoldListener", "(Lyz5/a;)V", "unFoldListener", "p0", "getFoldListener", "setFoldListener", "foldListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveFoldTextView extends com.tencent.mm.ui.widget.MMNeat7extView {

    /* renamed from: x1, reason: collision with root package name */
    public static final java.lang.String f115893x1 = " " + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egq);

    /* renamed from: y1, reason: collision with root package name */
    public static final java.lang.String f115894y1 = " " + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dfc);

    /* renamed from: V, reason: from kotlin metadata */
    public boolean isFolding;

    /* renamed from: W, reason: from kotlin metadata */
    public yz5.a unFoldListener;

    /* renamed from: l1, reason: collision with root package name */
    public int f115895l1;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public yz5.a foldListener;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f115897p1;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.f0 f115898x0;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.f0 f115899y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFoldTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.isFolding = true;
        this.f115898x0 = new com.tencent.mm.pluginsdk.ui.span.f0();
        this.f115899y0 = new com.tencent.mm.pluginsdk.ui.span.f0();
        this.f115895l1 = 5;
    }

    public final yz5.a getFoldListener() {
        return this.foldListener;
    }

    public final yz5.a getUnFoldListener() {
        return this.unFoldListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0120, code lost:
    
        if (r2 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.CharSequence r17, int r18, int r19, boolean r20, yz5.l r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView.o(java.lang.CharSequence, int, int, boolean, yz5.l, boolean, boolean):void");
    }

    @Override // com.tencent.mm.ui.widget.MMNeat7extView, com.tencent.neattextview.textview.view.NeatTextView, android.view.View
    public void onMeasure(int i17, int i18) {
        java.util.List m17;
        super.onMeasure(i17, i18);
        ks5.a layout = getLayout();
        boolean z17 = false;
        if (layout != null && (m17 = layout.m()) != null && (!m17.isEmpty())) {
            z17 = true;
        }
        if (z17) {
            postInvalidate();
        }
    }

    public final void setFoldListener(yz5.a aVar) {
        this.foldListener = aVar;
    }

    public final void setFolding(boolean z17) {
        this.isFolding = z17;
    }

    public final void setUnFoldListener(yz5.a aVar) {
        this.unFoldListener = aVar;
    }
}
