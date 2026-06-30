package hr3;

/* loaded from: classes3.dex */
public final class od extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f283862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.rd f283863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(androidx.appcompat.app.AppCompatActivity appCompatActivity, hr3.rd rdVar) {
        super(0);
        this.f283862d = appCompatActivity;
        this.f283863e = rdVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f283862d;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.vas.VASActivity");
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(((com.tencent.mm.ui.vas.VASActivity) appCompatActivity).getContainerActivity());
        f5Var.f210400e = this.f283863e;
        return f5Var;
    }
}
