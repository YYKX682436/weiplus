package dl4;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f235355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f235356f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f235357g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ff0.r f235358h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, dl4.m0 m0Var, ff0.r rVar) {
        super(0);
        this.f235354d = str;
        this.f235355e = view;
        this.f235356f = bitmap;
        this.f235357g = m0Var;
        this.f235358h = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        android.view.View view = this.f235355e;
        java.util.Objects.toString(view != null ? view.getTag(com.tencent.mm.R.id.f487310o93) : null);
        android.graphics.Bitmap bitmap = this.f235356f;
        java.util.Objects.toString(bitmap);
        boolean b17 = kotlin.jvm.internal.o.b(view != null ? view.getTag(com.tencent.mm.R.id.f487310o93) : null, this.f235354d);
        ff0.r rVar = this.f235358h;
        if (b17) {
            this.f235357g.getClass();
            pm0.v.X(new dl4.j0(bitmap, view));
            if (rVar != null) {
                z17 = (bitmap == null || bitmap.isRecycled()) ? false : true;
                yz5.l lVar = ((dl4.i0) rVar).f235413a;
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.valueOf(z17));
                }
            }
        } else if (rVar != null) {
            z17 = view == null;
            yz5.l lVar2 = ((dl4.i0) rVar).f235413a;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.valueOf(z17));
            }
        }
        return jz5.f0.f302826a;
    }
}
