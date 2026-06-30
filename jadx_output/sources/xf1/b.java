package xf1;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xf1.e f454226e;

    public b(java.lang.String str, xf1.e eVar) {
        this.f454225d = str;
        this.f454226e = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = xf1.f.f454234b;
        java.lang.String str = this.f454225d;
        if (!((java.util.HashMap) map).containsKey(str)) {
            ((java.util.HashMap) map).put(str, new java.util.ArrayList());
        }
        ((java.util.List) ((java.util.HashMap) map).get(str)).add(this.f454226e);
    }
}
