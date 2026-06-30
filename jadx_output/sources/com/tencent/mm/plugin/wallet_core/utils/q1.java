package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class q1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.x1 f180970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.yt5 f180971e;

    public q1(com.tencent.mm.plugin.wallet_core.utils.x1 x1Var, r45.yt5 yt5Var) {
        this.f180970d = x1Var;
        this.f180971e = yt5Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        this.f180970d.a(this.f180971e, new java.lang.Object[0]);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }
}
