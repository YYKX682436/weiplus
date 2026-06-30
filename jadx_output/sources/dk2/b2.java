package dk2;

/* loaded from: classes3.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jp f233230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.g f233231e;

    public b2(com.tencent.mm.plugin.finder.live.plugin.jp jpVar, dk2.g gVar) {
        this.f233230d = jpVar;
        this.f233231e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.jp jpVar = this.f233230d;
        if (jpVar != null) {
            com.tencent.mm.plugin.finder.live.plugin.jp.b(jpVar, false, -1, com.tencent.mm.plugin.finder.live.plugin.ip.f113003g, null, null, 0, this.f233231e.f233467b, "combo err", null, 16, null);
        }
    }
}
