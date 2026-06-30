package z12;

/* loaded from: classes4.dex */
public final class a0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z12.b0 f469278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f469279b;

    public a0(z12.b0 b0Var, yz5.p pVar) {
        this.f469278a = b0Var;
        this.f469279b = pVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.fu4 fu4Var = (r45.fu4) fVar.f70618d;
        z12.b0 b0Var = this.f469278a;
        b0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.StoreEmoticonGetDesignerAcctInfoCgi", "[onSceneEnd] MMFunc_MMGetDesignerAcctInfoNew: " + i17 + ", " + i18);
        java.lang.String str = b0Var.f469280a;
        yz5.p pVar = this.f469279b;
        if (i18 == 0) {
            pVar.invoke(fu4Var != null ? fu4Var.f374599d : null, str);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.StoreEmoticonGetDesignerAcctInfoCgi", "get designerAccInfo failed");
            pVar.invoke(null, str);
        }
        return jz5.f0.f302826a;
    }
}
