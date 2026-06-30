package vw3;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f441187d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        super(0);
        this.f441187d = repairerBlockDetectUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("BlockDetect");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(h07, "BlockDetect_" + java.lang.System.currentTimeMillis() + ".txt");
        if (!h07.m()) {
            h07.J();
        }
        if (r6Var.m()) {
            r6Var.l();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = ix3.i.f295434j.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                java.lang.String o17 = r6Var.o();
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.f(sb7, "toString(...)");
                byte[] bytes = sb7.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                com.tencent.mm.vfs.w6.S(o17, bytes, 0, bytes.length);
                ex3.c cVar = ex3.c.f257206a;
                java.lang.String o18 = r6Var.o();
                kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
                cVar.a(this.f441187d, o18);
                return jz5.f0.f302826a;
            }
            ix3.c cVar2 = (ix3.c) it.next();
            sb6.append("========================================================\n");
            sb6.append("时间点: " + cVar2.f295371a + '(' + k35.m1.e(cVar2.f295371a) + ")\n");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Block时间: ");
            sb8.append(cVar2.f295372b);
            sb8.append("ms\n");
            sb6.append(sb8.toString());
            sb6.append("堆栈:\n");
            for (java.lang.StackTraceElement stackTraceElement : cVar2.f295373c) {
                sb6.append("    ");
                sb6.append(stackTraceElement.toString());
                sb6.append("\n");
            }
            sb6.append("\n\n");
        }
    }
}
