package dk5;

/* loaded from: classes9.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f234491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f234492e;

    public a2(dk5.c2 c2Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.f9 f9Var2) {
        this.f234491d = f9Var;
        this.f234492e = f9Var2;
    }

    @Override // java.lang.Runnable
    public void run() {
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f279671d;
        java.lang.String Di = ((g90.u) wVar).Di(this.f234491d, 2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Di)) {
            return;
        }
        ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ui(this.f234492e, 2, Di, null);
    }
}
