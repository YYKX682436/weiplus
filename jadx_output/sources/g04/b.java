package g04;

/* loaded from: classes15.dex */
public class b implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine f267446d;

    public b(com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine imageWordScanDetailEngine) {
        this.f267446d = imageWordScanDetailEngine;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        android.util.Pair pair = (android.util.Pair) obj;
        if (pair != null) {
            com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine imageWordScanDetailEngine = this.f267446d;
            java.lang.String str = (java.lang.String) pair.first;
            g04.l lVar = (g04.l) pair.second;
            imageWordScanDetailEngine.getClass();
            if (str == null || lVar == null) {
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new g04.g(imageWordScanDetailEngine, str, lVar), "WordDetectThread");
        }
    }
}
