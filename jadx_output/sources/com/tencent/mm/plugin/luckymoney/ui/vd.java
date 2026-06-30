package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class vd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f147543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147544f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f147545g;

    public vd(java.lang.String str, com.tencent.mm.view.MMPAGView mMPAGView, r45.wv3 wv3Var, long j17) {
        this.f147542d = str;
        this.f147543e = mMPAGView;
        this.f147544f = wv3Var;
        this.f147545g = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.model.n3.f145460a.h(1, this.f147542d, this.f147543e);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        r45.xv3 xv3Var = this.f147544f.f389501g;
        objArr[0] = xv3Var != null ? xv3Var.f390494x : null;
        objArr[1] = 1;
        objArr[2] = 2;
        objArr[3] = java.lang.Long.valueOf(this.f147545g);
        g0Var.d(28153, objArr);
    }
}
