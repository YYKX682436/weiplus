package mx;

/* loaded from: classes11.dex */
public final class e extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public static final mx.a f331813x = new mx.a(null);

    public final void c0(com.tencent.pigeon.biz_base.BizMinimizeInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        y(26, f331813x.a(info.getUrl()));
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(info.getUserName());
        java.lang.String d17 = n07 != null ? n07.d() : null;
        r45.lr4 lr4Var = new r45.lr4();
        lr4Var.set(10, info.getUserName());
        lr4Var.set(1, info.getTitle());
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String userName = info.getUserName();
        ((sg3.a) v0Var).getClass();
        lr4Var.set(0, c01.a2.e(userName));
        lr4Var.set(2, d17);
        lr4Var.set(5, d17);
        lr4Var.set(7, java.lang.Boolean.FALSE);
        r45.k97 k97Var = new r45.k97();
        k97Var.set(2, info.getUrl());
        k97Var.set(1, info.getUrl());
        k97Var.set(13, 90);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new mx.c(lr4Var, info, this, k97Var.toByteArray(), null), 3, null);
    }

    public final void d0(bw5.v70 listenItem, boolean z17, android.graphics.Rect rect, android.graphics.Bitmap bitmap, yz5.l lVar) {
        r45.lr4 v07;
        ak3.c cVar;
        kotlin.jvm.internal.o.g(listenItem, "listenItem");
        y(24, listenItem.getListenId());
        if (rect != null && bitmap != null && (cVar = this.f300111d) != null) {
            ((ak3.i) cVar).s(rect, bitmap);
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        if (multiTaskInfo != null) {
            bw5.zo0 zo0Var = new bw5.zo0();
            zo0Var.f36074d = listenItem;
            zo0Var.f36075e[1] = true;
            multiTaskInfo.field_data = zo0Var.toByteArray();
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = this.f300077a;
        if (multiTaskInfo2 != null && (v07 = multiTaskInfo2.v0()) != null) {
            v07.set(1, listenItem.getTitle());
            v07.set(0, listenItem.c());
            v07.set(5, listenItem.d().b());
            v07.set(2, listenItem.f());
        }
        this.f300117j = new mx.d(lVar);
        V(!z17, 9, jk3.c.f300081e);
    }

    public final void e0(java.lang.String listenItemId, android.app.Activity activity) {
        kotlin.jvm.internal.o.g(listenItemId, "listenItemId");
        if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
            try {
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
                multiTaskInfo.field_id = listenItemId;
                multiTaskInfo.field_type = 24;
                if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo)) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.j0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    com.tencent.mm.plugin.multitask.j0.We((com.tencent.mm.plugin.multitask.j0) c17, listenItemId, 24, false, 4, null);
                    if (activity != null) {
                        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                        e4Var.d(com.tencent.mm.R.string.n5w);
                        e4Var.c();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizMultiTaskHelper", "removeStar Exception=" + e17);
            }
        }
    }
}
