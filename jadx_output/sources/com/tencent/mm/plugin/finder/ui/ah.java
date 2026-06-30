package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class ah implements com.tencent.mm.ui.base.preference.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f128863a;

    public ah(ya2.b2 b2Var) {
        this.f128863a = b2Var;
    }

    public final void a(java.lang.String str, android.widget.ImageView imageView, boolean z17) {
        ya2.b2 b2Var = this.f128863a;
        if (b2Var == null) {
            com.tencent.mars.xlog.Log.e("FinderSettingInfoUI", "error self contact is null");
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        kotlin.jvm.internal.o.d(b2Var);
        mn2.n nVar = new mn2.n(b2Var.field_avatarUrl, null, 2, null);
        kotlin.jvm.internal.o.d(imageView);
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
    }
}
