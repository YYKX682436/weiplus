package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class s3 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.h5 f147400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f147401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.t3 f147402c;

    public s3(com.tencent.mm.plugin.luckymoney.ui.t3 t3Var, com.tencent.mm.plugin.luckymoney.model.h5 h5Var, android.widget.TextView textView) {
        this.f147402c = t3Var;
        this.f147400a = h5Var;
        this.f147401b = textView;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.luckymoney.model.h5 h5Var = this.f147400a;
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = this.f147400a.f145319n;
            ((sg3.a) v0Var).getClass();
            h5Var.f145312d = c01.a2.e(str2);
            this.f147400a.f145322q = false;
            ((ku5.t0) ku5.t0.f312615d).D(new com.tencent.mm.plugin.luckymoney.ui.r3(this, str));
        }
    }
}
