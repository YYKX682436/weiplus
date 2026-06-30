package qd2;

/* loaded from: classes10.dex */
public final class e1 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f361722d;

    public e1(qd2.g1 g1Var) {
        this.f361722d = g1Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f361722d.f361755i;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.D(3);
    }
}
