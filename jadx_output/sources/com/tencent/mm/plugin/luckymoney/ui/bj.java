package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class bj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.cj f146757d;

    public bj(com.tencent.mm.plugin.luckymoney.ui.cj cjVar) {
        this.f146757d = cjVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.cj cjVar = this.f146757d;
        if (cjVar.f146798d != null) {
            com.tencent.mm.plugin.luckymoney.ui.lj ljVar = cjVar.f146800f;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = ljVar.f147150a.X;
            if (iEmojiInfo == null || !iEmojiInfo.getMd5().equals(cjVar.f146798d.getMd5())) {
                return;
            }
            if (!cjVar.f146799e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "somethings error.");
                ljVar.f147150a.R.setVisibility(8);
                ljVar.f147150a.Q.setVisibility(0);
                ljVar.f147150a.getClass();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "somethings success.");
            ljVar.f147150a.X = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(ljVar.f147150a.X.getMd5());
            ljVar.f147150a.R.setVisibility(8);
            ljVar.f147150a.P.setVisibility(0);
            ljVar.f147150a.getClass();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = ljVar.f147150a;
            com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = luckyMoneyNotHookReceiveUI.X;
            luckyMoneyNotHookReceiveUI.J1 = 4;
            luckyMoneyNotHookReceiveUI.P.setEmojiInfo(iEmojiInfo2);
            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
            redEnvSendWithEmoticonClickStruct.f59936d = 8L;
            redEnvSendWithEmoticonClickStruct.k();
        }
    }
}
