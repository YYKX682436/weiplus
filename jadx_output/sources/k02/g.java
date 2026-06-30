package k02;

/* loaded from: classes8.dex */
public class g implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f303076a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h02.a f303078c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k02.k f303079d;

    public g(int[] iArr, android.content.Context context, h02.a aVar, k02.k kVar) {
        this.f303076a = iArr;
        this.f303077b = context;
        this.f303078c = aVar;
        this.f303079d = kVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        this.f303076a[0] = 1;
        k02.l.e(this.f303077b, 6, this.f303078c);
        k02.k kVar = this.f303079d;
        if (kVar != null) {
            kVar.b();
        }
    }
}
