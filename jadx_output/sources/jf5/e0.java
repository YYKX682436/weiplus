package jf5;

/* loaded from: classes9.dex */
public final class e0 implements jf5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f299449a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f299450b;

    public e0(android.app.Activity activity, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f299449a = activity;
        this.f299450b = msg;
    }

    @Override // jf5.m0
    public void a(java.lang.String selectedText) {
        kotlin.jvm.internal.o.g(selectedText, "selectedText");
        com.tencent.mm.sdk.platformtools.b0.e(selectedText);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        android.app.Activity activity = this.f299449a;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
        e4Var.f211776c = activity.getString(com.tencent.mm.R.string.f490361st);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.f211779f = false;
        e4Var.c();
    }

    @Override // jf5.m0
    public boolean b(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout host) {
        kotlin.jvm.internal.o.g(host, "host");
        return !c01.ia.A(this.f299450b);
    }

    @Override // jf5.m0
    public boolean c(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout host) {
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mm.storage.f9 f9Var = this.f299450b;
        return (c01.ia.A(f9Var) || c01.ia.x(f9Var)) ? false : true;
    }

    @Override // jf5.m0
    public boolean d(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout host) {
        kotlin.jvm.internal.o.g(host, "host");
        com.tencent.mm.storage.f9 f9Var = this.f299450b;
        return (c01.ia.A(f9Var) || c01.ia.x(f9Var)) ? false : true;
    }

    @Override // jf5.m0
    public void f(com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout host, java.lang.String selectedText) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(selectedText, "selectedText");
        android.app.Activity activity = this.f299449a;
        com.tencent.mm.storage.f9 f9Var = this.f299450b;
        te5.x0.b(activity, selectedText, f9Var.Q0(), com.tencent.mm.sdk.platformtools.t8.u1(f9Var.V1(), f9Var.Q0()), f9Var.I0(), 4, host.p());
    }

    @Override // jf5.m0
    public void g(java.lang.String selectedText) {
        kotlin.jvm.internal.o.g(selectedText, "selectedText");
        com.tencent.mm.ui.chatting.manager.t.a(this.f299450b, this.f299449a, new jf5.d0(this, selectedText));
    }

    @Override // jf5.m0
    public void h(java.lang.String selectedText) {
        kotlin.jvm.internal.o.g(selectedText, "selectedText");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.pluginsdk.model.a2.m(doFavoriteEvent, selectedText, 1);
        android.app.Activity activity = this.f299449a;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6323i = activity;
        c4Var.f6327m = 43;
        r45.bq0 bq0Var = c4Var.f6315a;
        r45.jq0 jq0Var = bq0Var != null ? bq0Var.f370962d : null;
        if (jq0Var != null) {
            jq0Var.e(c01.z1.r());
            jq0Var.j(this.f299450b.Q0());
            doFavoriteEvent.e();
        }
    }
}
