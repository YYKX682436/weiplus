package kp1;

/* loaded from: classes3.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final void a(yz5.a task) {
        kotlin.jvm.internal.o.g(task, "task");
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            pm0.v.L("MicroMsg.AudioPanelTaskBarBaseView", true, new kp1.a(task));
        } else {
            task.invoke();
        }
    }
}
