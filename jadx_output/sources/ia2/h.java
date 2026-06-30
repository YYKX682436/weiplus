package ia2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f289925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.ref.WeakReference weakReference) {
        super(2);
        this.f289925d = weakReference;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "doRequestPoiStream: onSucceed latitude=" + floatValue + ", longitude=" + floatValue2);
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) this.f289925d.get();
        if (finderFlutterPOIActivity != null) {
            yz5.p pVar = finderFlutterPOIActivity.N;
            if (pVar != null) {
            }
            ia2.n0 n0Var = finderFlutterPOIActivity.f101782v;
            boolean z18 = false;
            if (n0Var != null) {
                java.util.Map map = n0Var.f289962p;
                if (!map.isEmpty()) {
                    java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) ((java.util.Map.Entry) it.next()).getValue()).getDataList().isEmpty()) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (!z17) {
                    z18 = true;
                }
            }
            finderFlutterPOIActivity.W = z18;
        }
        return jz5.f0.f302826a;
    }
}
