package yj2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f462644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yj2.e f462645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f462646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.graphics.Bitmap bitmap, yj2.e eVar, boolean z17) {
        super(0);
        this.f462644d = bitmap;
        this.f462645e = eVar;
        this.f462646f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f462644d != null) {
            this.f462645e.getViewBinding().f262046d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(this.f462645e.getContext().getResources(), this.f462644d));
            yj2.e eVar = this.f462645e;
            eVar.b(this.f462646f && eVar.f462656m);
            yj2.f fVar = this.f462645e.f462653g;
            if (fVar != null) {
                fVar.f462662c++;
                com.tencent.mars.xlog.Log.i("PreviewCountDownData", "cur: " + fVar.f462662c + " sum: " + fVar.f462660a + " code: " + fVar.hashCode());
                if (fVar.f462662c == fVar.f462660a) {
                    fVar.f462661b.invoke();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
