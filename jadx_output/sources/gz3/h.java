package gz3;

/* loaded from: classes15.dex */
public class h extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI f277754o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI) {
        super(scannerHistoryUI, new fz3.a());
        this.f277754o = scannerHistoryUI;
        r(true);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        fz3.a aVar = (fz3.a) obj;
        if (aVar == null) {
            aVar = new fz3.a();
        }
        aVar.convertFrom(cursor);
        return aVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        gz3.i iVar;
        java.lang.String str;
        fz3.a aVar = (fz3.a) getItem(i17);
        com.tencent.mm.plugin.scanner.history.ui.ScannerHistoryUI scannerHistoryUI = this.f277754o;
        if (view == null) {
            view = android.view.View.inflate(scannerHistoryUI.getContext(), com.tencent.mm.R.layout.chr, null);
            iVar = new gz3.i(scannerHistoryUI, null);
            iVar.f277755a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.hhr);
            iVar.f277756b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hjn);
            iVar.f277757c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hjl);
            iVar.f277758d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hhg);
            view.setTag(iVar);
        } else {
            iVar = (gz3.i) view.getTag();
        }
        e04.n3 b17 = com.tencent.mm.plugin.scanner.model.k0.b(aVar.field_xmlContent, aVar.field_funcType);
        iVar.f277756b.setText(b17.field_title);
        iVar.f277757c.setText(k35.m1.f(scannerHistoryUI, aVar.field_ScanTime, true, false));
        iVar.f277758d.setText(b17.field_subtitle);
        int dimensionPixelSize = scannerHistoryUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a9d);
        iVar.f277755a.setImageResource(com.tencent.mm.R.drawable.ccy);
        if (android.text.TextUtils.isEmpty(b17.field_thumburl)) {
            iVar.f277755a.setImageResource(com.tencent.mm.R.drawable.ccy);
        } else {
            o11.f fVar = new o11.f();
            fVar.f342083g = lp0.b.D();
            com.tencent.mm.plugin.scanner.m1 Ai = com.tencent.mm.plugin.scanner.m1.Ai();
            java.lang.String str2 = b17.field_thumburl;
            Ai.getClass();
            if (gm0.j1.a()) {
                str = java.lang.String.format("%s/scanbook_%s", Ai.f158756d + "image/scan/img", kk.k.g(str2.getBytes()));
            } else {
                str = "";
            }
            fVar.f342082f = str;
            fVar.f342078b = true;
            fVar.f342096t = false;
            fVar.f342077a = true;
            fVar.f342087k = dimensionPixelSize;
            fVar.f342086j = dimensionPixelSize;
            fVar.f342091o = com.tencent.mm.R.drawable.ccy;
            n11.a.b().h(b17.field_thumburl, iVar.f277755a, fVar.a());
        }
        return view;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        s(com.tencent.mm.plugin.scanner.m1.Ai().Bi().getAll());
        notifyDataSetChanged();
    }
}
