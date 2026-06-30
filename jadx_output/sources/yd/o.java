package yd;

/* loaded from: classes7.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yd.u f460959d;

    public o(yd.u uVar) {
        this.f460959d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (java.lang.String str : this.f460959d.f460969e) {
            yd.e eVar = this.f460959d.f460967c;
            if (eVar.f460947i) {
                eVar.b(str);
            } else {
                if (eVar.f460946h == null) {
                    eVar.f460946h = new java.util.LinkedList();
                }
                eVar.f460946h.add(str);
            }
        }
        ((java.util.LinkedList) this.f460959d.f460969e).clear();
    }
}
