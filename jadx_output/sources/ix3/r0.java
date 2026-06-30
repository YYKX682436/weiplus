package ix3;

/* loaded from: classes4.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ix3.r0 f295542d = new ix3.r0();

    public r0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            java.util.HashSet hashSet = com.tencent.mm.plugin.repairer.ui.RepairerMainUI.d;
            java.lang.reflect.Field declaredField = com.tencent.mm.plugin.repairer.ui.RepairerMainUI.class.getDeclaredField("hostMap");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(null);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            return (java.util.Map) obj;
        } catch (java.lang.Exception unused) {
            return kz5.b1.e(new jz5.l("现网", ""));
        }
    }
}
