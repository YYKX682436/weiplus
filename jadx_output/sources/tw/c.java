package tw;

/* loaded from: classes9.dex */
public final class c implements e31.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tw.i f422395a;

    public c(tw.i iVar) {
        this.f422395a = iVar;
    }

    @Override // e31.h
    public void a(java.lang.String bizUsername, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "[NotifySwitchCB] onNotifySwitchInfoUpdated: bizUsername=" + bizUsername + ", isOpened=" + z17 + ", importantNotifyNum=" + i17);
        tw.i iVar = this.f422395a;
        iVar.f422410o.add(bizUsername);
        if (iVar.f422410o.size() >= 10) {
            iVar.f422410o.size();
            tw.i.T6(iVar);
        } else if (iVar.f422411p == null) {
            tw.f fVar = new tw.f(iVar);
            iVar.f422411p = fVar;
            iVar.f422406h.postDelayed(fVar, 200L);
        }
    }
}
