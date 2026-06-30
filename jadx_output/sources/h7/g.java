package h7;

/* loaded from: classes13.dex */
public class g implements t6.o {
    @Override // t6.o
    public t6.c a(t6.l lVar) {
        return t6.c.SOURCE;
    }

    @Override // t6.d
    public boolean b(java.lang.Object obj, java.io.File file, t6.l lVar) {
        try {
            q7.c.b(((s6.f) ((h7.f) ((w6.z0) obj).get()).f279333d.f279332a.f279349a).f403296d.asReadOnlyBuffer(), file);
            return true;
        } catch (java.io.IOException unused) {
            android.util.Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }
}
