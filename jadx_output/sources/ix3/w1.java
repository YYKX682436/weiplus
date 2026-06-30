package ix3;

/* loaded from: classes5.dex */
public final class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f295594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ix3.z1 f295595f;

    public w1(java.lang.String str, long j17, ix3.z1 z1Var) {
        this.f295593d = str;
        this.f295594e = j17;
        this.f295595f = z1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        v05.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerFileMsgDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.storage.f9 k17 = e0Var.k(this.f295593d, this.f295594e);
        if (k17 != null) {
            l15.c cVar = new l15.c();
            java.lang.String U1 = k17.U1();
            if (U1 == null) {
                U1 = "";
            }
            cVar.fromXml(U1);
            v05.b k18 = cVar.k();
            if (k18 != null && (aVar = (v05.a) k18.getCustom(k18.f432315e + 8)) != null) {
                int i17 = aVar.f368364d;
                boolean z17 = true;
                if (!r26.n0.N(aVar.getString(i17 + 2))) {
                    if (aVar.getLong(i17 + 0) >= 26214400) {
                        aVar.set(i17 + 3, "23938d53044460f51af1a3190ec05f68");
                        aVar.set(i17 + 2, "3057020100044b304902010002048b1ca2f802032f84110204f1bb587d020468b5adee042461653634613861322d396137652d343761392d393064312d3230626634393864313566650204012800070201000405004c56f900");
                    } else {
                        aVar.set(i17 + 3, "dd2089fef9936fe01394ec07243ec930");
                        aVar.set(i17 + 2, "3057020100044b304902010002048b1ca2f802032f84110204f1bb587d020468b5adee042435646462613362612d336533382d343965332d393463382d6236333134636534663332330204012400050201000405004c51e500");
                    }
                } else if (!r26.n0.N(aVar.C())) {
                    aVar.set(i17 + 3, "d2465869bbb246518f6b9d3a3a06fd85");
                    aVar.S("https://wwfile.work.weixin.qq.com/cgi-bin/download?f=30690201020462306002010002045cdd6a6b02030f4df90204e6136071020468d0e5b8042432633031323966352d356166392d343033302d613530392d313832626362373033636433020100020327a8100410b46c7334ab1c8f50ef2f2cb0c412a1930201050201000400&t=EA3215E3ED30E80D79DCF8F03E4F62EFA7794628589104D04AF3BF0E62A96A02FCB2F5B97C2F48DE6391E52103FDBB6848D9F15A746828FCC170E7C77AE5BE0025AF20BDF5875783370D724CD9265FFD6AC533F4861A7C2AF3DD28F9D2B9CE5B238E135482D7D2251EB6C3D049F63D5F3A1AD9E7F0DBE581BCFF1A40E074C6B7430A224011E8341D2764704DB08A8CB14C019FF85E0F04EB24437998BCC66E9A55357A0988A95AAA78A633226CA86C0A763F17BE79AA7E44D84947027D656E64A42598C9644D0734C540FB52313612B38AF5B730C8ACCC3A799FC9BCA52BD163422FA6165C30066AB665CA1778FD12F35F6333E1BBED2260C8F1654D74A0BF28334ACF5DABBAB7D9D5CA640C9C17DD1B&p=5");
                    aVar.R("0A2B6F4E2D4D7741514141414143496D4B44766A545676424D6745716B637871474D5A40696D2E7778776F726B1097B9E4CF07");
                } else {
                    z17 = false;
                }
                if (z17) {
                    r15.b l17 = cVar.l();
                    if (l17 != null) {
                        l17.p(c01.id.e());
                    }
                    if (k17.A0() == 0 && com.tencent.mm.storage.z3.N4(k17.Q0())) {
                        k17.d1(k17.V1() + ":\n" + cVar.toXml());
                    } else {
                        k17.d1(cVar.toXml());
                    }
                }
            }
            k17.e1(c01.id.c() - 1296000000);
            e0Var.s(k17.Q0(), k17.getMsgId(), k17);
            androidx.appcompat.app.AppCompatActivity activity = this.f295595f.getActivity();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = "消息时间已修改为15天之前";
            e4Var.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerFileMsgDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
