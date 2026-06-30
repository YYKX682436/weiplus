package pk2;

/* loaded from: classes3.dex */
public final class oa implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pk2.pa f356125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f356126c;

    public oa(pk2.o9 o9Var, pk2.pa paVar, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        this.f356124a = o9Var;
        this.f356125b = paVar;
        this.f356126c = mMSwitchBtn;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        pk2.o9 o9Var = this.f356124a;
        long j17 = ((mm2.e1) o9Var.c(mm2.e1.class)).f328988r.getLong(0);
        if (z17) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("FINDER_LIVE_MMKV");
            if (M != null) {
                M.putLong("VISITOR_GIFT_EFFECT_OFF_LIVE_ID", 0L);
            }
        } else {
            com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M("FINDER_LIVE_MMKV");
            if (M2 != null) {
                M2.putLong("VISITOR_GIFT_EFFECT_OFF_LIVE_ID", j17);
            }
            o9Var.j(qo0.b.X1, null);
        }
        pk2.pa.w(o9Var, this.f356126c, z17);
        ((mm2.c1) o9Var.c(mm2.c1.class)).f328894u5 = !z17;
        qk2.f.f(this.f356125b, false, 1, null);
    }
}
