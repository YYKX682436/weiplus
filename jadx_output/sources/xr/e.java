package xr;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f456142a;

    /* renamed from: b, reason: collision with root package name */
    public final qk.h6 f456143b;

    /* renamed from: c, reason: collision with root package name */
    public final as.a f456144c;

    public e(int i17, qk.h6 item, as.a executor) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(executor, "executor");
        this.f456142a = i17;
        this.f456143b = item;
        this.f456144c = executor;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof xr.e) {
            return kotlin.jvm.internal.o.b(((xr.e) obj).f456143b.field_functionmsgid, this.f456143b.field_functionmsgid);
        }
        return false;
    }

    public java.lang.String toString() {
        return "FunctionMsgTask(mOpCode=" + this.f456142a + ", mItem=" + this.f456143b + ')';
    }
}
