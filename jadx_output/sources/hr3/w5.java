package hr3;

/* loaded from: classes11.dex */
public class w5 implements kv.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelavatar.m0 f284134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI f284137d;

    public w5(com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI contactSocialInfoUI, com.tencent.mm.modelavatar.m0 m0Var, java.lang.String str, java.lang.String str2) {
        this.f284137d = contactSocialInfoUI;
        this.f284134a = m0Var;
        this.f284135b = str;
        this.f284136c = str2;
    }

    @Override // kv.g0
    public int a(int i17, int i18) {
        this.f284134a.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSocialInfoUI", "onSceneEnd: errType=%d, errCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI contactSocialInfoUI = this.f284137d;
        if (i17 == 0 && i18 == 0) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            android.graphics.Bitmap m17 = com.tencent.mm.modelavatar.d1.Ai().m(this.f284135b);
            int i19 = com.tencent.mm.plugin.profile.ui.ContactSocialInfoUI.f153713s;
            if (contactSocialInfoUI.X6(this.f284136c, m17)) {
                dp.a.makeText(contactSocialInfoUI.getContext(), contactSocialInfoUI.getContext().getString(com.tencent.mm.R.string.bgt), 0).show();
                return 0;
            }
        }
        dp.a.makeText(contactSocialInfoUI.getContext(), contactSocialInfoUI.getContext().getString(com.tencent.mm.R.string.bgr), 0).show();
        return 0;
    }
}
