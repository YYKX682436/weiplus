package nd2;

/* loaded from: classes10.dex */
public final class p implements com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nd2.q f336465a;

    public p(nd2.q qVar) {
        this.f336465a = qVar;
    }

    @Override // com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi
    public void dispose(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "dispose viewId=" + j17);
        nd2.q qVar = this.f336465a;
        nd2.o oVar = (nd2.o) qVar.f336468c.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            oVar.dispose();
        }
        qVar.f336468c.remove(java.lang.Long.valueOf(j17));
        qVar.f336469d.remove(java.lang.Long.valueOf(j17));
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi
    public void pause(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "pause viewId=" + j17);
        nd2.o oVar = (nd2.o) this.f336465a.f336468c.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerContainer", "pause");
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = oVar.f336454m;
            if (nearbyLivePreviewView != null) {
                nearbyLivePreviewView.pause();
            }
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi
    public void resume(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "resume viewId=" + j17);
        nd2.o oVar = (nd2.o) this.f336465a.f336468c.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerContainer", "resume");
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = oVar.f336454m;
            if (nearbyLivePreviewView != null) {
                nearbyLivePreviewView.resume();
            }
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi
    public void setMute(long j17, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "setMute viewId=" + j17 + " isMuted=" + z17);
        nd2.o oVar = (nd2.o) this.f336465a.f336468c.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            oVar.f336462u = z17;
            com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerContainer", "setMute isMuted=" + z17);
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = oVar.f336454m;
            if (nearbyLivePreviewView != null) {
                nearbyLivePreviewView.setMute(z17);
            }
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    @Override // com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startPlay(long r29, java.lang.String r31, yz5.l r32) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd2.p.startPlay(long, java.lang.String, yz5.l):void");
    }

    @Override // com.tencent.pigeon.live_cdn_player.LiveCDNPlayerApi
    public void stopPlay(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerPlugin", "stopPlay viewId=" + j17);
        nd2.o oVar = (nd2.o) this.f336465a.f336468c.get(java.lang.Long.valueOf(j17));
        if (oVar != null) {
            com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerContainer", "stopPlay");
            oVar.f336464w = true;
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = oVar.f336454m;
            if (nearbyLivePreviewView != null) {
                nearbyLivePreviewView.stop();
            }
            oVar.c();
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }
}
