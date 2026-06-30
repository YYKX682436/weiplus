package qi3;

/* loaded from: classes12.dex */
public abstract class c implements qi3.b0, java.lang.Comparable {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f363674h = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f363675d = jz5.h.b(qi3.b.f363673d);

    /* renamed from: e, reason: collision with root package name */
    public final long f363676e;

    /* renamed from: f, reason: collision with root package name */
    public qi3.g0 f363677f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.flow.i2 f363678g;

    public c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend", i() + " init ");
        this.f363676e = android.os.SystemClock.elapsedRealtime();
        this.f363677f = qi3.g0.f363705d;
    }

    public static /* synthetic */ java.lang.Integer e(qi3.c cVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkMsgSendStop");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        return cVar.d(z17);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        qi3.c other = (qi3.c) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return i().compareTo(other.i());
    }

    public java.lang.Integer d(boolean z17) {
        if (!z17 || com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return this.f363677f == qi3.g0.f363713o ? -510001 : null;
        }
        return -520007;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof qi3.c) {
            return kotlin.jvm.internal.o.b(i(), ((qi3.c) obj).i());
        }
        return false;
    }

    public void f1() {
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2;
        qi3.e0 h17 = h();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend", "submitTaskEvent " + h17);
        qi3.g0 g0Var = h17.f363691a;
        qi3.g0 g0Var2 = qi3.g0.f363712n;
        qi3.x xVar = qi3.x.f363761a;
        if (g0Var == g0Var2 && (msgIdTalker2 = h17.f363697g) != null) {
            xVar.c(msgIdTalker2);
        }
        if (h17.f363691a == qi3.g0.f363713o && (msgIdTalker = h17.f363697g) != null) {
            xVar.c(msgIdTalker);
        }
        v65.i.b(((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).bj(), null, new qi3.a(this, h17, null), 1, null);
        jm.y yVar = (jm.y) ((qi3.y) i95.n0.c(qi3.y.class));
        yVar.getClass();
        v65.i.b(yVar.bj(), null, new jm.s(h17, yVar, null), 1, null);
    }

    public abstract qi3.e0 h();

    public int hashCode() {
        return super.hashCode();
    }

    public final java.lang.String i() {
        return (java.lang.String) this.f363675d.getValue();
    }

    @Override // qi3.b0
    public java.lang.String id() {
        return i();
    }

    public abstract boolean j();

    public abstract java.lang.Object k(kotlin.coroutines.Continuation continuation);

    public java.lang.Object l(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend", i() + " start to sendCgi, isBypSession=" + j());
        return j() ? k(continuation) : m(continuation);
    }

    public abstract java.lang.Object m(kotlin.coroutines.Continuation continuation);

    public final java.lang.Object n(kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend", i() + " finish");
        r(qi3.g0.f363712n);
        java.lang.Object A = A(continuation);
        return A == pz5.a.f359186d ? A : jz5.f0.f302826a;
    }

    public final void o() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend", i() + " prepare");
        r(qi3.g0.f363706e);
    }

    public final void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend", i() + " sendCgi");
        r(qi3.g0.f363710i);
    }

    public void r(qi3.g0 sendStatus) {
        kotlin.jvm.internal.o.g(sendStatus, "sendStatus");
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend", i() + " setSendState current:" + this.f363677f + " target:" + sendStatus);
        this.f363677f = sendStatus;
    }

    public final void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend", i() + " updateMsg");
        r(qi3.g0.f363711m);
    }

    public void t() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend", i() + " uploadAttach");
        r(qi3.g0.f363709h);
    }

    @Override // qi3.b0
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSend", i() + " cancel");
        r(qi3.g0.f363713o);
    }
}
