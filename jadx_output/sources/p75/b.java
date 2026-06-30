package p75;

/* loaded from: classes12.dex */
public final class b implements com.tencent.wcdb.support.ICancellationSignal {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p75.c f352620d;

    public b(p75.c cVar) {
        this.f352620d = cVar;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return null;
    }

    @Override // com.tencent.wcdb.support.ICancellationSignal
    public void cancel() {
        this.f352620d.f352623b.cancel();
    }
}
