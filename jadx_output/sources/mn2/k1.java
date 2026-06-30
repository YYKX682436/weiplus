package mn2;

/* loaded from: classes10.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.g3 f330033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(mn2.g3 g3Var) {
        super(0);
        this.f330033d = g3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        fVar.f464085i = new android.graphics.drawable.BitmapDrawable((android.graphics.Bitmap) ((jz5.n) this.f330033d.f329999y).getValue());
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        fVar.f464082f = t70Var.f();
        fVar.f464081e = t70Var.f();
        fVar.f464089m = true;
        return fVar.a();
    }
}
