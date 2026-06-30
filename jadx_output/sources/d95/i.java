package d95;

/* loaded from: classes12.dex */
public class i implements android.util.Printer {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Printer f227684d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.Printer f227685e = new com.tencent.wcdb.support.LogPrinter(5, "MicroMsg.MMDataBase");

    public i(d95.f fVar, java.lang.StringBuilder sb6) {
        this.f227684d = new android.util.StringBuilderPrinter(sb6);
    }

    @Override // android.util.Printer
    public void println(java.lang.String str) {
        ((android.util.StringBuilderPrinter) this.f227684d).println(str);
        this.f227685e.println(str);
    }
}
