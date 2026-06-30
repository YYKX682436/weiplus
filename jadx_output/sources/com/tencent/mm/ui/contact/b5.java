package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class b5 extends com.tencent.mm.ui.contact.f5 {

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.contact.n4 f206624n;

    public b5(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, java.lang.String str) {
        super(mMBaseSelectContactUI, list, z17, 0);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchContactAdapter", "Create!");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchContactAdapter", "initData!");
        h();
    }

    @Override // com.tencent.mm.ui.contact.f5, rd0.z0
    public void f(java.lang.String str, boolean z17) {
        com.tencent.mm.ui.contact.n4 n4Var = this.f206624n;
        if (n4Var != null) {
            n4Var.d4(str, 0, z17);
        }
    }

    @Override // com.tencent.mm.ui.contact.f5, android.widget.Adapter
    public int getCount() {
        return 0;
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        if (i17 >= 0) {
            throw null;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMSearchContactAdapter", "create Data Item Error position=%d", java.lang.Integer.valueOf(i17));
        return null;
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.p4
    public void k() {
        super.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchContactAdapter", "finish!");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchContactAdapter", "initData!");
        h();
    }

    @Override // com.tencent.mm.ui.contact.f5, com.tencent.mm.ui.contact.p4
    public boolean o(com.tencent.mm.ui.contact.item.d dVar) {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void u(com.tencent.mm.ui.contact.n4 n4Var) {
        this.f206624n = n4Var;
    }
}
