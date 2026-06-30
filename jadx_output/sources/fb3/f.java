package fb3;

/* loaded from: classes.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb3.j f260860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.pz5 f260861e;

    public f(fb3.j jVar, r45.pz5 pz5Var) {
        this.f260860d = jVar;
        this.f260861e = pz5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fb3.j jVar = this.f260860d;
        db5.e1.y(jVar.getContext(), this.f260861e.f383503e, "", jVar.getContext().getString(com.tencent.mm.R.string.ba6), null);
    }
}
