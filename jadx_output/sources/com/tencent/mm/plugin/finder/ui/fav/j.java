package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes.dex */
public final class j implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.p f129177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f129178e;

    public j(com.tencent.mm.plugin.finder.ui.fav.p pVar, android.content.Context context) {
        this.f129177d = pVar;
        this.f129178e = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            int i17 = this.f129177d.f129200n;
            android.content.Context context = this.f129178e;
            g4Var.d(i17, context.getResources().getColor(com.tencent.mm.R.color.f478532ac), context.getResources().getString(com.tencent.mm.R.string.f490367t0));
        }
    }
}
