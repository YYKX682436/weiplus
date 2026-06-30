package ui1;

/* loaded from: classes7.dex */
public abstract class q implements ui1.r {

    /* renamed from: a, reason: collision with root package name */
    public final ui1.r f428081a;

    public q(ui1.r rVar) {
        this.f428081a = rVar;
    }

    @Override // ui1.r
    public void a() {
        ui1.r rVar = this.f428081a;
        if (rVar != null) {
            rVar.a();
        }
    }

    @Override // ui1.r
    public void c(int i17, java.lang.String str) {
        ui1.r rVar = this.f428081a;
        if (rVar != null) {
            rVar.c(i17, str);
        }
    }

    @Override // ui1.r
    public void onCancel() {
        ui1.r rVar = this.f428081a;
        if (rVar != null) {
            rVar.onCancel();
        }
    }
}
