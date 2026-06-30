package ry2;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f401459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f401460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ry2.t f401461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f401462g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, boolean z17, ry2.t tVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f401459d = i17;
        this.f401460e = z17;
        this.f401461f = tVar;
        this.f401462g = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.PostImageWidget", "add thumb file, index:" + this.f401459d);
        if (this.f401460e) {
            ry2.t tVar = this.f401461f;
            tVar.getClass();
            pm0.v.X(new ry2.c(this.f401462g, tVar));
            android.widget.ImageView imageView = tVar.f401487q;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("thumbIv");
                throw null;
            }
            imageView.setOnClickListener(new ry2.q(tVar));
        }
        return jz5.f0.f302826a;
    }
}
