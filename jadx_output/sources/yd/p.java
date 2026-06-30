package yd;

/* loaded from: classes7.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f460960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd.u f460961e;

    public p(yd.u uVar, java.lang.String str) {
        this.f460961e = uVar;
        this.f460960d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f460961e.f460967c != null) {
            yd.e eVar = this.f460961e.f460967c;
            java.lang.String str = this.f460960d;
            if (eVar.f460947i) {
                eVar.b(str);
                return;
            }
            if (eVar.f460946h == null) {
                eVar.f460946h = new java.util.LinkedList();
            }
            eVar.f460946h.add(str);
        }
    }
}
