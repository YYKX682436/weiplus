package ju2;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f301844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderThanksUpdateEvent f301846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ju2.v f301847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, java.lang.String str, com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent, ju2.v vVar) {
        super(0);
        this.f301844d = j17;
        this.f301845e = str;
        this.f301846f = finderThanksUpdateEvent;
        this.f301847g = vVar;
    }

    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int, boolean] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        ju2.w wVar;
        com.tencent.mars.xlog.Log.i("FinderThanksButtonViewModel", "thank forward UpdateListener event objectID:" + this.f301844d + " wxUsername:" + this.f301845e);
        am.md mdVar = this.f301846f.f54333g;
        ?? r07 = (mdVar == null || !mdVar.f7338b) ? 0 : 1;
        ju2.v vVar = this.f301847g;
        vVar.f301853f = r07;
        r45.hn2 hn2Var = vVar.f301856i;
        if (hn2Var != null) {
            hn2Var.set(1, java.lang.Integer.valueOf((int) r07));
        }
        java.lang.ref.WeakReference weakReference = vVar.f301852e;
        if (weakReference != null && (wVar = (ju2.w) weakReference.get()) != null) {
            ((com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButton) wVar).I();
        }
        return jz5.f0.f302826a;
    }
}
