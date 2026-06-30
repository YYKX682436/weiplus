package r50;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f392614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f392615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity appCompatActivity, r50.j0 j0Var) {
        super(0);
        this.f392614d = appCompatActivity;
        this.f392615e = j0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f392614d;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.vas.VASActivity");
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5(((com.tencent.mm.ui.vas.VASActivity) appCompatActivity).getContainerActivity());
        f5Var.f210400e = this.f392615e;
        return f5Var;
    }
}
