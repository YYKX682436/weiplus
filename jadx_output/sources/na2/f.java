package na2;

/* loaded from: classes2.dex */
public final class f extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f335957d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f335958e;

    /* renamed from: f, reason: collision with root package name */
    public qs2.e f335959f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f335960g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f335960g = jz5.h.b(new na2.e(activity, this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:13|(3:34|(1:36)(1:39)|(10:38|18|19|20|21|(1:23)(1:30)|24|(1:26)|27|28))|17|18|19|20|21|(0)(0)|24|(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6(qs2.e r17) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: na2.f.O6(qs2.e):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        long longExtra = getIntent().getLongExtra("from_object_id", 0L);
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "onCreate: fromObjectId=" + longExtra);
        if (longExtra != 0) {
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(longExtra);
            jz5.f0 f0Var = null;
            if (h17 != null) {
                this.f335957d = h17;
                qd2.g gVar = (qd2.g) ((jz5.n) this.f335960g).getValue();
                if (gVar.f361728b == null) {
                    gVar.f361728b = h17;
                    gVar.d(null);
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "onCreate: prepare audio track from bubble feedId=".concat(pm0.v.u(longExtra)));
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "onCreate: fromObjectId=" + longExtra + " not in cache, fallback to recommend first feed later");
            }
        }
    }
}
