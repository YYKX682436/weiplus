package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class y1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120400d;

    public y1(android.content.Context context) {
        this.f120400d = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f120400d;
        g4Var.d(0, context.getResources().getColor(com.tencent.mm.R.color.ad8), context.getString(com.tencent.mm.R.string.ooa));
        g4Var.d(1, context.getResources().getColor(com.tencent.mm.R.color.ad8), context.getString(com.tencent.mm.R.string.oo_));
    }
}
