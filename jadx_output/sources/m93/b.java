package m93;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f325017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m93.h f325018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f325019g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m93.i f325020h;

    public b(m93.i iVar, java.lang.String str, int i17, m93.h hVar, boolean z17) {
        this.f325020h = iVar;
        this.f325016d = str;
        this.f325017e = i17;
        this.f325018f = hVar;
        this.f325019g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f325016d;
        sb6.append(str);
        sb6.append("_");
        int i17 = this.f325017e;
        sb6.append(java.lang.Integer.toString(i17));
        java.lang.String sb7 = sb6.toString();
        m93.i iVar = this.f325020h;
        boolean containsKey = ((java.util.concurrent.ConcurrentHashMap) iVar.f325039e).containsKey(sb7);
        m93.h hVar = this.f325018f;
        if (containsKey) {
            hVar.b(((m93.f) ((java.util.concurrent.ConcurrentHashMap) iVar.f325039e).get(sb7)).f325030a);
        } else {
            iVar.a(str, this.f325019g, i17, hVar);
        }
    }
}
