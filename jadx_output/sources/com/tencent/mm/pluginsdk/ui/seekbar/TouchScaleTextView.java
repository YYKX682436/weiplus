package com.tencent.mm.pluginsdk.ui.seekbar;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/seekbar/TouchScaleTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-playvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TouchScaleTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public float f191161g;

    public TouchScaleTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            float textSize = getTextSize();
            this.f191161g = textSize;
            setTextSize(0, textSize * 0.9f);
            setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.adi));
        } else {
            if (motionEvent != null && motionEvent.getAction() == 1) {
                setTextSize(0, this.f191161g);
                setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.adh));
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public TouchScaleTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
