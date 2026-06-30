package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class d5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.l5 f187156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ck f187157e;

    public d5(com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var, r45.ck ckVar) {
        this.f187156d = l5Var;
        this.f187157e = ckVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$BizCommentViewHolder$update$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var = this.f187156d;
        l5Var.f187384f.s(3);
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = l5Var.f187384f;
        l5Var.getClass();
        r45.ck info = this.f187157e;
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String str = info.f371605i;
        r45.r60 r60Var = info.f371610q;
        if (r60Var != null && !com.tencent.mm.sdk.platformtools.t8.L0(r60Var.f384569d)) {
            int size = info.f371610q.f384569d.size() - 1;
            while (true) {
                if (-1 >= size) {
                    break;
                }
                if (((r45.q60) info.f371610q.f384569d.get(size)).f383709o == 0) {
                    str = ((r45.q60) info.f371610q.f384569d.get(size)).f383701d;
                    break;
                }
                size--;
            }
        }
        kotlin.jvm.internal.o.d(str);
        z5Var.w(str, info.f371601e, true);
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/MPWriteCommentLayout$MPMyCommentItemAdapter$BizCommentViewHolder$update$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
