package vi1;

/* loaded from: classes7.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f437509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.x20 f437510e;

    public y2(vi1.k3 k3Var, r45.x20 x20Var) {
        this.f437509d = k3Var;
        this.f437510e = x20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vi1.k3 k3Var = this.f437509d;
        r45.x20 x20Var = this.f437510e;
        vi1.k3.b(k3Var, x20Var.f389690d, x20Var.f389691e, x20Var.f389692f, x20Var.f389694h, x20Var.f389695i);
    }
}
