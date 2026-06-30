package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class mc extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f204570s;

    /* renamed from: t, reason: collision with root package name */
    public yb5.d f204571t;

    /* renamed from: u, reason: collision with root package name */
    public final e04.l f204572u;

    /* renamed from: v, reason: collision with root package name */
    public final e04.k f204573v;

    public mc() {
        ((jd0.s2) ((kd0.y2) i95.n0.c(kd0.y2.class))).getClass();
        this.f204572u = new e04.p();
        ((jd0.s2) ((kd0.y2) i95.n0.c(kd0.y2.class))).getClass();
        this.f204573v = new e04.f(null);
        this.f204570s = new com.tencent.mm.ui.chatting.viewitems.kc(this);
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean C() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488530w4);
        com.tencent.mm.ui.chatting.viewitems.lc lcVar = new com.tencent.mm.ui.chatting.viewitems.lc(this);
        lcVar.a(xgVar);
        xgVar.setTag(lcVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean N() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar == null) {
            return false;
        }
        g4Var.c(erVar.d(), 100, 0, view.getContext().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean b0() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        com.tencent.mm.storage.a9 a9Var;
        if (!te5.s1.f418747a.a() || f9Var == null || (a9Var = f9Var.f193927g2) == null) {
            return null;
        }
        return a9Var;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.tencent.mm.ui.chatting.view.ServiceNotifyHeaderView serviceNotifyHeaderView;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        this.f204571t = dVar;
        com.tencent.mm.ui.chatting.viewitems.lc lcVar = (com.tencent.mm.ui.chatting.viewitems.lc) g0Var;
        java.lang.String j17 = f9Var.j();
        if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
            return;
        }
        com.tencent.mm.plugin.scanner.model.OfflineScanContext a17 = com.tencent.mm.plugin.scanner.model.OfflineScanContext.CREATOR.a(j17);
        if (te5.s1.f418747a.a() && (serviceNotifyHeaderView = lcVar.f204453d) != null) {
            serviceNotifyHeaderView.a(dVar, f9Var, cm5.k.c(f9Var));
        }
        java.lang.String string = lcVar.f204451b.getResources().getString(com.tencent.mm.R.string.he9);
        long j18 = a17.f158766m;
        tb5.o0.d(dVar, f9Var, null, tb5.o0.b(string, j18), 1, false);
        a17.toString();
        android.widget.TextView textView = lcVar.f204451b;
        android.text.format.Time time = new android.text.format.Time();
        time.set(j18);
        textView.setText(java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.he6), k35.s.a("yyyy-MM-dd kk:mm", time).toString()));
        com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), lcVar, null);
        lcVar.clickArea.setTag(erVar);
        lcVar.clickArea.setOnLongClickListener(u(dVar));
        android.view.View view = lcVar.clickArea;
        android.view.View.OnClickListener onClickListener = this.f204570s;
        view.setOnClickListener(onClickListener);
        lcVar.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        lcVar.f204452c.setTag(erVar);
        lcVar.f204452c.setOnClickListener(onClickListener);
    }
}
