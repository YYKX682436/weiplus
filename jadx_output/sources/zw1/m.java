package zw1;

/* loaded from: classes2.dex */
public class m implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectBillUI f476718d;

    public m(com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI) {
        this.f476718d = collectBillUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ww1.p1) {
            ww1.p1 p1Var = (ww1.p1) m1Var;
            com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI = this.f476718d;
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CollectBillUI", "net error: %s", p1Var);
                collectBillUI.f96366p.setVisibility(8);
                return;
            }
            java.util.LinkedList<r45.d8> linkedList = p1Var.f450268f.f386820d;
            if (linkedList == null || linkedList.isEmpty()) {
                collectBillUI.f96366p.setVisibility(8);
                return;
            }
            for (r45.d8 d8Var : linkedList) {
                if (d8Var.f372213d == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(d8Var.f372214e)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CollectBillUI", "show notice");
                    collectBillUI.f96366p.setText(d8Var.f372214e);
                    collectBillUI.f96366p.setOnClickListener(new zw1.l(this, d8Var));
                    collectBillUI.f96366p.setVisibility(0);
                    return;
                }
            }
            collectBillUI.f96366p.setVisibility(8);
        }
    }
}
