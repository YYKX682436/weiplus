package dm3;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f241672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f241672d = weakReference;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dm3.e0 e0Var;
        com.tencent.mm.plugin.mv.ui.open.text_status.TingMusicLyricsView tingMusicLyricsView;
        java.lang.String str = (java.lang.String) obj;
        if (str != null && (e0Var = (dm3.e0) this.f241672d.get()) != null && (tingMusicLyricsView = e0Var.f241683o) != null) {
            tingMusicLyricsView.setupLyricContent(str);
        }
        return jz5.f0.f302826a;
    }
}
