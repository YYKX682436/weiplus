package zl1;

/* loaded from: classes7.dex */
public class g0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.h0 f473594d;

    public g0(zl1.h0 h0Var) {
        this.f473594d = h0Var;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "TempFileIconLoader";
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.h0 h0Var = this.f473594d;
        com.tencent.mm.vfs.r6 absoluteFile = h0Var.f473627b.getFileSystem().getAbsoluteFile(h0Var.f473626a);
        if (absoluteFile == null) {
            h0Var.f473628c.a("Failed to load icon via temp file", h0Var);
            return;
        }
        java.lang.String u17 = absoluteFile.u();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(u17);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/tabbar/TempFileIconLoader$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
        yj0.a.e(obj, decodeFile, "com/tencent/mm/plugin/appbrand/widget/tabbar/TempFileIconLoader$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
        if (decodeFile == null) {
            h0Var.f473628c.a("Failed to load icon via temp file", h0Var);
            return;
        }
        zl1.z zVar = h0Var.f473631f;
        if (zVar != null) {
            zVar.a(decodeFile, h0Var);
        }
    }
}
