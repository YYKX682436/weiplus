package xr2;

/* loaded from: classes2.dex */
public final class a extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xr2.b f456208g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer f456209h;

    public a(xr2.b bVar, com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer) {
        this.f456208g = bVar;
        this.f456209h = dataBuffer;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        int i17;
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        if ((event instanceof fc2.t) && ((i17 = ((fc2.t) event).f260985d) == 6 || i17 == 7 || i17 == 0)) {
            return true;
        }
        if (!(event instanceof ec2.f)) {
            return false;
        }
        int i18 = ((ec2.f) event).f250959d;
        return i18 == 27 || i18 == 28 || i18 == 26;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #0 {, blocks: (B:26:0x0060, B:28:0x006b, B:33:0x0077, B:35:0x007f, B:38:0x0089, B:44:0x0096, B:47:0x00bc), top: B:25:0x0060 }] */
    @Override // fc2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G0(fc2.a r22) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr2.a.G0(fc2.a):void");
    }
}
