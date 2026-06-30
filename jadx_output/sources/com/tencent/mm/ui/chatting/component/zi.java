package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class zi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msgquote.model.MsgQuoteItem f200387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.bj f200388f;

    public zi(com.tencent.mm.ui.chatting.component.bj bjVar, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        this.f200388f = bjVar;
        this.f200386d = f9Var;
        this.f200387e = msgQuoteItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.bj bjVar = this.f200388f;
        bjVar.getClass();
        java.lang.String str = bjVar.f198829h;
        long j17 = bjVar.f198828g;
        sb5.z zVar = (sb5.z) bjVar.f198580d.f460708c.a(sb5.z.class);
        int b17 = i65.a.b(bjVar.f198580d.g(), 120);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && j17 != 0) {
            sb5.y yVar = new sb5.y();
            yVar.f405597b = true;
            yVar.f405600e = b17;
            yVar.f405602g = true;
            ((com.tencent.mm.ui.chatting.adapter.k) zVar).T0(str, j17, hd5.n.ACTION_POSITION, yVar);
        }
        bjVar.m0();
        com.tencent.mm.storage.f9 f9Var = this.f200386d;
        if (f9Var != null) {
            int type = f9Var.getType();
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem = this.f200387e;
            switch (type) {
                case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                case 1048625:
                case 419430449:
                case 436207665:
                case 754974769:
                case 771751985:
                case 805306417:
                case 822083633:
                case 855638065:
                case 939524145:
                case 973078577:
                case 975175729:
                case 1040187441:
                case 1090519089:
                case 1157627953:
                case 1174405169:
                case 1224736817:
                case 1241514033:
                    ot0.q v17 = ot0.q.v(f9Var.j());
                    if (v17 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.QuoteMsgTongueComponent", "appMsgContent is null");
                        break;
                    } else {
                        ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ni(ty.p0.f422739h, msgQuoteItem, java.lang.Integer.valueOf(v17.f348666i), str);
                        break;
                    }
                default:
                    ((ti3.q) ((ty.k0) i95.n0.c(ty.k0.class))).Ni(ty.p0.f422739h, msgQuoteItem, 0, str);
                    break;
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/QuoteMsgTongueComponent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
