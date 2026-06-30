package el3;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253961e;

    public b(el3.h hVar, java.lang.String str, java.lang.String str2) {
        this.f253960d = str;
        this.f253961e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f253960d + "-" + com.tencent.mm.sdk.platformtools.w2.a(this.f253961e);
        synchronized (el3.h.f253996i) {
            if (el3.h.f253995h.containsKey(str)) {
                el3.h.f253995h.put(str, java.lang.Integer.valueOf(((java.lang.Integer) el3.h.f253995h.get(str)).intValue() + 1));
            } else {
                el3.h.f253995h.put(str, 1);
            }
            el3.h.f253989b++;
        }
    }
}
