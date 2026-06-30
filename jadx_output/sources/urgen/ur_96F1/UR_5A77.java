package urgen.ur_96F1;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 J\u001b\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0087 J&\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0087 ¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087 J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0007¨\u0006\u001c"}, d2 = {"Lurgen/ur_96F1/UR_5A77;", "", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_C", "", "ptr", "Ljz5/f0;", "UR_3AE4", "runnable", "UR_76C0", "", "", "reportList", "UR_427B", "(J[Ljava/lang/String;)V", "", "languageType", "errorType", "msg", "UR_5026", "obj", "URB_3AE4", "URB_76C0", "URB_427B", "(Lcom/tencent/unit_rc/BaseObjectDef;[Ljava/lang/String;)V", "URB_5026", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes16.dex */
public final class UR_5A77 {
    public static final urgen.ur_96F1.UR_5A77 INSTANCE = new urgen.ur_96F1.UR_5A77();

    private UR_5A77() {
    }

    public static final void URB_3AE4(com.tencent.unit_rc.BaseObjectDef obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((com.tencent.unit_rc.ur.FuncDeclare) obj).Void_Empty();
    }

    public static final void URB_427B(com.tencent.unit_rc.BaseObjectDef obj, java.lang.String[] reportList) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(reportList, "reportList");
        ((com.tencent.unit_rc.ur.FuncDeclare) obj).Void_ListString(reportList);
    }

    public static final void URB_5026(com.tencent.unit_rc.BaseObjectDef obj, int i17, int i18, java.lang.String msg) {
        kotlin.jvm.internal.o.g(obj, "obj");
        kotlin.jvm.internal.o.g(msg, "msg");
        ((com.tencent.unit_rc.ur.FuncDeclare) obj).Void_Uint32Uint32String(i17, i18, msg);
    }

    public static final void URB_76C0(com.tencent.unit_rc.BaseObjectDef obj, com.tencent.unit_rc.BaseObjectDef baseObjectDef) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ((com.tencent.unit_rc.ur.FuncDeclare) obj).Void_Func_Void_Empty(com.tencent.unit_rc.ur.FuncDeclareKt.INSTANCE.Void_Empty_FromObj((com.tencent.unit_rc.ur.FuncDeclare) baseObjectDef));
    }

    public static final native void UR_3AE4(long j17);

    public static final native void UR_427B(long ptr, java.lang.String[] reportList);

    public static final native void UR_5026(long j17, int i17, int i18, java.lang.String str);

    public static final native void UR_76C0(long j17, com.tencent.unit_rc.BaseObjectDef baseObjectDef);

    public static final com.tencent.unit_rc.BaseObjectDef UR_C() {
        return new com.tencent.unit_rc.ur.FuncDeclareCpp();
    }
}
