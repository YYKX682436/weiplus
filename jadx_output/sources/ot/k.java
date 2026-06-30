package ot;

@j95.b
/* loaded from: classes10.dex */
public final class k extends jm0.o implements pt.i0 {
    public java.lang.String Zi(android.graphics.Bitmap bitmap, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(fileName, "fileName");
        java.lang.String g17 = ut.g.f430626a.g(fileName);
        return bitmap != null ? com.tencent.mm.sdk.platformtools.x.D0(bitmap, ut.g.f430627b, android.graphics.Bitmap.CompressFormat.JPEG, g17, false) : false ? g17 : "";
    }
}
