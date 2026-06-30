package ii3;

/* loaded from: classes13.dex */
public class a extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.progressbar.MMSightProgressBar f291626a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.mmsight.ui.progressbar.MMSightProgressBar mMSightProgressBar, android.os.Looper looper) {
        super(looper);
        this.f291626a = mMSightProgressBar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == 233) {
            this.f291626a.getClass();
        }
    }
}
