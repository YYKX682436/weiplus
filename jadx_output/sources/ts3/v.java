package ts3;

/* loaded from: classes9.dex */
public class v implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.readerapp.ui.ReaderAppUI f421701a;

    public v(com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI) {
        this.f421701a = readerAppUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI = this.f421701a;
        com.tencent.mm.ui.base.MMPullDownView mMPullDownView = readerAppUI.f155057e;
        ts3.d0 d0Var = (ts3.d0) readerAppUI.f155059g;
        mMPullDownView.setIsTopShowAll(d0Var.f421651p >= d0Var.f421652q);
    }
}
