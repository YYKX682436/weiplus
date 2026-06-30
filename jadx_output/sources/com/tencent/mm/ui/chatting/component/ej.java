package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.p1.class)
/* loaded from: classes9.dex */
public class ej extends com.tencent.mm.ui.chatting.component.a implements sb5.p1, ot0.f3 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.HashMap f198976o = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f198977e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f198978f = true;

    /* renamed from: g, reason: collision with root package name */
    public long f198979g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f198980h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f198981i = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f198982m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f198983n = new java.util.HashMap();

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        if (this.f198977e) {
            tn1.f.f().c();
        }
    }

    @Override // ot0.f3
    public boolean G3() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        if (this.f198977e) {
            this.f198580d.p().setOnScrollListener(null);
            this.f198978f = true;
            this.f198977e = false;
            this.f198982m = false;
        }
    }

    @Override // ot0.f3
    public boolean I6() {
        return false;
    }

    @Override // ot0.f3
    public void T3(ot0.e3 e3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "failDoJob %s", e3Var);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        this.f198977e = this.f198580d.f460717l.getBooleanExtra("key_record_msg_select", false).booleanValue();
        this.f198979g = this.f198580d.f460717l.getLongExtra("key_record_select_min_msg_id", -1L);
        this.f198980h = this.f198580d.f460717l.getIntExtra("key_record_select_msg_num", 0);
        this.f198981i = this.f198580d.f460717l.getStringExtra("Chat_User");
        com.tencent.mars.xlog.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "isRecordSelect:%s lastSelectMinMsgId:%s lastSelectMsgNum:%s ", java.lang.Boolean.valueOf(this.f198977e), java.lang.Long.valueOf(this.f198979g), java.lang.Integer.valueOf(this.f198980h));
    }

    @Override // ot0.f3
    public void f2(ot0.e3 e3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "requestExitSelectedMode %s", e3Var);
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (this.f198977e) {
            if (!this.f198982m && !n0()) {
                a14.a.a().f582a.f60361h = m0();
            }
            this.f198982m = true;
        }
    }

    @Override // ot0.f3
    public void k6(ot0.e3 e3Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "doInBackground %s", e3Var);
    }

    public int m0() {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).W;
        if (copyOnWriteArraySet == null) {
            return 0;
        }
        return copyOnWriteArraySet.size();
    }

    public boolean n0() {
        return (this.f198979g == -1 || this.f198980h == 0) ? false : true;
    }

    @Override // ot0.f3
    public boolean u1() {
        return false;
    }

    @Override // ot0.f3
    public void w1(android.os.Bundle bundle) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = bundle != null ? bundle.toString() : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "doOnlySelectRecordMsg %s", objArr);
        this.f198978f = false;
        this.f198580d.d();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        if (this.f198977e) {
            com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class));
            kVar.X = new com.tencent.mm.ui.chatting.component.cj(this);
            kVar.T = true;
            kVar.h(null);
            kVar.B1 = null;
            kVar.D1 = null;
            kVar.F1 = null;
            kVar.H1 = null;
            kVar.J1 = null;
            kVar.U = true;
            kVar.W.clear();
            if (n0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.recordSelect.RecordSelectComponent", "onChattingEnterAnimEnd isEnterLastPosition:%s", java.lang.Boolean.valueOf(n0()));
                sb5.y yVar = new sb5.y();
                yVar.f405596a = true;
                ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).T0(this.f198981i, this.f198979g, hd5.n.ACTION_POSITION, yVar);
            }
        }
    }
}
