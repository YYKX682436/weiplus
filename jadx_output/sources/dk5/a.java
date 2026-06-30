package dk5;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.ui.contact.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f234488n;

    public a(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, boolean z18, boolean z19) {
        super(mMBaseSelectContactUI, list, z17, z18, z19);
        s();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().a(this);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        s();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f234488n;
        if (cursor != null) {
            return cursor.getCount();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ConvBoxTransmitUI.ConvBoxTransmitAdapter", "getCount: dataCursor == null ");
        return 0;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        if (!this.f234488n.moveToPosition(i17)) {
            return null;
        }
        com.tencent.mm.ui.contact.item.c0 c0Var = new com.tencent.mm.ui.contact.item.c0(i17);
        com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
        l4Var.convertFrom(this.f234488n);
        gm0.j1.i();
        c0Var.f(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(l4Var.h1()));
        if (c0Var.B == null) {
            gm0.j1.i();
            c0Var.f(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(l4Var.h1()));
        }
        c0Var.f206836e = this.f207078f;
        return c0Var;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvBoxTransmitUI.ConvBoxTransmitAdapter", "finish!");
        android.database.Cursor cursor = this.f234488n;
        if (cursor != null) {
            cursor.close();
            this.f234488n = null;
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this);
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvBoxTransmitUI.ConvBoxTransmitAdapter", "resetData");
        android.database.Cursor cursor = this.f234488n;
        if (cursor != null) {
            cursor.close();
            this.f234488n = null;
        }
        this.f234488n = ((com.tencent.mm.storage.m4) c01.d9.b().r()).s(1, this.f206588m, "conversationboxservice", -1);
    }
}
