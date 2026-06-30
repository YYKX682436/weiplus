package com.tencent.mm.ui.widget.cropview;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0013R*\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/ui/widget/cropview/VideoTimeView;", "Landroid/widget/TextView;", "Lml5/e0;", "", "value", "d", "I", "getDuration", "()I", "setDuration", "(I)V", "duration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class VideoTimeView extends android.widget.TextView implements ml5.e0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int duration;

    public VideoTimeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        setTextSize(0, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
        setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        setBackgroundResource(com.tencent.mm.R.drawable.f481362rg);
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        int dimension2 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        setPadding(dimension, dimension2, dimension, dimension2);
    }

    public final java.lang.String a(int i17) {
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void setDuration(int i17) {
        this.duration = i17;
        setText(a(i17 / 60) + ':' + a(i17 % 60));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setDuration] value=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeView", sb6.toString());
    }

    public VideoTimeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        setTextSize(0, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
        setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        setBackgroundResource(com.tencent.mm.R.drawable.f481362rg);
        int dimension = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        int dimension2 = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        setPadding(dimension, dimension2, dimension, dimension2);
    }
}
