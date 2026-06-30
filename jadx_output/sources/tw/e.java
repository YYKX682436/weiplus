package tw;

/* loaded from: classes9.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f422397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tw.i f422398e;

    public e(androidx.appcompat.app.AppCompatActivity appCompatActivity, tw.i iVar) {
        this.f422397d = appCompatActivity;
        this.f422398e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f422397d.isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = this.f422398e.f422402d;
        if (brandServiceSortView != null) {
            brandServiceSortView.i();
        } else {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
    }
}
