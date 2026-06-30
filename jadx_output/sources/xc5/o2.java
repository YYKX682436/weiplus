package xc5;

/* loaded from: classes12.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.s2 f453545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(xc5.s2 s2Var, mf3.k kVar) {
        super(1);
        this.f453545d = s2Var;
        this.f453546e = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lg3.a aVar;
        float floatValue = ((java.lang.Number) obj).floatValue();
        xc5.s2 s2Var = this.f453545d;
        if (s2Var.f453567y && (aVar = s2Var.f453565w) != null) {
            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).h(this.f453546e, new vf3.f(vf3.e.f436380g, null, 0, floatValue, 6, null));
        }
        return jz5.f0.f302826a;
    }
}
