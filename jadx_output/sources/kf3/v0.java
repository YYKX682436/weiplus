package kf3;

/* loaded from: classes12.dex */
public class v0 implements db5.o5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI f307453d;

    public v0(com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI) {
        this.f307453d = massSendHistoryUI;
    }

    @Override // db5.o5
    public boolean a() {
        com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI = this.f307453d;
        kf3.k0 k0Var = massSendHistoryUI.f148528f;
        int i17 = k0Var.f307379r;
        int i18 = k0Var.f307380s;
        int i19 = 0;
        if (i17 >= i18) {
            massSendHistoryUI.f148526d.setSelectionFromTop(0, massSendHistoryUI.f148529g.getTopHeight());
            return true;
        }
        if (i17 >= i18) {
            k0Var.f307379r = i18;
        } else {
            i19 = 10;
            int i27 = i17 + 10;
            k0Var.f307379r = i27;
            if (i27 > i18) {
                k0Var.f307379r = i18;
                i19 = i18 % 10;
            }
        }
        k0Var.f();
        massSendHistoryUI.f148526d.setSelectionFromTop(i19, massSendHistoryUI.f148529g.getTopHeight());
        return true;
    }
}
