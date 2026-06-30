package wo;

/* loaded from: classes13.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public java.io.RandomAccessFile f447834a;

    /* renamed from: b, reason: collision with root package name */
    public java.io.RandomAccessFile f447835b;

    /* renamed from: c, reason: collision with root package name */
    public wo.v f447836c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f447837d;

    /* renamed from: e, reason: collision with root package name */
    public final long f447838e;

    public w(long j17) {
        this.f447838e = 0L;
        this.f447838e = j17;
    }

    public final void a() {
        this.f447834a = new java.io.RandomAccessFile("/proc/stat", "r");
        long j17 = this.f447838e;
        if (j17 > 0) {
            this.f447835b = new java.io.RandomAccessFile("/proc/" + j17 + "/stat", "r");
        }
    }

    public final void b(int i17, java.lang.String str, java.lang.String str2) {
        java.lang.String[] split;
        java.lang.String str3;
        if (str == null || str.length() <= 0) {
            com.tencent.mars.xlog.Log.e(" MicroMsg.CpuUsage", "unable to get cpu line cpuId[%d]", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String[] split2 = str.split("[ ]+");
        if (split2[0].indexOf("cpu") != -1) {
            if (i17 != -1) {
                if (this.f447837d == null) {
                    this.f447837d = new java.util.ArrayList();
                }
                if (i17 < this.f447837d.size()) {
                    ((wo.v) this.f447837d.get(i17)).a(split2);
                    return;
                }
                wo.v vVar = new wo.v(this);
                vVar.a(split2);
                this.f447837d.add(vVar);
                return;
            }
            if (this.f447836c == null) {
                this.f447836c = new wo.v(this, this.f447838e);
            }
            wo.v vVar2 = this.f447836c;
            long j17 = vVar2.f447815d;
            if (j17 <= 0) {
                vVar2.a(split2);
                return;
            }
            if (str2 == null || str2.length() <= 0 || (split = str2.split("[ ]+")) == null || split.length <= 0 || (str3 = split[0]) == null || java.lang.Long.parseLong(str3, 10) != j17) {
                com.tencent.mars.xlog.Log.e(" MicroMsg.CpuUsage", "update but pid not match[%d, %s] update nothing", java.lang.Long.valueOf(j17), str2);
                return;
            }
            long parseLong = java.lang.Long.parseLong(split[13], 10);
            long parseLong2 = java.lang.Long.parseLong(split[14], 10);
            long parseLong3 = java.lang.Long.parseLong(split[15], 10);
            long parseLong4 = java.lang.Long.parseLong(split[16], 10);
            long j18 = parseLong + parseLong2 + parseLong3 + parseLong4;
            long parseLong5 = java.lang.Long.parseLong(split2[4], 10);
            boolean z17 = true;
            long j19 = 0;
            for (java.lang.String str4 : split2) {
                if (z17) {
                    z17 = false;
                } else {
                    j19 += java.lang.Long.parseLong(str4, 10);
                }
            }
            long j27 = parseLong5 - vVar2.f447814c;
            long j28 = j19 - vVar2.f447813b;
            long j29 = j18 - vVar2.f447816e;
            float f17 = (float) j28;
            vVar2.f447812a = (int) ((((float) (j28 - j27)) / f17) * 100.0f);
            vVar2.f447817f = (int) ((((float) j29) / f17) * 100.0f);
            vVar2.f447813b = j19;
            vVar2.f447814c = parseLong5;
            vVar2.f447816e = j18;
            com.tencent.mars.xlog.Log.i(" MicroMsg.CpuUsage", "CpuUsageInfo(%d) CPU total=%d idle=%d usage=%d pid=%d pidTotal=%d mPidUsage=%d [%d, %d, %d, %d], [%d, %d, %d]", java.lang.Integer.valueOf(vVar2.hashCode()), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(parseLong5), java.lang.Integer.valueOf(vVar2.f447812a), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(vVar2.f447817f), java.lang.Long.valueOf(parseLong), java.lang.Long.valueOf(parseLong2), java.lang.Long.valueOf(parseLong3), java.lang.Long.valueOf(parseLong4), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j29));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            java.io.RandomAccessFile r0 = r6.f447835b
            java.lang.String r1 = " MicroMsg.CpuUsage"
            r2 = 0
            if (r0 == 0) goto L24
            r0.seek(r2)     // Catch: java.io.IOException -> L12
            java.io.RandomAccessFile r0 = r6.f447835b     // Catch: java.io.IOException -> L12
            java.lang.String r0 = r0.readLine()     // Catch: java.io.IOException -> L12
            goto L25
        L12:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Ops pidStatFile: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.mars.xlog.Log.e(r1, r0)
        L24:
            r0 = 0
        L25:
            java.io.RandomAccessFile r4 = r6.f447834a
            if (r4 == 0) goto L4d
            r4.seek(r2)     // Catch: java.io.IOException -> L3b
            r2 = -1
        L2d:
            java.io.RandomAccessFile r3 = r6.f447834a     // Catch: java.io.IOException -> L3b
            java.lang.String r3 = r3.readLine()     // Catch: java.io.IOException -> L3b
            r6.b(r2, r3, r0)     // Catch: java.io.IOException -> L3b
            int r2 = r2 + 1
            if (r3 != 0) goto L2d
            goto L4d
        L3b:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Ops statFile: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.mars.xlog.Log.e(r1, r0)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.w.c():void");
    }

    public void d() {
        try {
            a();
            c();
            java.io.RandomAccessFile randomAccessFile = this.f447834a;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            java.io.RandomAccessFile randomAccessFile2 = this.f447835b;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(" MicroMsg.CpuUsage", e17, "update e:", new java.lang.Object[0]);
            java.io.RandomAccessFile randomAccessFile3 = this.f447834a;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.close();
                } catch (java.lang.Exception unused) {
                }
                this.f447834a = null;
            }
            java.io.RandomAccessFile randomAccessFile4 = this.f447835b;
            if (randomAccessFile4 != null) {
                try {
                    randomAccessFile4.close();
                } catch (java.lang.Exception unused2) {
                }
                this.f447835b = null;
            }
        }
    }

    public java.lang.String toString() {
        d();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (this.f447836c != null) {
            stringBuffer.append("Cpu Total : ");
            stringBuffer.append(this.f447836c.f447812a);
            stringBuffer.append("%");
            long j17 = this.f447838e;
            if (j17 > 0) {
                stringBuffer.append("pid(");
                stringBuffer.append(j17 + ") :");
                stringBuffer.append(this.f447836c.f447817f);
                stringBuffer.append("%");
            }
        }
        if (this.f447837d != null) {
            for (int i17 = 0; i17 < this.f447837d.size(); i17++) {
                wo.v vVar = (wo.v) this.f447837d.get(i17);
                stringBuffer.append(" Cpu Core(" + i17 + ") : ");
                stringBuffer.append(vVar.f447812a);
                stringBuffer.append("%");
            }
        }
        return stringBuffer.toString();
    }
}
