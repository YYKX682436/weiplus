package gc3;

/* loaded from: classes9.dex */
public final class o implements gc3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout f270436a;

    public o(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout luckyMoneyVoiceTransLayout) {
        this.f270436a = luckyMoneyVoiceTransLayout;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyVoiceTransLayout", "onDetectStop, someone doStop or time out");
        com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceTransLayout luckyMoneyVoiceTransLayout = this.f270436a;
        luckyMoneyVoiceTransLayout.f147622v.d();
        long j17 = luckyMoneyVoiceTransLayout.f147617q;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        luckyMoneyVoiceTransLayout.f147618r = java.lang.System.currentTimeMillis() - j17;
        if (luckyMoneyVoiceTransLayout.f147618r < 1000) {
            gc3.n voiceListener = luckyMoneyVoiceTransLayout.getVoiceListener();
            if (voiceListener != null) {
                ((com.tencent.mm.plugin.luckymoney.ui.nh) voiceListener).a(2, luckyMoneyVoiceTransLayout.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String());
                return;
            }
            return;
        }
        if (com.tencent.mm.vfs.w6.j(luckyMoneyVoiceTransLayout.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String())) {
            gc3.n voiceListener2 = luckyMoneyVoiceTransLayout.getVoiceListener();
            if (voiceListener2 != null) {
                ((com.tencent.mm.plugin.luckymoney.ui.nh) voiceListener2).a(0, luckyMoneyVoiceTransLayout.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String());
                return;
            }
            return;
        }
        gc3.n voiceListener3 = luckyMoneyVoiceTransLayout.getVoiceListener();
        if (voiceListener3 != null) {
            ((com.tencent.mm.plugin.luckymoney.ui.nh) voiceListener3).a(3, luckyMoneyVoiceTransLayout.getCom.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH java.lang.String());
        }
    }
}
