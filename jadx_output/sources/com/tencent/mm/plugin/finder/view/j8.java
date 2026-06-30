package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class j8 implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f132421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ al5.u4 f132422b;

    public j8(android.app.Activity activity, al5.u4 u4Var) {
        this.f132421a = activity;
        this.f132422b = u4Var;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public final void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_START_HALF_ACTIVITY_PREFERENCE", "settings_finder_switch");
        java.lang.Long FINDER_SHARE_ENTER_TIMELINE = com.tencent.mm.ui.t2.f209869c;
        kotlin.jvm.internal.o.f(FINDER_SHARE_ENTER_TIMELINE, "FINDER_SHARE_ENTER_TIMELINE");
        intent.putExtra("KEY_ENTER_SCENE", FINDER_SHARE_ENTER_TIMELINE.longValue());
        i95.m c17 = i95.n0.c(wd0.z1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((vd0.o3) ((wd0.z1) c17)).Zi(this.f132421a, intent);
        this.f132422b.dismiss();
    }
}
