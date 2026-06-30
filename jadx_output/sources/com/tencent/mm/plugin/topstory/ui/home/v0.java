package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class v0 implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175090a;

    public v0(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        this.f175090a = jVar;
    }

    @Override // q80.s
    public void a(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "[TopStoryLiteApp]start video lite app view success");
        boolean z17 = view instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView;
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175090a;
        if (z17) {
            jVar.F = ((com.tencent.liteapp.ui.WxaLiteAppBaseView) view).getAppUuid();
        }
        jVar.C = true;
        jVar.D = false;
        android.view.View view2 = jVar.B;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$6", ya.b.SUCCESS, "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$6", ya.b.SUCCESS, "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // q80.s
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "[TopStoryLiteApp]start video lite app view fail");
        com.tencent.mm.plugin.topstory.ui.home.j jVar = this.f175090a;
        jVar.C = false;
        jVar.D = false;
    }
}
