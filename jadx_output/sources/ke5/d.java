package ke5;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f307067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f307068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f307069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f307070g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ke5.a f307071h;

    public d(ke5.a aVar, int i17, int i18, boolean z17, boolean z18) {
        this.f307071h = aVar;
        this.f307067d = i17;
        this.f307068e = i18;
        this.f307069f = z17;
        this.f307070g = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        ke5.a aVar = this.f307071h;
        int j17 = aVar.f307041b.j();
        int i17 = this.f307067d;
        if (j17 <= i17 && i17 <= aVar.f307041b.o()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[protectSetSelection] successfully! pos:" + i17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.AbstractDataPresenter", "[protectSetSelection] pos:" + i17 + " reTryCount:" + aVar.f307045f);
        yb5.d dVar = aVar.f307041b;
        boolean z17 = dVar.f460721p;
        boolean z18 = this.f307070g;
        boolean z19 = this.f307069f;
        if (z17) {
            dVar.U(i17, i65.a.b(dVar.g(), 120), z19, z18);
        } else {
            dVar.U(i17, this.f307068e, z19, z18);
        }
        int i18 = aVar.f307045f - 1;
        aVar.f307045f = i18;
        if (i18 >= 0) {
            aVar.f307041b.p().postDelayed(this, 20L);
        }
    }
}
