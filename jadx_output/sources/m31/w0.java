package m31;

/* loaded from: classes9.dex */
public final class w0 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m31.y0 f323225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f323226b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f323227c;

    public w0(m31.y0 y0Var, androidx.recyclerview.widget.k3 k3Var, int i17) {
        this.f323225a = y0Var;
        this.f323226b = k3Var;
        this.f323227c = i17;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        this.f323225a.y(z17, this.f323226b, this.f323227c);
    }
}
