package ya2;

/* loaded from: classes10.dex */
public final class c1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f460461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ya2.e1 f460462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f460463c;

    public c1(android.content.Intent intent, ya2.e1 e1Var, android.content.Context context) {
        this.f460461a = intent;
        this.f460462b = e1Var;
        this.f460463c = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        android.content.Context context = this.f460463c;
        ya2.e1 e1Var = this.f460462b;
        if ((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            java.lang.Long valueOf = finderObject != null ? java.lang.Long.valueOf(finderObject.getId()) : null;
            android.content.Intent intent = this.f460461a;
            intent.putExtra("KEY_OBJECT_ID", valueOf);
            e1Var.C(context, intent);
        } else {
            ya2.e1.i(e1Var, context, fVar.f70616b, fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
