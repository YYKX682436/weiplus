package fk1;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263264d;

    public a(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263264d = wAGameRecordShareUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI = this.f263264d;
        java.lang.String str = wAGameRecordShareUI.f90183f.f323303a;
        java.lang.String format = java.lang.String.format("https://game.weixin.qq.com/cgi-bin/h5/static/gamelife/localvideo.html?wechat_pkgid=gamelife_localvideo&wechat_immersive=1&immersivePageBgIsDark=1&tab_type=1&sub_tab_type=1&ssid=30&s_uia=1004&s_pid=2&s_cid=%s&game_tab_key=%s", java.util.Arrays.copyOf(new java.lang.Object[]{str, str}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI.T6(wAGameRecordShareUI, format);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$layoutButton$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
