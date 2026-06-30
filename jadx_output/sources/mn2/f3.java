package mn2;

/* loaded from: classes10.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.g3 f329974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(mn2.g3 g3Var) {
        super(0);
        this.f329974d = g3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        fVar.f464085i = new android.graphics.drawable.BitmapDrawable((android.graphics.Bitmap) ((jz5.n) this.f329974d.f330001z).getValue());
        int i17 = com.tencent.mm.plugin.finder.storage.t70.f127832n;
        fVar.f464082f = i17;
        fVar.f464081e = i17;
        return fVar.a();
    }
}
