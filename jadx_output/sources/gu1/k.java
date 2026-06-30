package gu1;

/* loaded from: classes15.dex */
public class k extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public int f275892o;

    /* renamed from: p, reason: collision with root package name */
    public tt1.k f275893p;

    /* renamed from: q, reason: collision with root package name */
    public int f275894q;

    /* renamed from: r, reason: collision with root package name */
    public long f275895r;

    /* renamed from: s, reason: collision with root package name */
    public long f275896s;

    public k(android.content.Context context) {
        super(context, new com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo());
        this.f275892o = 0;
        this.f275894q = -1;
        this.f275895r = 0L;
        this.f275896s = 0L;
        r(true);
        this.f275893p = new gu1.u(context, this);
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo shareCardInfo = (com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) obj;
        if (shareCardInfo == null) {
            shareCardInfo = new com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo();
        }
        if (cursor.isClosed()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardAdatper", "cursor is closed!");
        } else {
            shareCardInfo.convertFrom(cursor);
        }
        return shareCardInfo;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        return this.f275893p.a(i17, view, viewGroup, (com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) getItem(i17));
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        c();
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        java.lang.String str;
        android.database.Cursor B;
        this.f275895r = java.lang.System.currentTimeMillis();
        if (this.f275894q == -1) {
            fu1.i nj6 = xt1.t0.nj();
            nj6.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from ShareCardInfo");
            sb6.append(" where (status=0 OR status=5)");
            sb6.append(" order by status asc , share_time desc");
            B = nj6.f266845d.B(sb6.toString(), null);
        } else {
            fu1.i nj7 = xt1.t0.nj();
            int i17 = this.f275894q;
            nj7.getClass();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(" where ( status=0) ");
            if (i17 == 1) {
                sb7.append(" AND  (");
                sb7.append(nj7.z0(1));
                sb7.append(" categoryType= '10' ) ");
            } else if (i17 == 2) {
                sb7.append(" AND ( (");
                sb7.append(nj7.z0(1));
                sb7.append(" categoryType= '10' )  OR (");
                sb7.append(nj7.z0(2));
                sb7.append(" categoryType= '0' )  )");
            } else if (i17 != 3) {
                if (i17 == 4) {
                    sb7.append(" AND 1 != 1 ");
                }
                str = "";
                B = nj7.f266845d.B("select * from ShareCardInfo" + sb7.toString() + str, null);
            } else {
                sb7.append(" AND  (");
                sb7.append(nj7.z0(2));
                sb7.append(" categoryType= '0' ) ");
            }
            str = " order by categoryType desc , itemIndex asc";
            B = nj7.f266845d.B("select * from ShareCardInfo" + sb7.toString() + str, null);
        }
        if (B != null) {
            this.f275892o = B.getCount();
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardAdatper", "resetCursor showType %s, card count:%s", java.lang.Integer.valueOf(this.f275894q), java.lang.Integer.valueOf(this.f275892o));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardAdatper", "resetCursor cursor is null, showType %s", java.lang.Integer.valueOf(this.f275894q));
        }
        s(B);
        this.f275896s = java.lang.System.currentTimeMillis();
        notifyDataSetChanged();
    }
}
