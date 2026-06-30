package r53;

/* loaded from: classes8.dex */
public class s implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f392689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f392690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f392691c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f392692d;

    public s(r53.y yVar, android.widget.ImageView imageView, int i17, int i18, int i19) {
        this.f392689a = imageView;
        this.f392690b = i17;
        this.f392691c = i18;
        this.f392692d = i19;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new r53.r(this, bitmap));
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
