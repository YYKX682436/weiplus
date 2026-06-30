package mm2;

/* loaded from: classes3.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.q f329511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(km2.q qVar) {
        super(1);
        this.f329511d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        km2.q qVar = (km2.q) obj;
        km2.q qVar2 = this.f329511d;
        return java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.D0(qVar2 != null ? qVar2.f309170a : null, qVar.f309170a));
    }
}
