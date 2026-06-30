package jf;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f299339d;

    public m(android.content.Context context) {
        this.f299339d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj1.b bVar;
        sj1.l.i("", "Native", "Finish");
        sj1.l.b("");
        java.io.File externalFilesDir = this.f299339d.getExternalFilesDir("");
        kotlin.jvm.internal.o.d(externalFilesDir);
        java.lang.String filePath = externalFilesDir.getAbsolutePath() + java.io.File.separator + "test.trace";
        kotlin.jvm.internal.o.g(filePath, "filePath");
        if (!sj1.l.f408372b || (bVar = (sj1.b) sj1.l.f408373c.get("")) == null) {
            return;
        }
        bVar.e(filePath);
    }
}
