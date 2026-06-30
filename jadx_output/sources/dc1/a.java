package dc1;

/* loaded from: classes8.dex */
public final class a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f228680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u65.a f228681e;

    public a(int i17, u65.a aVar) {
        this.f228680d = i17;
        this.f228681e = aVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (this.f228680d == i17) {
            this.f228681e.b();
        }
    }
}
