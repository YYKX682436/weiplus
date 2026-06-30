package kl3;

/* loaded from: classes11.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl3.z f308851d;

    public x(kl3.z zVar, kl3.v vVar) {
        this.f308851d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        kl3.z zVar = this.f308851d;
        zVar.f308865n = true;
        b21.r o17 = zVar.o();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "musicWrapper.MusicType:%d", java.lang.Integer.valueOf(o17.f17345d));
        int i17 = o17.f17345d;
        if (i17 == 1) {
            com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = new com.tencent.mm.autogen.events.MusicActionEvent();
            musicActionEvent.f54509g.f6770a = -5;
            musicActionEvent.e();
            list = musicActionEvent.f54510h.f6839c;
        } else if (i17 == 4) {
            com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent2 = new com.tencent.mm.autogen.events.MusicActionEvent();
            musicActionEvent2.f54509g.f6770a = -4;
            musicActionEvent2.e();
            list = musicActionEvent2.f54510h.f6839c;
        } else if (i17 == 6) {
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            favoriteOperationEvent.f54243g.f8528a = 18;
            favoriteOperationEvent.e();
            list = favoriteOperationEvent.f54244h.f6141h;
        } else if (i17 != 8) {
            list = null;
        } else {
            com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent3 = new com.tencent.mm.autogen.events.MusicActionEvent();
            am.gk gkVar = musicActionEvent3.f54509g;
            gkVar.f6770a = -6;
            gkVar.f6771b = o17;
            musicActionEvent3.e();
            list = musicActionEvent3.f54510h.f6839c;
        }
        if (list != null) {
            for (int i18 = 0; i18 < list.size(); i18++) {
                b21.r rVar = (b21.r) list.get(i18);
                if (rVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicWechatPrivateLogic", "wrapper is null, continue");
                } else {
                    ll3.o2.Ai().J0(rVar);
                    arrayList.add(xl3.c.a(rVar));
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "GetMusicWrapperListTask run time %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        zVar.f308865n = false;
        kl3.y yVar = new kl3.y(zVar, null);
        yVar.f308852d = arrayList;
        com.tencent.mm.sdk.platformtools.u3.h(yVar);
    }
}
