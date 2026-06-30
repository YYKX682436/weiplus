package y53;

/* loaded from: classes4.dex */
public final class v implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u53.v f459509b;

    public v(java.lang.String str, u53.v vVar) {
        this.f459508a = str;
        this.f459509b = vVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70616b;
        u53.v vVar = this.f459509b;
        if (i17 == 0 && fVar.f70615a == 0) {
            v53.e eVar = (v53.e) fVar.f70618d;
            vVar.a(eVar.f433335e, kotlin.jvm.internal.o.b(this.f459508a, eVar.f433334d.f433321d) ? ((v53.e) fVar.f70618d).f433334d.f433322e : false);
        } else {
            com.tencent.mars.xlog.Log.e("GameLife.ContactService", "isBlackListAssociateWithWAGame errCode:%d,errType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f70615a));
            vVar.a(false, false);
        }
        return jz5.f0.f302826a;
    }
}
