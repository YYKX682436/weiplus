package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class e1 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final android.view.LayoutInflater f162256o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI f162257p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI shakeTvHistoryListUI, android.content.Context context) {
        super(context, new h34.h0());
        this.f162257p = shakeTvHistoryListUI;
        this.f162256o = android.view.LayoutInflater.from(context);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        h34.h0 h0Var = (h34.h0) obj;
        if (h0Var == null) {
            h0Var = new h34.h0();
        }
        h0Var.convertFrom(cursor);
        return h0Var;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.shake.ui.d1 d1Var;
        android.view.View view2;
        java.lang.String d17;
        if (view == null) {
            view2 = this.f162256o.inflate(com.tencent.mm.R.layout.cmu, viewGroup, false);
            d1Var = new com.tencent.mm.plugin.shake.ui.d1(this);
            d1Var.f162251a = (com.tencent.mm.ui.MMImageView) view2.findViewById(com.tencent.mm.R.id.ms6);
            d1Var.f162252b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ms8);
            d1Var.f162253c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ms7);
            view2.setTag(d1Var);
        } else {
            d1Var = (com.tencent.mm.plugin.shake.ui.d1) view.getTag();
            view2 = view;
        }
        h34.h0 h0Var = (h34.h0) getItem(i17);
        com.tencent.mm.plugin.shake.ui.f1.b(d1Var.f162251a, h0Var.field_iconurl, 0, true);
        d1Var.f162252b.setText(h0Var.field_title);
        android.widget.TextView textView = d1Var.f162253c;
        androidx.appcompat.app.AppCompatActivity context = this.f162257p.getContext();
        long j17 = h0Var.field_createtime * 1000;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        if (j17 < 3600000) {
            d17 = "";
        } else {
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis <= 0 || timeInMillis > 86400000) {
                long timeInMillis2 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
                d17 = (timeInMillis2 <= 0 || timeInMillis2 > 86400000) ? k35.m1.d(context.getString(com.tencent.mm.R.string.fcl), j17 / 1000) : context.getString(com.tencent.mm.R.string.fdi);
            } else {
                d17 = k35.m1.d(context.getString(com.tencent.mm.R.string.fcv), j17 / 1000);
            }
        }
        textView.setText(d17);
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        s(c34.h0.Ui().f278543d.B("SELECT * FROM shaketvhistory ORDER BY createtime DESC", null));
        notifyDataSetChanged();
    }
}
