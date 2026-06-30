package ts3;

/* loaded from: classes9.dex */
public class s implements db5.o5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.readerapp.ui.ReaderAppUI f421698d;

    public s(com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI) {
        this.f421698d = readerAppUI;
    }

    @Override // db5.o5
    public boolean a() {
        int i17;
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI = this.f421698d;
        ts3.a aVar = readerAppUI.f155059g;
        ts3.d0 d0Var = (ts3.d0) aVar;
        if (d0Var.f421651p >= d0Var.f421652q) {
            readerAppUI.f155056d.setSelectionFromTop(0, readerAppUI.f155057e.getTopHeight());
            return true;
        }
        int count = aVar.getCount();
        ts3.a aVar2 = readerAppUI.f155059g;
        ts3.d0 d0Var2 = (ts3.d0) aVar2;
        int i18 = d0Var2.f421651p;
        int i19 = d0Var2.f421652q;
        if (i18 >= i19) {
            i17 = 0;
        } else {
            i17 = 3;
            int i27 = i18 + 3;
            d0Var2.f421651p = i27;
            if (i27 > i19) {
                d0Var2.f421651p = i19;
                i17 = i19 % 3;
            }
        }
        aVar2.f();
        if (readerAppUI.f155059g.getCount() > count) {
            int i28 = i17 + 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.ReaderAppUI", "pullDownView nowCount > preCount on set position %d, set pullDownView.getTopHeight() %d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(readerAppUI.f155057e.getTopHeight()));
            com.tencent.mm.pluginsdk.ui.tools.f7.b(readerAppUI.f155056d, i28, readerAppUI.f155057e.getTopHeight(), false, false);
        }
        return true;
    }
}
