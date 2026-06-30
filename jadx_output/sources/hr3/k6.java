package hr3;

/* loaded from: classes4.dex */
public class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f283714e;

    public k6(hr3.t6 t6Var, java.lang.String str) {
        this.f283714e = t6Var;
        this.f283713d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        hr3.t6 t6Var = this.f283714e;
        com.tencent.mm.ui.base.preference.r rVar = t6Var.f284003e;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetBizInfo", "LazyGetAvatar screen is null");
            return;
        }
        com.tencent.mm.plugin.profile.ui.IconWidgetPreference iconWidgetPreference = (com.tencent.mm.plugin.profile.ui.IconWidgetPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_info_kf_worker");
        if (iconWidgetPreference == null || t6Var.f284003e == null) {
            return;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(this.f283713d);
        if (a17 != null) {
            iconWidgetPreference.N = a17;
            android.widget.ImageView imageView = iconWidgetPreference.L;
            if (imageView != null) {
                imageView.setImageBitmap(a17);
            }
            ((com.tencent.mm.ui.base.preference.h0) t6Var.f284003e).notifyDataSetChanged();
        }
    }
}
