package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f155476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155477g;

    public r1(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI, java.util.List list, java.lang.String str, java.lang.Runnable runnable) {
        this.f155477g = recordMsgImageUI;
        this.f155474d = list;
        this.f155475e = str;
        this.f155476f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String t17;
        for (java.lang.String str : this.f155474d) {
            c01.h7 h7Var = new c01.h7();
            com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155477g;
            int selectedItemPosition = recordMsgImageUI.f155314h.getSelectedItemPosition();
            if (-1 == selectedItemPosition) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ShowImageUI", "error position");
                t17 = null;
            } else {
                t17 = recordMsgImageUI.f155315i.getItem(selectedItemPosition).t();
            }
            h7Var.f37231f = t17;
            h7Var.f37227b = recordMsgImageUI.f155317n;
            h7Var.f37229d = recordMsgImageUI.f155318o;
            tg3.a1 a17 = tg3.t1.a();
            ((dk5.s5) a17).Vi(recordMsgImageUI.getContext(), str, recordMsgImageUI.f155319p, 0, "", "", h7Var);
            ((dk5.s5) tg3.t1.a()).Ui(this.f155475e, str);
        }
        com.tencent.mm.sdk.platformtools.u3.h(this.f155476f);
    }

    public java.lang.String toString() {
        return super.toString() + "|onActivityResult";
    }
}
