package gm0;

/* loaded from: classes7.dex */
public class e1 extends android.os.FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final gm0.i1 f273182a;

    public e1(java.lang.String str, gm0.i1 i1Var) {
        super(str, 3780);
        this.f273182a = i1Var;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i17, java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if ((i17 & 4) != 0) {
            stringBuffer.append("ATTRIB|");
        }
        if ((i17 & 512) != 0) {
            stringBuffer.append("DELETE|");
        }
        if ((i17 & 1024) != 0) {
            stringBuffer.append("DELETE_SELF|");
        }
        if ((i17 & 64) != 0) {
            stringBuffer.append("MOVED_FROM|");
        }
        if ((i17 & 128) != 0) {
            stringBuffer.append("MOVED_TO|");
        }
        if ((i17 & 2048) != 0) {
            stringBuffer.append("MOVE_SELF|");
        }
        stringBuffer.append(java.lang.String.format("0x%x", java.lang.Integer.valueOf(i17)));
        objArr[0] = stringBuffer.toString();
        objArr[1] = str;
        java.io.File file = gm0.d1.f273177a;
        synchronized (gm0.d1.class) {
            java.lang.String format = java.lang.String.format("(%s), %s", objArr);
            if (format == null) {
                format = "";
            }
            java.lang.String str2 = ((java.lang.Object) android.text.format.DateFormat.format("[yyyy-MM-dd HH:mm:ss] ", new java.util.Date())) + format;
            com.tencent.mars.xlog.Log.w("MicroMsg.FileDisappearedObserver", str2);
            gm0.d1.f273177a.mkdirs();
            try {
                java.io.File file2 = gm0.d1.f273178b;
                if (!file2.exists()) {
                    file2.createNewFile();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileDisappearedObserver", th6, "", new java.lang.Object[0]);
            }
            com.tencent.mm.vfs.w6.R(gm0.d1.f273178b.getAbsolutePath(), str2.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        }
        gm0.i1 i1Var = this.f273182a;
        if (i1Var != null) {
            gm0.h1 h1Var = (gm0.h1) i1Var;
            h1Var.getClass();
            if (str == null || !str.endsWith("EnMicroMsg.db")) {
                return;
            }
            h1Var.b(i17, 4, 10);
            h1Var.b(i17, 512, 11);
            h1Var.b(i17, 1024, 12);
            h1Var.b(i17, 2048, 15);
            h1Var.b(i17, 64, 13);
            h1Var.b(i17, 128, 14);
        }
    }
}
