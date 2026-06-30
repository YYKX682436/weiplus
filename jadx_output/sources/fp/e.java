package fp;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public fp.d f265176a;

    public e(android.content.Context context) {
        this.f265176a = null;
        context = context instanceof android.app.Activity ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
        if (fp.h.c(8)) {
            this.f265176a = new fp.g(context);
        }
    }

    public boolean a() {
        synchronized ("audio_lock") {
            fp.d dVar = this.f265176a;
            if (dVar == null) {
                return false;
            }
            return ((fp.g) dVar).a();
        }
    }

    public boolean b() {
        synchronized ("audio_lock") {
            fp.d dVar = this.f265176a;
            if (dVar == null) {
                return false;
            }
            return ((fp.g) dVar).c();
        }
    }
}
