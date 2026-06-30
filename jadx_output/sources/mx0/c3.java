package mx0;

/* loaded from: classes5.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton f331866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f331867e;

    public c3(com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton, int i17) {
        this.f331866d = recordButton;
        this.f331867e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton = this.f331866d;
        android.view.View view = recordButton.f69501d;
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) (view != null ? view.getBackground() : null);
        if (gradientDrawable != null) {
            android.view.View view2 = recordButton.f69501d;
            gradientDrawable.setColor(i65.a.d(view2 != null ? view2.getContext() : null, this.f331867e));
        }
    }
}
