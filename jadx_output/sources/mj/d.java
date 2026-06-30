package mj;

/* loaded from: classes14.dex */
public class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f326956d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f326957e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f326958f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f326959g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.trace.view.FloatFrameView f326960h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mj.i f326961i;

    public d(mj.i iVar, com.tencent.matrix.trace.view.FloatFrameView floatFrameView) {
        this.f326961i = iVar;
        this.f326960h = floatFrameView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.View.OnClickListener onClickListener;
        int action = motionEvent.getAction();
        mj.i iVar = this.f326961i;
        if (action == 0) {
            this.f326956d = motionEvent.getX();
            this.f326957e = motionEvent.getY();
            android.view.WindowManager.LayoutParams layoutParams = iVar.f326972b;
            this.f326958f = layoutParams.x;
            this.f326959g = layoutParams.y;
        } else if (action == 1) {
            int[] iArr = new int[2];
            int i17 = iVar.f326972b.x;
            iArr[0] = i17;
            int i18 = iVar.f326976f.widthPixels;
            iArr[1] = i17 > i18 / 2 ? i18 - this.f326960h.getWidth() : 0;
            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofInt("trans", iArr));
            ofPropertyValuesHolder.addUpdateListener(new mj.c(this, view));
            ofPropertyValuesHolder.setInterpolator(new android.view.animation.AccelerateInterpolator());
            ofPropertyValuesHolder.setDuration(180L).start();
            android.view.WindowManager.LayoutParams layoutParams2 = iVar.f326972b;
            int i19 = layoutParams2.x;
            int i27 = layoutParams2.y;
            if (java.lang.Math.abs(i19 - this.f326958f) <= 20 && java.lang.Math.abs(i27 - this.f326959g) <= 20 && (onClickListener = iVar.f326975e) != null) {
                onClickListener.onClick(view);
            }
        } else if (action == 2) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            android.view.WindowManager.LayoutParams layoutParams3 = iVar.f326972b;
            layoutParams3.x = (int) (layoutParams3.x + ((x17 - this.f326956d) / 3.0f));
            layoutParams3.y = (int) (layoutParams3.y + ((y17 - this.f326957e) / 3.0f));
            if (view != null) {
                iVar.f326971a.updateViewLayout(view, layoutParams3);
            }
        }
        return true;
    }
}
