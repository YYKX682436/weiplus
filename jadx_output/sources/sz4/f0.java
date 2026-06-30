package sz4;

/* loaded from: classes12.dex */
public class f0 extends sz4.a {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText f414195f;

    public f0(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = (com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText) view.findViewById(com.tencent.mm.R.id.m8b);
        this.f414195f = wXRTEditText;
        if (j0Var.f333309q != 2 || !this.f414182d.f333310r) {
            wXRTEditText.setKeyListener(null);
            wXRTEditText.setFocusable(false);
            wXRTEditText.setClickable(true);
        }
        wXRTEditText.E = this;
        wXRTEditText.setEditTextType(0);
        this.f414182d.k(wXRTEditText);
        wXRTEditText.getViewTreeObserver().addOnGlobalLayoutListener(new sz4.c0(this));
    }

    @Override // sz4.a
    public int i() {
        return 1;
    }

    @Override // sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = this.f414195f;
        wXRTEditText.setPosInDataList(i17);
        iz4.i iVar = (iz4.i) cVar;
        iVar.f296108f = wXRTEditText;
        android.os.Bundle bundle = null;
        iVar.f296106d = null;
        iVar.f296107e = null;
        mz4.d dVar = this.f414183e;
        iz4.c l17 = dVar.l(i17 - 1);
        int i19 = 0;
        if (l17 != null && l17.d() == 1) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) wXRTEditText.getLayoutParams();
            layoutParams.topMargin = 0;
            wXRTEditText.setLayoutParams(layoutParams);
        }
        iz4.c l18 = dVar.l(i17 + 1);
        if (l18 != null && l18.d() == 1) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) wXRTEditText.getLayoutParams();
            layoutParams2.bottomMargin = 0;
            wXRTEditText.setLayoutParams(layoutParams2);
        }
        mz4.j0 j0Var = this.f414182d;
        int i27 = j0Var.f333309q;
        if (i27 == 1) {
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(j0Var.f333295c, j0Var.f333294b);
            java.lang.String Q0 = Li.Q0();
            long I0 = Li.I0();
            if (j0Var.f333293a) {
                bundle = com.tencent.mm.pluginsdk.ui.span.l1.f191260q.a(Q0 != null ? k01.d.a(Q0) : -1);
            } else {
                bundle = com.tencent.mm.pluginsdk.ui.span.l1.f191259p.a(Q0 != null ? k01.d.a(Q0) : -1);
            }
            bundle.putInt("geta8key_scene", 73);
            bundle.putLong("msgSvrId", I0);
            bundle.putString("msgUsername", j0Var.f333296d);
            bundle.putInt("KMsgType", 49);
            bundle.putString("geta8key_username", j0Var.f333295c);
        } else if (i27 == 2) {
            bundle = com.tencent.mm.pluginsdk.ui.span.l1.f191258o.a(-1);
        } else if (i27 == 4) {
            bundle = com.tencent.mm.pluginsdk.ui.span.l1.f191261r.a(-1);
            bundle.putString("serverMsgID", j0Var.f333297e);
            bundle.putInt("geta8key_scene", 97);
            bundle.putString("msgUsername", j0Var.f333298f);
            bundle.putString("geta8key_username", j0Var.f333298f);
        }
        if (j0Var.f333309q == 2 && j0Var.f333310r) {
            com.tencent.mm.sdk.platformtools.u3.h(new sz4.e0(this, iVar, bundle));
        } else {
            wXRTEditText.setRichTextEditing(iVar.f296155t);
            le0.r rVar = com.tencent.mm.pluginsdk.ui.span.c0.f191193c;
            int i28 = j0Var.f333309q;
            if (i28 == 2) {
                i19 = 9;
            } else if (i28 == 1) {
                i19 = 8;
            }
            com.tencent.mm.pluginsdk.ui.span.c0.q(wXRTEditText, bundle, rVar, i19);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.NoteTextItemHolder", "TextItemHolder position is " + getLayoutPosition());
    }
}
