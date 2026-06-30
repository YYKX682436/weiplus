package ix1;

/* loaded from: classes12.dex */
public abstract class d extends ix1.a {

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f295323l = "";

    /* renamed from: m, reason: collision with root package name */
    public r45.gp0 f295324m;

    /* renamed from: n, reason: collision with root package name */
    public r45.gp0 f295325n;

    /* renamed from: o, reason: collision with root package name */
    public long f295326o;

    /* renamed from: p, reason: collision with root package name */
    public int f295327p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f295328q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f295329r;

    @Override // ix1.a
    public void c() {
        if (this.f295324m == null && this.f295325n == null) {
            return;
        }
        l75.k0 Q4 = com.tencent.mm.plugin.announcement.s.f74705e.Q4();
        java.lang.String str = this.f295311a;
        p75.i0 i17 = dm.a2.f235564i.i();
        i17.f352657d = dm.a2.f235566n.j(str);
        i17.f352656c = "MicroMsg.SDK.BaseChatroomNoticeAttachIndex";
        if (((java.util.ArrayList) i17.a().k(Q4, dm.a2.class)).size() < 1) {
            r45.gp0 gp0Var = this.f295324m;
            if (gp0Var == null) {
                gp0Var = this.f295325n;
            }
            java.lang.String c17 = hx1.b.c(gp0Var);
            java.lang.String e17 = hx1.b.e(gp0Var);
            com.tencent.mm.vfs.w6.h(c17);
            com.tencent.mm.vfs.w6.h(e17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorDataItem", "del attach. type:%d, dataPath:%s thumbPath:%s", java.lang.Integer.valueOf(gp0Var.I), c17, e17);
        }
    }
}
