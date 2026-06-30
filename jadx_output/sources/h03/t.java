package h03;

/* loaded from: classes2.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.mega_video.MegaVideoFeedInfo f277924d;

    public t(com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo) {
        this.f277924d = megaVideoFeedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.protocal.protobuf.FinderObject b17 = c03.i.b(this.f277924d);
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LVNativePlugin", "showLastExitFeedHint fail, finderObject is null");
            return;
        }
        com.tencent.mm.autogen.events.FinderLongVideoShowLastExitFeedHintEvent finderLongVideoShowLastExitFeedHintEvent = new com.tencent.mm.autogen.events.FinderLongVideoShowLastExitFeedHintEvent();
        long id6 = b17.getId();
        am.ic icVar = finderLongVideoShowLastExitFeedHintEvent.f54303g;
        icVar.f6936a = id6;
        icVar.f6937b = b17;
        finderLongVideoShowLastExitFeedHintEvent.e();
    }
}
