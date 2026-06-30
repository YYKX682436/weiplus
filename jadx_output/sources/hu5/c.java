package hu5;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f285237a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f285238b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f285239c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f285240d;

    /* renamed from: e, reason: collision with root package name */
    public final hu5.a f285241e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f285242f = false;

    public c(int i17, java.lang.String str, boolean z17, boolean z18, hu5.a aVar, hu5.b bVar) {
        this.f285237a = 0;
        this.f285238b = "";
        this.f285239c = false;
        this.f285240d = false;
        this.f285241e = null;
        this.f285237a = i17;
        this.f285238b = str;
        this.f285239c = z17;
        this.f285240d = z18;
        this.f285241e = aVar;
    }

    public static void a(hu5.c cVar, zt5.k kVar) {
        hu5.a aVar = cVar.f285241e;
        if (aVar != null && !cVar.f285242f) {
            if (kVar == null) {
                aVar.a(-1, com.eclipsesource.mmv8.Platform.UNKNOWN);
            } else if (kVar.a()) {
                aVar.onSuccess();
            } else {
                aVar.a(kVar.f475605a, kVar.f475606b);
            }
        }
        cVar.f285242f = true;
    }
}
