package zt1;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f475553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f475554e;

    public a(zt1.b bVar, boolean z17, boolean z18) {
        this.f475553d = z17;
        this.f475554e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Long l17;
        if (this.f475553d && (l17 = (java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_REQUENCE_LONG_SYNC, 0L)) != null && l17.longValue() == 0) {
            xt1.t0.mj().a();
        }
        if (this.f475554e && android.text.TextUtils.isEmpty((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_CARD_LAYOUT_BUF_DATA_STRING_SYNC, null))) {
            xt1.t0.wi().a(1);
        }
    }
}
