package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes4.dex */
public class z extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.AppChooserUI f192017e;

    public z(com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI) {
        this.f192017e = appChooserUI;
    }

    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view) {
        return new in5.s0(view);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.acu;
    }

    @Override // in5.r
    public void h(in5.s0 s0Var, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.pluginsdk.ui.tools.AppChooseItemCheckedView appChooseItemCheckedView = (com.tencent.mm.pluginsdk.ui.tools.AppChooseItemCheckedView) s0Var.p(com.tencent.mm.R.id.e1w);
        appChooseItemCheckedView.f191326d = false;
        appChooseItemCheckedView.a();
        com.tencent.mm.pluginsdk.ui.tools.AppChooserUI appChooserUI = this.f192017e;
        com.tencent.mm.pluginsdk.ui.otherway.x xVar = appChooserUI.f191337i;
        com.tencent.mm.pluginsdk.ui.otherway.x xVar2 = appChooserUI.f191343q;
        appChooseItemCheckedView.setChecked(xVar == xVar2 || xVar2 == null);
        s0Var.itemView.setOnClickListener(new com.tencent.mm.pluginsdk.ui.tools.y(this));
    }
}
