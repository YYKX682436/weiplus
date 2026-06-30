package p75;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wcdb.support.CancellationSignal f352622a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.CancellationSignal f352623b;

    public c(com.tencent.wcdb.support.CancellationSignal cancellationSignal, l75.k0 sqlLiteDB) {
        kotlin.jvm.internal.o.g(cancellationSignal, "cancellationSignal");
        kotlin.jvm.internal.o.g(sqlLiteDB, "sqlLiteDB");
        this.f352622a = cancellationSignal;
        android.os.CancellationSignal cancellationSignal2 = new android.os.CancellationSignal();
        this.f352623b = cancellationSignal2;
        if (sqlLiteDB.a()) {
            cancellationSignal2.setOnCancelListener(new p75.a(this));
            cancellationSignal.setRemote(new p75.b(this));
        }
    }
}
