package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes11.dex */
public class o implements rk4.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew f150956a;

    public o(com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew) {
        this.f150956a = musicMainUINew;
    }

    @Override // rk4.o5
    public void a(int i17, bw5.lp0 lp0Var) {
        com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = this.f150956a;
        bw5.lp0 uj6 = ((rk4.z8) musicMainUINew.f150920z).uj();
        if (uj6 != null) {
            for (java.lang.String str : musicMainUINew.B.keySet()) {
                com.tencent.mm.plugin.mv.ui.WeCheckBox weCheckBox = (com.tencent.mm.plugin.mv.ui.WeCheckBox) musicMainUINew.B.get(str);
                if (weCheckBox != null) {
                    if (str.equals(uj6.b())) {
                        if (i17 == 3 || i17 == 6) {
                            weCheckBox.setChecked(true);
                        }
                        if (i17 == 11 || i17 == 12) {
                            weCheckBox.setChecked(false);
                        }
                    } else {
                        weCheckBox.setChecked(false);
                    }
                }
            }
        }
    }
}
