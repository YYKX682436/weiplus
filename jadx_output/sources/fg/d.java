package fg;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.f f261745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f261746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f261747f;

    public d(fg.f fVar, int i17, int i18) {
        this.f261745d = fVar;
        this.f261746e = i17;
        this.f261747f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        fg.f fVar = this.f261745d;
        fVar.getClass();
        int i18 = this.f261746e;
        if (i18 < 0 || (i17 = this.f261747f) < 0 || i18 > i17) {
            return;
        }
        try {
            fVar.f261758w.setSelection(i18, i17);
        } catch (java.lang.Exception unused) {
        }
    }
}
