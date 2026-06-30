package v25;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f432970a = {"retCode", "url"};

    public static android.database.MatrixCursor a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtCommonUtils", "returnMatrix = " + i17);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(r62.a.f393004a);
        matrixCursor.addRow(new java.lang.Object[]{java.lang.Integer.valueOf(i17)});
        return matrixCursor;
    }

    public static android.database.MatrixCursor b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtCommonUtils", "returnMatrix = " + i17);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(f432970a);
        matrixCursor.addRow(new java.lang.Object[]{java.lang.Integer.valueOf(i17), str});
        return matrixCursor;
    }
}
