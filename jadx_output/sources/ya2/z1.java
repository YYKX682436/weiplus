package ya2;

/* loaded from: classes10.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f460585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f460586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f460587f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ya2.b2 b2Var, java.lang.Exception exc, int i17) {
        super(0);
        this.f460585d = b2Var;
        this.f460586e = exc;
        this.f460587f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.database.Cursor cursor;
        java.lang.String str;
        ya2.b2 b2Var = this.f460585d;
        b2Var.getClass();
        java.lang.StackTraceElement[] stackTrace = this.f460586e.getStackTrace();
        kotlin.jvm.internal.o.f(stackTrace, "getStackTrace(...)");
        java.lang.String str2 = "";
        java.lang.String str3 = "";
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            str3 = str3 + stackTraceElement + " \n";
        }
        ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).getClass();
        com.tencent.mm.plugin.finder.storage.o80 Jj = ((c61.l7) i95.n0.c(c61.l7.class)).Jj();
        Jj.getClass();
        try {
            cursor = Jj.f127296d.f("PRAGMA table_info(FinderContact)", null, 2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderContactStorage", e17.toString());
            cursor = null;
        }
        if (cursor != null) {
            try {
                int columnCount = cursor.getColumnCount();
                java.lang.String str4 = "";
                while (cursor.moveToNext()) {
                    int columnIndex = cursor.getColumnIndex(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                    boolean z17 = true;
                    if (columnIndex >= 0 && columnIndex < columnCount) {
                        java.lang.String string = cursor.getString(columnIndex);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        str = "" + string + ':';
                    } else {
                        str = "";
                    }
                    int columnIndex2 = cursor.getColumnIndex("type");
                    if (columnIndex2 < 0 || columnIndex2 >= columnCount) {
                        z17 = false;
                    }
                    if (z17) {
                        java.lang.String string2 = cursor.getString(columnIndex2);
                        kotlin.jvm.internal.o.f(string2, "getString(...)");
                        str = str + string2;
                    }
                    str4 = str4 + str + ';';
                }
                vz5.b.a(cursor, null);
                str2 = str4;
            } finally {
            }
        }
        java.lang.String str5 = "[colCount=" + this.f460587f + "]###\n[" + b2Var.N2 + "]###\n[" + b2Var.M2 + "]###\n[" + str2 + "]###\n[error: " + str3 + ']';
        kotlin.jvm.internal.o.g(str5, "<set-?>");
        b2Var.N2 = str5;
        com.tencent.mars.xlog.Log.i("LocalFinderContact", str5);
        pm0.z.b(xy2.b.f458155b, "KeyContactConvertError", false, null, null, false, false, new ya2.y1(b2Var), 60, null);
        return jz5.f0.f302826a;
    }
}
