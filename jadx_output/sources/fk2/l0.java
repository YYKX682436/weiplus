package fk2;

/* loaded from: classes3.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.m0 f263422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f263424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263425g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(fk2.m0 m0Var, android.content.Context context, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.lang.String str) {
        super(0);
        this.f263422d = m0Var;
        this.f263423e = context;
        this.f263424f = finderJumpInfo;
        this.f263425g = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f263422d.q(this.f263423e, this.f263424f, this.f263425g);
        return jz5.f0.f302826a;
    }
}
