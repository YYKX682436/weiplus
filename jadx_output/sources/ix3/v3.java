package ix3;

/* loaded from: classes9.dex */
public final class v3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f295588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix3.x3 f295589e;

    public v3(com.tencent.mm.storage.f9 f9Var, ix3.x3 x3Var) {
        this.f295588d = f9Var;
        this.f295589e = x3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String xml;
        long j17;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerRecordMsgDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.storage.f9 f9Var = this.f295588d;
        if (f9Var != null) {
            l15.c cVar = new l15.c();
            java.lang.String U1 = f9Var.U1();
            java.lang.String str = "";
            if (U1 == null) {
                U1 = "";
            }
            cVar.fromXml(U1, true);
            ix3.x3 x3Var = this.f295589e;
            x3Var.f295607e = cVar;
            v05.b k17 = cVar.k();
            int i17 = 0;
            if (k17 != null && (string = k17.getString(k17.f432315e + 44)) != null) {
                if (!(string.length() > 0)) {
                    string = null;
                }
                if (string != null) {
                    s15.w wVar = new s15.w();
                    wVar.fromXml(string);
                    x3Var.f295608f = wVar;
                }
            }
            long j18 = 1000;
            long c17 = (c01.id.c() - 1296000000) / j18;
            s15.w wVar2 = x3Var.f295608f;
            if (wVar2 != null) {
                java.util.LinkedList j19 = wVar2.j();
                int size = j19 != null ? j19.size() : 0;
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS);
                java.util.LinkedList j27 = wVar2.j();
                if (j27 != null) {
                    for (java.lang.Object obj : j27) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        s15.h hVar = (s15.h) obj;
                        hVar.Q();
                        if (hVar.Q() > c17) {
                            j17 = c17;
                            hVar.W0(hVar.Q() - 1296000);
                        } else {
                            j17 = c17;
                        }
                        if (hVar.Q() > 0) {
                            try {
                                java.lang.String format = simpleDateFormat.format(new java.util.Date(hVar.Q() * j18));
                                kotlin.jvm.internal.o.f(format, "format(...)");
                                hVar.T0(format);
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.RepairerRecordMsgDebugUIC", "时间戳转换失败: " + e17);
                            }
                        }
                        hVar.getSourceName();
                        hVar.Q();
                        hVar.O();
                        i17 = i18;
                        c17 = j17;
                    }
                }
                java.lang.String xml2 = wVar2.toXml();
                l15.c cVar2 = x3Var.f295607e;
                v05.b k18 = cVar2 != null ? cVar2.k() : null;
                if (k18 != null) {
                    k18.set(k18.f432315e + 44, xml2);
                }
                l15.c cVar3 = x3Var.f295607e;
                if (cVar3 != null && (xml = cVar3.toXml()) != null) {
                    str = xml;
                }
                f9Var.d1(str);
                pt0.f0.f358209b1.s(f9Var.Q0(), f9Var.getMsgId(), f9Var);
                androidx.appcompat.app.AppCompatActivity activity = x3Var.getActivity();
                int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                e4Var.f211776c = "已将 " + size + " 条子消息的时间修改为15天前";
                e4Var.c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerRecordMsgDebugUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
