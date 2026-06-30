package tl;

/* loaded from: classes14.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f420024d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f420025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tl.d0 f420026f;

    public a0(tl.d0 d0Var) {
        this.f420026f = d0Var;
        int i17 = d0Var.f420030e;
        this.f420024d = i17;
        this.f420025e = new byte[i17 * 2];
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int a17;
        int b17;
        this.f420026f.getClass();
        tl.d0 d0Var = this.f420026f;
        synchronized (d0Var.f420040o) {
            to.b bVar = d0Var.f420038m;
            i17 = bVar != null ? bVar.f420880a : -1;
        }
        int i18 = (int) (i17 * 0.8d);
        tl.d0 d0Var2 = this.f420026f;
        int i19 = d0Var2.f420030e;
        if (i18 < i19 * 8) {
            i18 = i19 * 8;
        }
        synchronized (d0Var2.f420040o) {
            to.b bVar2 = d0Var2.f420038m;
            a17 = bVar2 != null ? bVar2.a() : -1;
        }
        int i27 = a17 <= i18 ? 1 : 8;
        for (int i28 = 0; i28 < i27; i28++) {
            tl.d0 d0Var3 = this.f420026f;
            byte[] bArr = this.f420025e;
            int i29 = this.f420024d;
            synchronized (d0Var3.f420040o) {
                to.b bVar3 = d0Var3.f420038m;
                b17 = bVar3 != null ? bVar3.b(bArr, i29) : -1;
            }
            tl.c cVar = this.f420026f.f420039n;
            if (cVar != null && b17 == 0) {
                cVar.b(this.f420025e, this.f420024d);
            }
        }
    }
}
