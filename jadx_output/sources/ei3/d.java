package ei3;

/* loaded from: classes10.dex */
public class d {

    /* renamed from: i, reason: collision with root package name */
    public static int f253025i = 4;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3[] f253026a;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f253030e;

    /* renamed from: f, reason: collision with root package name */
    public final ei3.c f253031f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f253032g;

    /* renamed from: b, reason: collision with root package name */
    public int f253027b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f253028c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f253029d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final ei3.f f253033h = new ei3.b(this);

    public d(ei3.c cVar) {
        this.f253032g = false;
        this.f253031f = cVar;
        f253025i = -1;
        if (com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance() != null) {
            f253025i = com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.getInstance().getInt(com.tencent.mm.storage.u3.USERINFO_LOCAL_SIGHT_THREADCOUNT_INT_SYNC, -1);
        }
        int i17 = f253025i;
        if (i17 == -1) {
            int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
            f253025i = availableProcessors;
            int min = java.lang.Math.min(4, availableProcessors);
            f253025i = min;
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMgr", "ForwardMgr THREAD_COUNT from runtime %d, availableProcessors: %s", java.lang.Integer.valueOf(min), java.lang.Integer.valueOf(java.lang.Runtime.getRuntime().availableProcessors()));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMgr", "ForwardMgr THREAD_COUNT from config %d", java.lang.Integer.valueOf(i17));
        }
        int i18 = f253025i;
        this.f253026a = new com.tencent.mm.sdk.platformtools.n3[i18];
        com.tencent.mm.plugin.sight.base.SightVideoJNI.initScaleAndRoateBuffer(i18);
        int i19 = 0;
        while (true) {
            com.tencent.mm.sdk.platformtools.n3[] n3VarArr = this.f253026a;
            if (i19 >= n3VarArr.length) {
                this.f253032g = false;
                return;
            }
            n3VarArr[i19] = new com.tencent.mm.sdk.platformtools.n3("BigSightMediaCodecMP4MuxRecorder_FrameBufProcessMgr_" + i19);
            i19++;
        }
    }

    public final void a() {
        boolean z17;
        java.util.LinkedList linkedList = this.f253029d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMgr", "processBufList %d %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f253028c));
        while (linkedList.size() != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMgr", "loop processBufList %d %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f253028c));
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                ei3.g gVar = (ei3.g) it.next();
                int i17 = this.f253028c;
                if (i17 == gVar.f253046c) {
                    this.f253028c = i17 + 1;
                    ((ei3.a1) this.f253031f).a(gVar.f253045b);
                    linkedList.remove(gVar);
                    z17 = true;
                    break;
                }
            }
            if (!z17) {
                return;
            }
        }
    }

    public void b() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMgr", "stop FrameBufProcessMgr %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        int i17 = 0;
        while (true) {
            com.tencent.mm.sdk.platformtools.n3[] n3VarArr = this.f253026a;
            if (i17 >= n3VarArr.length) {
                com.tencent.mm.plugin.sight.base.SightVideoJNI.releaseScaleAndRoateBuffer(f253025i);
                this.f253032g = true;
                return;
            } else {
                com.tencent.mm.sdk.platformtools.n3 n3Var = n3VarArr[i17];
                if (n3Var != null) {
                    n3Var.getSerial().f457303b.g();
                    n3VarArr[i17] = null;
                }
                i17++;
            }
        }
    }

    public void finalize() {
        try {
            b();
        } catch (java.lang.Throwable unused) {
        }
        super.finalize();
    }
}
