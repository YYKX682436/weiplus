package gx1;

/* loaded from: classes12.dex */
public class s extends gx1.a {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText f277326e;

    public s(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText = (com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText) view.findViewById(com.tencent.mm.R.id.m8b);
        this.f277326e = wXRTEditText;
        wXRTEditText.E = this;
        wXRTEditText.setEditTextType(0);
        this.f277291d.f(wXRTEditText);
        wXRTEditText.getViewTreeObserver().addOnGlobalLayoutListener(new gx1.p(this));
    }

    @Override // gx1.a
    public int i() {
        return 1;
    }

    @Override // gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(getLayoutPosition());
        nx1.z zVar = this.f277291d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.EditorTextItemHolder", "TextItemHolder position is %d, editable:%b", valueOf, java.lang.Boolean.valueOf(zVar.f341334d));
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText = this.f277326e;
        wXRTEditText.setPosInDataList(i17);
        ix1.l lVar = (ix1.l) aVar;
        lVar.f295316f = wXRTEditText;
        lVar.f295314d = null;
        lVar.f295315e = null;
        ix1.a l17 = nx1.d.q().l(i17 - 1);
        if (l17 != null && l17.b() == 1) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) wXRTEditText.getLayoutParams();
            layoutParams.topMargin = 0;
            wXRTEditText.setLayoutParams(layoutParams);
        }
        ix1.a l18 = nx1.d.q().l(i17 + 1);
        if (l18 != null && l18.b() == 1) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) wXRTEditText.getLayoutParams();
            layoutParams2.bottomMargin = 0;
            wXRTEditText.setLayoutParams(layoutParams2);
        }
        if (zVar.f341334d) {
            com.tencent.mm.sdk.platformtools.u3.h(new gx1.r(this, lVar));
        } else {
            wXRTEditText.setRichTextEditing(lVar.f295338s);
            zVar.f341332b.f3(wXRTEditText);
        }
    }
}
