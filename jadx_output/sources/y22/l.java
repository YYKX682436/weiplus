package y22;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.m f459097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f459099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f459100g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f459101h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f459102i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(y22.m mVar, android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        super(0);
        this.f459097d = mVar;
        this.f459098e = context;
        this.f459099f = charSequence;
        this.f459100g = z17;
        this.f459101h = i17;
        this.f459102i = onCancelListener;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        y22.m mVar = this.f459097d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = mVar.f459103a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        mVar.f459103a = com.tencent.mm.ui.widget.dialog.u3.f(this.f459098e, this.f459099f, this.f459100g, this.f459101h, this.f459102i);
        return jz5.f0.f302826a;
    }
}
