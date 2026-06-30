package mq4;

/* loaded from: classes8.dex */
public class t implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.u f330807d;

    public t(mq4.u uVar) {
        this.f330807d = uVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        mq4.u uVar = this.f330807d;
        vq4.d0.a(uVar.f330808h, "onSceneEnd type:" + m1Var.getType() + " errType:" + i17 + " errCode:" + i18);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w(uVar.f330808h, "onSceneEnd: error %d %d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        } else {
            r45.m37 m37Var = (r45.m37) uVar.f330793d.f70710a.f70684a;
            if (m37Var != null) {
                com.tencent.mm.plugin.voip.model.j0.m(m37Var.f380127e, m37Var.f380128f, 0);
            }
        }
    }
}
