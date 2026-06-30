package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public class s4 implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f147406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147407h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f147408i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147409m;

    public s4(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, r45.wv3 wv3Var, android.view.View view, android.view.View view2, android.widget.ImageView imageView, android.view.View view3, android.view.ViewGroup viewGroup, android.view.View view4) {
        this.f147403d = wv3Var;
        this.f147404e = view;
        this.f147405f = view2;
        this.f147406g = imageView;
        this.f147407h = view3;
        this.f147408i = viewGroup;
        this.f147409m = view4;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        if (this.f147403d.f389501g.D == 2) {
            this.f147404e.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.p4(this), 0L);
        } else {
            this.f147409m.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.r4(this), 0L);
        }
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
