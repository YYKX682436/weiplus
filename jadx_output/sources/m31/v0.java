package m31;

/* loaded from: classes9.dex */
public final class v0 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m31.y0 f323220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f323221b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f323222c;

    public v0(m31.y0 y0Var, androidx.recyclerview.widget.k3 k3Var, int i17) {
        this.f323220a = y0Var;
        this.f323221b = k3Var;
        this.f323222c = i17;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        this.f323220a.y(z17, this.f323221b, this.f323222c);
    }
}
