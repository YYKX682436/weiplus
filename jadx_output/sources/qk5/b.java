package qk5;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final qk5.b f364451d = new qk5.b();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/vas/launcher/VASLauncher$startActivityForResult$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.VAS.VASLauncher", "vaslauncher onclick protect");
        yj0.a.h(this, "com/tencent/mm/ui/vas/launcher/VASLauncher$startActivityForResult$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
