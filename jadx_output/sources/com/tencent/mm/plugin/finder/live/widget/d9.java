package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d9 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f118091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f118092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e9 f118093c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f118094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f118095e;

    public d9(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, com.tencent.mm.plugin.finder.live.widget.e9 e9Var, int i17, yz5.l lVar) {
        this.f118091a = arrayList;
        this.f118092b = arrayList2;
        this.f118093c = e9Var;
        this.f118094d = i17;
        this.f118095e = lVar;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public final void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.e9 e9Var = this.f118093c;
        if (z17) {
            try {
                java.util.ArrayList arrayList = this.f118091a;
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                int c07 = kz5.n0.c0(arrayList, (java.lang.CharSequence) obj);
                java.lang.Object obj3 = this.f118092b.get(c07);
                kotlin.jvm.internal.o.f(obj3, "get(...)");
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                int indexOf = ((java.util.List) obj3).indexOf((java.lang.CharSequence) obj2);
                int i17 = (c07 * 3600) + (indexOf * 60);
                com.tencent.mars.xlog.Log.i("FinderLiveChargeIncreaseDurationWidget", "chosen time:" + obj + ' ' + obj2 + ",firstChosenIndex:" + c07 + ",secChosenIndex:" + indexOf + ",duration:" + i17 + ",preview_type:" + e9Var.a().getInteger(0));
                if (i17 <= this.f118094d) {
                    android.content.Context context = e9Var.f118237a;
                    db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.f491491d92));
                    return;
                }
                com.tencent.mm.ui.widget.picker.c0 c0Var = e9Var.f118240d;
                if (c0Var != null) {
                    c0Var.d();
                }
                if (e9Var.a().getInteger(0) == 2) {
                    e9Var.a().set(2, java.lang.Integer.valueOf(i17));
                } else {
                    e9Var.a().set(1, java.lang.Integer.valueOf(i17));
                }
                this.f118095e.invoke(java.lang.Integer.valueOf(i17));
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.ui.widget.picker.c0 c0Var2 = e9Var.f118240d;
                if (c0Var2 != null) {
                    c0Var2.d();
                }
                com.tencent.mars.xlog.Log.i("FinderLiveChargeIncreaseDurationWidget", th6.getMessage());
            }
        }
    }
}
