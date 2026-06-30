package u9;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f425781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f425782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f425783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f425784g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u9.s f425785h;

    public p(u9.s sVar, int i17, int i18, int i19, float f17) {
        this.f425785h = sVar;
        this.f425781d = i17;
        this.f425782e = i18;
        this.f425783f = i19;
        this.f425784g = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f425785h.f425791b.h(this.f425781d, this.f425782e, this.f425783f, this.f425784g);
    }
}
