package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ud extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.y0 f147499d;

    /* renamed from: e, reason: collision with root package name */
    public ym5.w1 f147500e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final com.tencent.mm.view.MMPAGView O6() {
        return (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.ued);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (this.f147500e != null) {
            com.tencent.mm.view.MMPAGView O6 = O6();
            boolean z17 = false;
            if (O6 != null && O6.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.view.MMPAGView O62 = O6();
                if (O62 != null) {
                    O62.n();
                }
                com.tencent.mm.view.MMPAGView O63 = O6();
                if (O63 != null) {
                    O63.i(this.f147500e);
                }
            }
        }
        this.f147500e = null;
        com.tencent.mm.wallet_core.model.z1.f214041a.a(this.f147499d);
        this.f147499d = null;
    }
}
