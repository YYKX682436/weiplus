package eh0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f252873a = new java.util.concurrent.ConcurrentHashMap();

    public final void a(java.lang.String talker, long j17, long j18, java.lang.String deltaText) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(deltaText, "deltaText");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.f252873a.get(talker);
        if (copyOnWriteArrayList == null) {
            return;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((com.tencent.mm.ui.chatting.component.qp) ((dh0.i) it.next())).q0(talker, j17, j18, deltaText);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeClawStream.StreamListenerManager", e17, "notifyResultContentDelta error", new java.lang.Object[0]);
            }
        }
    }

    public final void b(java.lang.String talker, long j17, long j18, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(talker, "talker");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.f252873a.get(talker);
        if (copyOnWriteArrayList == null) {
            return;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((com.tencent.mm.ui.chatting.component.qp) ((dh0.i) it.next())).s0(talker, j17, j18, i17, str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeClawStream.StreamListenerManager", e17, "notifyStreamError error", new java.lang.Object[0]);
            }
        }
    }

    public final void c(java.lang.String talker, long j17, long j18, java.lang.String streamText) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(streamText, "streamText");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) this.f252873a.get(talker);
        if (copyOnWriteArrayList == null) {
            return;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            try {
                ((com.tencent.mm.ui.chatting.component.qp) ((dh0.i) it.next())).t0(talker, j17, j18, streamText);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeClawStream.StreamListenerManager", e17, "notifyThinkingDelta error", new java.lang.Object[0]);
            }
        }
    }
}
