package th;

/* loaded from: classes14.dex */
public class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f419236d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f419237e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f419238f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f419239g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f419240h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager f419241i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f419242m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ th.o f419243n;

    public d(th.o oVar, android.view.WindowManager.LayoutParams layoutParams, android.view.WindowManager windowManager, int i17) {
        this.f419243n = oVar;
        this.f419240h = layoutParams;
        this.f419241i = windowManager;
        this.f419242m = i17;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        android.view.WindowManager.LayoutParams layoutParams = this.f419240h;
        if (action == 0) {
            this.f419236d = motionEvent.getX();
            this.f419237e = motionEvent.getY();
            this.f419238f = layoutParams.x;
            this.f419239g = layoutParams.y;
            return false;
        }
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            layoutParams.x = (int) (layoutParams.x + ((x17 - this.f419236d) / 3.0f));
            layoutParams.y = (int) (layoutParams.y + ((y17 - this.f419237e) / 3.0f));
            if (view == null) {
                return false;
            }
            this.f419241i.updateViewLayout(view, layoutParams);
            return false;
        }
        int[] iArr = new int[2];
        int i17 = layoutParams.x;
        iArr[0] = i17;
        th.o oVar = this.f419243n;
        iArr[1] = i17 > (oVar.f419263a.widthPixels - oVar.f419267e.getWidth()) / 2 ? oVar.f419263a.widthPixels - oVar.f419267e.getWidth() : 0;
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofInt("trans", iArr));
        ofPropertyValuesHolder.addUpdateListener(new th.c(this, view));
        ofPropertyValuesHolder.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofPropertyValuesHolder.setDuration(180L).start();
        return java.lang.Math.abs(layoutParams.x - this.f419238f) > 20 || java.lang.Math.abs(layoutParams.y - this.f419239g) > 20;
    }
}
