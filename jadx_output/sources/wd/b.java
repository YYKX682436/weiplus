package wd;

/* loaded from: classes7.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e8.a f444672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wd.c f444673f;

    public b(wd.c cVar, java.lang.String str, e8.a aVar) {
        this.f444673f = cVar;
        this.f444671d = str;
        this.f444672e = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f444673f.f444678e) {
            wd.c cVar = this.f444673f;
            if (cVar.f444679f && !cVar.f444678e.contains(this.f444671d) && this.f444672e != null) {
                wd.c cVar2 = this.f444673f;
                if (cVar2.f444680g != 0) {
                    int size = cVar2.f444678e.size();
                    wd.c cVar3 = this.f444673f;
                    if (size < cVar3.f444680g) {
                        cVar3.f444678e.size();
                        java.lang.String str = this.f444672e.f249987g;
                        wd.c cVar4 = this.f444673f;
                        java.lang.String str2 = cVar4.f444677d;
                        int i17 = cVar4.f444682i;
                        long j17 = this.f444672e.f249981a;
                        long j18 = this.f444672e.f249985e;
                        long j19 = this.f444672e.f249986f;
                        wd.c.c(this.f444673f, this.f444671d, this.f444672e);
                    }
                } else {
                    double random = java.lang.Math.random();
                    wd.c cVar5 = this.f444673f;
                    if (random < cVar5.f444681h) {
                        cVar5.f444678e.size();
                        java.lang.String str3 = this.f444672e.f249987g;
                        wd.c cVar6 = this.f444673f;
                        java.lang.String str4 = cVar6.f444677d;
                        int i18 = cVar6.f444682i;
                        long j27 = this.f444672e.f249981a;
                        long j28 = this.f444672e.f249985e;
                        long j29 = this.f444672e.f249986f;
                        wd.c.c(this.f444673f, this.f444671d, this.f444672e);
                    }
                }
            }
        }
    }
}
