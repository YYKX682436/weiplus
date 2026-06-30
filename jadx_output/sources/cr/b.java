package cr;

/* loaded from: classes12.dex */
public final class b implements cr.h {

    /* renamed from: a, reason: collision with root package name */
    public cr.i f221553a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f221554b;

    /* renamed from: c, reason: collision with root package name */
    public final cr.a f221555c = new cr.a(this);

    @Override // cr.h
    public void a(cr.i fetcherConfig, yz5.l lVar) {
        kotlin.jvm.internal.o.g(fetcherConfig, "fetcherConfig");
        this.f221553a = fetcherConfig;
        this.f221554b = lVar;
        sx.e0 e0Var = (sx.e0) i95.n0.c(sx.e0.class);
        dn.m mVar = new dn.m();
        mVar.f241789h = -3;
        mVar.f241785d = "task_EmojiCdnFetcher";
        cr.i iVar = this.f221553a;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("fetcherConfig");
            throw null;
        }
        mVar.field_authKey = iVar.f221571d;
        mVar.field_fileType = 19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downemoji_");
        cr.i iVar2 = this.f221553a;
        if (iVar2 == null) {
            kotlin.jvm.internal.o.o("fetcherConfig");
            throw null;
        }
        sb6.append(iVar2.f221568a.getMd5());
        mVar.field_mediaId = sb6.toString();
        cr.i iVar3 = this.f221553a;
        if (iVar3 == null) {
            kotlin.jvm.internal.o.o("fetcherConfig");
            throw null;
        }
        mVar.field_fullpath = iVar3.f221570c;
        mVar.f241811z = iVar3.f221569b;
        mVar.f241787f = this.f221555c;
        if (((rx.l) e0Var).wi(mVar)) {
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("create task failed ");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = fetcherConfig.f221568a;
        sb7.append(emojiInfo.getMd5());
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader.EmojiFetcher", sb7.toString());
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader.EmojiFetcher", "callback is null " + emojiInfo.getMd5());
    }
}
