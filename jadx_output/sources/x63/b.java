package x63;

/* loaded from: classes5.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452234d;

    public b(java.lang.String str) {
        this.f452234d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        x63.j wi6 = ((t63.e) i95.n0.c(t63.e.class)).wi();
        java.lang.String str = this.f452234d;
        x63.a c17 = wi6.c(str);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "deleteExpireGroupSolitatire() chatRoomGroupSolitatire == null");
            return;
        }
        java.util.List z07 = ((t63.e) i95.n0.c(t63.e.class)).Bi().z0(str, 1, c17.f452230b);
        boolean z18 = false;
        if (((java.util.ArrayList) z07).size() > 0) {
            z17 = ((t63.e) i95.n0.c(t63.e.class)).Bi().y0(str, 1, c17.f452230b);
            if (c17.f452229a) {
                ((t63.e) i95.n0.c(t63.e.class)).Ai().e(z07, 2);
            } else {
                ((t63.e) i95.n0.c(t63.e.class)).Ai().e(z07, 1);
            }
        } else {
            z17 = false;
        }
        java.util.List z08 = ((t63.e) i95.n0.c(t63.e.class)).Bi().z0(str, 0, c17.f452232d);
        if (((java.util.ArrayList) z08).size() > 0) {
            z18 = ((t63.e) i95.n0.c(t63.e.class)).Bi().y0(str, 0, c17.f452232d);
            if (c17.f452231c) {
                ((t63.e) i95.n0.c(t63.e.class)).Ai().e(z08, 2);
            } else {
                ((t63.e) i95.n0.c(t63.e.class)).Ai().e(z08, 1);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "deleteExpireGroupSolitatire() activeResult:%s unActiveResult:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
    }
}
