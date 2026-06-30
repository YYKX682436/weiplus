package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vs3.a f155190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.j f155191e;

    public i(com.tencent.mm.plugin.recharge.ui.j jVar, vs3.a aVar) {
        this.f155191e = jVar;
        this.f155190d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.recharge.ui.j jVar = this.f155191e;
        com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText = jVar.f155193a.f155200i;
        vs3.a aVar = this.f155190d;
        mallEditText.f155097u = aVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f439876b)) {
            jVar.f155193a.f155200i.f155085f.setText("");
            jVar.f155193a.f155200i.f155085f.setVisibility(8);
        } else {
            com.tencent.mm.plugin.recharge.ui.MallEditText mallEditText2 = jVar.f155193a.f155200i;
            mallEditText2.f155085f.setText(mallEditText2.f155097u.f439876b);
            jVar.f155193a.f155200i.f155085f.setVisibility(0);
        }
        jVar.f155193a.f155200i.f155086g.dismissDropDown();
    }
}
