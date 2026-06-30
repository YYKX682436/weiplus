package qd2;

/* loaded from: classes2.dex */
public abstract class k {
    public static final void a(android.app.Activity activity, android.view.View anchor, java.lang.CharSequence menuTitle, yz5.a onConfirm) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(anchor, "anchor");
        kotlin.jvm.internal.o.g(menuTitle, "menuTitle");
        kotlin.jvm.internal.o.g(onConfirm, "onConfirm");
        rl5.r rVar = new rl5.r(activity);
        int i17 = com.tencent.mm.view.TouchableLayout.f213511d;
        int i18 = com.tencent.mm.view.TouchableLayout.f213511d;
        int i19 = com.tencent.mm.view.TouchableLayout.f213512e;
        com.tencent.mars.xlog.Log.i("Finder.FinderFollowAggregationHelper", "showFollowItemPopup at (" + i18 + ", " + i19 + "), title=" + ((java.lang.Object) menuTitle));
        rVar.h(anchor, new qd2.i(0, menuTitle), new qd2.j(0, onConfirm), i18, i19);
    }
}
