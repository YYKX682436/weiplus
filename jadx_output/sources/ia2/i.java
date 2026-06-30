package ia2;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f289928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f289928d = weakReference;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) this.f289928d.get();
        if (finderFlutterPOIActivity != null) {
            finderFlutterPOIActivity.W = true;
        }
        return jz5.f0.f302826a;
    }
}
