package jn4;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f300804d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f300805e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f300806f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jn4.m f300807g;

    public i(jn4.m mVar, java.lang.String str, java.lang.String str2, boolean z17, java.lang.Integer num) {
        this.f300807g = mVar;
        this.f300804d = str;
        this.f300805e = str2;
        this.f300806f = num;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String format;
        jn4.m mVar = this.f300807g;
        mVar.getClass();
        for (int i17 = 1; i17 <= 3; i17++) {
            java.lang.String str = "-t " + java.lang.String.valueOf(64);
            java.lang.String str2 = this.f300804d;
            java.util.ArrayList arrayList = (java.util.ArrayList) jn4.o.d(new java.lang.String[]{"ping", "-c 1", str, str2});
            int size = arrayList.size();
            java.lang.String str3 = this.f300805e;
            java.lang.Integer num = this.f300806f;
            if (size == 2) {
                java.lang.String str4 = (java.lang.String) arrayList.get(0);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "runcommand err " + str2);
                    mVar.c(str3, "run command err ", num);
                } else {
                    java.lang.String obj = arrayList.get(1).toString();
                    if (jn4.o.c(str4) > 0) {
                        java.lang.String b17 = jn4.o.b(str4, true);
                        format = !com.tencent.mm.sdk.platformtools.t8.K0(b17) ? java.lang.String.format(" %sms ", b17) : !com.tencent.mm.sdk.platformtools.t8.K0(obj) ? java.lang.String.format(" %sms ", obj) : java.lang.String.format("unable to get time", new java.lang.Object[0]);
                    } else {
                        format = java.lang.String.format(" router no response ", new java.lang.Object[0]);
                    }
                    if (i17 == 3) {
                        format = format + "\n";
                    }
                    mVar.c(str3, format, num);
                }
            } else if (i17 == 3) {
                mVar.c(str3, " router no response\n", num);
            } else {
                mVar.c(str3, " router no response", num);
            }
        }
    }
}
