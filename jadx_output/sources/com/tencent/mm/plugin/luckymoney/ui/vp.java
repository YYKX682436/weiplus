package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class vp implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f147623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.SelectLuckyMoneyContactUI f147624b;

    public vp(com.tencent.mm.plugin.luckymoney.ui.SelectLuckyMoneyContactUI selectLuckyMoneyContactUI, android.content.Intent intent) {
        this.f147624b = selectLuckyMoneyContactUI;
        this.f147623a = intent;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            android.content.Intent intent = this.f147623a;
            com.tencent.mm.plugin.luckymoney.ui.SelectLuckyMoneyContactUI selectLuckyMoneyContactUI = this.f147624b;
            selectLuckyMoneyContactUI.setResult(-1, intent);
            selectLuckyMoneyContactUI.finish();
        }
    }
}
