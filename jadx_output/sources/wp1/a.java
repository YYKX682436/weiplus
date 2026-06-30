package wp1;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f448377a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Stack f448378b;

    public a(int i17, java.lang.String baseActivityName) {
        kotlin.jvm.internal.o.g(baseActivityName, "baseActivityName");
        this.f448377a = baseActivityName;
        this.f448378b = new java.util.Stack();
    }

    public final r45.f83 a() {
        java.util.Stack stack = this.f448378b;
        if (stack.isEmpty()) {
            return null;
        }
        return (r45.f83) stack.peek();
    }

    public final r45.f83 b(long j17, android.content.Intent intent) {
        java.util.Stack stack = this.f448378b;
        if (stack.isEmpty()) {
            return null;
        }
        r45.f83 f83Var = (r45.f83) stack.peek();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f83Var.f374086e);
        sb6.append(" out stack, size = ");
        sb6.append(stack.size() - 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStackManager", sb6.toString());
        vp1.i.f438889a.b0(f83Var, j17, intent);
        return (r45.f83) stack.pop();
    }

    public final void c(r45.f83 f83Var, long j17, android.content.Intent intent) {
        f83Var.f374096r = this.f448377a;
        java.util.Stack stack = this.f448378b;
        stack.push(f83Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStackManager", f83Var.f374086e + "  in stack, size = " + stack.size());
        vp1.i iVar = vp1.i.f438889a;
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "inStack [" + f83Var.f374086e + "] " + java.lang.Integer.valueOf(f83Var.f374090i));
        java.util.Iterator it = vp1.i.f438897i.iterator();
        while (it.hasNext()) {
            ((up1.a) it.next()).d(f83Var, intent, j17);
        }
    }
}
