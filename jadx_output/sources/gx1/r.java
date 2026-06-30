package gx1;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix1.l f277324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx1.s f277325e;

    public r(gx1.s sVar, ix1.l lVar) {
        this.f277325e = sVar;
        this.f277324d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gx1.s sVar = this.f277325e;
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText = sVar.f277326e;
        ix1.l lVar = this.f277324d;
        wXRTEditText.setRichTextEditing(lVar.f295338s);
        sVar.f277326e.x();
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText2 = sVar.f277326e;
        synchronized (wXRTEditText2) {
            wXRTEditText2.f96602u = true;
        }
        com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText3 = sVar.f277326e;
        synchronized (wXRTEditText3) {
            wXRTEditText3.f96602u = false;
        }
        sVar.f277326e.B();
        if (lVar.f295312b) {
            int i17 = lVar.f295313c;
            if (i17 == -1 || i17 >= sVar.f277326e.getText().toString().length()) {
                com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText4 = sVar.f277326e;
                wXRTEditText4.setSelection(wXRTEditText4.getText().toString().length());
            } else {
                sVar.f277326e.setSelection(lVar.f295313c);
            }
            sVar.f277326e.requestFocus();
            com.tencent.mm.sdk.platformtools.u3.i(new gx1.q(this), 500L);
        } else if (sVar.f277326e.hasFocus()) {
            sVar.f277326e.clearFocus();
        }
        if (lVar.f295319i) {
            lVar.f295319i = false;
            com.tencent.mm.plugin.component.editor.model.nativenote.manager.WXRTEditText wXRTEditText5 = sVar.f277326e;
            wXRTEditText5.D = true;
            wXRTEditText5.onTextContextMenuItem(android.R.id.paste);
        }
    }
}
