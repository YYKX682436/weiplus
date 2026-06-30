package ry2;

/* loaded from: classes10.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.q0 f401404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f401405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ry2.q0 q0Var, android.graphics.Bitmap bitmap) {
        super(0);
        this.f401404d = q0Var;
        this.f401405e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("Finder.PostVideoWidget", "postToShowThumb");
        ry2.q0 q0Var = this.f401404d;
        q0Var.z(this.f401405e);
        android.widget.ImageView imageView = q0Var.f401450r;
        if (imageView != null) {
            imageView.setOnClickListener(new ry2.k0(q0Var));
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("thumbIv");
        throw null;
    }
}
