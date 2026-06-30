package vd2;

/* loaded from: classes3.dex */
public final class d1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f435695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f435696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435697c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wk0 f435699e;

    public d1(ss5.d0 d0Var, vd2.f1 f1Var, android.content.Context context, android.content.Intent intent, r45.wk0 wk0Var) {
        this.f435695a = d0Var;
        this.f435696b = f1Var;
        this.f435697c = context;
        this.f435698d = intent;
        this.f435699e = wk0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ss5.d0 d0Var = this.f435695a;
        if (d0Var != null) {
            kotlin.jvm.internal.o.d(fVar);
            d0Var.c(fVar);
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && finderObject != null) {
            pm0.v.X(new vd2.c1(this.f435696b, this.f435697c, this.f435698d, finderObject, this.f435699e, this.f435695a));
        } else {
            java.lang.String str = this.f435696b.f435725d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterLiveD error ");
            sb6.append(fVar.f70615a);
            sb6.append(", ");
            sb6.append(fVar.f70616b);
            sb6.append(", ");
            sb6.append(finderObject != null ? java.lang.Integer.valueOf(finderObject.hashCode()) : null);
            com.tencent.mars.xlog.Log.w(str, sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
