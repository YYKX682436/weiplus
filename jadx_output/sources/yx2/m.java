package yx2;

/* loaded from: classes2.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f467864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f467865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView f467866f;

    public m(r45.mb4 mb4Var, android.widget.ImageView imageView, com.tencent.mm.plugin.finder.view.snscover.SnsFinderImageBackView snsFinderImageBackView) {
        this.f467864d = mb4Var;
        this.f467865e = imageView;
        this.f467866f = snsFinderImageBackView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.cover.preview.SnsCoverFadeImageView thumbView;
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d b17 = g1Var.b();
        r45.mb4 item = this.f467864d;
        kotlin.jvm.internal.o.f(item, "$item");
        wo0.c b18 = b17.b(new mn2.u0(item, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, 4, null), g1Var.h(mn2.f1.f329953d));
        android.widget.ImageView bgView = this.f467865e;
        kotlin.jvm.internal.o.f(bgView, "$bgView");
        b18.c(bgView);
        thumbView = this.f467866f.getThumbView();
        thumbView.setVisibility(8);
    }
}
