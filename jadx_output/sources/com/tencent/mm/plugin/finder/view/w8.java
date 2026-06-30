package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class w8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderExtendActivityView f133287d;

    public w8(com.tencent.mm.plugin.finder.view.FinderExtendActivityView finderExtendActivityView) {
        this.f133287d = finderExtendActivityView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderExtendActivityView$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.e3 e3Var = com.tencent.mm.plugin.finder.report.e3.f125009a;
        com.tencent.mm.plugin.finder.view.FinderExtendActivityView finderExtendActivityView = this.f133287d;
        android.content.Context context = finderExtendActivityView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e3Var.a("1", xy2.c.e(context), new cl0.g().h("vst_id", finderExtendActivityView.getVstId()));
        switch (finderExtendActivityView.f131021m) {
            case 100:
                finderExtendActivityView.d();
                break;
            case 101:
            case 102:
                finderExtendActivityView.getClass();
                android.content.Intent intent = new android.content.Intent();
                finderExtendActivityView.setIntentParam(intent);
                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                android.content.Context context2 = finderExtendActivityView.getContext();
                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context2;
                i0Var.getClass();
                intent.setClass(mMActivity, com.tencent.mm.plugin.finder.ui.FinderActivityDescUI.class);
                intent.putExtra("key_activity_already_participate", false);
                mMActivity.startActivityForResult(intent, 20002);
                break;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderExtendActivityView$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
