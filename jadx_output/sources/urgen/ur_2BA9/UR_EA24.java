package urgen.ur_2BA9;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0087 J)\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0087 J(\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J(\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0007¨\u0006\u0016"}, d2 = {"Lurgen/ur_2BA9/UR_EA24;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_4D3C", "", "ptr", "", "context", "", "event", "", "msg", "UR_8654", "position", "displayTimeMs", "duration", "URB_4D3C", "obj", "URB_8654", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UR_EA24 {
    public static final urgen.ur_2BA9.UR_EA24 INSTANCE = new urgen.ur_2BA9.UR_EA24();

    private UR_EA24() {
    }

    public static final void URB_4D3C(com.tencent.unit_rc.BaseObjectDef obj, byte[] context, int event, byte[] msg) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msg, "msg");
        ((b66.t) obj).o(context, event, msg);
    }

    public static final void URB_8654(com.tencent.unit_rc.BaseObjectDef obj, long position, long displayTimeMs, long duration) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((b66.t) obj).x(position, displayTimeMs, duration);
    }

    public static final native void UR_4D3C(long ptr, byte[] context, int event, byte[] msg);

    public static final native void UR_8654(long ptr, long position, long displayTimeMs, long duration);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new b66.u();
    }
}
