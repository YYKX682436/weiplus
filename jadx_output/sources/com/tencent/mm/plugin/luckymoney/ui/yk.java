package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class yk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.zk f147746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xv3 f147747e;

    public yk(com.tencent.mm.plugin.luckymoney.ui.zk zkVar, r45.xv3 xv3Var) {
        this.f147746d = zkVar;
        this.f147747e = xv3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.zk zkVar = this.f147746d;
        if (zkVar.f147786e == null) {
            kotlin.jvm.internal.o.o("envelopeMaskIv");
            throw null;
        }
        int height = (int) ((r1.getHeight() / 1200.0f) * (com.tencent.mm.sdk.platformtools.t8.K0(this.f147747e.f390494x) ^ true ? 40 : 38));
        gb3.j jVar = (gb3.j) i95.n0.c(gb3.j.class);
        r45.wv3 wv3Var = zkVar.f147785d;
        if (wv3Var == null) {
            kotlin.jvm.internal.o.o("hbEnvelopSource");
            throw null;
        }
        android.view.View view = zkVar.f147787f;
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = zkVar.f147788g;
        kotlinx.coroutines.y0 y0Var = zkVar.f147789h;
        androidx.appcompat.app.AppCompatActivity activity = zkVar.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        int i17 = ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew) activity).f146508i;
        android.widget.ImageView imageView = zkVar.f147786e;
        if (imageView != null) {
            ((com.tencent.mm.plugin.luckymoney.model.w2) jVar).rj(10, wv3Var, view, listScrollPAGView, y0Var, i17, 0, imageView, height);
        } else {
            kotlin.jvm.internal.o.o("envelopeMaskIv");
            throw null;
        }
    }
}
