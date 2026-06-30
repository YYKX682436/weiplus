package uj4;

/* loaded from: classes11.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj4.e f428409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uj4.e eVar) {
        super(1);
        this.f428409d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.vas.VASActivity vASActivity = (com.tencent.mm.ui.vas.VASActivity) obj;
        uj4.e eVar = this.f428409d;
        com.tencent.mars.xlog.Log.i(eVar.f428417d, "addStatusFeedVASFragmentToRoot: attach fragment, " + vASActivity);
        eVar.f428422i = new java.lang.ref.WeakReference(vASActivity);
        com.tencent.mars.xlog.Log.i(eVar.f428417d, "doOnInit: ");
        com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC V6 = eVar.V6();
        if (V6 != null) {
            V6.f173786t = false;
            uj4.d listener = eVar.f428430t;
            kotlin.jvm.internal.o.g(listener, "listener");
            V6.f173780n.add(listener);
        }
        return jz5.f0.f302826a;
    }
}
