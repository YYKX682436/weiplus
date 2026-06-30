package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class zd implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f174490d;

    public zd(android.content.Context context) {
        this.f174490d = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f174490d;
        g4Var.f(1, i65.a.r(context, com.tencent.mm.R.string.ome));
        g4Var.f(2, i65.a.r(context, com.tencent.mm.R.string.lp_));
    }
}
