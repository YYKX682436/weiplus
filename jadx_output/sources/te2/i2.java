package te2;

/* loaded from: classes14.dex */
public final class i2 implements z91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.l2 f418101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418102b;

    public i2(te2.l2 l2Var, java.lang.String str) {
        this.f418101a = l2Var;
        this.f418102b = str;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        te2.l2 l2Var = this.f418101a;
        java.lang.String str = l2Var.f418192e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail before play new ");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : null);
        com.tencent.mars.xlog.Log.e(str, sb6.toString());
        android.os.Message obtainMessage = l2Var.f418197m.obtainMessage(l2Var.f418193f);
        obtainMessage.arg1 = eVar != null ? eVar.f2487c : 0;
        obtainMessage.sendToTarget();
    }

    @Override // z91.a
    public void b(aa1.e eVar) {
        te2.l2 l2Var = this.f418101a;
        x91.h hVar = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar != null) {
            hVar.f452651e.f452663a = x91.j.Stopped;
        }
        x91.h hVar2 = ((je2.i) l2Var.f418191d.a(je2.i.class)).f299235f;
        if (hVar2 != null) {
            hVar2.d(this.f418102b, new te2.h2(l2Var));
        }
    }
}
