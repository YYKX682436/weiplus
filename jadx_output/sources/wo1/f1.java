package wo1;

/* loaded from: classes5.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.i1 f447935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(wo1.i1 i1Var) {
        super(0);
        this.f447935d = i1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.reflect.Field declaredField = y9.i.class.getDeclaredField("f");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(this.f447935d);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<*>");
        return (com.google.android.material.bottomsheet.BottomSheetBehavior) obj;
    }
}
