package ho1;

/* loaded from: classes5.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282754e;

    public m0(ho1.a1 a1Var, long j17) {
        this.f282753d = a1Var;
        this.f282754e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List j17 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.j(true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            arrayList.add(((po1.d) it.next()).e());
        }
        com.tencent.wechat.aff.affroam.e0 e0Var = this.f282753d.f282623b;
        if (e0Var != null) {
            e0Var.B0(this.f282754e, arrayList);
        }
    }
}
