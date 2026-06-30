package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ai extends com.tencent.mm.ui.component.UIComponent implements zy2.t7 {

    /* renamed from: d, reason: collision with root package name */
    public gx2.q f133777d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.fragment.app.Fragment f133778e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f133779f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133779f = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public static gx2.q R6(com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar, androidx.fragment.app.Fragment fragment, android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.viewmodel.component.vh factory, int i17, java.lang.Object obj) {
        android.view.ViewGroup viewGroup2;
        boolean z17;
        hx2.i centerComponent;
        if ((i17 & 2) != 0) {
            viewGroup = null;
        }
        if ((i17 & 4) != 0) {
            factory = new com.tencent.mm.plugin.finder.viewmodel.component.vh();
        }
        aiVar.getClass();
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(factory, "factory");
        if (viewGroup == null) {
            android.view.View decorView = aiVar.getActivity().getWindow().getDecorView();
            viewGroup2 = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup2 == null) {
                return null;
            }
        } else {
            viewGroup2 = viewGroup;
        }
        gx2.q qVar = aiVar.f133777d;
        android.view.View a17 = (qVar == null || (centerComponent = qVar.getCenterComponent()) == null) ? null : centerComponent.a();
        android.view.ViewGroup viewGroup3 = a17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) a17 : null;
        if (viewGroup3 == null) {
            viewGroup3 = new android.widget.FrameLayout(aiVar.getContext());
            viewGroup3.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            viewGroup3.setId(com.tencent.mm.R.id.f484516eh4);
            viewGroup3.setBackgroundColor(viewGroup3.getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
            z17 = true;
        } else {
            z17 = false;
        }
        gx2.q qVar2 = aiVar.f133777d;
        if (qVar2 != null && z17) {
            qVar2.setCenterComponent(new hx2.c(viewGroup3));
        }
        if (aiVar.f133777d == null || viewGroup != null) {
            gx2.a aVar = new gx2.a();
            aVar.f277337c = factory.b(aiVar.getContext());
            hx2.i component = factory.a(aiVar.getContext());
            kotlin.jvm.internal.o.g(component, "component");
            aVar.f277338d = component;
            aVar.f277339e = new hx2.c(viewGroup3);
            aVar.a(new com.tencent.mm.plugin.finder.viewmodel.component.uh(aiVar));
            android.app.Activity context = aiVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            aVar.f277340f = new hx2.b(context, true);
            aiVar.f133777d = aVar.b(viewGroup2);
        }
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment ? (com.tencent.mm.ui.vas.VASCommonFragment) fragment : null;
        if (vASCommonFragment != null) {
            vASCommonFragment.q0(new com.tencent.mm.plugin.finder.viewmodel.component.yh(aiVar));
        }
        gx2.q qVar3 = aiVar.f133777d;
        if (qVar3 != null) {
            qVar3.setOnDrawerClose(new com.tencent.mm.plugin.finder.viewmodel.component.zh(aiVar));
        }
        viewGroup3.removeAllViews();
        androidx.fragment.app.i2 beginTransaction = aiVar.getActivity().getSupportFragmentManager().beginTransaction();
        beginTransaction.k(com.tencent.mm.R.id.f484516eh4, fragment, null);
        beginTransaction.f();
        aiVar.f133778e = fragment;
        return aiVar.f133777d;
    }

    public final void O6(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a onOpenDrawerListener) {
        kotlin.jvm.internal.o.g(onOpenDrawerListener, "onOpenDrawerListener");
        this.f133779f.add(onOpenDrawerListener);
    }

    public final void P6() {
        gx2.q qVar = this.f133777d;
        if (qVar != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, null, false, null, 15, null);
        }
    }

    public final gx2.q Q6(android.view.View customContent) {
        int i17;
        kotlin.jvm.internal.o.g(customContent, "customContent");
        android.view.View decorView = getActivity().getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup == null) {
            return null;
        }
        android.content.Context context = getContext();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        int c17 = com.tencent.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        float a17 = i17 * kx2.a.f313278a.a(getContext());
        gx2.q qVar = this.f133777d;
        if (qVar != null) {
            if (qVar != null) {
                qVar.setCenterComponent(new hx2.c(customContent));
            }
            gx2.q qVar2 = this.f133777d;
            if (qVar2 != null) {
                qVar2.setExpandHeight(a17);
            }
        }
        if (this.f133777d == null) {
            gx2.a aVar = new gx2.a();
            aVar.f277337c = a17;
            aVar.f277338d = new hx2.g(getContext(), 0, 0, 0, false, false, 62, null);
            aVar.f277339e = new hx2.c(customContent);
            aVar.a(new com.tencent.mm.plugin.finder.viewmodel.component.uh(this));
            aVar.f277340f = new hx2.b(getContext(), true);
            this.f133777d = aVar.b(viewGroup);
        }
        gx2.q qVar3 = this.f133777d;
        if (qVar3 != null) {
            qVar3.setOnDrawerClose(new com.tencent.mm.plugin.finder.viewmodel.component.wh(this));
        }
        gx2.q qVar4 = this.f133777d;
        if (qVar4 != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(qVar4, false, 1, null);
        }
        return this.f133777d;
    }

    public final void S6(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a onOpenDrawerListener) {
        kotlin.jvm.internal.o.g(onOpenDrawerListener, "onOpenDrawerListener");
        this.f133779f.remove(onOpenDrawerListener);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        gx2.q qVar = this.f133777d;
        if (!(qVar != null ? qVar.isDrawerOpen : false)) {
            return super.onBackPressed();
        }
        P6();
        return true;
    }
}
