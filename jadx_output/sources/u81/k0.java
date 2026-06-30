package u81;

/* loaded from: classes7.dex */
public abstract class k0 extends u81.l0 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String[] f425441g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f425442h;

    public k0(java.lang.String str, android.os.Looper looper) {
        super(str, looper);
        this.f425441g = new java.lang.String[]{"invokeEnterMethods", "invokeExitMethods", "handleMessage:", "quit"};
        this.f425442h = false;
        k75.j jVar = this.f304847e;
        if (jVar == null) {
            return;
        }
        jVar.f304831b = true;
    }

    @Override // k75.k
    public void f(java.lang.String str) {
        boolean z17;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        java.lang.String[] strArr = this.f425441g;
        int length = strArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = false;
                break;
            } else {
                if (str.startsWith(strArr[i17])) {
                    z17 = true;
                    break;
                }
                i17++;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(this.f304846d, str);
        }
        if (str.startsWith("handleMessage: E")) {
            this.f425442h = true;
        }
        if (str.startsWith("handleMessage: X")) {
            this.f425442h = false;
        }
    }
}
