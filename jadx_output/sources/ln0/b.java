package ln0;

/* loaded from: classes10.dex */
public final class b extends com.qcloud.qvb.Logger {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ln0.p f319643a;

    public b(ln0.p pVar) {
        this.f319643a = pVar;
    }

    @Override // com.qcloud.qvb.Logger
    public void d(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        ln0.p.a(this.f319643a);
    }

    @Override // com.qcloud.qvb.Logger
    public void e(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        ln0.p.a(this.f319643a);
        com.tencent.mars.xlog.Log.e("MicroMsg.MMXp2pWrapper", msg);
    }

    @Override // com.qcloud.qvb.Logger
    public void i(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        ln0.p.a(this.f319643a);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", msg);
    }

    @Override // com.qcloud.qvb.Logger
    public void v(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        ln0.p.a(this.f319643a);
    }

    @Override // com.qcloud.qvb.Logger
    public void w(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        ln0.p.a(this.f319643a);
        com.tencent.mars.xlog.Log.w("MicroMsg.MMXp2pWrapper", msg);
    }
}
