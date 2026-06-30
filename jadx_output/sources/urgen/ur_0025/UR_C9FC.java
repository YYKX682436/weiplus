package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, d2 = {"Lurgen/ur_0025/UR_C9FC;", "", "<init>", "()V", "URB_0B3A", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "listenId", "", "lyricItem", "", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UR_C9FC {
    public static final urgen.ur_0025.UR_C9FC INSTANCE = new urgen.ur_0025.UR_C9FC();

    private UR_C9FC() {
    }

    public static final void URB_0B3A(com.tencent.unit_rc.BaseObjectDef obj, java.lang.String listenId, byte[] lyricItem) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(listenId, "listenId");
        ((ku5.t0) ku5.t0.f312615d).h(new tl4.i((tl4.l) ((jm4.b2) obj), listenId, lyricItem != null ? (bw5.tp0) jm4.r5.b(lyricItem, new bw5.tp0()) : null), "MicroMsg.TingPlayAppNotificationModule");
    }
}
