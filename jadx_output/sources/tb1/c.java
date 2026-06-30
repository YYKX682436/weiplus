package tb1;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f416890a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f416891b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f416892c = false;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f416893d = new android.util.SparseArray();

    public c(tb1.a aVar) {
    }

    public int[] a() {
        android.util.SparseArray sparseArray = this.f416893d;
        if (sparseArray == null || sparseArray.size() == 0) {
            return new int[0];
        }
        int[] iArr = new int[sparseArray.size()];
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            iArr[i17] = sparseArray.keyAt(i17);
        }
        return iArr;
    }

    public boolean b(int i17, boolean z17) {
        android.util.SparseArray sparseArray = this.f416893d;
        if (sparseArray.indexOfKey(i17) < 0) {
            return false;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) sparseArray.get(i17);
        if (weakReference != null) {
            tb1.a0 a0Var = (tb1.a0) weakReference.get();
            if (a0Var != null) {
                ((com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) a0Var).i();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraMrg", "release a recycled camera instance");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraMrg", "release client fail, weak reference not exist");
        }
        if (!z17) {
            return true;
        }
        sparseArray.remove(i17);
        return true;
    }
}
