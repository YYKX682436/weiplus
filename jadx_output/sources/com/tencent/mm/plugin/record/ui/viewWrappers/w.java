package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes5.dex */
public class w implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f155574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.x f155575e;

    public w(com.tencent.mm.plugin.record.ui.viewWrappers.x xVar, android.widget.TextView textView) {
        this.f155575e = xVar;
        this.f155574d = textView;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        com.tencent.mm.plugin.record.ui.viewWrappers.x xVar = this.f155575e;
        boolean z17 = xVar.f155577e;
        et3.b bVar = xVar.f155579g;
        java.lang.String str = z17 ? bVar.f256590a.f375408f : xVar.f155578f.f24266f;
        android.widget.TextView textView = this.f155574d;
        textView.setText(str);
        xVar.f155581i.getClass();
        int i17 = bVar.f256594e;
        int i18 = i17 == 1 ? 6 : i17 == 0 ? 4 : 0;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.pluginsdk.ui.span.c0.o(textView, 1, i18, null, null, true, true);
    }
}
