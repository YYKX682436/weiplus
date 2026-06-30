package vd2;

/* loaded from: classes3.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f435669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f435672g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.wk0 f435673h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f435674i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(vd2.f1 f1Var, android.content.Context context, android.content.Intent intent, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.wk0 wk0Var, ss5.d0 d0Var) {
        super(0);
        this.f435669d = f1Var;
        this.f435670e = context;
        this.f435671f = intent;
        this.f435672g = finderObject;
        this.f435673h = wk0Var;
        this.f435674i = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f435669d.Ni(this.f435670e, this.f435671f, kz5.b0.c(this.f435672g), 0, this.f435673h, this.f435674i);
        return jz5.f0.f302826a;
    }
}
