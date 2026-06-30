package tw3;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f422479a;

    public static void a(android.content.Context context, r45.jp6 jp6Var) {
        java.util.ArrayList arrayList;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemitHelper", "goMobileRemitUI()");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_rcvr_openid", jp6Var.f378021h);
        intent.putExtra("key_rcvr_token", jp6Var.f378022i);
        intent.putExtra("key_wx_name", jp6Var.f378023m);
        intent.putExtra("key_real_name", jp6Var.f378024n);
        intent.putExtra("key_phone", jp6Var.f378025o);
        intent.putExtra("key_img_url", jp6Var.f378026p);
        intent.putExtra("key_amount_remind_bit", jp6Var.f378027q);
        java.util.LinkedList linkedList = jp6Var.f378028r;
        int i17 = sw3.h.f413468w;
        if (linkedList == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.tencent.mm.plugin.remittance.mobile.cgi.NetSceneMobileRemitGetRecvInfo$DelayOptionParcel((r45.bd0) it.next()));
            }
        }
        intent.putExtra("key_delay_options", arrayList);
        intent.putExtra("key_check_name_wording", jp6Var.f378029s);
        intent.putExtra("key_check_name_mask", jp6Var.f378030t);
        intent.putExtra("key_get_rcvr_ext", jp6Var.f378031u);
        intent.putExtra("key_timestamp_ms", jp6Var.f378032v);
        j45.l.j(context, "remittance", ".mobile.ui.MobileRemittanceUI", intent, null);
    }
}
