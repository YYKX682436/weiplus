package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class tj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f147465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.uj f147466f;

    public tj(com.tencent.mm.plugin.luckymoney.ui.uj ujVar, java.lang.String str, long j17) {
        this.f147466f = ujVar;
        this.f147464d = str;
        this.f147465e = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.model.n3 n3Var = com.tencent.mm.plugin.luckymoney.model.n3.f145460a;
        com.tencent.mm.plugin.luckymoney.ui.uj ujVar = this.f147466f;
        n3Var.h(1, this.f147464d, ujVar.f147508c);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28153, ujVar.f147509d.f389501g.f390494x, 1, 2, java.lang.Long.valueOf(this.f147465e));
    }
}
