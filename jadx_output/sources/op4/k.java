package op4;

/* loaded from: classes10.dex */
public abstract class k implements ju3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public jx3.a f347291d;

    public abstract void a(android.content.Intent intent);

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i(i(), "report:" + g());
        jx3.a aVar = this.f347291d;
        if (aVar != null) {
            aVar.k();
        }
    }

    public abstract java.lang.String g();

    public final void h() {
        com.tencent.mars.xlog.Log.i(i(), "reportOnce:" + g());
        jx3.a aVar = this.f347291d;
        if (aVar != null) {
            aVar.k();
        }
        this.f347291d = null;
    }

    public final java.lang.String i() {
        return "MicroMsg.TimelineEditorReportBasePlugin" + g();
    }
}
