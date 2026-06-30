package ia2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f289979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f289979d = weakReference;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) this.f289979d.get();
        if (finderFlutterPOIActivity != null) {
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.f7(finderFlutterPOIActivity);
        }
        return jz5.f0.f302826a;
    }
}
