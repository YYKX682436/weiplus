package h03;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h03.q f277886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.mega_video.MegaVideoFeedInfo f277887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f277888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277889g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f277890h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h03.q qVar, com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo, long j17, java.lang.String str, boolean z17) {
        super(0);
        this.f277886d = qVar;
        this.f277887e = megaVideoFeedInfo;
        this.f277888f = j17;
        this.f277889g = str;
        this.f277890h = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity = this.f277886d.f277912f;
        if (activity != null) {
            so2.u1 d17 = c03.i.d(this.f277887e);
            int i17 = (int) this.f277888f;
            java.lang.String userName = this.f277889g;
            kotlin.jvm.internal.o.g(userName, "userName");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_to_comment_scene", i17);
            intent.putExtra("finder_username", userName);
            intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, activity, intent, d17 != null ? d17.getItemId() : 0L, null, 0, 0, false, 0, d17 != null ? d17.w() : null, 224, null);
            if (this.f277890h) {
                pf5.z zVar = pf5.z.f353948a;
                if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ((com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) a17).Q6(intent, 0);
            } else {
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(activity, intent);
            }
        }
        return jz5.f0.f302826a;
    }
}
