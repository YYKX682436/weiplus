package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class q2 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public int f142986o;

    /* renamed from: p, reason: collision with root package name */
    public int f142987p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI f142988q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI iPCallMsgUI, android.content.Context context, s83.g gVar) {
        super(context, gVar);
        this.f142988q = iPCallMsgUI;
        new java.util.HashSet();
        this.f142986o = 10;
        this.f142987p = 10;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        s83.g gVar = (s83.g) obj;
        if (gVar == null) {
            gVar = new s83.g();
        }
        gVar.convertFrom(cursor);
        return gVar;
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    public long getItemId(int i17) {
        return ((s83.g) getItem(i17)).systemRowid;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate;
        com.tencent.mm.plugin.ipcall.ui.p2 p2Var;
        boolean z17;
        java.lang.String str;
        int i18;
        s83.g gVar = (s83.g) getItem(i17);
        if (view == null || !(view.getTag() instanceof com.tencent.mm.plugin.ipcall.ui.p2)) {
            inflate = com.tencent.mm.ui.id.b(this.f212608e).inflate(com.tencent.mm.R.layout.f489184bm0, (android.view.ViewGroup) null);
            p2Var = new com.tencent.mm.plugin.ipcall.ui.p2(this);
            p2Var.f142978a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obg);
            p2Var.f142979b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cgq);
            p2Var.f142980c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o7m);
            inflate.setTag(p2Var);
        } else {
            p2Var = (com.tencent.mm.plugin.ipcall.ui.p2) view.getTag();
            inflate = view;
        }
        p2Var.f142978a.setText(gVar.field_title);
        p2Var.f142979b.setText(gVar.field_content);
        android.widget.TextView textView = p2Var.f142980c;
        com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI iPCallMsgUI = this.f142988q;
        androidx.appcompat.app.AppCompatActivity context = iPCallMsgUI.getContext();
        long j17 = gVar.field_pushTime * 1000;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        java.lang.String str2 = (java.lang.String) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.f492135fc2), j17);
        if (str2.indexOf("-") > 0) {
            java.lang.String str3 = str2.split("-")[0];
            java.lang.String str4 = str2.split("-")[1];
            java.lang.String[] stringArray = context.getResources().getStringArray(com.tencent.mm.R.array.f478030af);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("");
            for (java.lang.String str5 : stringArray) {
                arrayList.add(str5);
            }
            z17 = false;
            try {
                i18 = com.tencent.mm.sdk.platformtools.t8.P(str3, 0);
            } catch (java.lang.Exception unused) {
                i18 = 0;
            }
            str = (str4 + " " + (i18 < arrayList.size() ? (java.lang.String) arrayList.get(i18) : "") + " ") + " " + ((java.lang.String) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.fcv), j17));
        } else {
            z17 = false;
            long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis <= 0 || timeInMillis > 86400000) {
                long timeInMillis2 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
                str = (timeInMillis2 <= 0 || timeInMillis2 > 86400000) ? str2 + " " + ((java.lang.String) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.fcv), j17)) : context.getString(com.tencent.mm.R.string.fdi) + " " + ((java.lang.String) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.fcv), j17));
            } else {
                str = "" + ((java.lang.String) android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.fcv), j17));
            }
        }
        textView.setText(str);
        if (gVar.field_isRead == 1 ? true : z17) {
            p2Var.f142978a.setTextColor(iPCallMsgUI.getResources().getColor(com.tencent.mm.R.color.f479281ux));
        } else {
            p2Var.f142978a.setTextColor(iPCallMsgUI.getResources().getColor(com.tencent.mm.R.color.f479282uy));
        }
        return inflate;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.tencent.mm.ui.z9, l75.q0
    public synchronized void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        f();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        this.f142987p = com.tencent.mm.plugin.ipcall.model.r.Ri().getCount();
        s83.h Ri = com.tencent.mm.plugin.ipcall.model.r.Ri();
        int i17 = this.f142986o;
        s(Ri.f404880d.E("IPCallMsg", s83.h.f404879f, null, null, null, null, "pushTime desc limit " + i17));
        notifyDataSetChanged();
    }
}
