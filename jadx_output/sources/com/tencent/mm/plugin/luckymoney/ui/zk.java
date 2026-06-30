package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class zk extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public r45.wv3 f147785d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f147786e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f147787f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.chatting.component.ListScrollPAGView f147788g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.y0 f147789h;

    /* renamed from: i, reason: collision with root package name */
    public ym5.w1 f147790i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (this.f147790i != null) {
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = this.f147788g;
            boolean z17 = false;
            if (listScrollPAGView != null && listScrollPAGView.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView2 = this.f147788g;
                if (listScrollPAGView2 != null) {
                    listScrollPAGView2.n();
                }
                com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView3 = this.f147788g;
                if (listScrollPAGView3 != null) {
                    listScrollPAGView3.i(this.f147790i);
                }
            }
        }
        this.f147788g = null;
        this.f147790i = null;
        com.tencent.mm.wallet_core.model.z1.f214041a.a(this.f147789h);
        this.f147789h = null;
    }
}
