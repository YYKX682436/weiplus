package uw0;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f431614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.x f431615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, uw0.x xVar) {
        super(0);
        this.f431614d = context;
        this.f431615e = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(this.f431614d);
        uw0.x xVar = this.f431615e;
        android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.dve, (android.view.ViewGroup) xVar, false);
        inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, xVar.f431623z1));
        return inflate;
    }
}
