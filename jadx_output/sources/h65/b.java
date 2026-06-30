package h65;

/* loaded from: classes8.dex */
public class b {
    public void a(int i17, java.lang.String str) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("type", java.lang.Integer.valueOf(i17));
        contentValues.put("value", str);
        try {
            com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().update(android.net.Uri.parse("content://" + qk.d0.f364065a + "/userinfo/"), contentValues, null, null);
        } catch (java.lang.IllegalArgumentException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmotionStorageResolver", e17, "", new java.lang.Object[0]);
        }
    }
}
