package im2;

/* loaded from: classes2.dex */
public final class v4 extends com.tencent.mm.ui.component.UIComponent implements zy2.o8 {

    /* renamed from: d, reason: collision with root package name */
    public static int f292582d;

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.protocal.protobuf.FinderJumpInfo f292583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public void O6(int i17, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, boolean z17) {
        f292582d = i17;
        f292583e = finderJumpInfo;
        if (finderJumpInfo != null) {
            com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info = finderJumpInfo.getMini_app_info();
            java.lang.String app_id = mini_app_info != null ? mini_app_info.getApp_id() : null;
            com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info2 = finderJumpInfo.getMini_app_info();
            java.lang.String path = mini_app_info2 != null ? mini_app_info2.getPath() : null;
            if (app_id != null && path != null) {
                ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).P4("", app_id, path, 0);
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSelfUIC", "flag:" + i17 + ", isFromCache:" + z17);
        if (!z17) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SELF_UI_SHOW_ORDER_INT_SYNC, java.lang.Integer.valueOf(i17));
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.hpr);
        if (findViewById != null) {
            if (!(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3478l).getValue()).r()).intValue() == 1 && f292582d == 1 && f292583e != null)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(ILcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(ILcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(ILcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC", "refreshLiveOrder", "(ILcom/tencent/mm/protocal/protobuf/FinderJumpInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setOnClickListener(new im2.u4(this, finderJumpInfo));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ae2.b2 b2Var = ae2.b2.f3461a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.T).getValue()).r()).intValue() == 1) {
            f292582d = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_SELF_UI_SHOW_ORDER_INT_SYNC, 0);
        }
        O6(f292582d, f292583e, true);
    }
}
