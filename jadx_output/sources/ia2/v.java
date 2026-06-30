package ia2;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f289980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f289980d = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.ah0 serviceInfo = (bw5.ah0) obj;
        kotlin.jvm.internal.o.g(serviceInfo, "serviceInfo");
        java.lang.ref.WeakReference weakReference = this.f289980d;
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) weakReference.get();
        if (finderFlutterPOIActivity != null) {
            finderFlutterPOIActivity.f101790z = serviceInfo;
        }
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity2 = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) weakReference.get();
        if (finderFlutterPOIActivity2 != null) {
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.f7(finderFlutterPOIActivity2);
        }
        return jz5.f0.f302826a;
    }
}
