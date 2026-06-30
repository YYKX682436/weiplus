package com.tencent.mm.plugin.profile;

/* loaded from: classes.dex */
public final class l2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f153522d;

    public l2(android.content.Context context) {
        this.f153522d = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f153522d;
        g4Var.g(0, context.getResources().getString(com.tencent.mm.R.string.bd7), com.tencent.mm.R.raw.bottomsheet_icon_transmit);
        g4Var.g(1, context.getResources().getString(com.tencent.mm.R.string.f490359sr), com.tencent.mm.R.raw.bottomsheet_icon_moment);
    }
}
