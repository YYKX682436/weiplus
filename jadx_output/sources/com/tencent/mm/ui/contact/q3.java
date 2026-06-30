package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class q3 extends android.widget.LinearLayout implements r01.v {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f207129d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f207130e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f207131f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f207132g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f207133h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.contact.p3 f207134i;

    public q3(android.content.Context context, com.tencent.mm.ui.contact.p3 p3Var) {
        super(context);
        this.f207130e = null;
        this.f207129d = context;
        this.f207134i = p3Var;
        b();
    }

    @Override // r01.v
    public void a(r01.u uVar) {
        qk.o oVar = uVar.f368254c;
        if (oVar == null) {
            return;
        }
        if (oVar.I0()) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.contact.o3(this));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnterpriseBizView", "onEvent, not enterprise father");
        }
    }

    public void b() {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.contact.n3(this));
    }

    public int getEnterpriseFriendCount() {
        java.util.List list = this.f207131f;
        if (list == null || this.f207133h == null) {
            return 0;
        }
        return list.size() + this.f207133h.size();
    }
}
