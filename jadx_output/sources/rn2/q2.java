package rn2;

/* loaded from: classes15.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(rn2.t2 t2Var) {
        super(2);
        this.f397825d = t2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction action = (com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction) obj;
        r45.h32 h32Var = (r45.h32) obj2;
        kotlin.jvm.internal.o.g(action, "action");
        if (action != com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction.NONE) {
            rn2.t2 t2Var = this.f397825d;
            rn2.f fVar = t2Var.f397854f;
            if (fVar != null) {
                rn2.c1 c1Var = (rn2.c1) fVar;
                c1Var.f397674q = h32Var;
                c1Var.g(c1Var.f397668h, true);
            }
            t2Var.w();
        }
        return jz5.f0.f302826a;
    }
}
