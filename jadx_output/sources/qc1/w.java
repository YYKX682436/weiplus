package qc1;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f361499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f361500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pl1.i f361501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f361502g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qc1.x f361503h;

    public w(qc1.x xVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17, pl1.i iVar, int i18) {
        this.f361503h = xVar;
        this.f361499d = v5Var;
        this.f361500e = i17;
        this.f361501f = iVar;
        this.f361502g = i18;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.tencent.mm.plugin.appbrand.widget.input.p4] */
    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        java.lang.Integer num;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        com.tencent.mm.plugin.appbrand.widget.input.p pVar;
        android.graphics.Rect o17;
        java.util.Set<??> d17;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var2 = this.f361499d;
        int i17 = this.f361500e;
        pl1.i iVar = this.f361501f;
        if (v5Var2 != null && (d17 = com.tencent.mm.plugin.appbrand.widget.input.m.f91540a.d(v5Var2)) != null) {
            for (com.tencent.mm.plugin.appbrand.widget.input.f fVar : d17) {
                if (fVar != 0) {
                    if (fVar.h() != null && ((com.tencent.mm.plugin.appbrand.widget.input.e4) ((com.tencent.mm.plugin.appbrand.widget.input.t4) fVar.h())).getInputId() == i17) {
                        break;
                    }
                }
            }
        }
        fVar = 0;
        com.tencent.mm.plugin.appbrand.widget.input.f fVar2 = fVar instanceof com.tencent.mm.plugin.appbrand.widget.input.f ? fVar : null;
        if (fVar2 != null) {
            java.lang.String str = iVar.f356587a;
            if (str != null) {
                fVar2.t(str);
            }
            fVar2.j(iVar);
            android.widget.EditText n17 = fVar2.n();
            if (n17 != null && (v5Var = (com.tencent.mm.plugin.appbrand.page.v5) fVar2.f91435h.get()) != null && v5Var.a2() != null && (pVar = (com.tencent.mm.plugin.appbrand.widget.input.p) v5Var.E1()) != null && (o17 = fVar2.o()) != null) {
                pVar.s(v5Var.a2(), n17, o17.width(), o17.height(), o17.left, o17.top);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            this.f361499d.a(this.f361502g, this.f361503h.o("ok"));
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.p4 a17 = com.tencent.mm.plugin.appbrand.widget.input.r1.a(this.f361499d, this.f361500e);
        if (!(a17 instanceof com.tencent.mm.plugin.appbrand.widget.input.q0)) {
            java.util.Locale locale = java.util.Locale.US;
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiUpdateInput", java.lang.String.format(locale, "AppBrandInputInvokeHandler with inputID(%d) 404", java.lang.Integer.valueOf(this.f361500e)));
            this.f361499d.a(this.f361502g, this.f361503h.o(java.lang.String.format(locale, "fail found no input with %d", java.lang.Integer.valueOf(this.f361500e))));
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.input.q0 q0Var = (com.tencent.mm.plugin.appbrand.widget.input.q0) a17;
        pl1.i iVar2 = this.f361501f;
        pl1.f fVar3 = q0Var.f91609n;
        if (fVar3 != null && q0Var.f91612q != null) {
            fVar3.a(iVar2);
            com.tencent.mm.plugin.appbrand.widget.input.l4.a(q0Var.f91609n, iVar2);
            if (q0Var.f91609n.U || ((num = q0Var.f91609n.f356589c) != null && num.intValue() > 0)) {
                q0Var.f91612q.setWillNotDraw(true);
                q0Var.A();
                java.lang.String str2 = q0Var.f91609n.f356587a;
                if (str2 != null) {
                    q0Var.f91612q.u(str2);
                }
                if (com.tencent.mm.plugin.appbrand.widget.input.m5.d(q0Var.f91609n.f356609w)) {
                    com.tencent.mm.plugin.appbrand.widget.input.e0 e0Var = new com.tencent.mm.plugin.appbrand.widget.input.e0(q0Var);
                    if (q0Var.f91612q.getLayout() == null) {
                        q0Var.f91612q.post(e0Var);
                    } else {
                        e0Var.run();
                    }
                } else {
                    q0Var.C(q0Var.f91612q, q0Var.f91609n);
                }
                q0Var.f91612q.setWillNotDraw(false);
                q0Var.f91612q.invalidate();
            }
        }
        this.f361499d.a(this.f361502g, this.f361503h.o("ok"));
    }
}
