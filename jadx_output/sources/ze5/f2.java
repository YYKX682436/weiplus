package ze5;

/* loaded from: classes9.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f471915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.m f471916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f471917g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ot0.q f471918h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471919i;

    public f2(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.pluginsdk.model.app.d dVar, z01.m mVar, kotlin.jvm.internal.f0 f0Var, ot0.q qVar, yb5.d dVar2) {
        this.f471914d = f9Var;
        this.f471915e = dVar;
        this.f471916f = mVar;
        this.f471917g = f0Var;
        this.f471918h = qVar;
        this.f471919i = dVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgFileMvvm", "progressPB(msgId:" + this.f471914d.getMsgId() + ") click, status:" + this.f471915e.field_status + ", progressPB:" + this.f471916f.f469106t);
        if (!this.f471916f.f469106t) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f471917g.f310116d = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(this.f471914d, this.f471915e);
        int i17 = this.f471917g.f310116d;
        if (i17 != 100) {
            if (i17 != 101) {
                long j17 = this.f471915e.field_status;
                if (j17 == 105) {
                    if (c01.id.a() - this.f471915e.field_createTime < 432000000) {
                        com.tencent.mm.pluginsdk.model.app.k0.A(this.f471914d, this.f471918h.f348654f);
                        d35.i iVar = d35.i.f226347a;
                        com.tencent.mm.storage.f9 f9Var = this.f471914d;
                        ot0.q qVar = this.f471918h;
                        if (f9Var != null) {
                            ((ku5.t0) ku5.t0.f312615d).g(new ze5.a2(qVar, f9Var, 4));
                        }
                    } else {
                        yb5.d dVar = this.f471919i;
                        com.tencent.mm.storage.f9 f9Var2 = this.f471914d;
                        final ot0.q qVar2 = this.f471918h;
                        com.tencent.mm.pluginsdk.model.app.k0.P(dVar, f9Var2, com.tencent.mm.R.string.f490487wg, com.tencent.mm.R.string.f490484wd, new java.util.function.Consumer() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$n
                            @Override // java.util.function.Consumer
                            public final void accept(java.lang.Object obj) {
                                ot0.q qVar3 = ot0.q.this;
                                com.tencent.mm.storage.f9 f9Var3 = (com.tencent.mm.storage.f9) obj;
                                if (f9Var3 == null) {
                                    return;
                                }
                                ((ku5.t0) ku5.t0.f312615d).g(new ze5.a2(qVar3, f9Var3, 5));
                            }
                        });
                    }
                } else if (j17 == 102) {
                    ze5.g2.b(this.f471914d, this.f471918h.f348694p);
                } else if (sc5.i.f406581a.a(this.f471914d)) {
                    ze5.g2.d(this.f471914d, this.f471918h);
                } else {
                    com.tencent.mm.pluginsdk.model.app.k0.x(this.f471914d.getMsgId(), this.f471914d.Q0(), this.f471918h.f348654f);
                    d35.i.f226347a.d(this.f471914d);
                    ot0.q qVar3 = this.f471918h;
                    com.tencent.mm.storage.f9 f9Var3 = this.f471914d;
                    if (f9Var3 != null) {
                        ((ku5.t0) ku5.t0.f312615d).g(new ze5.a2(qVar3, f9Var3, 2));
                    }
                }
            }
        } else if (c01.id.a() - this.f471915e.field_createTime < 432000000) {
            pt0.e0 e0Var = pt0.f0.f358209b1;
            com.tencent.mm.storage.f9 k17 = e0Var.k(this.f471914d.Q0(), this.f471914d.getMsgId());
            if (k17 != null) {
                i95.m c17 = i95.n0.c(pt.g0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                pt.g0.Xb((pt.g0) c17, k17, null, 0, false, 8, null);
                e0Var.s(k17.Q0(), k17.getMsgId(), k17);
                java.lang.String str = this.f471918h.f348654f;
                com.tencent.mm.pluginsdk.model.app.d J0 = com.tencent.mm.pluginsdk.model.app.u5.wi().J0(k17.getMsgId(), k17.Q0());
                if (J0 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " getinfo failed: " + str);
                } else if (J0.field_status != 198) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "ERR:" + fp.k.c() + " get status failed: " + str + " status:" + J0.field_status);
                } else {
                    com.tencent.mm.pluginsdk.model.app.k0.m(true);
                    J0.field_status = 101;
                    J0.field_lastModifyTime = c01.id.e();
                    com.tencent.mm.pluginsdk.model.app.u5.wi().update(J0, new java.lang.String[0]);
                    dk5.w.f234966a.b(k17, "file_resend_attach_from_fail");
                }
                d35.i iVar2 = d35.i.f226347a;
                ((ku5.t0) ku5.t0.f312615d).g(new ze5.a2(this.f471918h, k17, 4));
            }
        } else {
            yb5.d dVar2 = this.f471919i;
            com.tencent.mm.storage.f9 f9Var4 = this.f471914d;
            final ot0.q qVar4 = this.f471918h;
            com.tencent.mm.pluginsdk.model.app.k0.P(dVar2, f9Var4, com.tencent.mm.R.string.f490486wf, com.tencent.mm.R.string.f490484wd, new java.util.function.Consumer() { // from class: com.tencent.mm.pluginsdk.model.app.k0$$n
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    ot0.q qVar32 = ot0.q.this;
                    com.tencent.mm.storage.f9 f9Var32 = (com.tencent.mm.storage.f9) obj;
                    if (f9Var32 == null) {
                        return;
                    }
                    ((ku5.t0) ku5.t0.f312615d).g(new ze5.a2(qVar32, f9Var32, 5));
                }
            });
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
