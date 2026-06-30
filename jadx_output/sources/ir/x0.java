package ir;

/* loaded from: classes7.dex */
public final class x0 implements im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f293913d = new java.util.LinkedList();

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PanelLifeCycle", "clear: ");
        java.util.LinkedList linkedList = this.f293913d;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).dead();
        }
        linkedList.clear();
    }

    @Override // im5.b
    public void keep(im5.a iLifeCycle) {
        kotlin.jvm.internal.o.g(iLifeCycle, "iLifeCycle");
        com.tencent.mars.xlog.Log.i("MicroMsg.PanelLifeCycle", "keep: " + iLifeCycle);
        java.util.LinkedList linkedList = this.f293913d;
        if (linkedList.contains(iLifeCycle)) {
            return;
        }
        linkedList.add(iLifeCycle);
    }
}
