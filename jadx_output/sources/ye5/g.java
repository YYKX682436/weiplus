package ye5;

/* loaded from: classes9.dex */
public final class g extends ye5.a implements qd5.h {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f461253s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        ye5.k0.d(ye5.l0.f461271a, item, ui6, msgData);
        return false;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        yb5.d dVar = this.f461253s;
        if (dVar == null) {
            return false;
        }
        ye5.k0.c(ye5.l0.f461271a, menu, v17, msgData, dVar);
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void S(yb5.d dVar, rd5.d dVar2) {
        if (dVar2 instanceof qd5.i) {
            qd5.i iVar = (qd5.i) dVar2;
            if (g95.e0.j(iVar.f394254d.f445300b)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupItem", "ChattingItemMediaGroupItemFrom onMsgExposed, msg is expired, skip download");
            } else {
                te5.d.f418622a.a(iVar.f394254d.f445300b, new ye5.f(dVar, dVar2));
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
    }

    @Override // ze5.w8
    public com.tencent.mm.mvvm.MvvmView d0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return ((bf5.a) ((q31.t) ((q31.r) c17)).Ai()).m(context);
    }

    @Override // ze5.w8
    public java.util.List e0(ze5.n8 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return kz5.b0.c(ze5.y8.a(ye5.t.f461283d, ye5.x.f461288d, ye5.y.f461289d));
    }

    @Override // ze5.w8
    public java.util.List f0(ze5.n8 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return kz5.b0.c(ze5.y8.a(ye5.h0.f461260d, new ye5.i0(holder, this), ye5.j0.f461266d));
    }

    @Override // qd5.h
    public qd5.f g(rd5.d msgData) {
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return new ye5.a0(msgData);
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f461253s = ui6;
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        return ye5.k0.a(ye5.l0.f461271a, ui6, msgData, this);
    }
}
