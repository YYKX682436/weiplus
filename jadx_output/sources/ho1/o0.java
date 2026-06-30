package ho1;

/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ho1.a1 a1Var, long j17) {
        super(1);
        this.f282772d = a1Var;
        this.f282773e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List devices = (java.util.List) obj;
        kotlin.jvm.internal.o.g(devices, "devices");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = devices.iterator();
        while (it.hasNext()) {
            arrayList.add(((po1.d) it.next()).e());
        }
        com.tencent.wechat.aff.affroam.e0 e0Var = this.f282772d.f282623b;
        if (e0Var != null) {
            e0Var.R0(this.f282773e, arrayList);
        }
        return jz5.f0.f302826a;
    }
}
