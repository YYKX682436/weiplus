package ex3;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ex3.c f257206a = new ex3.c();

    public final void a(android.content.Context context, java.lang.String filePath) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        if (!com.tencent.mm.vfs.w6.j(filePath)) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = "文件不存在";
            e4Var.c();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Repairer.RepairerInnerLogic", "sendFile ".concat(filePath));
        ec5.a aVar = new ec5.a();
        aVar.l(filePath);
        n13.r rVar = new n13.r();
        rVar.f334117a = true;
        if (!(context instanceof android.app.Activity)) {
            rVar.f334128l = new ex3.b();
        }
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(context, aVar, rVar);
    }
}
