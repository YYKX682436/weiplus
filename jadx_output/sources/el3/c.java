package el3;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f253964f;

    public c(el3.h hVar, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f253962d = str;
        this.f253963e = str2;
        this.f253964f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f253962d + "-" + com.tencent.mm.sdk.platformtools.w2.a(this.f253963e);
        synchronized (el3.h.f253996i) {
            if (el3.h.f253996i.containsKey(str)) {
                el3.h.f253996i.put(str, java.lang.Integer.valueOf(((java.lang.Integer) el3.h.f253996i.get(str)).intValue() + 1));
            } else {
                el3.h.f253996i.put(str, 1);
            }
            if (this.f253964f) {
                el3.h.f253991d++;
            } else {
                el3.h.f253992e++;
            }
        }
    }
}
