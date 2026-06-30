package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class mc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f147176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f147178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f147179g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147180h;

    public mc(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard, android.view.View view, boolean z17, android.widget.EditText editText, com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147176d = wcPayKeyboard;
        this.f147177e = view;
        this.f147178f = z17;
        this.f147179g = editText;
        this.f147180h = luckyMoneyNewPrepareUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f147176d;
        android.animation.ObjectAnimator objectAnimator = wcPayKeyboard.F;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        android.animation.ObjectAnimator objectAnimator2 = wcPayKeyboard.G;
        if (objectAnimator2 != null) {
            objectAnimator2.end();
        }
        boolean isShown = wcPayKeyboard.isShown();
        android.view.View view = this.f147177e;
        if (!isShown && view.isShown()) {
            wcPayKeyboard.setIsOnlySupportInteger(this.f147178f);
            wcPayKeyboard.u();
        }
        wcPayKeyboard.setInputEditText(this.f147179g);
        java.lang.Object systemService = this.f147180h.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
