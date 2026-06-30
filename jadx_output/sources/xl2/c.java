package xl2;

/* loaded from: classes.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f455114a;

    public c(yz5.l lVar) {
        this.f455114a = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        yz5.l lVar;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70616b;
        if (i17 == 0 && fVar.f70615a == 0 && (lVar = this.f455114a) != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
        return jz5.f0.f302826a;
    }
}
