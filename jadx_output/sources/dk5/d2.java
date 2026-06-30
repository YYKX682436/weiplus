package dk5;

/* loaded from: classes9.dex */
public class d2 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f234580d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f234581e;

    /* renamed from: f, reason: collision with root package name */
    public final int f234582f;

    /* renamed from: g, reason: collision with root package name */
    public final int f234583g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f234584h;

    /* renamed from: i, reason: collision with root package name */
    public final long f234585i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f234586m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f234587n;

    public d2(java.util.List list, java.lang.String str, int i17, int i18, int i19, boolean z17, long j17, boolean z18, java.lang.String str2) {
        this.f234580d = list;
        this.f234581e = str;
        this.f234582f = i17;
        this.f234583g = i18;
        this.f234584h = z17;
        this.f234585i = j17;
        this.f234586m = z18;
        this.f234587n = str2;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        r45.uf6 uf6Var;
        java.lang.String str = r1Var.f445529a;
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(str);
        if (h17 != null && h17.f415011i == 199 && str.equals(this.f234581e)) {
            dk5.e2 e2Var = new dk5.e2(null);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            e2Var.f234600a = linkedList;
            java.util.List<java.lang.String> list = this.f234580d;
            linkedList.addAll(list);
            for (java.lang.String str2 : list) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "copy video after download %s", str2);
                int i17 = com.tencent.mm.ui.transmit.MsgRetransmitUI.H1;
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.MsgRetransmitUI", "start copy video", new java.lang.Object[0]);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                dk5.c2 c2Var = new dk5.c2();
                c2Var.f234542b = context;
                c2Var.f234546f = str;
                c2Var.f234544d = this.f234582f;
                c2Var.f234545e = this.f234583g;
                c2Var.f234550j = false;
                c2Var.f234548h = str2;
                c2Var.f234551k = true;
                c2Var.f234552l = this.f234584h;
                c2Var.f234555o = e2Var;
                t21.v2 h18 = t21.d3.h(str);
                if (h18 != null && (uf6Var = h18.E) != null) {
                    c2Var.f234554n = uf6Var;
                    c2Var.f234556p = h18.h();
                    c2Var.f234557q = new com.tencent.mm.plugin.msg.MsgIdTalker(h18.f415016n, h18.f415020r);
                }
                if (h18 != null) {
                    c2Var.f234559s = h18.N;
                }
                c2Var.execute(new java.lang.Object[0]);
                c01.sc.d().a(c01.sc.f37461d, null);
                long j17 = this.f234585i;
                if (j17 != -1) {
                    com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f234587n, j17);
                    boolean R4 = com.tencent.mm.storage.z3.R4(str2);
                    com.tencent.mm.ui.chatting.e.c(R4 ? com.tencent.mm.ui.chatting.c.Chatroom : com.tencent.mm.ui.chatting.c.Chat, this.f234586m ? com.tencent.mm.ui.chatting.d.Full : com.tencent.mm.ui.chatting.d.Samll, Li, R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2) : 0);
                }
            }
        }
    }
}
