package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class op implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI f161404d;

    public op(com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
        this.f161404d = unfamiliarContactDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f161404d;
        db5.e1.L(unfamiliarContactDetailUI.getContext(), true, unfamiliarContactDetailUI.getContext().getString(com.tencent.mm.R.string.k2t), unfamiliarContactDetailUI.getContext().getString(com.tencent.mm.R.string.f490961bd5), unfamiliarContactDetailUI.getContext().getString(com.tencent.mm.R.string.f490367t0), unfamiliarContactDetailUI.getContext().getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.setting.ui.setting.np(this), null, com.tencent.mm.R.color.f478622ch, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
