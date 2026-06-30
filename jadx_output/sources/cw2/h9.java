package cw2;

/* loaded from: classes.dex */
public final class h9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223756d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        super(0);
        this.f223756d = finderVideoLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f223756d.findViewById(com.tencent.mm.R.id.f487556oz4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderVideoLayout$videoTypeIv$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$videoTypeIv$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return findViewById;
    }
}
