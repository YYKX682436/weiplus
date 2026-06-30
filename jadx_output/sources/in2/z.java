package in2;

/* loaded from: classes10.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f292937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f292938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in2.t f292939f;

    public z(int i17, in2.f0 f0Var, in2.t tVar) {
        this.f292937d = i17;
        this.f292938e = f0Var;
        this.f292939f = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar;
        in2.f0 f0Var = this.f292938e;
        int i17 = f0Var.f292832q;
        int i18 = this.f292937d;
        int i19 = i18 - i17;
        f0Var.f292832q = i18;
        int[] iArr = new int[2];
        in2.t tVar = this.f292939f;
        tVar.itemView.getLocationInWindow(iArr);
        yz5.q qVar = f0Var.f292830o;
        if (qVar != null) {
            qVar.invoke(java.lang.Integer.valueOf(iArr[1] + tVar.f292902h.getHeight()), java.lang.Boolean.valueOf(f0Var.f292834s), java.lang.Integer.valueOf(i19));
        }
        if (i18 == f0Var.f292826h.size() - 2 && (lVar = f0Var.f292831p) != null) {
            lVar.invoke(java.lang.Integer.valueOf(f0Var.f292826h.size() - 2));
        }
        tVar.f292902h.postDelayed(new in2.y(tVar), 300L);
        f0Var.f292834s = true;
    }
}
