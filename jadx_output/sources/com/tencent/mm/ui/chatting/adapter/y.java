package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes12.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.z f198454d;

    public y(com.tencent.mm.ui.chatting.adapter.z zVar, com.tencent.mm.ui.chatting.adapter.a0 a0Var) {
        this.f198454d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.adapter.z zVar = this.f198454d;
        boolean z17 = !zVar.f198459h.isChecked();
        com.tencent.mm.ui.chatting.gallery.r4 r4Var = com.tencent.mm.ui.chatting.gallery.p4.f201265a;
        int f17 = r4Var.f();
        android.widget.CheckBox checkBox = zVar.f198459h;
        if (f17 < 9) {
            checkBox.setChecked(z17);
        } else if (!z17) {
            checkBox.setChecked(z17);
        }
        com.tencent.mm.ui.chatting.adapter.a0 a0Var = zVar.f198462n;
        if (a0Var.f198393p != null) {
            int intValue = ((java.lang.Integer) view.getTag()).intValue();
            com.tencent.mm.ui.chatting.adapter.w x17 = a0Var.x(intValue);
            com.tencent.mm.ui.chatting.presenter.g3 g3Var = (com.tencent.mm.ui.chatting.presenter.g3) a0Var.f198393p;
            g3Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[onCheck] isChecked :%s pos:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(intValue));
            com.tencent.mm.ui.chatting.presenter.n3 n3Var = g3Var.f202228a;
            if (!z17 || r4Var.f() < 9) {
                if (z17) {
                    r4Var.a(x17.f198447b);
                } else {
                    r4Var.e(x17.f198447b);
                }
                zb5.g gVar = n3Var.f202356d;
                int f18 = r4Var.f();
                com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI mediaHistoryGalleryUI = (com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI) gVar;
                mediaHistoryGalleryUI.setMMTitle(mediaHistoryGalleryUI.getString(com.tencent.mm.R.string.fjy, java.lang.Integer.valueOf(f18)));
                mediaHistoryGalleryUI.T6(f18);
            } else {
                android.content.Context context = n3Var.f202358f;
                dp.a.makeText(context, context.getResources().getString(com.tencent.mm.R.string.fjk, 9), 1).show();
                n3Var.f202361i.notifyItemChanged(intValue);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter$ViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
