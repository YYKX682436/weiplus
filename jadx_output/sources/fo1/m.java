package fo1;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final fo1.m f264882a = new fo1.m();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f264883b = jz5.h.b(fo1.l.f264881d);

    public final void a(java.lang.String tag, bw5.w0 roamPackage) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(roamPackage, "roamPackage");
    }

    public final void b(java.lang.String tag, java.util.ArrayList inserted) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(inserted, "inserted");
    }

    public final void c(java.lang.String tag, java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(args, "args");
        java.lang.Object value = ((jz5.n) f264883b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mars.xlog.Log.LogInstance) value).e(tag, format, java.util.Arrays.copyOf(args, args.length));
    }

    public final java.lang.String d(bw5.u0 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return "svrId=" + msg.f33677m + ", createTime=" + msg.f33675h + ", type=" + msg.f33671d;
    }

    public final java.lang.String e(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return "svrId=" + msg.I0() + ", createTime=" + msg.getCreateTime() + ", type=" + msg.getType() + ", id=" + msg.getMsgId();
    }

    public final void f(java.lang.String tag, java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(format, "format");
        kotlin.jvm.internal.o.g(args, "args");
        java.lang.Object value = ((jz5.n) f264883b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mars.xlog.Log.LogInstance) value).i(tag, format, java.util.Arrays.copyOf(args, args.length));
    }

    public final void g(java.lang.String tag, long j17, java.lang.String convId, fo1.e action, java.lang.String log) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(convId, "convId");
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(log, "log");
        java.lang.Object value = ((jz5.n) f264883b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mars.xlog.Log.LogInstance) value).i(tag, "pkg=" + j17 + ", conv=" + convId + ", action=" + action + ", " + log, new java.lang.Object[0]);
    }
}
