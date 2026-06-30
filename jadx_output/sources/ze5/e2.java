package ze5;

/* loaded from: classes9.dex */
public final class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f471892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.m f471893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f471894g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ot0.q f471895h;

    public e2(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.pluginsdk.model.app.d dVar, z01.m mVar, kotlin.jvm.internal.f0 f0Var, ot0.q qVar) {
        this.f471891d = f9Var;
        this.f471892e = dVar;
        this.f471893f = mVar;
        this.f471894g = f0Var;
        this.f471895h = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("progressPB(msgId:");
        com.tencent.mm.storage.f9 f9Var = this.f471891d;
        sb6.append(f9Var.getMsgId());
        sb6.append(") click, status:");
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f471892e;
        sb6.append(dVar.field_status);
        sb6.append(", progressPB:");
        z01.m mVar = this.f471893f;
        sb6.append(mVar.f469106t);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgFileMvvm", sb6.toString());
        if (!mVar.f469106t) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int ij6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).ij(f9Var, dVar);
        kotlin.jvm.internal.f0 f0Var = this.f471894g;
        f0Var.f310116d = ij6;
        int i17 = f0Var.f310116d;
        ot0.q qVar = this.f471895h;
        if (i17 == 3) {
            com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(f9Var.Q0(), f9Var.getMsgId());
            i95.m c17 = i95.n0.c(pt.g0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            pt.g0.Xb((pt.g0) c17, this.f471891d, null, 0, false, 8, null);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), n17, true);
            ze5.g2.b(f9Var, qVar.f348694p);
        } else if (i17 != 4) {
            if (dVar.field_status == 102) {
                ze5.g2.b(f9Var, qVar.f348694p);
            } else {
                ze5.g2.d(f9Var, qVar);
                if (ez.v0.f257777a.i(java.lang.Integer.valueOf(qVar.f348666i))) {
                    long I0 = f9Var.I0();
                    rt0.b bVar = (rt0.b) qVar.y(rt0.b.class);
                    if (bVar != null) {
                        long j17 = bVar.f399372b;
                        if (j17 != 0) {
                            I0 = j17;
                        }
                    }
                    ct3.d.f222303a.a(f9Var, qVar, 15, I0);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemAppMsgFileMvvmKt$createFileViewModel$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
