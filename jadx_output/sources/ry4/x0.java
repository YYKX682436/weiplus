package ry4;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401687d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ry4.d1 d1Var) {
        super(3);
        this.f401687d = d1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem item = (com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        android.view.View anchorView = (android.view.View) obj3;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(anchorView, "anchorView");
        ry4.d1 d1Var = this.f401687d;
        rl5.r rVar = d1Var.f401614m;
        if (rVar != null) {
            rVar.g(anchorView, intValue, -1L, new ry4.z0(d1Var), new ry4.a1(d1Var, intValue), 0, 0);
        }
        return jz5.f0.f302826a;
    }
}
