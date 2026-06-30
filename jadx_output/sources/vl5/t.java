package vl5;

/* loaded from: classes15.dex */
public abstract class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f437958d;

    /* renamed from: e, reason: collision with root package name */
    public final float f437959e;

    /* renamed from: f, reason: collision with root package name */
    public final float f437960f;

    /* renamed from: g, reason: collision with root package name */
    public final float f437961g;

    /* renamed from: h, reason: collision with root package name */
    public final float f437962h;

    /* renamed from: i, reason: collision with root package name */
    public final float f437963i;

    /* renamed from: m, reason: collision with root package name */
    public final float f437964m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f437965n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.sortlist.DragSortListView f437966o;

    public t(com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView, float f17, int i17, vl5.e eVar) {
        this.f437966o = dragSortListView;
        this.f437960f = f17;
        this.f437959e = i17;
        float f18 = 1.0f - f17;
        float f19 = 1.0f / ((f17 * 2.0f) * f18);
        this.f437964m = f19;
        this.f437961g = f19;
        this.f437962h = f17 / ((f17 - 1.0f) * 2.0f);
        this.f437963i = 1.0f / f18;
    }

    public abstract void a();

    public abstract void b(float f17, float f18);

    @Override // java.lang.Runnable
    public void run() {
        float f17;
        if (this.f437965n) {
            return;
        }
        float uptimeMillis = ((float) (android.os.SystemClock.uptimeMillis() - this.f437958d)) / this.f437959e;
        if (uptimeMillis >= 1.0f) {
            b(1.0f, 1.0f);
            a();
            return;
        }
        float f18 = this.f437960f;
        if (uptimeMillis < f18) {
            f17 = this.f437961g * uptimeMillis * uptimeMillis;
        } else if (uptimeMillis < 1.0f - f18) {
            f17 = (this.f437963i * uptimeMillis) + this.f437962h;
        } else {
            float f19 = uptimeMillis - 1.0f;
            f17 = 1.0f - ((this.f437964m * f19) * f19);
        }
        b(uptimeMillis, f17);
        this.f437966o.post(this);
    }
}
