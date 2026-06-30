package d95;

/* loaded from: classes12.dex */
public class o extends d95.p implements l75.h0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.wcdb.support.CancellationSignal f227698f;

    public o(com.tencent.wcdb.Cursor cursor, java.lang.String str, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        super(cursor, str);
        this.f227698f = cancellationSignal;
    }

    @Override // l75.h0
    public boolean a() {
        return this.f227698f.isCanceled();
    }

    @Override // l75.h0
    public void cancel() {
        this.f227698f.cancel();
    }
}
