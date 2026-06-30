package kd2;

/* loaded from: classes2.dex */
public final class u1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FeedData f306842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f306843b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f306844c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f306845d;

    public u1(com.tencent.mm.plugin.finder.storage.FeedData feedData, int i17, long j17, int i18) {
        this.f306842a = feedData;
        this.f306843b = i17;
        this.f306844c = j17;
        this.f306845d = i18;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        com.tencent.mm.plugin.finder.storage.FeedData feedData = this.f306842a;
        lVarArr[0] = new jz5.l("feedid", pm0.v.u(feedData.getId()));
        lVarArr[1] = new jz5.l("screen_type", java.lang.Integer.valueOf(this.f306843b));
        lVarArr[2] = new jz5.l("last_completed_feedid", pm0.v.u(this.f306844c));
        java.lang.String sessionBuffer = feedData.getSessionBuffer();
        if (sessionBuffer == null) {
            sessionBuffer = "";
        }
        lVarArr[3] = new jz5.l("session_buffer", sessionBuffer);
        lVarArr[4] = new jz5.l("continue_play_type", java.lang.Integer.valueOf(this.f306845d));
        return kz5.c1.k(lVarArr);
    }
}
