package e33;

/* loaded from: classes10.dex */
public class k3 implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f247305d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f247306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f247307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e33.l3 f247308g;

    public k3(e33.l3 l3Var, java.lang.String str, int i17) {
        this.f247308g = l3Var;
        this.f247306e = str;
        this.f247307f = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean a() {
        e33.l3 l3Var = this.f247308g;
        if (l3Var.f247327j != null) {
            java.lang.String str = this.f247306e;
            if (!android.text.TextUtils.isEmpty(str)) {
                if (this.f247307f == 2) {
                    this.f247305d = t23.t1.f(-1L, 2, "", this.f247306e, -1);
                }
                if (this.f247305d != null) {
                    return true;
                }
                e33.v2 v2Var = l3Var.f247327j;
                if (v2Var == null) {
                    return false;
                }
                try {
                    v2Var.getClass();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    android.os.SystemClock.elapsedRealtime();
                    ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decodeFileToBitmapByJavaHeap", "com.tencent.mm.feature.sns.SnsUtilService");
                    android.graphics.Bitmap o17 = ca4.z0.o(str);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeFileToBitmapByJavaHeap", "com.tencent.mm.feature.sns.SnsUtilService");
                    android.os.SystemClock.elapsedRealtime();
                    this.f247305d = o17;
                    return true;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("ImageGalleryLazyLoader", "doInBackground loadImage error : " + th6.getMessage());
                    return false;
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        e33.l3 l3Var = this.f247308g;
        l3Var.f247328k = false;
        java.util.HashMap hashMap = l3Var.f247320c;
        java.lang.String str = this.f247306e;
        if (hashMap.containsKey(str)) {
            int intValue = ((java.lang.Integer) hashMap.get(str)).intValue();
            if (l3Var.f247323f == 0) {
                l3Var.a(intValue, this.f247305d);
            } else {
                l3Var.f247322e.put(intValue, this.f247305d);
            }
        }
        ((jt0.i) l3Var.f247324g).j(str, this.f247305d);
        this.f247305d = null;
        l3Var.d(this.f247307f);
        return false;
    }
}
