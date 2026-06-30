package pe5;

/* loaded from: classes9.dex */
public final class a implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k70.i0 f353726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353727e;

    public a(k70.i0 i0Var, java.lang.String str) {
        this.f353726d = i0Var;
        this.f353727e = str;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        k70.i0 i0Var;
        p15.h hVar;
        com.tencent.mm.modelmulti.BizScreenshotMsgInfo a17;
        if (((r70.h) obj).f393109a == r70.i.f393113d && (hVar = (i0Var = this.f353726d).f304654m) != null) {
            java.lang.String j17 = hVar.j();
            if (!(j17 == null || j17.length() == 0) && (a17 = com.tencent.mm.modelmulti.BizScreenshotMsgInfo.f71250m.a(i0Var.f304654m)) != null) {
                ((qv.s) ((qk.r6) i95.n0.c(qk.r6.class))).Di(a17, com.tencent.mm.storage.z3.R4(this.f353727e) ? 2 : 1, 1);
            }
        }
        return jz5.f0.f302826a;
    }
}
