package ux1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f431840d;

    /* renamed from: e, reason: collision with root package name */
    public final long f431841e;

    /* renamed from: f, reason: collision with root package name */
    public final int f431842f;

    public a(java.lang.Class cls, int i17) {
        this.f431841e = 0L;
        this.f431842f = 0;
        this.f431840d = cls;
        this.f431842f = i17;
        this.f431841e = java.lang.System.currentTimeMillis();
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append("#exec_bad#");
        java.lang.Class cls = this.f431840d;
        sb6.append(cls.getName());
        sb6.append("#");
        sb6.append(cls.getGenericSuperclass());
        sb6.append("#");
        sb6.append(this.f431842f);
        com.tencent.mars.xlog.Log.e("MicroMsg.BadBinder", sb6.toString());
    }
}
