package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes7.dex */
public final class f7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q7 f151130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f151131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f151132f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f151133g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f151134h;

    public f7(com.tencent.mm.plugin.mv.ui.uic.q7 q7Var, boolean z17, kotlin.jvm.internal.c0 c0Var, android.graphics.drawable.BitmapDrawable bitmapDrawable, java.lang.String str) {
        this.f151130d = q7Var;
        this.f151131e = z17;
        this.f151132f = c0Var;
        this.f151133g = bitmapDrawable;
        this.f151134h = str;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        com.tencent.mm.plugin.mv.ui.uic.q7 q7Var = this.f151130d;
        java.lang.String string = q7Var.getContext().getString(com.tencent.mm.R.string.f490559yh);
        int color = q7Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m);
        boolean z17 = this.f151131e;
        g4Var.j(101, string, com.tencent.mm.R.raw.finder_full_share, color, !z17);
        g4Var.j(102, q7Var.getContext().getString(com.tencent.mm.R.string.h4v), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, !z17);
        g4Var.j(103, q7Var.getContext().getString(com.tencent.mm.R.string.h3u), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0, !z17);
        g4Var.j(104, q7Var.getContext().getString(com.tencent.mm.R.string.h4w), com.tencent.mm.R.raw.state_icon_main, q7Var.getContext().getResources().getColor(com.tencent.mm.R.color.f478496g), !z17);
        if (!this.f151132f.f310112d || (bitmapDrawable = this.f151133g) == null) {
            return;
        }
        g4Var.n(105, this.f151134h, bitmapDrawable, 0);
    }
}
