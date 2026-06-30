package u85;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f425715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f425716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.os.Bundle bundle, com.tencent.mm.ipcinvoker.r rVar) {
        super(1);
        this.f425715d = bundle;
        this.f425716e = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.os.Bundle bundle = this.f425715d;
        bundle.putBoolean("task_result", booleanValue);
        com.tencent.mm.ipcinvoker.r rVar = this.f425716e;
        if (rVar != null) {
            rVar.a(bundle);
        }
        return jz5.f0.f302826a;
    }
}
