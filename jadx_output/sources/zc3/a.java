package zc3;

/* loaded from: classes7.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.demo.ui.MagicBaseDemoActivity f471408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471409e;

    public a(com.tencent.mm.plugin.magicbrush.demo.ui.MagicBaseDemoActivity magicBaseDemoActivity, java.lang.String str) {
        this.f471408d = magicBaseDemoActivity;
        this.f471409e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zc3.c cVar;
        zc3.c cVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/demo/ui/MagicBaseDemoActivity$initEnv$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.magicbrush.demo.ui.MagicBaseDemoActivity.f147916f;
        com.tencent.mm.plugin.magicbrush.demo.ui.MagicBaseDemoActivity magicBaseDemoActivity = this.f471408d;
        magicBaseDemoActivity.getClass();
        java.lang.String str = this.f471409e;
        switch (str.hashCode()) {
            case -318476791:
                if (str.equals("preload")) {
                    com.tencent.mars.xlog.Log.i("MagicSimpleDemo", "preload");
                    magicBaseDemoActivity.T6().a();
                    break;
                }
                break;
            case 3529469:
                if (str.equals("show") && (cVar = magicBaseDemoActivity.f147917d) != null) {
                    cVar.show();
                    break;
                }
                break;
            case 3540994:
                if (str.equals("stop") && (cVar2 = magicBaseDemoActivity.f147917d) != null) {
                    cVar2.stop();
                    ((android.widget.FrameLayout) magicBaseDemoActivity.findViewById(com.tencent.mm.R.id.p1c)).removeView(magicBaseDemoActivity.f147918e);
                    magicBaseDemoActivity.f147918e = null;
                    magicBaseDemoActivity.f147917d = null;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start") && magicBaseDemoActivity.f147917d == null) {
                    com.tencent.mars.xlog.Log.i("MagicSimpleDemo", "start");
                    zc3.c T6 = magicBaseDemoActivity.T6();
                    androidx.appcompat.app.AppCompatActivity context = magicBaseDemoActivity.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    zq0.a aVar = new zq0.a(context);
                    ((android.widget.FrameLayout) magicBaseDemoActivity.findViewById(com.tencent.mm.R.id.p1c)).addView(aVar);
                    T6.b(aVar);
                    magicBaseDemoActivity.f147918e = aVar;
                    magicBaseDemoActivity.f147917d = T6;
                    break;
                }
                break;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/demo/ui/MagicBaseDemoActivity$initEnv$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
