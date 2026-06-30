package hk5;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk5.k f282002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hk5.k kVar) {
        super(1);
        this.f282002d = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s05.d dVar;
        s05.d dVar2;
        s05.d dVar3;
        vg5.a state = (vg5.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar4 = state.f298066d;
        if (dVar4 != null && (dVar4 instanceof wg5.e)) {
            hk5.k kVar = this.f282002d;
            kVar.W6().g().setVisibility(8);
            nb5.b bVar = new nb5.b();
            bVar.fromXml(state.f436774e);
            v05.b j17 = bVar.j();
            boolean z17 = true;
            if (!((j17 == null || (dVar3 = (s05.d) j17.getCustom(j17.f432315e + 39)) == null || dVar3.getType() != 1) ? false : true)) {
                java.util.ArrayList arrayList = (java.util.ArrayList) state.f436775f;
                if (arrayList.size() == 1) {
                    java.lang.String str = (java.lang.String) arrayList.get(0);
                    java.lang.String str2 = null;
                    kVar.f282010m = null;
                    if (kotlin.jvm.internal.o.b("wxid_wi_1d142z0zdj03", str)) {
                        v05.b j18 = bVar.j();
                        java.lang.String appId = (j18 == null || (dVar2 = (s05.d) j18.getCustom(j18.f432315e + 39)) == null) ? null : dVar2.getAppId();
                        if (appId != null && appId.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.ForwardMsgPreviewAppBrandUIC", "getAndUploadPageContent appId is null");
                        } else {
                            v05.b j19 = bVar.j();
                            if (j19 != null && (dVar = (s05.d) j19.getCustom(j19.f432315e + 39)) != null) {
                                str2 = dVar.p();
                            }
                            kVar.f282010m = new hk5.c(appId, str2);
                            hk5.g gVar = new hk5.g(kVar);
                            kVar.W6().a().setOnClickListener(gVar);
                            kVar.W6().i().setOnClickListener(gVar);
                            kVar.W6().e().c(new hk5.f(gVar));
                        }
                    }
                    if (c01.e2.Z(str)) {
                        kVar.W6().g().setVisibility(0);
                    }
                }
            }
            em.b W6 = kVar.W6();
            if (W6.f254081d == null) {
                W6.f254081d = (com.tencent.mm.ui.widget.imageview.WeImageView) W6.f254078a.findViewById(com.tencent.mm.R.id.he_);
            }
            W6.f254081d.setOnClickListener(new hk5.d(kVar));
        }
        return jz5.f0.f302826a;
    }
}
