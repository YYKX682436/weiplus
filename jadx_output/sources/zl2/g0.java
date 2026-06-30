package zl2;

/* loaded from: classes.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f473771d;

    /* renamed from: e, reason: collision with root package name */
    public int f473772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f473773f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f473774g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.n f473775h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f473776i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f473777m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f473778n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.view.MenuItem menuItem, v65.n nVar, r45.zc4 zc4Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, r45.zc4 zc4Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f473773f = k0Var;
        this.f473774g = menuItem;
        this.f473775h = nVar;
        this.f473776i = zc4Var;
        this.f473777m = appCompatActivity;
        this.f473778n = zc4Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zl2.g0(this.f473773f, this.f473774g, this.f473775h, this.f473776i, this.f473777m, this.f473778n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zl2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01bb  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
