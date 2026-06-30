package jk3;

/* loaded from: classes8.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk3.b f300076d;

    public a(jk3.b bVar) {
        this.f300076d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        r45.kr4 kr4Var = this.f300076d.f300079c;
        com.tencent.mm.plugin.multitask.p1 p1Var = (com.tencent.mm.plugin.multitask.p1) l0Var;
        p1Var.getClass();
        if (kr4Var != null) {
            kr4Var.getString(2);
        }
        if (kr4Var != null) {
            kr4Var.getInteger(3);
        }
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("reporttype", 2);
            bundle.putByteArray("reportdata", kr4Var != null ? kr4Var.toByteArray() : null);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.multitask.j2.class, new com.tencent.mm.plugin.multitask.n1(p1Var));
            return;
        }
        if (kr4Var != null) {
            nk3.f fVar = nk3.f.f338041a;
            fVar.f(kr4Var);
            fVar.g(kr4Var.getInteger(3), (r45.jr4) kr4Var.getCustom(8));
        }
    }
}
