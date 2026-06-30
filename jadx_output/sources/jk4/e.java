package jk4;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public jk4.b f300150a;

    /* renamed from: b, reason: collision with root package name */
    public long f300151b;

    /* renamed from: c, reason: collision with root package name */
    public long f300152c;

    /* renamed from: d, reason: collision with root package name */
    public long f300153d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f300154e = new java.util.HashMap();

    public final void a(int i17, jk4.a info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.HashMap hashMap = this.f300154e;
        if (hashMap.isEmpty() || this.f300153d <= 0) {
            this.f300153d = info.f300132b;
        }
        jk4.b bVar = this.f300150a;
        if (bVar != null) {
            info.f300137g = (int) ((((float) bVar.f300143b) * 1.0f) / bVar.f300142a);
            info.f300138h = bVar.f300144c;
            info.f300139i = bVar.f300145d;
            bVar.f300142a = 0;
            bVar.f300143b = 0L;
            bVar.f300144c = 0;
            bVar.f300145d = 0;
        }
        hashMap.put(java.lang.Integer.valueOf(i17), info);
        com.tencent.mars.xlog.Log.i("MicroMsg.MV.MvReportInfo", i17 + ", " + info);
    }

    public java.lang.String toString() {
        java.util.Set entrySet = this.f300154e.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        return kz5.n0.g0(entrySet, null, null, null, 0, null, jk4.d.f300149d, 31, null);
    }
}
