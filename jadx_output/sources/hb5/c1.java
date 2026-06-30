package hb5;

/* loaded from: classes11.dex */
public class c1 extends com.tencent.mm.ui.contact.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f280156n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f280157o;

    public c1(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, java.lang.String str) {
        super(mMBaseSelectContactUI, list, z17, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "create!");
        this.f280157o = str;
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        s();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f280156n.getCount() + 1;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        com.tencent.mm.ui.contact.l4 l4Var = this.f207076d;
        if (i17 == 0) {
            com.tencent.mm.ui.contact.item.n0 n0Var = new com.tencent.mm.ui.contact.item.n0(i17);
            n0Var.f206903y = l4Var.getActivity().getResources().getString(com.tencent.mm.R.string.f492963ig5);
            return n0Var;
        }
        if (i17 <= 0 || !this.f280156n.moveToPosition((i17 + 0) - 1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecentConversationAdapter", "create Data Item Error position=%d", java.lang.Integer.valueOf(i17));
            return null;
        }
        hb5.i iVar = new hb5.i(i17);
        s01.b bVar = new s01.b();
        bVar.convertFrom(this.f280156n);
        if (iVar.D != -1) {
            return iVar;
        }
        iVar.D = bVar.field_bizChatId;
        s01.h z07 = r01.q3.Ui().z0(bVar.field_bizChatId);
        if (z07.y0()) {
            iVar.f206818y = z07.field_chatName;
            iVar.C = z07.field_headImageUrl;
            iVar.f206819z = z07.field_brandUserName;
        } else {
            s01.a0 y07 = r01.q3.Vi().y0(z07.field_bizChatServId);
            if (y07 != null) {
                iVar.f206818y = y07.field_userName;
                iVar.C = y07.field_headImageUrl;
                iVar.f206819z = y07.field_brandUserName;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.J0(iVar.f206818y)) {
            iVar.f206818y = l4Var.getActivity().getResources().getString(com.tencent.mm.R.string.i4y);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(iVar.f206819z)) {
            return iVar;
        }
        iVar.f206819z = bVar.field_brandUserName;
        return iVar;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public void k() {
        h();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "finish!");
        android.database.Cursor cursor = this.f280156n;
        if (cursor != null) {
            cursor.close();
            this.f280156n = null;
        }
    }

    @Override // com.tencent.mm.ui.contact.a5
    public void s() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationAdapter", "resetData");
        android.database.Cursor cursor = this.f280156n;
        if (cursor != null) {
            cursor.close();
            this.f280156n = null;
        }
        this.f280156n = r01.q3.aj().L0(this.f280157o);
    }
}
