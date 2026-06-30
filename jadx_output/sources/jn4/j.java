package jn4;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f300808d;

    /* renamed from: e, reason: collision with root package name */
    public final int f300809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jn4.m f300810f;

    public j(jn4.m mVar, java.lang.String str, int i17) {
        this.f300810f = mVar;
        this.f300808d = str;
        this.f300809e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int indexOf;
        int i17;
        int indexOf2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ttl= ");
        int i18 = this.f300809e;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMTraceRoute", sb6.toString());
        jn4.m mVar = this.f300810f;
        mVar.getClass();
        java.lang.String str = "-t " + java.lang.String.valueOf(i18);
        java.lang.String str2 = this.f300808d;
        java.util.ArrayList arrayList = (java.util.ArrayList) jn4.o.d(new java.lang.String[]{"ping", "-c 1", str, str2});
        if (arrayList.size() != 2) {
            mVar.c(str2, java.lang.String.format("%d : can not get roupter ip\n", java.lang.Integer.valueOf(i18)), java.lang.Integer.valueOf(i18 + 1));
            return;
        }
        java.lang.String str3 = (java.lang.String) arrayList.get(0);
        if (str3.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "runcommand err");
            return;
        }
        int indexOf3 = str3.indexOf("From ");
        java.lang.String replace = ((indexOf3 >= 0 || (indexOf3 = str3.indexOf("from ")) >= 0) && ((indexOf = str3.indexOf(" ", indexOf3)) >= 0 || (indexOf = str3.indexOf(":", indexOf3)) >= 0) && (indexOf2 = str3.indexOf(" ", (i17 = indexOf + 1))) >= 0) ? str3.substring(i17, indexOf2).replace(":", "") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(replace)) {
            if (jn4.o.c(str3) > 0) {
                return;
            }
            java.lang.String format = java.lang.String.format("%d : can not get roupter ip\n", java.lang.Integer.valueOf(i18));
            com.tencent.mars.xlog.Log.e("MicroMsg.MMTraceRoute", "can not get setData ip and ttl" + str2);
            mVar.c(str2, format, java.lang.Integer.valueOf(i18 + 1));
            return;
        }
        if (str2.equals(replace)) {
            mVar.c(str2, java.lang.String.format("%d : FIN %s\n\n", java.lang.Integer.valueOf(i18), replace), java.lang.Integer.valueOf(i18 + 1));
            return;
        }
        if (jn4.o.c(str3) > 0) {
            java.lang.String format2 = java.lang.String.format("%d : FIN %s\n\n ", java.lang.Integer.valueOf(i18), replace);
            int i19 = i18 + 1;
            mVar.c(str2, format2, java.lang.Integer.valueOf(i19));
            jn4.p pVar = jn4.m.f300815j;
            if (pVar != null) {
                pVar.execute(new jn4.i(mVar, replace, str2, true, java.lang.Integer.valueOf(i19)));
                return;
            }
            return;
        }
        java.lang.String format3 = java.lang.String.format("%d : %s", java.lang.Integer.valueOf(i18), replace);
        int i27 = i18 + 1;
        mVar.c(str2, format3, java.lang.Integer.valueOf(i27));
        jn4.p pVar2 = jn4.m.f300815j;
        if (pVar2 != null) {
            pVar2.execute(new jn4.i(mVar, replace, str2, false, java.lang.Integer.valueOf(i27)));
        }
    }
}
