package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class s0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f185819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f185820e;

    public s0(android.content.Context context, int i17) {
        this.f185819d = context;
        this.f185820e = i17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f185819d;
        g4Var.l(1, context.getString(com.tencent.mm.R.string.hr_), com.tencent.mm.R.raw.bottomsheet_icon_transmit, false);
        if (com.tencent.mm.pluginsdk.ui.tools.e9.l()) {
            g4Var.l(2, context.getString(com.tencent.mm.R.string.hra), com.tencent.mm.R.raw.bottomsheet_icon_moment, false);
        }
        int i17 = this.f185820e;
        if (2 == i17 || 5 == i17) {
            return;
        }
        g4Var.l(0, context.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, false);
    }
}
