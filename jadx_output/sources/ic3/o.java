package ic3;

/* loaded from: classes12.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290415d;

    public o(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290415d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290415d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        xj.m Ui = ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ui(magicAdServiceDemoActivity.f147851e);
        if (Ui != null) {
            java.lang.String str2 = magicAdServiceDemoActivity.f147850d;
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "getAdInfo");
            java.lang.String str3 = Ui.f454753a;
            magicAdServiceDemoActivity.f147852f = str3;
            androidx.appcompat.app.AppCompatActivity context = magicAdServiceDemoActivity.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            magicAdServiceDemoActivity.f147853g = new ic3.f0(context, Ui.f454754b, str3);
            ((android.widget.FrameLayout) magicAdServiceDemoActivity.findViewById(com.tencent.mm.R.id.cg7)).addView(magicAdServiceDemoActivity.f147853g);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(magicAdServiceDemoActivity.f147850d, "adInfo is empty");
            com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "adInfo is empty");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
