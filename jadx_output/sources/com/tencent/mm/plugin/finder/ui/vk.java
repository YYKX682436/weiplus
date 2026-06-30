package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class vk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderWxMsgUI f129963d;

    public vk(com.tencent.mm.plugin.finder.ui.FinderWxMsgUI finderWxMsgUI) {
        this.f129963d = finderWxMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderWxMsgUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_wx_msg_settings_scene", true);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        androidx.appcompat.app.AppCompatActivity context = this.f129963d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.Uj(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderWxMsgUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
