package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.t4 f205485f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f205486g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205487h;

    public s4(java.lang.String str, java.lang.String str2, com.tencent.mm.ui.chatting.viewitems.t4 t4Var, boolean z17, android.view.View view) {
        this.f205483d = str;
        this.f205484e = str2;
        this.f205485f = t4Var;
        this.f205486g = z17;
        this.f205487h = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i(this.f205483d, "get background url: %s", this.f205484e);
        int height = this.f205485f.clickArea.getHeight();
        int width = this.f205485f.clickArea.getWidth();
        android.graphics.Bitmap e17 = n11.a.b().e(this.f205484e);
        if (e17 != null) {
            this.f205487h.setBackground(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x2.f193075e, com.tencent.mm.sdk.platformtools.x.p(com.tencent.mm.sdk.platformtools.x.k0(e17, width, height, false), true ^ this.f205486g ? com.tencent.mm.R.drawable.bgs : com.tencent.mm.R.drawable.bzy)));
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f342083g = g83.a.b();
        fVar.f342078b = true;
        fVar.f342077a = true;
        fVar.f342095s = false;
        fVar.f342086j = width;
        fVar.f342087k = height;
        o11.g a17 = fVar.a();
        this.f205487h.setTag(com.tencent.mm.R.id.nvv, this.f205484e);
        n11.a.b().k(this.f205484e, null, a17, null, new com.tencent.mm.ui.chatting.viewitems.r4(this, height, width));
    }
}
