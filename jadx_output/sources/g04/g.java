package g04;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g04.l f267462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine f267463f;

    public g(com.tencent.mm.plugin.scanner.word.ImageWordScanDetailEngine imageWordScanDetailEngine, java.lang.String str, g04.l lVar) {
        this.f267463f = imageWordScanDetailEngine;
        this.f267461d = str;
        this.f267462e = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f267463f.f160019g.remove(this.f267461d);
        if (arrayList == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g04.h hVar = (g04.h) it.next();
            ((ku5.t0) ku5.t0.f312615d).B(new g04.f(this, hVar));
        }
    }
}
