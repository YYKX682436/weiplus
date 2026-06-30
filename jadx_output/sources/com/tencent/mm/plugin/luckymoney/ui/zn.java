package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class zn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.zm f147795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147796e;

    public zn(com.tencent.mm.plugin.luckymoney.ui.co coVar, com.tencent.mm.plugin.luckymoney.ui.zm zmVar) {
        this.f147796e = coVar;
        this.f147795d = zmVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.W6(this.f147796e.M, this.f147795d.f147793b.f389500f);
        }
    }
}
