package i02;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286505h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i02.h f286506i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i02.h hVar, long j17, com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo tMAssistantDownloadTaskInfo, java.lang.String str) {
        super(j17, tMAssistantDownloadTaskInfo);
        this.f286506i = hVar;
        this.f286505h = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        try {
            return this.f286506i.j().getDownloadTaskState(this.f286505h);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FileDownloaderImplTMAssistant", "queryDownloadStateSync faile: " + e17.toString());
            return null;
        }
    }
}
