package wo1;

/* loaded from: classes3.dex */
public final class j1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public int f447962d;

    /* renamed from: e, reason: collision with root package name */
    public int f447963e;

    /* renamed from: f, reason: collision with root package name */
    public float f447964f;

    /* renamed from: g, reason: collision with root package name */
    public float f447965g;

    /* renamed from: h, reason: collision with root package name */
    public int f447966h;

    /* renamed from: i, reason: collision with root package name */
    public int f447967i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f447968m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager f447969n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f447970o;

    public j1(android.view.WindowManager.LayoutParams layoutParams, android.view.WindowManager windowManager, android.view.View view) {
        this.f447968m = layoutParams;
        this.f447969n = windowManager;
        this.f447970o = view;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View v17, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(event, "event");
        int action = event.getAction();
        android.view.WindowManager.LayoutParams layoutParams = this.f447968m;
        if (action == 0) {
            this.f447962d = layoutParams.x;
            this.f447963e = layoutParams.y;
            this.f447964f = event.getRawX();
            this.f447965g = event.getRawY();
            int[] t17 = pm0.v.t(v17);
            this.f447966h = t17[0];
            this.f447967i = t17[1];
            yj0.a.i(true, this, "com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (action != 2) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int rawX = (int) (event.getRawX() - this.f447964f);
        int rawY = (int) (event.getRawY() - this.f447965g);
        int i17 = this.f447962d;
        int i18 = i17 - rawX;
        if (i18 <= 0) {
            i18 = 0;
        }
        layoutParams.x = i18;
        int i19 = this.f447966h;
        if (i19 < (-rawX)) {
            layoutParams.x = i17 + i19;
        }
        int i27 = this.f447963e;
        int i28 = i27 - rawY;
        layoutParams.y = i28 > 0 ? i28 : 0;
        int i29 = this.f447967i;
        if (i29 < (-rawY)) {
            layoutParams.y = i27 + i29;
        }
        this.f447969n.updateViewLayout(this.f447970o, layoutParams);
        yj0.a.i(true, this, "com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
