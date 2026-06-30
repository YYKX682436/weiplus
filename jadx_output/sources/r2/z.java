package r2;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.y1 f368765d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u1.y1 y1Var) {
        super(0);
        this.f368765d = y1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        java.lang.Object obj = this.f368765d.f423724a;
        kotlin.jvm.internal.o.d(obj);
        android.view.View typedView$ui_release = ((r2.h0) obj).getTypedView$ui_release();
        if (typedView$ui_release != null) {
            typedView$ui_release.saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }
}
