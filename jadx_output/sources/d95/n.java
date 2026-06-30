package d95;

/* loaded from: classes12.dex */
public class n extends com.tencent.wcdb.CursorWrapper implements l75.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.wcdb.support.CancellationSignal f227697d;

    public n(com.tencent.wcdb.Cursor cursor, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        super(cursor);
        this.f227697d = cancellationSignal;
    }

    @Override // l75.h0
    public boolean a() {
        return this.f227697d.isCanceled();
    }

    @Override // l75.h0
    public void cancel() {
        this.f227697d.cancel();
    }
}
