package g04;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g04.l f267457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine f267458f;

    public e(com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine imageWordScanDetailEngine, java.lang.String str, g04.l lVar) {
        this.f267458f = imageWordScanDetailEngine;
        this.f267456d = str;
        this.f267457e = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f267458f.f160017e.setValue(new android.util.Pair(this.f267456d, this.f267457e));
    }
}
