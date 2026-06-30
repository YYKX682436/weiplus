package f63;

/* loaded from: classes4.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f259855a;

    public g(yz5.p pVar) {
        this.f259855a = pVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        yz5.p pVar = this.f259855a;
        if (i17 == 0 && fVar.f70616b == 0) {
            v53.i iVar = (v53.i) fVar.f70618d;
            java.lang.String str = iVar.f433342d;
            pVar.invoke(str != null ? str : "", iVar.f433343e);
        } else {
            pVar.invoke("", null);
        }
        return jz5.f0.f302826a;
    }
}
