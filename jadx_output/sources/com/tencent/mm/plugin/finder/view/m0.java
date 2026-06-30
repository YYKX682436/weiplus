package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class m0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f132624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.o0 f132625e;

    public m0(android.content.Context context, com.tencent.mm.plugin.finder.view.o0 o0Var) {
        this.f132624d = context;
        this.f132625e = o0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.content.Context context = this.f132624d;
            g4Var.d(9, context.getResources().getColor(com.tencent.mm.R.color.f478532ac), context.getResources().getString(com.tencent.mm.R.string.f491265mg1));
            com.tencent.mm.plugin.finder.view.j0 j0Var = com.tencent.mm.plugin.finder.view.q0.f132862a;
            android.content.Context context2 = this.f132624d;
            com.tencent.mm.plugin.finder.view.o0 o0Var = this.f132625e;
            if (j0Var.a(context2, o0Var.f132755f, o0Var.f132754e.getUserName(), false, null)) {
                g4Var.d(10, context.getResources().getColor(com.tencent.mm.R.color.f478532ac), context.getResources().getString(com.tencent.mm.R.string.ckg));
            }
        }
    }
}
