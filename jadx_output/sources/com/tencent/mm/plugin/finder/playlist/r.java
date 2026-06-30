package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class r implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f122410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f122412f;

    public r(o25.y1 y1Var, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f122410d = y1Var;
        this.f122411e = context;
        this.f122412f = k0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        kotlin.jvm.internal.o.d(g4Var);
        ((com.tencent.mm.pluginsdk.forward.m) this.f122410d).wi(this.f122411e, g4Var, this.f122412f);
    }
}
