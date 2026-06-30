package fu1;

/* loaded from: classes15.dex */
public class i extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f266844e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo.f94679l1, "ShareCardInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f266845d;

    public i(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo.f94679l1, "ShareCardInfo", null);
        this.f266845d = k0Var;
    }

    public int D0(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "getNormalCount()");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" where ( status=0) ");
        sb6.append(" AND (card_tp_id = '" + str + "' )");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("select count(*) from ShareCardInfo");
        sb7.append(sb6.toString());
        android.database.Cursor f17 = this.f266845d.f(sb7.toString(), null, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "getNormalCount(), cursor == null");
            return 0;
        }
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public java.lang.String J0(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId()");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" where ( status=0) ");
        sb6.append(" AND (card_tp_id = '" + str + "' )");
        sb6.append(" order by share_time desc  limit 1");
        android.database.Cursor f17 = this.f266845d.f("select ShareCardInfo.card_id from ShareCardInfo" + sb6.toString(), null, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId(), cursor == null");
            return "";
        }
        int columnIndex = f17.getColumnIndex("card_id");
        if (columnIndex == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId(), index is wrong");
            f17.close();
            return "";
        }
        java.lang.String string = f17.moveToFirst() ? f17.getString(columnIndex) : "";
        f17.close();
        return string;
    }

    public java.util.ArrayList L0(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), limit is " + i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" where ( status=0) ");
        sb6.append(" AND (card_tp_id = '" + str + "' )");
        sb6.append(" order by share_time desc ");
        sb6.append(" limit " + i17);
        android.database.Cursor f17 = this.f266845d.f("select ShareCardInfo.from_username from ShareCardInfo" + sb6.toString(), null, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), cursor == null");
            return null;
        }
        int columnIndex = f17.getColumnIndex("from_username");
        if (columnIndex == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), index is wrong");
            f17.close();
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (f17.moveToNext()) {
            java.lang.String string = f17.getString(columnIndex);
            if (android.text.TextUtils.isEmpty(string) || arrayList.contains(string)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ShareCardInfoStorage", "the field_from_username is empty or username is added!, the card id is " + str);
            } else {
                arrayList.add(string);
            }
            if (arrayList.size() >= i17) {
                break;
            }
        }
        f17.close();
        return arrayList;
    }

    public java.lang.String P0(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId()");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" where ( status=0) ");
        sb6.append(" AND (card_tp_id = '" + str2 + "' )");
        sb6.append(" order by share_time desc  limit 2");
        android.database.Cursor f17 = this.f266845d.f("select ShareCardInfo.card_id from ShareCardInfo" + sb6.toString(), null, 2);
        java.lang.String str3 = "";
        if (f17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId(), cursor == null");
            return "";
        }
        int columnIndex = f17.getColumnIndex("card_id");
        if (columnIndex == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId(), index is wrong");
            f17.close();
            return "";
        }
        while (f17.moveToNext()) {
            str3 = f17.getString(columnIndex);
            if (str != null && !str.equals(str3)) {
                break;
            }
        }
        f17.close();
        return str3;
    }

    public boolean W0(java.util.ArrayList arrayList, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" where ( status=0)  AND (");
        if (arrayList != null && arrayList.size() > 0) {
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                if (i18 != 0) {
                    sb6.append(" OR ");
                }
                sb6.append("card_tp_id");
                sb6.append(" = '" + ((java.lang.String) arrayList.get(i18)) + "' ");
            }
            sb6.append(") AND (");
        }
        sb6.append("categoryType");
        sb6.append(" = '" + i17 + "'");
        sb6.append(")");
        boolean A = this.f266845d.A("ShareCardInfo", "update ShareCardInfo set categoryType = '0' , itemIndex = '0' " + sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", "resetCategoryInfo updateRet is " + (A ? 1 : 0));
        return A;
    }

    public boolean b1(java.lang.String str, int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" where ( status=0) ");
        sb6.append(" AND (card_tp_id = '" + str + "' )");
        boolean A = this.f266845d.A("ShareCardInfo", "update ShareCardInfo set categoryType = '" + i17 + "', itemIndex = '" + i18 + "' " + sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateCategoryInfo updateRet is ");
        sb7.append(A ? 1 : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareCardInfoStorage", sb7.toString());
        return A;
    }

    public com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo y0(java.lang.String str) {
        com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo shareCardInfo = new com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo();
        shareCardInfo.field_card_id = str;
        if (super.get(shareCardInfo, new java.lang.String[0])) {
            return shareCardInfo;
        }
        return null;
    }

    public final java.lang.String z0(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList e17 = eu1.f.e(i17);
        if (e17 == null || e17.size() <= 0) {
            return "";
        }
        sb6.append(" (");
        for (int i18 = 0; i18 < e17.size(); i18++) {
            if (i18 != 0) {
                sb6.append(" OR ");
            }
            sb6.append("card_id");
            sb6.append(" = '" + ((java.lang.String) e17.get(i18)) + "' ");
        }
        sb6.append(") AND ");
        return sb6.toString();
    }
}
