package lk5;

/* loaded from: classes14.dex */
public abstract class s {
    public static final android.view.ViewGroup a(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "<this>");
        if (activity instanceof com.tencent.mm.ui.vas.VASActivity) {
            com.tencent.mm.ui.vas.VASActivity vASActivity = (com.tencent.mm.ui.vas.VASActivity) activity;
            if (vASActivity.isPageFragmentMode()) {
                android.view.View w17 = vASActivity.getController().w();
                kotlin.jvm.internal.o.e(w17, "null cannot be cast to non-null type android.view.ViewGroup");
                return (android.view.ViewGroup) w17;
            }
        }
        android.view.View findViewById = activity.findViewById(android.R.id.content);
        kotlin.jvm.internal.o.d(findViewById);
        return (android.view.ViewGroup) findViewById;
    }

    public static final boolean b(android.content.Context context) {
        android.content.Intent intent;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return false;
        }
        return c(intent);
    }

    public static final boolean c(android.content.Intent intent) {
        if (intent != null) {
            return intent.getBooleanExtra(com.tencent.mm.ui.vas.VASActivity.KEY_IS_FRAGMENT_MODE, false);
        }
        return false;
    }

    public static final boolean d(android.content.Intent intent, int i17) {
        nk5.c cVar;
        java.lang.String str;
        nk5.c cVar2;
        kotlin.jvm.internal.o.g(intent, "<this>");
        lk5.f fVar = com.tencent.mm.ui.vas.VASActivity.Companion;
        fVar.getClass();
        cVar = com.tencent.mm.ui.vas.VASActivity.vasController;
        if (!cVar.e()) {
            return false;
        }
        if ((i17 & intent.getIntExtra(com.tencent.mm.ui.vas.VASActivity.KEY_VAS_START_MODE, 3)) == 0) {
            return false;
        }
        android.content.ComponentName component = intent.getComponent();
        if (component == null || (str = component.getClassName()) == null) {
            str = "";
        }
        if (!(kotlin.jvm.internal.o.b(str, com.tencent.mm.ui.vas.VASCommonForPadActivity.class.getName()) ? true : kotlin.jvm.internal.o.b(str, com.tencent.mm.ui.vas.VASCommonActivity.class.getName())) && intent.getBooleanExtra(com.tencent.mm.ui.vas.VASActivity.KEY_ACTIVITY_SUPPORT_VAS, false)) {
            return true;
        }
        fVar.getClass();
        cVar2 = com.tencent.mm.ui.vas.VASActivity.vasController;
        if (!cVar2.d(str)) {
            return false;
        }
        for (java.lang.Class<?> cls = java.lang.Class.forName(str); cls.getSuperclass() != null; cls = cls.getSuperclass()) {
            if (kotlin.jvm.internal.o.b(cls.getSuperclass(), com.tencent.mm.ui.vas.VASActivity.class)) {
                return true;
            }
        }
        return false;
    }

    public static final android.content.Intent e(android.content.Intent intent, boolean z17) {
        kotlin.jvm.internal.o.g(intent, "<this>");
        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_ACTIVITY_SUPPORT_VAS, z17);
        return intent;
    }
}
