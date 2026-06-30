package mv2;

/* loaded from: classes10.dex */
public final class e extends mv2.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.r f331558i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.storage.yj0 yj0Var, com.tencent.mm.protobuf.g gVar, int i17, yz5.r rVar) {
        super(yj0Var, gVar, i17);
        this.f331558i = rVar;
    }

    @Override // mv2.b
    public void e(int i17, int i18, java.lang.String str, r45.ty0 ty0Var) {
        super.e(i17, i18, str, ty0Var);
        yz5.r rVar = this.f331558i;
        if (rVar != null) {
            rVar.C(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, ty0Var);
        }
    }
}
