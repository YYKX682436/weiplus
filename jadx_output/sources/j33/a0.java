package j33;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j33.c0 f297401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(j33.c0 c0Var) {
        super(0);
        this.f297401d = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        j33.c0 c0Var = this.f297401d;
        com.tencent.mars.xlog.Log.i(c0Var.f297425m, "focus to normal last anim end");
        c0Var.f297426n = false;
        yz5.a aVar = c0Var.f297423h;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
