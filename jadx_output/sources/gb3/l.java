package gb3;

/* loaded from: classes9.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f270017a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f270018b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f270019c = new java.util.HashMap();

    public static com.tencent.mm.plugin.luckymoney.model.e1 a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return (com.tencent.mm.plugin.luckymoney.model.e1) ((java.util.HashMap) f270017a).get(str);
    }

    public static void b(java.lang.String str, com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        ((java.util.HashMap) f270017a).put(str, e1Var);
    }
}
