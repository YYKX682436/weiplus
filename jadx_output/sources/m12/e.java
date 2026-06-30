package m12;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rm5.k f322830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.a f322831e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rm5.k kVar, com.tencent.mm.plugin.gif.a aVar) {
        super(1);
        this.f322830d = kVar;
        this.f322831e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f322830d.destroy();
        this.f322831e.b();
        return jz5.f0.f302826a;
    }
}
