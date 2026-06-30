package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes8.dex */
public class l1 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.m1 f162306a;

    public l1(com.tencent.mm.plugin.shake.ui.m1 m1Var) {
        this.f162306a = m1Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        if (i18 != -1) {
            return;
        }
        com.tencent.mm.autogen.events.DeleteFavoriteEvent deleteFavoriteEvent = new com.tencent.mm.autogen.events.DeleteFavoriteEvent();
        com.tencent.mm.plugin.shake.ui.m1 m1Var = this.f162306a;
        long longExtra = m1Var.f162309a.getIntent().getLongExtra("key_favorite_local_id", -1L);
        am.w3 w3Var = deleteFavoriteEvent.f54084g;
        w3Var.f8258a = longExtra;
        w3Var.f8260c = 8;
        deleteFavoriteEvent.e();
        long j17 = w3Var.f8258a;
        am.x3 x3Var = deleteFavoriteEvent.f54085h;
        boolean z17 = x3Var.f8343a;
        if (x3Var.f8343a) {
            m1Var.f162309a.finish();
        }
    }
}
