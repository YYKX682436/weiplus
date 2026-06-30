package vp;

/* loaded from: classes16.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f438729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp.c0 f438730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp.d0 f438731f;

    public a0(vp.d0 d0Var, java.util.List list, vp.c0 c0Var) {
        this.f438731f = d0Var;
        this.f438729d = list;
        this.f438730e = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f438729d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vp.d0 d0Var = this.f438731f;
            if (!hasNext) {
                d0Var.f438767e.post(new vp.z(this, arrayList));
                return;
            } else {
                wp.a aVar = (wp.a) it.next();
                arrayList.add(android.util.Pair.create(aVar, aVar.n() ? null : d0Var.f438766d.c(aVar).b(aVar)));
            }
        }
    }
}
