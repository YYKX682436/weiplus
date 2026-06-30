package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes8.dex */
public class n0 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.o0 f159594a;

    public n0(com.tencent.mm.plugin.scanner.ui.o0 o0Var) {
        this.f159594a = o0Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        if (i18 != -1) {
            return;
        }
        com.tencent.mm.autogen.events.DeleteFavoriteEvent deleteFavoriteEvent = new com.tencent.mm.autogen.events.DeleteFavoriteEvent();
        com.tencent.mm.plugin.scanner.ui.o0 o0Var = this.f159594a;
        long longExtra = o0Var.f159599a.getIntent().getLongExtra("key_favorite_local_id", -1L);
        am.w3 w3Var = deleteFavoriteEvent.f54084g;
        w3Var.f8258a = longExtra;
        w3Var.f8260c = 10;
        deleteFavoriteEvent.e();
        long j17 = w3Var.f8258a;
        am.x3 x3Var = deleteFavoriteEvent.f54085h;
        boolean z17 = x3Var.f8343a;
        if (x3Var.f8343a) {
            o0Var.f159599a.finish();
        }
    }
}
