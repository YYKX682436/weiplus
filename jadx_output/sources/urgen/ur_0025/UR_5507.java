package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0011"}, d2 = {"Lurgen/ur_0025/UR_5507;", "", "<init>", "()V", "URB_9C1C", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", com.tencent.mapsdk.internal.cm.a_, "", "(Lcom/tencent/unit_rc/BaseObjectDef;[Lcom/tencent/unit_rc/BaseObjectDef;)V", "URB_BF5C", "feed", "", "URB_3EB3", "code", "", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UR_5507 {
    public static final urgen.ur_0025.UR_5507 INSTANCE = new urgen.ur_0025.UR_5507();

    private UR_5507() {
    }

    public static final void URB_3EB3(com.tencent.unit_rc.BaseObjectDef obj, int code) {
        kotlin.jvm.internal.o.g(obj, "obj");
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_9C1C(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef[] services) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(services, "services");
        android.support.v4.media.f.a(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList(services.length);
        for (com.tencent.unit_rc.BaseObjectDef baseObjectDef : services) {
            kotlin.jvm.internal.o.e(baseObjectDef, "null cannot be cast to non-null type com.tencent.mm.plugin.ting.ur.PlayTaskService");
            arrayList.add((jm4.k3) baseObjectDef);
        }
        throw null;
    }

    public static final void URB_BF5C(com.tencent.unit_rc.BaseObjectDef obj, byte[] feed) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(feed, "feed");
        android.support.v4.media.f.a(obj);
        throw null;
    }
}
