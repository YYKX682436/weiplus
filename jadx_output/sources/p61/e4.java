package p61;

/* loaded from: classes11.dex */
public class e4 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.a f352240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p61.h4 f352241e;

    public e4(p61.h4 h4Var, r61.a aVar) {
        this.f352241e = h4Var;
        this.f352240d = aVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            ((com.tencent.mm.plugin.account.bind.ui.MobileFriendUI) this.f352241e.f212608e).V6(this.f352240d);
        }
    }
}
