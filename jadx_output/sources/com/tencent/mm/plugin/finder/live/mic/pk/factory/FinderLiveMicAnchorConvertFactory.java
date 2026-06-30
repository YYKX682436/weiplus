package com.tencent.mm.plugin.finder.live.mic.pk.factory;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/mic/pk/factory/FinderLiveMicAnchorConvertFactory;", "Lin5/s;", "Lcom/tencent/mm/plugin/finder/convert/z2;", "createFinderEmptyConvert", "", "type", "Lin5/r;", "getItemConvert", "Lgk2/e;", "liveData", "Lgk2/e;", "getLiveData", "()Lgk2/e;", "Lsi2/a;", "callback", "Lsi2/a;", "getCallback", "()Lsi2/a;", "<init>", "(Lgk2/e;Lsi2/a;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderLiveMicAnchorConvertFactory implements in5.s {
    private final si2.a callback;
    private final gk2.e liveData;

    public FinderLiveMicAnchorConvertFactory(gk2.e liveData, si2.a aVar) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.liveData = liveData;
        this.callback = aVar;
    }

    private final com.tencent.mm.plugin.finder.convert.z2 createFinderEmptyConvert() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.sdk.platformtools.Log.c("RecyclerViewAdapterEx", "type invalid", new java.lang.Object[0]);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }

    public final si2.a getCallback() {
        return this.callback;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        switch (type) {
            case 1:
                return new ui2.i(this.callback);
            case 2:
                return new ui2.n(this.callback);
            case 3:
                return new ui2.o();
            case 4:
                return new ui2.l(this.callback);
            case 5:
                return new ui2.c();
            case 6:
                return new ui2.f(this.liveData, this.callback);
            case 7:
                return new ui2.b(this.callback);
            case 8:
                return new ui2.s();
            case 9:
                return new ui2.f(this.liveData, this.callback);
            case 10:
                return new ui2.r();
            case 11:
                return new ui2.q(this.liveData, this.callback);
            default:
                return createFinderEmptyConvert();
        }
    }

    public final gk2.e getLiveData() {
        return this.liveData;
    }

    public /* synthetic */ FinderLiveMicAnchorConvertFactory(gk2.e eVar, si2.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        this(eVar, (i17 & 2) != 0 ? null : aVar);
    }
}
