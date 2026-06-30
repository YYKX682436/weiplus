package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class r3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.s3 f147365e;

    public r3(com.tencent.mm.plugin.luckymoney.ui.s3 s3Var, java.lang.String str) {
        this.f147365e = s3Var;
        this.f147364d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.s3 s3Var = this.f147365e;
        ((java.util.HashSet) s3Var.f147402c.f147442e.f146093r2).remove(s3Var.f147400a.f145319n);
        if (s3Var.f147401b.getTag() != null) {
            if (this.f147364d.equals((java.lang.String) s3Var.f147401b.getTag())) {
                com.tencent.mm.plugin.luckymoney.model.m5.E(s3Var.f147402c.f147442e.getContext(), s3Var.f147401b, s3Var.f147400a.f145312d);
            }
        }
    }
}
