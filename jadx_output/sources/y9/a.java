package y9;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f460237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f460238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f460239f;

    public a(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior, android.view.View view, int i17) {
        this.f460239f = bottomSheetBehavior;
        this.f460237d = view;
        this.f460238e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f460239f.G(this.f460237d, this.f460238e);
    }
}
