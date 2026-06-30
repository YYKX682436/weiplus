package nr0;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr0.x f339073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(nr0.x xVar) {
        super(1);
        this.f339073d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        kotlin.jvm.internal.o.g(it, "it");
        nr0.x xVar = this.f339073d;
        nr0.c0 c0Var = xVar.f339126r;
        yz5.a aVar = c0Var.f339069a;
        if (aVar != null) {
            aVar.invoke();
        }
        c0Var.f339069a = null;
        or0.c.f347429a.b();
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a17 = as0.a.f13425a.a(xVar.f339115d);
        if (a17 != null) {
            if (a17.f55566o <= 0) {
                a17.f55566o = java.lang.System.currentTimeMillis();
            }
            a17.f55571t++;
        }
        xVar.l(new nr0.d(xVar, null));
        return jz5.f0.f302826a;
    }
}
