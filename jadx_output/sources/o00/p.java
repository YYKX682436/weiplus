package o00;

/* loaded from: classes8.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI f341876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341877e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341878f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI ecsGiftSendThanksLogicUI, java.lang.String str, java.lang.String str2) {
        super(1);
        this.f341876d = ecsGiftSendThanksLogicUI;
        this.f341877e = str;
        this.f341878f = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kotlinx.coroutines.y0 b17 = v65.m.b(this.f341876d);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new o00.o(booleanValue, this.f341877e, this.f341876d, this.f341878f, null), 2, null);
        return jz5.f0.f302826a;
    }
}
