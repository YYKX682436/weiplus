package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes3.dex */
public final class a7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f151030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q7 f151031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f151032f;

    public a7(o25.y1 y1Var, com.tencent.mm.plugin.mv.ui.uic.q7 q7Var, kotlin.jvm.internal.h0 h0Var) {
        this.f151030d = y1Var;
        this.f151031e = q7Var;
        this.f151032f = h0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.app.Activity context = this.f151031e.getContext();
        kotlin.jvm.internal.o.d(g4Var);
        ((com.tencent.mm.pluginsdk.forward.m) this.f151030d).wi(context, g4Var, (com.tencent.mm.ui.widget.dialog.k0) this.f151032f.f310123d);
    }
}
