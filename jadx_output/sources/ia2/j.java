package ia2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity f289932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity) {
        super(0);
        this.f289932d = finderFlutterPOIActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = this.f289932d;
        java.lang.ref.WeakReference weakReference = finderFlutterPOIActivity.f101781u;
        androidx.fragment.app.FragmentActivity fragmentActivity = weakReference != null ? (androidx.fragment.app.FragmentActivity) weakReference.get() : null;
        if (fragmentActivity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderFlutterPOIActivity", "onAddressEntranceTap: failed, parentActivity null");
        } else {
            r45.f96 f96Var = finderFlutterPOIActivity.f101784x;
            if (f96Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FinderFlutterPOIActivity", "onAddressEntranceTap: failed, location null");
            } else {
                la2.d dVar = la2.d.f317510a;
                r45.f96 f96Var2 = finderFlutterPOIActivity.f101784x;
                kotlin.jvm.internal.o.d(f96Var2);
                dVar.b(fragmentActivity, null, 11, f96Var, true, f96Var2.getInteger(8), false, true);
            }
        }
        return jz5.f0.f302826a;
    }
}
