package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI f174418d;

    public x2(com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI statusAlbumUI) {
        this.f174418d = statusAlbumUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle;
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$initView$3$onLoadMoreEnd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent2 = new android.content.Intent();
        com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI statusAlbumUI = this.f174418d;
        androidx.fragment.app.FragmentActivity activity = statusAlbumUI.getActivity();
        if (activity == null || (intent = activity.getIntent()) == null || (bundle = intent.getExtras()) == null) {
            bundle = new android.os.Bundle();
        }
        android.content.Intent putExtras = intent2.putExtras(bundle);
        kotlin.jvm.internal.o.f(putExtras, "putExtras(...)");
        putExtras.putExtra("story_only", true);
        j45.l.j(statusAlbumUI.getContext(), "", "com.tencent.mm.ui.AlbumUI", putExtras, null);
        qj4.s.l(qj4.s.f363958a, 15L, null, null, 0L, null, 0L, 62, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/StatusAlbumUI$initView$3$onLoadMoreEnd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
