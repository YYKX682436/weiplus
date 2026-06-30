package pc;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353204d;

    public e(java.lang.String str) {
        this.f353204d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f353204d;
        try {
            java.io.File file = new java.io.File(str);
            if (file.exists() && !file.delete()) {
                mc.p.f325531a.e("CommonUtils", "delete file error， path:" + str);
            }
        } catch (java.lang.Exception e17) {
            mc.p.f325531a.e("CommonUtils", "delete file error: " + e17.getLocalizedMessage());
        }
    }
}
