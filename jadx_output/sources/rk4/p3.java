package rk4;

/* loaded from: classes11.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.q3 f396893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(rk4.q3 q3Var, java.lang.String str) {
        super(1);
        this.f396893d = q3Var;
        this.f396894e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.ting.TingTextureInfo newTextureInfo = (com.tencent.pigeon.ting.TingTextureInfo) obj;
        kotlin.jvm.internal.o.g(newTextureInfo, "newTextureInfo");
        this.f396893d.f396928e.put(this.f396894e, newTextureInfo);
        return jz5.f0.f302826a;
    }
}
