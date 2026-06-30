package ms4;

/* loaded from: classes8.dex */
public final class n0 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.o0 f331082a;

    public n0(ms4.o0 o0Var) {
        this.f331082a = o0Var;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        this.f331082a.f331085d.postValue(java.lang.Boolean.FALSE);
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        this.f331082a.f331085d.postValue((java.lang.Boolean) obj);
    }
}
