package if0;

/* loaded from: classes9.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if0.w f291050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.zs4 f291052f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(if0.w wVar, android.view.View view, r45.zs4 zs4Var) {
        super(1);
        this.f291050d = wVar;
        this.f291051e = view;
        this.f291052f = zs4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            if0.w wVar = this.f291050d;
            wVar.getClass();
            pm0.v.X(new if0.s(this.f291051e, this.f291052f, wVar));
        }
        return jz5.f0.f302826a;
    }
}
