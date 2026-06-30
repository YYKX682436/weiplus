package hw2;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.t f285529d;

    public g(hw2.t tVar) {
        this.f285529d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hw2.t tVar = this.f285529d;
        if (!tVar.f285567o) {
            tVar.e().findViewById(com.tencent.mm.R.id.epk).setOnClickListener(new hw2.l(tVar));
            android.view.KeyEvent.Callback findViewById = tVar.e().findViewById(com.tencent.mm.R.id.ept);
            os5.p pVar = findViewById instanceof os5.p ? (os5.p) findViewById : null;
            android.view.KeyEvent.Callback findViewById2 = tVar.e().findViewById(com.tencent.mm.R.id.epl);
            os5.o oVar = findViewById2 instanceof os5.o ? (os5.o) findViewById2 : null;
            if (pVar != null) {
                pVar.setOnModeSwitch(new hw2.m(oVar));
            }
            if (pVar != null) {
                pVar.setOnSuitSwitch(new hw2.n(oVar, tVar));
            }
            if (pVar != null) {
                pVar.setSuit(tVar.f285569q);
            }
            if (oVar != null) {
                oVar.setOnRequestSeekByKey(new hw2.o(tVar, pVar));
            }
            if (oVar != null) {
                oVar.setOnRequestDefaultSeekByKey(new hw2.p(tVar, pVar));
            }
            if (oVar != null) {
                oVar.setOnSeekChanging(new hw2.q(tVar));
            }
            if (oVar != null) {
                oVar.setOnSeekDone(hw2.r.f285550d);
            }
            if (oVar != null) {
                oVar.setOnRequestReset(new hw2.s(pVar, tVar, oVar));
            }
            if (oVar != null) {
                oVar.setEffectItems((java.util.List) ((jz5.n) tVar.f285572t).getValue());
            }
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = tVar.f285566n;
            kotlin.jvm.internal.o.f(editorPanelHolder, "access$getSettingHolder$p(...)");
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, tVar.e(), null, 2, null);
            tVar.f285567o = true;
        }
        tVar.f285566n.setShow(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordBeautifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
