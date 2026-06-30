package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class bp extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public int f133915d;

    /* renamed from: e, reason: collision with root package name */
    public int f133916e;

    /* renamed from: f, reason: collision with root package name */
    public td2.c f133917f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ka f133918g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.w2 f133919h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133915d = -1;
        this.f133916e = -1;
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = activity2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) activity2 : null;
        if (mMFragmentActivity != null) {
            P6(mMFragmentActivity);
        }
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.bp bpVar, int i17, int i18) {
        androidx.appcompat.app.AppCompatActivity activity = bpVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).U6(i18);
        if (U6 == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderMoreInterestDividerUIC", "hideMoreInterestBubble fail, get tabType:" + i18 + " fragment fail!");
            return;
        }
        androidx.lifecycle.c1 a17 = zVar.b(U6).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.d1 d1Var = (com.tencent.mm.plugin.finder.viewmodel.component.d1) a17;
        com.tencent.mm.plugin.finder.convert.qg qgVar = d1Var.f134062i;
        if (qgVar != null) {
            java.lang.String source = "Finder.FinderMoreInterestDividerUIC_" + i18 + '_' + i17;
            in5.s0 s0Var = d1Var.f134063m;
            kotlin.jvm.internal.o.g(source, "source");
            com.tencent.mars.xlog.Log.i("Finder.FeedFullMergedHeaderConvert", source + " hideMoreInterestDividerBubble,moreInterestBubbleView:" + qgVar.f104388p);
            com.tencent.mm.plugin.finder.view.FinderHomeTabMoreInterestDividerBubbleView finderHomeTabMoreInterestDividerBubbleView = qgVar.f104388p;
            if (finderHomeTabMoreInterestDividerBubbleView != null) {
                finderHomeTabMoreInterestDividerBubbleView.removeCallbacks(finderHomeTabMoreInterestDividerBubbleView.f131136d);
                finderHomeTabMoreInterestDividerBubbleView.setVisibility(8);
            }
            if (s0Var != null) {
                qgVar.r(s0Var, true, true);
            }
        }
    }

    public final void P6(final com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity) {
        td2.c cVar = this.f133917f;
        if (cVar != null) {
            mMFragmentActivity.mo133getLifecycle().c(cVar);
        }
        td2.c cVar2 = this.f133917f;
        if (cVar2 == null) {
            cVar2 = new td2.c() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderMoreInterestDividerUIC$bindLifeCycle$2
                @Override // td2.c
                public void onCreate(androidx.lifecycle.y var1) {
                    kotlin.jvm.internal.o.g(var1, "var1");
                }

                @Override // td2.c
                public void onDestroy(androidx.lifecycle.y var1) {
                    kotlin.jvm.internal.o.g(var1, "var1");
                    com.tencent.mm.plugin.finder.view.ka kaVar = com.tencent.mm.plugin.finder.viewmodel.component.bp.this.f133918g;
                    if (kaVar != null) {
                        com.tencent.mm.ui.MMFragmentActivity activity = mMFragmentActivity;
                        kotlin.jvm.internal.o.g(activity, "activity");
                        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133575o.remove(kaVar);
                    }
                }

                @Override // td2.c
                public void onPause(androidx.lifecycle.y var1) {
                    kotlin.jvm.internal.o.g(var1, "var1");
                }

                @Override // td2.c
                public void onResume(androidx.lifecycle.y var1) {
                    kotlin.jvm.internal.o.g(var1, "var1");
                }

                @Override // td2.c
                public void onStart(androidx.lifecycle.y var1) {
                    kotlin.jvm.internal.o.g(var1, "var1");
                }

                @Override // td2.c
                public void onStop(androidx.lifecycle.y var1) {
                    kotlin.jvm.internal.o.g(var1, "var1");
                    com.tencent.mm.plugin.finder.viewmodel.component.bp bpVar = com.tencent.mm.plugin.finder.viewmodel.component.bp.this;
                    com.tencent.mm.plugin.finder.viewmodel.component.bp.O6(bpVar, bpVar.f133916e, bpVar.f133915d);
                }
            };
        }
        this.f133917f = cVar2;
        mMFragmentActivity.mo133getLifecycle().a(cVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f133915d = -1;
        this.f133916e = -1;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) activity : null;
        if (mMFragmentActivity != null) {
            P6(mMFragmentActivity);
        }
    }
}
