package pp3;

/* loaded from: classes5.dex */
public class d extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public long f357470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pp3.j f357471b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pp3.j jVar, android.os.Looper looper) {
        super(looper);
        this.f357471b = jVar;
        this.f357470a = 0L;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PatHandler", "click msg %d", java.lang.Integer.valueOf(message.what));
        int i17 = message.what;
        pp3.j jVar = this.f357471b;
        switch (i17) {
            case com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX /* 290 */:
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = this.f357470a;
                if (j17 <= 0 || currentTimeMillis - j17 >= pp3.j.f357481f) {
                    sendMessageDelayed(jVar.f357486e.obtainMessage(291, message.obj), pp3.j.f357481f);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PatHandler", "double click");
                    removeMessages(291);
                    sendMessage(jVar.f357486e.obtainMessage(292, message.obj));
                }
                this.f357470a = currentTimeMillis;
                return;
            case 291:
                mp3.l lVar = jVar.f357482a;
                if (lVar != null && lVar.getOnClickListener() != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PatHandler", "single click");
                    jVar.f357482a.getOnClickListener().onClick((android.view.View) message.obj);
                }
                this.f357470a = 0L;
                return;
            case 292:
                mp3.l lVar2 = jVar.f357482a;
                if (!((lVar2 == null || lVar2.getDoubleClickListener() == null) ? false : jVar.f357482a.getDoubleClickListener().a((android.view.View) message.obj)) && jVar.f357482a != null) {
                    jVar.d();
                }
                this.f357470a = 0L;
                return;
            case com.tencent.mm.plugin.appbrand.jsapi.audio.c0.CTRL_INDEX /* 293 */:
                ((com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView) jVar.f357483b).f152895i.dismiss();
                return;
            default:
                return;
        }
    }
}
