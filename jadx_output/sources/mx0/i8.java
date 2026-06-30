package mx0;

/* loaded from: classes5.dex */
public final class i8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f332050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(android.content.Context context, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332050d = context;
        this.f332051e = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yt3.x3 x3Var = new yt3.x3(this.f332050d);
        x3Var.f465720g = this.f332051e;
        return x3Var;
    }
}
