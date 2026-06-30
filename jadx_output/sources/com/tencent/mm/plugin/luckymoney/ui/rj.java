package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class rj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f147388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.sj f147389f;

    public rj(com.tencent.mm.plugin.luckymoney.ui.sj sjVar, java.lang.String str, long j17) {
        this.f147389f = sjVar;
        this.f147387d = str;
        this.f147388e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.model.n3 n3Var = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
        com.tencent.mm.plugin.luckymoney.ui.sj sjVar = this.f147389f;
        n3Var.h(1, this.f147387d, sjVar.f147427c);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, sjVar.f147428d.f389501g.f390494x, 1, 2, java.lang.Long.valueOf(this.f147388e));
    }
}
