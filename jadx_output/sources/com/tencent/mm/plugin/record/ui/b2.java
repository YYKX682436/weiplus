package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class b2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155355f;

    public b2(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI, java.util.List list, java.util.List list2) {
        this.f155355f = recordMsgImageUI;
        this.f155353d = list;
        this.f155354e = list2;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        this.f155355f.f155321r.o(null);
        g4Var.clear();
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f155353d;
            if (i17 >= list.size()) {
                return;
            }
            g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f155354e.get(i17));
            i17++;
        }
    }
}
