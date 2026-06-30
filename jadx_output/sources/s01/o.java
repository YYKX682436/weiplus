package s01;

/* loaded from: classes11.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f401910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c01.da f401911f;

    public o(java.lang.String str, boolean z17, c01.da daVar) {
        this.f401909d = str;
        this.f401910e = z17;
        this.f401911f = daVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s01.g aj6 = r01.q3.aj();
        java.lang.String str = this.f401909d;
        aj6.z0(str);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().k(str);
        s01.m Ui = r01.q3.Ui();
        Ui.getClass();
        java.lang.String str2 = "delete from BizChatInfo where brandUserName = '" + str + "' ";
        boolean A = Ui.f401900d.A("BizChatInfo", str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatInfoStorage", "deleteByBrandUserName sql %s,%s", str2, java.lang.Boolean.valueOf(A));
        if (A) {
            s01.h hVar = new s01.h();
            s01.k kVar = new s01.k();
            kVar.f401890b = -1L;
            kVar.f401889a = s01.j.DELETE;
            kVar.f401891c = hVar;
            l75.v0 v0Var = Ui.f401901e;
            v0Var.d(kVar);
            v0Var.c();
        }
        com.tencent.mm.vfs.w6.f(qk.b.a(str));
        if (this.f401910e) {
            s01.d0 Vi = r01.q3.Vi();
            Vi.getClass();
            java.lang.String str3 = "delete from BizChatUserInfo where brandUserName = '" + str + "' ";
            boolean A2 = Vi.f401859e.A("BizChatUserInfo", str3);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizChatUserInfoStorage", "deleteByBrandUserName sql %s,%s", str3, java.lang.Boolean.valueOf(A2));
            if (A2) {
                new s01.a0();
                s01.c0 c0Var = new s01.c0();
                l75.v0 v0Var2 = Vi.f401860f;
                v0Var2.d(c0Var);
                v0Var2.c();
            }
            r01.q3.Di().y0(str);
            com.tencent.mm.vfs.w6.f(s01.r.k(str));
        }
        com.tencent.mm.sdk.platformtools.u3.h(new s01.n(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|deleteMsgByTalkers";
    }
}
