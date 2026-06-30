package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class am implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f131657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f131658e;

    public am(r45.mb4 mb4Var, android.widget.ImageView imageView) {
        this.f131657d = mb4Var;
        this.f131658e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d b17 = g1Var.b();
        r45.mb4 item = this.f131657d;
        kotlin.jvm.internal.o.f(item, "$item");
        wo0.c b18 = b17.b(new mn2.u0(item, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, 4, null), g1Var.h(mn2.f1.f329953d));
        android.widget.ImageView bgView = this.f131658e;
        kotlin.jvm.internal.o.f(bgView, "$bgView");
        b18.c(bgView);
    }
}
