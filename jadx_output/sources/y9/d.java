package y9;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f460241d;

    /* renamed from: e, reason: collision with root package name */
    public final int f460242e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f460243f;

    public d(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior, android.view.View view, int i17) {
        this.f460243f = bottomSheetBehavior;
        this.f460241d = view;
        this.f460242e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f460243f;
        androidx.customview.widget.l lVar = bottomSheetBehavior.f44446s;
        if (lVar == null || !lVar.h(true)) {
            bottomSheetBehavior.E(this.f460242e);
        } else {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.m(this.f460241d, this);
        }
    }
}
