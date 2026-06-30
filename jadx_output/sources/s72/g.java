package s72;

/* loaded from: classes11.dex */
public final class g implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f404030d;

    public g(yz5.l lVar) {
        this.f404030d = lVar;
    }

    @Override // com.tencent.mm.network.l0
    public final void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f404030d.invoke(new s72.a(i18, i19, str, v0Var, bArr));
    }
}
