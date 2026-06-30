package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class rc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity f174249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListActivity textStatusLikeListActivity) {
        super(0);
        this.f174249d = textStatusLikeListActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f174249d.findViewById(com.tencent.mm.R.id.j8i);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) x4.b.a(findViewById, com.tencent.mm.R.id.kod);
        if (viewPager != null) {
            return new ui4.f(frameLayout, frameLayout, viewPager);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(com.tencent.mm.R.id.kod)));
    }
}
