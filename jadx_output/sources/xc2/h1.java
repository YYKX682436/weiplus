package xc2;

/* loaded from: classes2.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f453154e;

    public h1(java.lang.String str, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f453153d = str;
        this.f453154e = baseFinderFeed;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        ya2.g gVar = ya2.h.f460484a;
        if (gVar.b(this.f453153d) != null || (contact = this.f453154e.getFeedObject().getFeedObject().getContact()) == null) {
            return;
        }
        ya2.g.m(gVar, contact, false, 2, null);
    }
}
