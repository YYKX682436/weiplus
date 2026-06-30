package r51;

/* loaded from: classes15.dex */
public final class e extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public int f392625d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f392626e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f392627f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.picker.base.view.WheelView f392628g;

    public e(com.tencent.mm.picker.base.view.WheelView wheelView, int i17) {
        this.f392628g = wheelView;
        this.f392627f = i17;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f392625d == Integer.MAX_VALUE) {
            this.f392625d = this.f392627f;
        }
        int i17 = this.f392625d;
        int i18 = (int) (i17 * 0.1f);
        this.f392626e = i18;
        if (i18 == 0) {
            if (i17 < 0) {
                this.f392626e = -1;
            } else {
                this.f392626e = 1;
            }
        }
        int abs = java.lang.Math.abs(i17);
        com.tencent.mm.picker.base.view.WheelView wheelView = this.f392628g;
        if (abs <= 1) {
            wheelView.a();
            wheelView.getHandler().sendEmptyMessage(3000);
            return;
        }
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + this.f392626e);
        if (!wheelView.A) {
            float itemHeight = wheelView.getItemHeight();
            float itemsCount = ((wheelView.getItemsCount() - 1) - wheelView.getInitPosition()) * itemHeight;
            if (wheelView.getTotalScrollY() <= (-wheelView.getInitPosition()) * itemHeight || wheelView.getTotalScrollY() >= itemsCount) {
                wheelView.setTotalScrollY(wheelView.getTotalScrollY() - this.f392626e);
                wheelView.a();
                wheelView.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        wheelView.getHandler().sendEmptyMessage(1000);
        this.f392625d -= this.f392626e;
    }
}
