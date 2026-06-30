package lm5;

/* loaded from: classes7.dex */
public class j extends lm5.d {

    /* renamed from: d, reason: collision with root package name */
    public final lm5.a f319617d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Looper f319618e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f319619f;

    public j(lm5.a aVar, java.lang.String str) {
        this.f319618e = aVar.getLooper();
        this.f319617d = aVar;
        this.f319619f = str;
    }

    @Override // lm5.d
    public void a(java.lang.Runnable runnable) {
        this.f319617d.post(runnable);
    }

    @Override // lm5.d
    public void b(java.lang.Runnable runnable, long j17) {
        lm5.a aVar = this.f319617d;
        if (j17 >= 0) {
            aVar.postDelayed(runnable, j17);
        } else {
            aVar.post(runnable);
        }
    }

    @Override // lm5.d
    public void c() {
        this.f319617d.a();
    }

    @Override // lm5.d
    public java.lang.String d() {
        return this.f319619f;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SingleScheduler{, mLooper=");
        android.os.Looper looper = this.f319618e;
        sb6.append(looper);
        sb6.append(", mType='");
        sb6.append(this.f319619f);
        sb6.append("', Thread =");
        sb6.append(looper.getThread());
        sb6.append(", Object=");
        sb6.append(super.toString());
        sb6.append('}');
        return sb6.toString();
    }

    public j(android.os.Looper looper, java.lang.String str) {
        this(new lm5.b(new android.os.Handler(looper)), str);
    }
}
