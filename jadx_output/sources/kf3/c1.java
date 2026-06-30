package kf3;

/* loaded from: classes5.dex */
public class c1 implements com.tencent.mm.pluginsdk.ui.chat.j5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendLayout f307328a;

    public c1(com.tencent.mm.plugin.masssend.ui.MassSendLayout massSendLayout) {
        this.f307328a = massSendLayout;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.j5
    public void a(int i17) {
        this.f307328a.f148537o.setTranslationY(-i17);
        com.tencent.mars.xlog.Log.i("MassSendLayout", "setKeyboardHeightChangeListener: height:%s", java.lang.Integer.valueOf(i17));
    }
}
