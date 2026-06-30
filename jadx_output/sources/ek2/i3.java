package ek2;

/* loaded from: classes3.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d81 f253472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f253473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f253474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f253475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f253476h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f253477i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f253478m;

    public i3(r45.d81 d81Var, int i17, int i18, int i19, yz5.p pVar, int i27, int i28) {
        this.f253472d = d81Var;
        this.f253473e = i17;
        this.f253474f = i18;
        this.f253475g = i19;
        this.f253476h = pVar;
        this.f253477i = i27;
        this.f253478m = i28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f253478m;
        int i18 = this.f253477i;
        yz5.p pVar = this.f253476h;
        try {
            try {
                ek2.k3.a(ek2.k3.f253492a, this.f253472d, this.f253473e, this.f253474f, this.f253475g);
                if (pVar == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Finder.LiveGiftListResultProcessor", "Error processing live gift list result", e17);
                if (pVar == null) {
                    return;
                }
            }
            pVar.invoke(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        } catch (java.lang.Throwable th6) {
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            }
            throw th6;
        }
    }
}
