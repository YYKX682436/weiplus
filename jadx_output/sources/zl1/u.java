package zl1;

/* loaded from: classes7.dex */
public class u implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl1.v f473625d;

    public u(zl1.v vVar) {
        this.f473625d = vVar;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "Base64IconLoader";
    }

    @Override // java.lang.Runnable
    public void run() {
        zl1.v vVar = this.f473625d;
        try {
            android.graphics.Bitmap c17 = zl1.v.c(vVar, vVar.f473626a);
            zl1.z zVar = vVar.f473631f;
            if (zVar != null) {
                zVar.a(c17, vVar);
            }
        } catch (java.lang.Exception unused) {
            vVar.f473628c.a("Failed to load icon via base64 icon", vVar);
        }
    }
}
