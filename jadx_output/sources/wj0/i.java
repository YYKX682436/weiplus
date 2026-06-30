package wj0;

/* loaded from: classes5.dex */
public class i implements com.tencent.mm.app.a3 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean[] f446561d = {false};

    @Override // com.tencent.mm.app.a3
    public android.os.Handler getHandler() {
        return null;
    }

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        boolean[] zArr = f446561d;
        synchronized (zArr) {
            zArr[0] = false;
        }
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        boolean[] zArr = f446561d;
        synchronized (zArr) {
            zArr[0] = true;
        }
    }
}
