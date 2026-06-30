package ix3;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.e0 f295367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ix3.e0 e0Var) {
        super(0);
        this.f295367d = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("BlockDetect");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(h07, "BlockDetectSingle_" + java.lang.System.currentTimeMillis() + ".txt");
        if (!h07.m()) {
            h07.J();
        }
        if (r6Var.m()) {
            r6Var.l();
        }
        ix3.e0 e0Var = this.f295367d;
        java.lang.String stringExtra = e0Var.getIntent().getStringExtra("TraceInfo");
        java.lang.String o17 = r6Var.o();
        byte[] bytes = java.lang.String.valueOf(stringExtra).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        com.tencent.mm.vfs.w6.S(o17, bytes, 0, bytes.length);
        ex3.c cVar = ex3.c.f257206a;
        androidx.appcompat.app.AppCompatActivity activity = e0Var.getActivity();
        java.lang.String o18 = r6Var.o();
        kotlin.jvm.internal.o.f(o18, "getAbsolutePath(...)");
        cVar.a(activity, o18);
        return jz5.f0.f302826a;
    }
}
