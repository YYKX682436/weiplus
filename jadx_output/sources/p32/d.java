package p32;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f351460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f351461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f351463g;

    public d(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, int i17) {
        this.f351460d = context;
        this.f351461e = imageView;
        this.f351462f = str;
        this.f351463g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        p32.g.b(this.f351460d, this.f351461e, this.f351462f, this.f351463g);
    }
}
