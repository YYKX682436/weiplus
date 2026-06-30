package zc3;

/* loaded from: classes7.dex */
public final class p implements zc3.c {

    /* renamed from: a, reason: collision with root package name */
    public iq0.c f471429a;

    /* renamed from: b, reason: collision with root package name */
    public zq0.a f471430b;

    @Override // zc3.c
    public void a() {
        gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
        jc3.s0 s0Var = jc3.s0.f298984d;
        int i17 = s26.a.f402368f;
        ((nq0.p) tVar).Vi(new iq0.i("MagicWorkerDemo", s0Var, s26.c.e(3000, s26.d.f402371f), null, null, null, 0.0d, null, null, 504, null));
    }

    @Override // zc3.c
    public void b(zq0.a container) {
        kotlin.jvm.internal.o.g(container, "container");
        if (this.f471429a == null) {
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.d(tVar);
            iq0.c de6 = gq0.t.de(tVar, new zc3.o(this, container), null, 2, null);
            gq0.t.bh(tVar, de6, null, 2, null);
            this.f471429a = de6;
            this.f471430b = container;
        }
    }

    @Override // zc3.c
    public void show() {
        zq0.a aVar;
        iq0.c cVar = this.f471429a;
        if (cVar == null || (aVar = this.f471430b) == null) {
            return;
        }
        aVar.getWidth();
        aVar.getHeight();
        ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).bj(cVar, "\nvar worker = null;\nvar canvas = null;\nvar offscreenCanvas = null;\nvar animationId = null;\nvar x = 0;\nvar y = 0;\nvar advanceX = 5;\nvar advanceY = 5;\nvar blockWidth = 100;\nvar blockHeight = 100;\n\n// 主线程逻辑\nfunction initWorker() {\n    // 1. 创建 Worker，传入相对路径（相对于 biz 包路径）\n    worker = new mb.Worker('magicbrush-demo-worker.js');\n    console.log('Worker created');\n\n    // 2. 创建 ScreenCanvas\n    canvas = new mb.ScreenCanvas();\n    canvas.width = 1260;\n    canvas.height = 1503;\n\n    // 3. 通过 transferControl 将 canvas 控制权转移到 worker\n    offscreenCanvas = canvas.transferControlToOffscreen();\n    console.log('Canvas transferred to worker');\n\n    // 4. 发送消息给 worker，传递离屏 canvas\n    worker.postMessage({\n        type: 'init',\n        canvas: offscreenCanvas\n    });\n\n    // 监听 worker 消息\n    worker.onmessage = function(e) {\n        console.log('Message from worker:', e.data);\n    };\n\n    worker.onerror = function(e) {\n        console.error('Worker error:', e);\n    };\n}\n\n// 初始化 Worker Demo\ninitWorker();\n", zc3.m.f471425d);
    }

    @Override // zc3.c
    public void stop() {
        iq0.c cVar = this.f471429a;
        if (cVar != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Di(cVar);
            this.f471429a = null;
            this.f471430b = null;
        }
    }
}
