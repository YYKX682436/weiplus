package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class t0 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI f143009o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI iPCallAllRecordUI, android.content.Context context) {
        super(context, null);
        this.f143009o = iPCallAllRecordUI;
        r(true);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s83.l lVar = (s83.l) obj;
        if (lVar == null) {
            lVar = new s83.l();
        }
        lVar.convertFrom(cursor);
        return lVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = this.f143009o.getLayoutInflater().inflate(com.tencent.mm.R.layout.bly, viewGroup, false);
            com.tencent.mm.plugin.ipcall.ui.s0 s0Var = new com.tencent.mm.plugin.ipcall.ui.s0(this);
            s0Var.f143000a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.l_z);
            s0Var.f143001b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486456la1);
            s0Var.f143002c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486457la2);
            view.setTag(s0Var);
        }
        s83.l lVar = (s83.l) getItem(i17);
        com.tencent.mm.plugin.ipcall.ui.s0 s0Var2 = (com.tencent.mm.plugin.ipcall.ui.s0) view.getTag();
        s0Var2.f143001b.setText(t83.c.c(lVar.field_phonenumber));
        long j17 = lVar.field_duration;
        if (j17 > 0) {
            s0Var2.f143002c.setText(t83.f.a(j17));
        } else {
            s0Var2.f143002c.setText(t83.f.h(lVar.field_status));
        }
        s0Var2.f143000a.setText(t83.f.b(lVar.field_calltime));
        return view;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        android.database.Cursor E;
        s83.c D0;
        com.tencent.mm.plugin.ipcall.ui.IPCallAllRecordUI iPCallAllRecordUI = this.f143009o;
        if (com.tencent.mm.sdk.platformtools.t8.K0(iPCallAllRecordUI.f142548e)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(iPCallAllRecordUI.f142547d)) {
                E = com.tencent.mm.plugin.ipcall.model.r.Vi().f404888d.E("IPCallRecord", s83.m.f404887f, "phonenumber=?", new java.lang.String[]{iPCallAllRecordUI.f142547d}, null, null, "calltime desc");
            }
            E = null;
        } else {
            java.lang.String str = iPCallAllRecordUI.f142548e;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (D0 = com.tencent.mm.plugin.ipcall.model.r.wi().D0(str)) != null) {
                long j17 = D0.systemRowid;
                if (j17 != -1) {
                    E = com.tencent.mm.plugin.ipcall.model.r.Vi().y0(j17);
                }
            }
            E = null;
        }
        s(E);
    }
}
