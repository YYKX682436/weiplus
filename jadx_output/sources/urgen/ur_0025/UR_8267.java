package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J!\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0087 J)\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0087 J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J(\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0015"}, d2 = {"Lurgen/ur_0025/UR_8267;", "", "<init>", "()V", "UR_C", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_A155", "", "ptr", "", "state", "", "event", "UR_BF6B", "position", "duration", "loudness", "", "URB_A155", "obj", "URB_BF6B", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UR_8267 {
    public static final urgen.ur_0025.UR_8267 INSTANCE = new urgen.ur_0025.UR_8267();

    private UR_8267() {
    }

    public static final void URB_A155(com.tencent.unit_rc.BaseObjectDef obj, int state, int event) {
        kotlin.jvm.internal.o.g(obj, "obj");
        UR_A155(((jm4.o4) ((jm4.n4) obj)).getCppPointer(), state, event);
    }

    public static final void URB_BF6B(com.tencent.unit_rc.BaseObjectDef obj, int position, int duration, double loudness) {
        kotlin.jvm.internal.o.g(obj, "obj");
        UR_BF6B(((jm4.o4) ((jm4.n4) obj)).getCppPointer(), position, duration, loudness);
    }

    public static final native void UR_A155(long ptr, int state, int event);

    public static final native void UR_BF6B(long ptr, int position, int duration, double loudness);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new jm4.o4();
    }
}
