package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes11.dex */
public final class r implements bi4.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f173362a;

    public r(android.content.Context context) {
        this.f173362a = context;
    }

    @Override // bi4.m0
    public final void a(int i17, java.lang.Object obj) {
        if (i17 == 6) {
            com.tencent.mm.plugin.textstatus.ui.h4 h4Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
            java.lang.String a17 = en1.a.a();
            android.view.View view = (android.view.View) obj;
            android.content.Context context = this.f173362a;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.textstatus.ui.h4.b(h4Var, context, a17, 1002, "SCENE_DEFAULT", null, view, "VALUE_EXIT_CARD_ANIM_CARD_STYLE", null, 128, null);
            mj4.h M = ai4.m0.f5173a.M(en1.a.a());
            if (M != null) {
                com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI.f173626i.a(context, ((mj4.k) M).l());
            }
        }
    }
}
