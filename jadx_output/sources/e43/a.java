package e43;

/* loaded from: classes8.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f249352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f249353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249354f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249355g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249356h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e43.b f249357i;

    public a(kotlin.jvm.internal.h0 h0Var, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, e43.b bVar) {
        this.f249352d = h0Var;
        this.f249353e = z17;
        this.f249354f = str;
        this.f249355g = str2;
        this.f249356h = str3;
        this.f249357i = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = (java.lang.String) this.f249352d.f310123d;
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_GameChatRoomMediaUploader";
        mVar.field_mediaId = str;
        mVar.f241787f = this.f249357i;
        mVar.field_fullpath = this.f249355g;
        mVar.field_needStorage = false;
        mVar.field_priority = 3;
        java.lang.String str2 = this.f249354f;
        if (android.webkit.URLUtil.isHttpUrl(str2) || android.webkit.URLUtil.isHttpsUrl(str2)) {
            mVar.field_fileType = 2;
            mVar.f241811z = str2;
            mVar.field_authKey = "";
        } else {
            mVar.field_fileId = str2;
            mVar.field_aesKey = this.f249356h;
            if (this.f249353e) {
                mVar.field_fileType = 3;
            } else {
                mVar.field_fileType = 2;
            }
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
    }
}
