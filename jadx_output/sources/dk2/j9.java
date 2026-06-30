package dk2;

/* loaded from: classes3.dex */
public final class j9 implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f233651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.api.LiveConfig f233652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f233653c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233654d;

    public j9(dk2.x4 x4Var, com.tencent.mm.live.api.LiveConfig liveConfig, android.content.Intent intent, android.content.Context context) {
        this.f233651a = x4Var;
        this.f233652b = liveConfig;
        this.f233653c = intent;
        this.f233654d = context;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        r45.nw1 liveInfo;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(this.f233652b.f68549s);
        int integer = (h17 == null || (liveInfo = h17.getLiveInfo()) == null) ? -1 : liveInfo.getInteger(21);
        dk2.x4 x4Var = this.f233651a;
        x4Var.f234319m = integer;
        if (x4Var.f234319m != -1) {
            dk2.r9.j(x4Var, this.f233653c, this.f233654d);
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveJumpChecker", "config.secondaryDeviceFlag is not legal: " + x4Var.f234319m + " after getCommentDatail");
    }
}
