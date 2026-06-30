package dk2;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f234263f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(dk2.r4 r4Var, android.view.View view, int i17) {
        super(0);
        this.f234261d = r4Var;
        this.f234262e = view;
        this.f234263f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.r4 r4Var = this.f234261d;
        java.util.ArrayList arrayList = r4Var.f234011f;
        int i17 = this.f234263f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.view.View view = this.f234262e;
        arrayList.add(new jz5.l(view, valueOf));
        com.tencent.mars.xlog.Log.i(r4Var.f234009d, "cache view:" + view.getClass().getSimpleName() + " visibility:" + i17);
        return jz5.f0.f302826a;
    }
}
