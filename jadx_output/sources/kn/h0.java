package kn;

/* loaded from: classes13.dex */
public class h0 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f309403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f309405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f309406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f309407h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309408i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309409m;

    public h0(int i17, java.lang.String str, int i18, boolean z17, int i19, java.lang.String str2, java.lang.String str3) {
        this.f309403d = i17;
        this.f309404e = str;
        this.f309405f = i18;
        this.f309406g = z17;
        this.f309407h = i19;
        this.f309408i = str2;
        this.f309409m = str3;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        int i17 = this.f309403d;
        if (i17 == 2) {
            kn.k0.c(this.f309404e, 1, this.f309405f, this.f309406g ? 1 : 2, this.f309407h, this.f309408i, this.f309409m);
        }
        if (i17 == 1) {
            kn.k0.b(this.f309404e, this.f309405f, 3, 1, this.f309408i, this.f309409m);
        }
    }
}
