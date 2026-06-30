package oc5;

/* loaded from: classes12.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.t f344410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oc5.g0 f344411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f344412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f344413g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f344414h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ oc5.n f344415i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(oc5.t tVar, oc5.g0 g0Var, android.view.View view, android.graphics.Point point, android.graphics.Bitmap bitmap, oc5.n nVar) {
        super(0);
        this.f344410d = tVar;
        this.f344411e = g0Var;
        this.f344412f = view;
        this.f344413g = point;
        this.f344414h = bitmap;
        this.f344415i = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        db5.f0 f0Var = (db5.f0) this.f344412f;
        android.graphics.Point point = this.f344413g;
        oc5.g0 g0Var = this.f344411e;
        oc5.t tVar = this.f344410d;
        tVar.f344476d = g0Var.d(tVar, f0Var, null, point);
        tVar.f344482j = !kotlin.jvm.internal.o.b(r0, this.f344414h);
        android.graphics.Bitmap bitmap = tVar.f344476d;
        if (bitmap != null) {
            bitmap.isRecycled();
        }
        g0Var.c(tVar, this.f344415i);
        return jz5.f0.f302826a;
    }
}
