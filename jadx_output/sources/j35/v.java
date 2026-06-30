package j35;

/* loaded from: classes2.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.permission.PermissionActivity f297523d;

    public v(com.tencent.mm.pluginsdk.permission.PermissionActivity permissionActivity) {
        this.f297523d = permissionActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View findViewById = this.f297523d.findViewById(com.tencent.mm.R.id.agc);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/permission/PermissionActivity$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/permission/PermissionActivity$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/pluginsdk/permission/PermissionActivity$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/permission/PermissionActivity$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.animate().alpha(1.0f).setDuration(300L).setListener(null);
        }
    }
}
