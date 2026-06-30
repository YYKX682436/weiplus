package tn0;

/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un0.h f420723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420724e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(un0.h hVar, tn0.w0 w0Var) {
        super(0);
        this.f420723d = hVar;
        this.f420724e = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f420723d.f429356e;
        if (bitmap != null) {
            tn0.w0 w0Var = this.f420724e;
            w0Var.N0(bitmap, 1);
            w0Var.d0(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "#startScreenCastPreview set cover when screen cast stop.");
        }
        return jz5.f0.f302826a;
    }
}
