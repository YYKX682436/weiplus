package vb1;

/* loaded from: classes7.dex */
public final class r implements gh.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vb1.q f434494a;

    public r(vb1.q qVar) {
        this.f434494a = qVar;
    }

    @Override // gh.w
    public void onPrepared() {
        vb1.q qVar = this.f434494a;
        qVar.f434491b = true;
        if (qVar.f434492c != null) {
            qVar.a();
        }
    }
}
