package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class a0 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f162235o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.LayoutInflater f162236p;

    /* renamed from: q, reason: collision with root package name */
    public int f162237q;

    public a0(android.content.Context context) {
        super(context, new c34.t());
        this.f162237q = 20;
        this.f162235o = context;
        this.f162236p = android.view.LayoutInflater.from(context);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        c34.t tVar = (c34.t) obj;
        if (tVar == null) {
            tVar = new c34.t();
        }
        tVar.convertFrom(cursor);
        return tVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.shake.ui.z zVar;
        android.view.View view2;
        java.lang.String quantityString;
        if (view == null) {
            view2 = this.f162236p.inflate(com.tencent.mm.R.layout.cmn, viewGroup, false);
            zVar = new com.tencent.mm.plugin.shake.ui.z(this);
            zVar.f162356a = (com.tencent.mm.ui.MMImageView) view2.findViewById(com.tencent.mm.R.id.f486887mr5);
            zVar.f162357b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.mr7);
            zVar.f162358c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f486886mr4);
            zVar.f162359d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.mr6);
            view2.setTag(zVar);
        } else {
            zVar = (com.tencent.mm.plugin.shake.ui.z) view.getTag();
            view2 = view;
        }
        c34.t tVar = (c34.t) getItem(i17);
        com.tencent.mm.plugin.shake.ui.f1.b(zVar.f162356a, tVar.field_thumburl, com.tencent.mm.R.raw.app_attach_file_icon_webpage, false);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(tVar.field_title);
        android.content.Context context = this.f162235o;
        if (K0) {
            zVar.f162357b.setVisibility(8);
        } else {
            android.widget.TextView textView = zVar.f162357b;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = tVar.field_title;
            float textSize = zVar.f162357b.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
            zVar.f162357b.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.field_desc)) {
            zVar.f162358c.setVisibility(8);
        } else {
            android.widget.TextView textView2 = zVar.f162358c;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = tVar.field_desc;
            float textSize2 = zVar.f162358c.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize2));
            zVar.f162358c.setVisibility(0);
        }
        android.widget.TextView textView3 = zVar.f162359d;
        long j17 = tVar.field_createtime * 1000;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        if (j17 < 3600000) {
            quantityString = "";
        } else {
            long timeInMillis = gregorianCalendar.getTimeInMillis() - j17;
            long j18 = timeInMillis / 3600000;
            if (j18 == 0) {
                int i18 = (int) (timeInMillis / 60000);
                int i19 = i18 >= 1 ? i18 : 1;
                quantityString = context.getResources().getQuantityString(com.tencent.mm.R.plurals.f489674k, i19, java.lang.Integer.valueOf(i19));
            } else {
                java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
                long timeInMillis2 = j17 - gregorianCalendar2.getTimeInMillis();
                if (timeInMillis2 <= 0 || timeInMillis2 > 86400000) {
                    long timeInMillis3 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
                    if (timeInMillis3 <= 0 || timeInMillis3 > 86400000) {
                        int i27 = (int) (timeInMillis / 86400000);
                        int i28 = i27 < 1 ? 1 : i27;
                        quantityString = context.getResources().getQuantityString(com.tencent.mm.R.plurals.f489675l, i28, java.lang.Integer.valueOf(i28));
                    } else {
                        quantityString = context.getString(com.tencent.mm.R.string.fdi);
                    }
                } else {
                    int i29 = (int) j18;
                    int i37 = i29 < 1 ? 1 : i29;
                    quantityString = context.getResources().getQuantityString(com.tencent.mm.R.plurals.f489673j, i37, java.lang.Integer.valueOf(i37));
                }
            }
        }
        textView3.setText(quantityString);
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        c34.u Ri = c34.h0.Ri();
        s(Ri.f38243d.B("SELECT * FROM " + Ri.getTableName() + " ORDER BY rowid DESC LIMIT " + this.f162237q, null));
        notifyDataSetChanged();
    }
}
