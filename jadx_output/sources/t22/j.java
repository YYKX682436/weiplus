package t22;

/* loaded from: classes10.dex */
public final class j implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t22.l f415091a;

    public j(t22.l lVar) {
        this.f415091a = lVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        u85.o task = (u85.o) dVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mm.sticker.loader.StickerLoadInfo stickerLoadInfo = task.f425719f;
        java.lang.String str = stickerLoadInfo.f193694i;
        t22.l lVar = this.f415091a;
        if (kotlin.jvm.internal.o.b(str, lVar.f415094b)) {
            com.tencent.mars.xlog.Log.i(lVar.f415096d, "onLoaderFin: " + status + ' ' + lVar.f415097e);
            if (lVar.f415097e) {
                return;
            }
            fp0.u uVar = fp0.u.f265290f;
            android.content.Context context = lVar.f415093a;
            if (status == uVar) {
                lVar.f415095c.a(false);
                lVar.f415098f.dismiss();
                o22.i.a(context);
                u85.i.f425707a.f(lVar.f415099g);
                return;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            int i17 = stickerLoadInfo.f193695m;
            if (i17 == 1 || i17 == 2) {
                u1Var.g(context.getResources().getString(com.tencent.mm.R.string.f493281jk4));
                u1Var.m(com.tencent.mm.R.string.f490544y3);
                u1Var.j(context.getString(com.tencent.mm.R.string.f490347sg));
                u1Var.l(new t22.f(lVar));
                u1Var.i(new t22.g(lVar));
            } else if (i17 == 4) {
                u1Var.g(context.getResources().getString(com.tencent.mm.R.string.jk6));
                u1Var.m(com.tencent.mm.R.string.f490507x1);
                u1Var.l(new t22.h(lVar));
            } else if (i17 == 5) {
                u1Var.g(context.getResources().getString(com.tencent.mm.R.string.f493282jk5));
                u1Var.m(com.tencent.mm.R.string.f490507x1);
                u1Var.l(new t22.i(lVar));
            }
            u1Var.q(false);
        }
    }
}
