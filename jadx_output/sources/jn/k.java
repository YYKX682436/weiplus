package jn;

/* loaded from: classes8.dex */
public class k implements com.tencent.mm.modelbase.u0 {
    public k() {
        gm0.j1.d().a(3618, this);
        gm0.j1.d().a(3854, this);
    }

    public void a(java.lang.String str, int i17, r45.vt5 vt5Var) {
        gm0.j1.d().g(new kn.z(str, i17, vt5Var));
    }

    public void finalize() {
        gm0.j1.d().q(3618, this);
        gm0.j1.d().q(3854, this);
        super.finalize();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.RoomTodoMsg", "onSceneEnd errType = %d, errCode = %d, errMsg = %s, scenetype:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
    }
}
