package rn;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397598d;

    public d(rn.e eVar, java.lang.String str) {
        this.f397598d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
        java.lang.String str = this.f397598d;
        Bi.getClass();
        try {
            i17 = Bi.f397602d.delete("GroupTodo", "createtime<? and username=?", new java.lang.String[]{(c01.id.c() - rn.e.f397599e.longValue()) + "", str});
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.GroupTodoStorage", "deleteExpireData Exception：[%s %s]", e17.getClass().getSimpleName(), e17.getMessage());
            i17 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoStorage", "onNotifyChange delete expire data : %s", java.lang.Boolean.valueOf(i17 > 0));
    }
}
