package qi3;

/* loaded from: classes12.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final qi3.g0 f363691a;

    /* renamed from: b, reason: collision with root package name */
    public final qi3.b0 f363692b;

    /* renamed from: c, reason: collision with root package name */
    public qi3.f0 f363693c;

    /* renamed from: d, reason: collision with root package name */
    public qi3.i0 f363694d;

    /* renamed from: e, reason: collision with root package name */
    public qi3.d0 f363695e;

    /* renamed from: f, reason: collision with root package name */
    public qi3.k0 f363696f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.msg.MsgIdTalker f363697g;

    /* renamed from: h, reason: collision with root package name */
    public float f363698h;

    public e0(qi3.g0 status, qi3.b0 sendTask) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(sendTask, "sendTask");
        this.f363691a = status;
        this.f363692b = sendTask;
    }

    public int a() {
        qi3.d0 d0Var = this.f363695e;
        if (d0Var != null) {
            return d0Var.f363683a;
        }
        qi3.i0 i0Var = this.f363694d;
        if (i0Var != null) {
            return i0Var.f363725a;
        }
        qi3.f0 f0Var = this.f363693c;
        if (f0Var != null) {
            return f0Var.f363700a;
        }
        return 0;
    }

    public java.lang.String toString() {
        return "SendMsgEvent:[status:" + this.f363691a + ",id:" + this.f363692b.id() + ", retCode:" + a() + ", idTalker:" + this.f363697g + " percent:" + this.f363698h + ']';
    }
}
