package yx2;

/* loaded from: classes2.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f467862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f467863e;

    public l(r45.mb4 mb4Var, android.widget.ImageView imageView) {
        this.f467862d = mb4Var;
        this.f467863e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        r45.mb4 item = this.f467862d;
        kotlin.jvm.internal.o.f(item, "$item");
        wo0.c b17 = e17.b(new mn2.u0(item, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null), g1Var.h(mn2.f1.f329953d));
        android.widget.ImageView imageView = this.f467863e;
        kotlin.jvm.internal.o.f(imageView, "$imageView");
        b17.c(imageView);
    }
}
