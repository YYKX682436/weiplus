package e14;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.protobuf.e {
    public a() {
        super(new com.tencent.mm.protobuf.k[0]);
    }

    public final java.lang.Boolean getBooleanWrapper(int i17) {
        java.lang.Object orDefault = getOrDefault(i17);
        if (orDefault instanceof java.lang.Boolean) {
            return (java.lang.Boolean) orDefault;
        }
        return null;
    }

    public final java.lang.Double getDoubleWrapper(int i17) {
        java.lang.Object orDefault = getOrDefault(i17);
        if (orDefault instanceof java.lang.Double) {
            return (java.lang.Double) orDefault;
        }
        return null;
    }

    public final java.lang.Float getFloatWrapper(int i17) {
        return (java.lang.Float) getOrDefault(i17);
    }

    public final java.lang.Integer getIntegerWrapper(int i17) {
        return (java.lang.Integer) getOrDefault(i17);
    }

    public final java.lang.Long getLongWrapper(int i17) {
        return (java.lang.Long) getOrDefault(i17);
    }
}
