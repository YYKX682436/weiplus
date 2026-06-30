package fr5;

/* loaded from: classes15.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.h f266001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(fr5.h hVar) {
        super(1);
        this.f266001d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fr5.h hVar = this.f266001d;
        if (hVar.f265958i) {
            hVar.f265958i = false;
            hVar.f265950a.removeCallbacks(hVar.f265957h);
            hVar.f265956g.forceFinished(true);
            hVar.f265955f.invoke();
        }
        return jz5.f0.f302826a;
    }
}
