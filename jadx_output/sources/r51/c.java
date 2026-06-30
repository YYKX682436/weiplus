package r51;

/* loaded from: classes15.dex */
public final class c extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public float f392621d = 2.1474836E9f;

    /* renamed from: e, reason: collision with root package name */
    public final float f392622e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.picker.base.view.WheelView f392623f;

    public c(com.tencent.mm.picker.base.view.WheelView wheelView, float f17) {
        this.f392623f = wheelView;
        this.f392622e = f17;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f392621d == 2.1474836E9f) {
            float f17 = this.f392622e;
            if (java.lang.Math.abs(f17) > 2000.0f) {
                this.f392621d = f17 <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f392621d = f17;
            }
        }
        float abs = java.lang.Math.abs(this.f392621d);
        com.tencent.mm.picker.base.view.WheelView wheelView = this.f392623f;
        if (abs >= 0.0f && java.lang.Math.abs(this.f392621d) <= 20.0f) {
            wheelView.a();
            wheelView.getHandler().sendEmptyMessage(2000);
            return;
        }
        float f18 = (int) (this.f392621d / 100.0f);
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f18);
        if (!wheelView.A) {
            float itemHeight = wheelView.getItemHeight();
            float f19 = (-wheelView.getInitPosition()) * itemHeight;
            float itemsCount = ((wheelView.getItemsCount() - 1) - wheelView.getInitPosition()) * itemHeight;
            double d17 = itemHeight * 0.25d;
            if (wheelView.getTotalScrollY() - d17 < f19) {
                f19 = wheelView.getTotalScrollY() + f18;
            } else if (wheelView.getTotalScrollY() + d17 > itemsCount) {
                itemsCount = wheelView.getTotalScrollY() + f18;
            }
            if (wheelView.getTotalScrollY() <= f19) {
                this.f392621d = 40.0f;
                wheelView.setTotalScrollY((int) f19);
            } else if (wheelView.getTotalScrollY() >= itemsCount) {
                wheelView.setTotalScrollY((int) itemsCount);
                this.f392621d = -40.0f;
            }
        }
        float f27 = this.f392621d;
        if (f27 < 0.0f) {
            this.f392621d = f27 + 20.0f;
        } else {
            this.f392621d = f27 - 20.0f;
        }
        wheelView.getHandler().sendEmptyMessage(1000);
    }
}
