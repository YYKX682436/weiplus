package ze5;

/* loaded from: classes9.dex */
public abstract class c0 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f471862s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f471863t;

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (view == null || dVar == null || f9Var == null) {
            return false;
        }
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).aj("view_clk", f9Var, "ecs_kf_card_wa_native_app");
        k0("view_clk");
        return te5.t.f418749a.d(dVar, f9Var);
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (view == null || dVar == null || f9Var == null) {
            return;
        }
        db5.e1.A(dVar.g(), dVar.s().getString(com.tencent.mm.R.string.b5h), "", dVar.s().getString(com.tencent.mm.R.string.f490543y2), dVar.s().getString(com.tencent.mm.R.string.f490347sg), new ze5.z(f9Var, dVar), ze5.a0.f471806d);
    }

    @Override // ze5.w8
    public com.tencent.mm.mvvm.MvvmView d0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingContactCardTemplateViewNew(context, null, 0, 6, null);
    }

    @Override // ze5.w8, we5.b
    public void e(yb5.d ui6, rd5.d msgData, java.lang.String str, we5.y0 uiBlock) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g(uiBlock, "uiBlock");
        super.e(ui6, msgData, str, uiBlock);
        uiBlock.d(new ze5.y(this, ui6));
    }

    @Override // ze5.w8
    public void h0(ze5.n8 holder, yb5.d ui6, com.tencent.mm.storage.f9 msg, java.lang.String str) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.h0(holder, ui6, msg, str);
        this.f471862s = ui6;
        this.f471863t = msg;
        com.tencent.mm.mvvm.MvvmView mvvmView = holder.f472111c;
        if (mvvmView != null) {
            if (M()) {
                mvvmView.setBackgroundResource(com.tencent.mm.R.drawable.f481244ob);
                mvvmView.setForeground(mvvmView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481171me));
                mvvmView.setPadding(0, 0, i65.a.b(mvvmView.getContext(), 5), 0);
            } else {
                mvvmView.setBackgroundResource(com.tencent.mm.R.drawable.f481182mi);
                mvvmView.setForeground(mvvmView.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481145lu));
                mvvmView.setPadding(i65.a.b(mvvmView.getContext(), 5), 0, 0, 0);
            }
        }
        ((b00.a0) ((c00.u3) i95.n0.c(c00.u3.class))).a(holder.f472111c, msg, "ecs_kf_card_shop", -1);
        k0("view_exp");
    }

    @Override // ze5.w8
    public q31.p i0(yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        w05.h hVar = k17 != null ? (w05.h) k17.getCustom(k17.f432315e + 74) : null;
        c11.a aVar = new c11.a();
        if (hVar != null) {
            aVar.f37802f = hVar.w();
            aVar.f37806m = hVar.s();
            aVar.f37808o = hVar.u();
            aVar.f37801e = new ze5.b0(hVar);
        }
        return aVar;
    }

    public final void k0(java.lang.String str) {
        yb5.d dVar;
        java.lang.String p17;
        java.lang.String appId;
        w05.h hVar;
        com.tencent.mm.storage.f9 f9Var = this.f471863t;
        if (f9Var == null || (dVar = this.f471862s) == null) {
            return;
        }
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        s05.d dVar2 = k17 != null ? (s05.d) k17.getCustom(k17.f432315e + 39) : null;
        java.lang.Integer valueOf = dVar.D() ? java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(dVar.x())) : null;
        boolean D = dVar.D();
        java.lang.String x17 = dVar.x();
        v05.b k18 = cVar.k();
        e00.g.e(str, f9Var, D, x17, 9, (k18 == null || (hVar = (w05.h) k18.getCustom(k18.f432315e + 74)) == null) ? 0 : hVar.o(), (dVar2 == null || (appId = dVar2.getAppId()) == null) ? "" : appId, (dVar2 == null || (p17 = dVar2.p()) == null) ? "" : p17, valueOf, null);
    }
}
