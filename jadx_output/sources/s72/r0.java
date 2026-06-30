package s72;

/* loaded from: classes11.dex */
public final class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static s72.r0 f404143b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f404144a = new java.util.LinkedList();

    public static s72.r0 a() {
        if (f404143b == null) {
            synchronized (s72.r0.class) {
                if (f404143b == null) {
                    f404143b = new s72.r0();
                }
            }
        }
        return f404143b;
    }

    public void b() {
        synchronized (this.f404144a) {
            java.util.Iterator it = this.f404144a.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.ui.conversation.q) ((s72.q0) it.next())).h();
            }
        }
    }
}
