package ms4;

/* loaded from: classes8.dex */
public final class e implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.h f331013a;

    public e(ms4.h hVar) {
        this.f331013a = hVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        ms4.h hVar = this.f331013a;
        hVar.f331031g.postValue(java.lang.Boolean.FALSE);
        js4.o oVar = hVar.f331028d.f301546d;
        if (oVar != null) {
            if (str == null) {
                str = "";
            }
            oVar.a(i17, i18, str);
        }
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        java.lang.Void r47 = (java.lang.Void) obj;
        ms4.h hVar = this.f331013a;
        hVar.f331031g.postValue(java.lang.Boolean.FALSE);
        js4.o oVar = hVar.f331028d.f301546d;
        if (oVar != null) {
            oVar.onSuccess(r47);
        }
    }
}
