package zo1;

/* loaded from: classes5.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f474635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f474636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f474637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(zo1.k4 k4Var, qo1.f0 f0Var, float f17) {
        super(0);
        this.f474635d = k4Var;
        this.f474636e = f0Var;
        this.f474637f = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qo1.f0 f0Var;
        zo1.k4 k4Var = this.f474635d;
        java.util.Iterator it = k4Var.f474674e.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            f0Var = this.f474636e;
            if (!hasNext) {
                i17 = -1;
                break;
            }
            if (((com.tencent.wechat.aff.affroam.g) it.next()).f215829d == f0Var.f365483i) {
                break;
            }
            i17++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pkgId=");
        sb6.append(f0Var.f365483i);
        sb6.append(", position = ");
        sb6.append(i17);
        sb6.append(", percentage=");
        float f17 = this.f474637f;
        sb6.append(f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", sb6.toString());
        if (i17 != -1) {
            k4Var.notifyItemChanged(i17, kz5.c0.i(1, java.lang.Float.valueOf(f17), f0Var));
        }
        return jz5.f0.f302826a;
    }
}
