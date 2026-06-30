package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class xn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147708e;

    public xn(com.tencent.mm.plugin.luckymoney.ui.co coVar, java.lang.String str) {
        this.f147708e = coVar;
        this.f147707d = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.W6(this.f147708e.M, this.f147707d);
        }
    }
}
