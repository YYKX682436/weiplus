package zc3;

/* loaded from: classes7.dex */
public final class l implements zc3.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f471423a;

    /* renamed from: b, reason: collision with root package name */
    public iq0.c f471424b;

    public l(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        this.f471423a = bizName;
    }

    @Override // zc3.c
    public void a() {
        gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
        java.lang.String str = this.f471423a;
        jc3.s0 s0Var = jc3.s0.f298984d;
        int i17 = s26.a.f402368f;
        ((nq0.p) tVar).Vi(new iq0.i(str, s0Var, s26.c.e(3000, s26.d.f402371f), null, null, null, 0.0d, null, null, 504, null));
    }

    @Override // zc3.c
    public void b(zq0.a container) {
        kotlin.jvm.internal.o.g(container, "container");
        if (this.f471424b == null) {
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.d(tVar);
            iq0.c de6 = gq0.t.de(tVar, new zc3.k(this, container), null, 2, null);
            gq0.t.bh(tVar, de6, null, 2, null);
            this.f471424b = de6;
        }
    }

    @Override // zc3.c
    public void show() {
        iq0.c cVar = this.f471424b;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).bj(cVar, "var mainCount = 0;\nvar canvas = new mb.ScreenCanvas();\ncanvas.width = 1260;\ncanvas.height = 1503;\nvar ctx = canvas.getContext('2d');\nlet unit = 5;\nlet blockWidth = 200;\nlet blockHeight = 200;\nvar x = 0;\nvar y = 0;\nvar advanceX = unit;\nvar advanceY = unit;\nvar mainCount = 1;\nmb.JSBridge.on('log', (arg) => console.log(JSON.stringify(arg)));\nvar mainLoop = function() {\n    mainCount++;\n    ctx.fillStyle = 'red';\n    ctx.clearRect(0, 0, canvas.width, canvas.height);\n    ctx.fillRect(x, y, blockWidth, blockHeight);\n    x += advanceX;\n    y += advanceY;\n    if (x + blockWidth >= canvas.width) {\n      advanceX = -unit;\n    }\n    if (x <= 0) {\n      advanceX = unit;\n    }\n    if (y + blockHeight >= canvas.height) {\n      advanceY = -unit;\n    }\n    if (y <= 0) {\n      advanceY = unit;\n    }\n    requestAnimationFrame(mainLoop);\n};mainLoop()", zc3.h.f471418d);
        }
    }

    @Override // zc3.c
    public void stop() {
        iq0.c cVar = this.f471424b;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Di(cVar);
            this.f471424b = null;
        }
    }
}
