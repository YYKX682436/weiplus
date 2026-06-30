package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class mh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f147189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.nh f147191f;

    public mh(com.tencent.mm.plugin.luckymoney.ui.nh nhVar, int i17, java.lang.String str) {
        this.f147191f = nhVar;
        this.f147189d = i17;
        this.f147190e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147191f.f147242a;
        luckyMoneyNewYearSendUIV2.f146444y2 = 1;
        luckyMoneyNewYearSendUIV2.f146424q2 = 4;
        if (!luckyMoneyNewYearSendUIV2.F2.e()) {
            this.f147191f.f147242a.F2.d();
        }
        int i17 = this.f147189d;
        if (i17 == 1 || i17 == 3) {
            this.f147191f.f147242a.S.f(false);
            db5.t7.m(this.f147191f.f147242a.getContext(), this.f147191f.f147242a.getContext().getResources().getString(com.tencent.mm.R.string.f492425gl4));
        } else if (i17 == 2) {
            this.f147191f.f147242a.f146405h.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.kh(this), 380L);
        } else {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = this.f147191f.f147242a;
            luckyMoneyNewYearSendUIV22.f146444y2 = 3;
            java.lang.String str = this.f147190e;
            luckyMoneyNewYearSendUIV22.f146410k2 = str;
            com.tencent.mm.modelcdntran.q0 q0Var = luckyMoneyNewYearSendUIV22.E2;
            java.lang.String str2 = com.tencent.mm.plugin.luckymoney.model.e5.f145262a;
            dn.m mVar = new dn.m();
            mVar.f241785d = "task_uploadVoice";
            mVar.field_fileType = 15;
            mVar.field_fullpath = str;
            mVar.field_mediaId = "VoiceData" + str;
            mVar.field_totalLen = com.tencent.mm.vfs.w6.k(mVar.field_fullpath);
            mVar.field_chattype = 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "uploadVoiceFile %s %s %s", mVar.field_mediaId, mVar.field_fullpath, mVar.field_aesKey);
            if (((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ui(mVar, new java.lang.ref.WeakReference(q0Var)) != null) {
                this.f147191f.f147242a.f146424q2 = 2;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearSendUIV2", "cdn upload fail");
                this.f147191f.f147242a.f146424q2 = 4;
            }
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV23 = this.f147191f.f147242a;
            luckyMoneyNewYearSendUIV23.i7(13, luckyMoneyNewYearSendUIV23.M.getF147618r());
            java.util.List list = this.f147191f.f147242a.f146436w2;
            if (list == null || list.size() <= 0) {
                this.f147191f.f147242a.X.setVisibility(8);
            } else {
                this.f147191f.f147242a.X.setVisibility(0);
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.luckymoney.ui.lh lhVar = new com.tencent.mm.plugin.luckymoney.ui.lh(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(lhVar, 500L, false);
        }
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV24 = this.f147191f.f147242a;
        luckyMoneyNewYearSendUIV24.f146446z1.setVisibility(8);
        luckyMoneyNewYearSendUIV24.f146446z1.n();
        this.f147191f.f147242a.q7();
    }
}
