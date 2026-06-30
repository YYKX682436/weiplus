package xi0;

/* loaded from: classes4.dex */
public final class d implements com.tencent.mm.plugin.sns.model.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f454670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.m0 f454672f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f454673g;

    public d(r45.jj4 jj4Var, java.lang.String str, com.tencent.mm.plugin.sns.model.m0 m0Var, kotlinx.coroutines.q qVar) {
        this.f454670d = jj4Var;
        this.f454671e = str;
        this.f454672f = m0Var;
        this.f454673g = qVar;
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDataSource", "onImageFinish: mediaId=" + str + ", isOk=" + z17);
        if (kotlin.jvm.internal.o.b(str, this.f454670d.f377855d)) {
            this.f454672f.v(this);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f454673g.resumeWith(kotlin.Result.m521constructorimpl(this.f454671e));
        }
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDataSource", "onSightFinish: " + str);
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDataSource", "onThumbFinish:".concat(mediaId));
        if (kotlin.jvm.internal.o.b(mediaId, this.f454670d.f377855d)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onThumbFinish: ");
            java.lang.String str = this.f454671e;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsDataSource", sb6.toString());
            this.f454672f.v(this);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f454673g.resumeWith(kotlin.Result.m521constructorimpl(str));
        }
    }
}
