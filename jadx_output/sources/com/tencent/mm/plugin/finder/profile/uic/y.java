package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.o0 f124373d;

    public y(com.tencent.mm.plugin.finder.profile.uic.o0 o0Var) {
        this.f124373d = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.uic.o0 o0Var = this.f124373d;
        if (o0Var.getIntent().getBooleanExtra("key_is_from_slide", false)) {
            android.app.Activity context = o0Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).f124114q = 1;
            androidx.appcompat.app.AppCompatActivity activity = o0Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.vas.VASActivity");
            android.app.Activity parentActivity = ((com.tencent.mm.ui.vas.VASActivity) activity).getParentActivity();
            com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI finderHomeSlideProfileUI = parentActivity instanceof com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI ? (com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI) parentActivity : null;
            if (finderHomeSlideProfileUI != null) {
                com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView finderPagerView = (com.tencent.mm.plugin.finder.ui.slideprofile.FinderPagerView) finderHomeSlideProfileUI.findViewById(com.tencent.mm.R.id.u2u);
                if (finderHomeSlideProfileUI.f129826v == 1 && finderPagerView != null) {
                    finderPagerView.e();
                }
            }
        } else {
            androidx.appcompat.app.AppCompatActivity activity2 = o0Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((com.tencent.mm.plugin.finder.profile.uic.d6) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.profile.uic.d6.class)).getClass();
            o0Var.getActivity().finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileActionBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
