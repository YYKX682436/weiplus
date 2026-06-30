package sj3;

/* loaded from: classes14.dex */
public class q4 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sj3.d f408715c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f408716d;

    public q4(sj3.a5 a5Var, sj3.d dVar) {
        this.f408716d = a5Var;
        this.f408715c = dVar;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        sj3.d dVar = this.f408715c;
        if (i17 < dVar.f408466n || i17 > (dVar.getItemCount() - dVar.f408467o) - 1) {
            return this.f408716d.f408421h.f11861w;
        }
        return 1;
    }
}
