package yh0;

/* loaded from: classes8.dex */
public final class a implements i35.f {
    @Override // i35.f
    public void K0(java.lang.String username, int i17, r45.g25 g25Var) {
        kotlin.jvm.internal.o.g(username, "username");
        if (com.tencent.mm.storage.z3.L3(username)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DelContactExtension", "[+] onDeleteContact: yuanbao username:" + username + ", notify to server now.");
            ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ni(username);
        }
    }
}
