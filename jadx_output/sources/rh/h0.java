package rh;

/* loaded from: classes12.dex */
public class h0 implements rh.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f395406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rh.i0 f395407b;

    public h0(rh.i0 i0Var, rh.o2 o2Var) {
        this.f395407b = i0Var;
        this.f395406a = o2Var;
    }

    @Override // rh.a1
    public long a(java.lang.String str) {
        long j17;
        long longValue;
        uh.g gVar = (uh.g) this.f395406a.f395486c;
        if (str == null) {
            longValue = ((java.lang.Long) gVar.f427713v.f395552a).longValue();
            j17 = ((java.lang.Long) gVar.f427715w.f395552a).longValue();
        } else {
            rh.i0 i0Var = this.f395407b;
            qh.f0 f0Var = i0Var.f395421a.f395442b.f395482d.f395329k;
            j17 = 0;
            if (f0Var == null) {
                return 0L;
            }
            java.lang.String packageName = f0Var.d().getPackageName();
            if (com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM.equals(str)) {
                packageName = i0Var.f395421a.f395442b.f395482d.f395329k.d().getPackageName() + ":" + str;
            }
            rh.x2 x2Var = (rh.x2) gVar.f427712u0.get(packageName);
            rh.x2 x2Var2 = (rh.x2) gVar.f427714v0.get(packageName);
            longValue = x2Var == null ? 0L : ((java.lang.Long) x2Var.f395552a).longValue();
            if (x2Var2 != null) {
                j17 = ((java.lang.Long) x2Var2.f395552a).longValue();
            }
        }
        return longValue + j17;
    }
}
