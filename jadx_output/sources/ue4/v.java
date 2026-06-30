package ue4;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f426927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426928e;

    public v(ue4.w wVar, android.app.Activity activity, java.lang.String str) {
        this.f426927d = activity;
        this.f426928e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        db5.d5 d5Var = com.tencent.mm.plugin.sport.model.c0.f171773a;
        if ((d5Var == null || !d5Var.isShowing()) && com.tencent.mm.plugin.sport.model.z.f171826a.a("KEY_SHOW_NOT_SUPPORT_DEVICE_STEP_TIPS", 1L) != 0 && c01.z1.r().equals(this.f426928e)) {
            ve4.e eVar = (ve4.e) i95.n0.c(ve4.e.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((ue4.w) eVar).getClass();
            if (com.tencent.mm.plugin.sport.model.c0.a(context)) {
                return;
            }
            android.app.Activity activity = this.f426927d;
            com.tencent.mm.plugin.sport.model.c0.f171773a = com.tencent.mm.ui.widget.dialog.y3.a(activity, 1, com.tencent.mm.R.raw.icons_filled_info, activity.getResources().getColor(com.tencent.mm.R.color.f478532ac), com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jji), com.tencent.mm.R.raw.icons_outlined_close, null, null, new com.tencent.mm.plugin.sport.model.b0());
        }
    }
}
