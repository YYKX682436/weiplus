package dl4;

/* loaded from: classes3.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f235415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w1 f235416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ff0.x f235417g;

    public i1(java.lang.String str, android.graphics.Bitmap bitmap, com.tencent.mm.sdk.platformtools.w1 w1Var, ff0.x xVar) {
        this.f235414d = str;
        this.f235415e = bitmap;
        this.f235416f = w1Var;
        this.f235417g = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = dl4.m1.f235436a;
        java.util.HashMap hashMap2 = dl4.m1.f235436a;
        java.lang.String str = this.f235414d;
        java.lang.Object obj = hashMap2.get(str);
        ff0.x xVar = this.f235417g;
        if (obj != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            if (!arrayList.isEmpty()) {
                if (xVar != null) {
                    arrayList.add(xVar);
                    return;
                }
                return;
            }
        }
        if (obj == null) {
            obj = new java.util.ArrayList();
        }
        if (xVar != null) {
            ((java.util.ArrayList) obj).add(xVar);
        }
        hashMap2.put(str, obj);
        rk4.g4 g4Var = rk4.g4.f396674a;
        dl4.k1 k1Var = new dl4.k1(str, this.f235416f);
        android.graphics.Bitmap bitmap = this.f235415e;
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        jz5.l c17 = g4Var.c(bitmap);
        if (c17 == null) {
            k1Var.invoke(null);
            return;
        }
        ((jm4.w5) rk4.g4.f396675b).a((byte[]) c17.f302833d, (bw5.tq0) c17.f302834e, new rk4.d4(k1Var));
    }
}
