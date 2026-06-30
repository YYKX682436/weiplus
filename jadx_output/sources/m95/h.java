package m95;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Application f325095a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources f325096b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.TypedValue f325097c = new android.util.TypedValue();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f325098d;

    public h(java.util.Map map, android.app.Application application, android.content.res.Resources resources) {
        this.f325098d = map;
        this.f325095a = application;
        this.f325096b = resources;
    }

    public void a(java.lang.Integer num, l95.c cVar) {
        if (cVar != null) {
            this.f325098d.put(num, cVar);
        }
        m95.k.b(this.f325095a, this.f325096b, num.intValue(), this.f325097c);
    }
}
