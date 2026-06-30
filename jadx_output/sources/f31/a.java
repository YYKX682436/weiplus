package f31;

/* loaded from: classes9.dex */
public final class a implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o31.d f259266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o31.b f259267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o31.e f259268c;

    public a(o31.d dVar, o31.b bVar, o31.e eVar) {
        this.f259266a = dVar;
        this.f259267b = bVar;
        this.f259268c = eVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        f31.b bVar = f31.b.f259269a;
        java.lang.Object obj = oVar.f70711b.f70700a;
        if ((obj == null || ((obj instanceof r45.ny3) && ((r45.ny3) obj).getBaseResponse() == null)) ? false : true) {
            try {
                ((o31.c) this.f259266a).f342668c.parseFrom(oVar.f70711b.f70700a.toByteArray());
            } catch (b36.g e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMCompatNetworkDispatcher", "parseFrom mmrr uri=" + ((o31.c) this.f259266a).f342670e + ", e=" + e17);
                o31.b bVar2 = this.f259267b;
                if (bVar2 != null) {
                    ((f31.f) bVar2).b(i17, i18, str, this.f259268c);
                    return;
                }
                return;
            } catch (java.io.IOException e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMCompatNetworkDispatcher", "parseFrom mmrr uri=" + ((o31.c) this.f259266a).f342670e + ", e=" + e18);
                o31.b bVar3 = this.f259267b;
                if (bVar3 != null) {
                    ((f31.f) bVar3).b(5, i18, str, this.f259268c);
                    return;
                }
                return;
            }
        }
        o31.b bVar4 = this.f259267b;
        if (bVar4 != null) {
            ((f31.f) bVar4).b(i17, i18, str, this.f259268c);
        }
        java.util.WeakHashMap weakHashMap = f31.b.f259270b;
        o31.e eVar = this.f259268c;
        synchronized (weakHashMap) {
            weakHashMap.remove(eVar);
        }
    }
}
