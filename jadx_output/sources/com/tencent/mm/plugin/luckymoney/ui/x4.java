package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wv3 f147667e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147668f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.component.ListScrollPAGView f147669g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f147670h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147671i;

    public x4(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI, android.view.View view, r45.wv3 wv3Var, android.view.View view2, com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView, kotlinx.coroutines.y0 y0Var, android.view.View view3) {
        this.f147666d = view;
        this.f147667e = wv3Var;
        this.f147668f = view2;
        this.f147669g = listScrollPAGView;
        this.f147670h = y0Var;
        this.f147671i = view3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).rj(10, this.f147667e, this.f147668f, this.f147669g, this.f147670h, this.f147671i.getWidth(), 0, this.f147666d, (int) ((this.f147666d.getHeight() / 1200.0f) * (com.tencent.mm.sdk.platformtools.t8.K0(this.f147667e.f389501g.f390494x) ^ true ? 50.0f : 48.0f)));
    }
}
