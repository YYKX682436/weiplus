package i53;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f288563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i53.i1 f288564e;

    public e1(i53.i1 i1Var, java.util.ArrayList arrayList) {
        this.f288564e = i1Var;
        this.f288563d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.i1 i1Var = this.f288564e;
        i1Var.f288594d.clear();
        java.util.ArrayList arrayList = this.f288563d;
        if (arrayList != null) {
            i1Var.f288594d.addAll(arrayList);
        }
        i1Var.notifyDataSetChanged();
    }
}
