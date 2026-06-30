package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class l40 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f135021d;

    public l40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        this.f135021d = f50Var;
    }

    public static final void a(android.content.Intent intent, com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        intent.putExtra("finder_username", f50Var.f134338d);
        intent.putExtra("KEY_FINDER_SELF_FLAG", true);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_enter_profile_type", 199993);
        intent.putExtra("KEY_CAN_USE_SELF_CLUB_USERNAME", true);
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, f50Var.getActivity(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("ProfileEntrance", new int[]{32});
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(f50Var.getActivity(), intent);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderAccountAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        ya2.g gVar = ya2.h.f460484a;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f135021d;
        ya2.b2 b17 = gVar.b(xy2.c.e(f50Var.getContext()));
        kotlin.jvm.internal.o.d(b17);
        if (b17.G0()) {
            intent.setClass(f50Var.getActivity(), com.tencent.mm.plugin.finder.ui.FinderExposeUI.class);
            androidx.appcompat.app.AppCompatActivity activity = f50Var.getActivity();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderAccountAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderAccountAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            m92.i X4 = g92.b.f269769e.X4(f50Var.f134338d);
            jz5.f0 f0Var = null;
            if (X4 != null) {
                if (X4.f324987a == 1) {
                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Mj(f50Var.getActivity(), f50Var.f134338d);
                    f50Var.f134339e = null;
                } else {
                    a(intent, f50Var);
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                a(intent, f50Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$normalOrAbNomalUi$finderAccountAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
