package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class tk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f200001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f200003f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200004g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f200005h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200006i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200007m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200008n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f200009o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f200010p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200011q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ vg3.a4 f200012r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f200013s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.sk f200014t;

    public tk(com.tencent.mm.ui.chatting.component.sk skVar, boolean z17, java.lang.String str, com.tencent.mm.storage.z3 z3Var, java.lang.String str2, boolean z18, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, java.util.Map map, java.lang.String str6, vg3.a4 a4Var, android.content.Context context) {
        this.f200014t = skVar;
        this.f200001d = z17;
        this.f200002e = str;
        this.f200003f = z3Var;
        this.f200004g = str2;
        this.f200005h = z18;
        this.f200006i = str3;
        this.f200007m = str4;
        this.f200008n = str5;
        this.f200009o = i17;
        this.f200010p = map;
        this.f200011q = str6;
        this.f200012r = a4Var;
        this.f200013s = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        vg3.a4 a4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SendTextComponent", "doSendMessage begin send txt msg");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f200014t.f198580d == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.SendTextComponent", "NULL == mChattingContext");
            return;
        }
        com.tencent.mm.plugin.report.service.f0.a(20);
        boolean z17 = this.f200001d;
        java.lang.String str = this.f200004g;
        if (z17) {
            c01.d9.e().g(new g11.b(this.f200002e, this.f200003f.d1(), str));
            return;
        }
        if (this.f200005h) {
            c01.sc.d().a(10076, 1);
        }
        java.lang.String str2 = this.f200006i;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.SendTextComponent", "toUser is null or nil!");
            return;
        }
        int C = c01.e2.C(str2);
        java.lang.String str3 = this.f200007m;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.SendTextComponent", "tempUser is null");
            return;
        }
        boolean a17 = w11.t1.a(str3);
        java.lang.String str4 = this.f200011q;
        java.util.Map map = this.f200010p;
        int i17 = this.f200009o;
        java.lang.String str5 = this.f200008n;
        if (a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SendTextComponent", "use ppc send Msg");
            w11.r1 a18 = w11.s1.a(str3);
            a18.f442130e = C;
            a18.f442131f = i17;
            a18.e(str5);
            a18.g(str3);
            a18.f442133h = map;
            a18.f442140o = str4;
            a18.b();
        } else {
            w11.r1 a19 = w11.s1.a(str3);
            a19.f442130e = C;
            a19.f442131f = i17;
            a19.e(str5);
            a19.g(str3);
            a19.f442133h = map;
            a19.f442140o = str4;
            a19.f442134i = 5;
            w11.n1 a27 = a19.a();
            com.tencent.mm.modelbase.m1 m1Var = a27.f442095a;
            if ((m1Var instanceof w11.r0) && (a4Var = this.f200012r) != null) {
                ((w11.r0) m1Var).f442125q = a4Var;
            }
            a27.a();
        }
        if (com.tencent.mm.storage.z3.l4(str2)) {
            c01.d9.e().g(new k14.f0(wo.w0.l(), str + " key " + com.tencent.mm.storage.la.m0() + " local key " + com.tencent.mm.storage.la.s0() + "NetType:" + com.tencent.mars.comm.NetStatusUtil.getNetTypeString(this.f200013s) + " hasNeon: " + wo.t.e() + " isArmv6: " + wo.t.f() + " isArmv7: " + wo.t.g(), 0));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SendTextComponent", "doSendMessage end cost:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
