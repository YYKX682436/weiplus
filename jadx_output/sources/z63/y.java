package z63;

/* loaded from: classes5.dex */
public class y implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI f470450d;

    public y(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI) {
        this.f470450d = groupSolitatireEditUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.System.currentTimeMillis();
        int i17 = com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI.U;
        com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI = this.f470450d;
        groupSolitatireEditUI.d7();
        if (groupSolitatireEditUI.f142233v instanceof com.tencent.mm.ui.widget.MMEditText) {
            java.lang.String obj = editable.toString();
            try {
                obj = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).wi(obj);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "afterTextChanged() emojiSoftBank2Unicode %s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
            int intValue = ((java.lang.Integer) ((com.tencent.mm.ui.widget.MMEditText) groupSolitatireEditUI.f142233v).getTag(com.tencent.mm.R.id.guj)).intValue();
            int y17 = x63.g.y(obj);
            if (intValue == 1) {
                if (y17 > x63.g.u() * 2) {
                    int l17 = x63.g.l(obj, x63.g.u() * 2);
                    editable.delete(l17, editable.length());
                    obj = obj.substring(0, l17);
                }
                y63.a aVar = groupSolitatireEditUI.B;
                aVar.H = obj;
                aVar.L = 1;
            } else if (intValue == 2) {
                groupSolitatireEditUI.B.I = obj;
            } else if (intValue == 3) {
                y63.b bVar = (y63.b) ((com.tencent.mm.ui.widget.MMEditText) groupSolitatireEditUI.f142233v).getTag(com.tencent.mm.R.id.guh);
                if (bVar != null) {
                    if (y17 > x63.g.v() * 2) {
                        int l18 = x63.g.l(obj, x63.g.v() * 2);
                        editable.delete(l18, editable.length());
                        obj = obj.substring(0, l18);
                    }
                    bVar.f459656e = obj;
                }
            } else if (intValue == 4) {
                if (y17 > x63.g.t() * 2) {
                    int l19 = x63.g.l(obj, x63.g.t() * 2);
                    editable.delete(l19, editable.length());
                    obj = obj.substring(0, l19);
                }
                groupSolitatireEditUI.B.f459651J = obj;
            }
        }
        groupSolitatireEditUI.g7(false);
        groupSolitatireEditUI.f142233v.postDelayed(new z63.n(this), 100L);
        java.lang.System.currentTimeMillis();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
