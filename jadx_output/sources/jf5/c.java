package jf5;

/* loaded from: classes9.dex */
public final class c implements jf5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f299440a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f299441b;

    public c(yb5.d ui6, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f299440a = ui6;
        this.f299441b = msg;
    }

    @Override // jf5.m0
    public void a(java.lang.String selectedText) {
        kotlin.jvm.internal.o.g(selectedText, "selectedText");
        com.tencent.mm.sdk.platformtools.b0.e(selectedText);
        yb5.d dVar = this.f299440a;
        android.app.Activity g17 = dVar.g();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(g17);
        e4Var.f211776c = dVar.g().getString(com.tencent.mm.R.string.f490361st);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.f211779f = false;
        e4Var.c();
    }

    @Override // jf5.m0
    public boolean b(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout host) {
        kotlin.jvm.internal.o.g(host, "host");
        return !c01.ia.A(this.f299441b);
    }

    @Override // jf5.m0
    public boolean c(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout host) {
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mm.storage.f9 f9Var = this.f299441b;
        return (c01.ia.A(f9Var) || c01.ia.x(f9Var)) ? false : true;
    }

    @Override // jf5.m0
    public boolean d(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout host) {
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mm.storage.f9 f9Var = this.f299441b;
        return (c01.ia.A(f9Var) || c01.ia.x(f9Var)) ? false : true;
    }

    @Override // jf5.m0
    public boolean e(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout host) {
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mm.storage.f9 f9Var = this.f299441b;
        return (c01.ia.A(f9Var) || c01.ia.x(f9Var)) ? false : true;
    }

    @Override // jf5.m0
    public void f(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout host, java.lang.String selectedText) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(selectedText, "selectedText");
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            return;
        }
        java.lang.String str = "65_" + c01.id.c();
        su4.j2 j2Var = new su4.j2();
        j2Var.f412938a = this.f299440a.g();
        j2Var.f412939b = 65;
        j2Var.f412941d = selectedText;
        j2Var.f412942e = str;
        j2Var.f412943f = true;
        j2Var.f412946i = false;
        j2Var.f412953p = true;
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }

    @Override // jf5.m0
    public void g(java.lang.String selectedText) {
        kotlin.jvm.internal.o.g(selectedText, "selectedText");
        jf5.b bVar = new jf5.b(this, selectedText);
        android.app.Activity g17 = this.f299440a.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        com.tencent.mm.ui.chatting.manager.t.a(this.f299441b, g17, bVar);
    }

    @Override // jf5.m0
    public void h(java.lang.String selectedText) {
        kotlin.jvm.internal.o.g(selectedText, "selectedText");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, selectedText, 1);
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f299440a.f460717l;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6324j = baseChattingUIFragment;
        c4Var.f6327m = 43;
        r45.bq0 bq0Var = c4Var.f6315a;
        r45.jq0 jq0Var = bq0Var != null ? bq0Var.f370962d : null;
        if (jq0Var != null) {
            java.lang.String r17 = c01.z1.r();
            com.tencent.mm.storage.f9 f9Var = this.f299441b;
            if (f9Var.A0() == 1) {
                jq0Var.e(r17);
                jq0Var.j(f9Var.Q0());
            } else {
                jq0Var.e(f9Var.Q0());
                jq0Var.j(r17);
            }
            doFavoriteEvent.e();
        }
    }
}
