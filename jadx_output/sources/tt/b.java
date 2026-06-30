package tt;

/* loaded from: classes5.dex */
public final class b implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421743d;

    public b(java.lang.String str) {
        this.f421743d = str;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsg.AppMsgAttachSyncDownloadFSC", "cancelDownloadAppMsgRecordAttach " + this.f421743d);
        return jz5.f0.f302826a;
    }
}
