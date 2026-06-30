package hq5;

/* loaded from: classes5.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.t0 f283254d;

    public o0(hq5.t0 t0Var) {
        this.f283254d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$onStateChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hq5.t0 t0Var = this.f283254d;
        com.tencent.mars.xlog.Log.i(t0Var.f283271d, "click selectFile");
        t0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(t0Var.getContext(), "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI");
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        intent.putExtra("file_max_size", t0Var.f283275h);
        if (t0Var.getContext() instanceof com.tencent.mm.ui.MMFragmentActivity) {
            intent.putExtra("is_use_vas", true);
            lk5.s.e(intent, true);
            android.app.Activity context = t0Var.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            ((com.tencent.mm.ui.bd) ((com.tencent.mm.ui.MMFragmentActivity) context).startActivityForResult(intent)).f197877a = new hq5.p0(t0Var);
        } else {
            android.app.Activity context2 = t0Var.getContext();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(t0Var.f283273f));
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k(context2, arrayList2.toArray(), "com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC", "selectFile", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/uic/ui/WeDropSelectFileUIC$onStateChange$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
