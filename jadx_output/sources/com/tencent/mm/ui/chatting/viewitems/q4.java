package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q11.b f205312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.r4 f205314f;

    public q4(com.tencent.mm.ui.chatting.viewitems.r4 r4Var, q11.b bVar, java.lang.String str) {
        this.f205314f = r4Var;
        this.f205312d = bVar;
        this.f205313e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f205312d.f359534d == null || !this.f205313e.equals(this.f205314f.f205408c.f205487h.getTag(com.tencent.mm.R.id.nvv))) {
            return;
        }
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
        com.tencent.mm.ui.chatting.viewitems.r4 r4Var = this.f205314f;
        com.tencent.mm.ui.chatting.viewitems.s4 s4Var = r4Var.f205408c;
        java.lang.String str = s4Var.f205483d;
        android.graphics.Bitmap bitmap = this.f205312d.f359534d;
        int i17 = r4Var.f205406a;
        this.f205314f.f205408c.f205487h.setBackground(new android.graphics.drawable.BitmapDrawable(resources, com.tencent.mm.sdk.platformtools.x.p(com.tencent.mm.sdk.platformtools.x.k0(bitmap, r4Var.f205407b, i17, false), s4Var.f205486g ^ true ? com.tencent.mm.R.drawable.bgs : com.tencent.mm.R.drawable.bzy)));
    }
}
