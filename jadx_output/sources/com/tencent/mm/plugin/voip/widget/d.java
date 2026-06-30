package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.InviteRemindDialog f177132d;

    public d(com.tencent.mm.plugin.voip.widget.InviteRemindDialog inviteRemindDialog) {
        this.f177132d = inviteRemindDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/voip/widget/InviteRemindDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f177132d.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/voip/widget/InviteRemindDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
