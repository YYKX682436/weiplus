package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f214855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f214856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f214857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f214858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f214859h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xwebutil.p0 f214860i;

    public n0(com.tencent.mm.xwebutil.p0 p0Var, double d17, double d18, double d19, double d27, double d28) {
        this.f214860i = p0Var;
        this.f214855d = d17;
        this.f214856e = d18;
        this.f214857f = d19;
        this.f214858g = d27;
        this.f214859h = d28;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.location.Location location = new android.location.Location("xweb");
        location.setLatitude(this.f214855d);
        location.setLongitude(this.f214856e);
        location.setAccuracy((float) this.f214857f);
        location.setAltitude(this.f214858g);
        location.setSpeed((float) this.f214859h);
        location.setTime(java.lang.System.currentTimeMillis());
        this.f214860i.f214867b.getClass();
        tx5.j.d(80030, new java.lang.Object[]{location});
    }
}
