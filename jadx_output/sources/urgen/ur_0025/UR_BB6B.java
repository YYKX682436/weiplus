package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J4\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\u0012"}, d2 = {"Lurgen/ur_0025/UR_BB6B;", "", "<init>", "()V", "URB_EC19", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "service", "URB_295F", "item", "", "URB_4EA7", "context", "state", "", "event", "eventContext", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_BB6B {
    public static final urgen.ur_0025.UR_BB6B INSTANCE = new urgen.ur_0025.UR_BB6B();

    private UR_BB6B() {
    }

    public static final void URB_295F(com.tencent.unit_rc.BaseObjectDef obj, byte[] item) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(item, "item");
        ((jm4.n3) obj).c9(item);
    }

    public static final void URB_4EA7(com.tencent.unit_rc.BaseObjectDef obj, byte[] context, int state, int event, byte[] eventContext) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((jm4.n3) obj).f1(context != null ? (bw5.kq0) jm4.r5.b(context, new bw5.kq0()) : null, state, event, eventContext != null ? (bw5.mq0) jm4.r5.b(eventContext, new bw5.mq0()) : null);
    }

    public static final void URB_EC19(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef service) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((jm4.n3) obj).Mc((jm4.k3) service);
    }
}
