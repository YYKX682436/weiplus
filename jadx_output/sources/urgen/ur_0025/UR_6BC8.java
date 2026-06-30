package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J+\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J \u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fH\u0007J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0015"}, d2 = {"Lurgen/ur_0025/UR_6BC8;", "", "<init>", "()V", "URB_432E", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "categoryId", "", "count", "", "URB_8544", "msgList", "", "", "(Lcom/tencent/unit_rc/BaseObjectDef;Ljava/lang/String;[[B)V", "URB_E60D", "URB_E53A", "msg", "URB_88AD", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UR_6BC8 {
    public static final urgen.ur_0025.UR_6BC8 INSTANCE = new urgen.ur_0025.UR_6BC8();

    private UR_6BC8() {
    }

    public static final void URB_432E(com.tencent.unit_rc.BaseObjectDef obj, java.lang.String categoryId, int count) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(categoryId, "categoryId");
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_8544(com.tencent.unit_rc.BaseObjectDef obj, java.lang.String categoryId, byte[][] msgList) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(categoryId, "categoryId");
        kotlin.jvm.internal.o.g(msgList, "msgList");
        int length = msgList.length;
        bw5.kb0[] kb0VarArr = new bw5.kb0[length];
        for (int i17 = 0; i17 < length; i17++) {
            kb0VarArr[i17] = new bw5.kb0();
        }
        jm4.r5.c(msgList, kb0VarArr);
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_88AD(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_E53A(com.tencent.unit_rc.BaseObjectDef obj, java.lang.String categoryId, byte[] msg) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(categoryId, "categoryId");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.support.v4.media.f.a(obj);
        throw null;
    }

    public static final void URB_E60D(com.tencent.unit_rc.BaseObjectDef obj, java.lang.String categoryId) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(categoryId, "categoryId");
        android.support.v4.media.f.a(obj);
        throw null;
    }
}
