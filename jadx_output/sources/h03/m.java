package h03;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.mega_video.MegaVideoFeedInfo f277898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h03.q f277900f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo, java.lang.String str, h03.q qVar) {
        super(0);
        this.f277898d = megaVideoFeedInfo;
        this.f277899e = str;
        this.f277900f = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = c03.i.a(this.f277898d);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LVFinderPlugin", "shareFeedToUser :" + this.f277899e + " feed to finderItem is null");
        } else {
            android.app.Activity activity = this.f277900f.f277912f;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = activity instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity : null;
            if (appCompatActivity != null) {
                java.lang.String str = this.f277899e;
                db5.h4 h4Var = new db5.h4(appCompatActivity, 0, 0);
                h4Var.A = str;
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Mj(appCompatActivity, str, h4Var, a17, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
