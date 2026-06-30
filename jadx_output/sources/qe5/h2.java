package qe5;

/* loaded from: classes12.dex */
public final class h2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f362121d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gp0 f362122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public final void T6(boolean z17) {
        boolean Y6;
        long longExtra = getIntent().getLongExtra("message_id", -1L);
        java.lang.String stringExtra = getIntent().getStringExtra("message_talker");
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(stringExtra, longExtra);
        this.f362121d = java.lang.String.valueOf(getIntent().getStringExtra("record_data_id"));
        r45.gp0 n18 = bt3.g2.n(getIntent().getStringExtra("record_xml"), this.f362121d);
        this.f362122e = n18;
        if (n18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.RecordFileDataUIC", "initData: dataItem is null");
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new kd5.f(false));
                return;
            }
            return;
        }
        j75.f Q62 = Q6();
        kd5.e eVar = Q62 != null ? (kd5.e) Q62.getState() : null;
        if (eVar != null) {
            eVar.f306877e = n17;
            eVar.f306879g = longExtra;
            eVar.f306880h = stringExtra;
            java.lang.String str = n18.K;
            kotlin.jvm.internal.o.f(str, "getDatafmt(...)");
            eVar.f306893x = str;
            java.lang.String t17 = bt3.g2.t(this.f362122e, n17.Q0(), n17.getMsgId(), 1);
            kotlin.jvm.internal.o.f(t17, "getDataPath(...)");
            eVar.F = t17;
            eVar.f306891v = bt3.g2.y(n18.T, stringExtra, longExtra, true);
            java.lang.String str2 = n18.f375404d;
            kotlin.jvm.internal.o.f(str2, "getTitle(...)");
            eVar.f306892w = str2;
            eVar.f306894y = n18.R;
            java.lang.String str3 = n18.M;
            if (str3 == null) {
                str3 = "";
            }
            eVar.f306895z = str3;
            eVar.f306890u = n18.I;
            eVar.D = n18.f375438u;
            eVar.B = n18.f375434s;
            eVar.C = n18.f375411g2;
            eVar.f306881i = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(n17);
            eVar.G = bt3.g2.K(this.f362122e, stringExtra, longExtra);
            eVar.f306884o = true;
            getIntent().getStringExtra("record_xml");
            eVar.f306885p = this.f362121d;
        }
        if (z17) {
            j75.f Q63 = Q6();
            kd5.e eVar2 = Q63 != null ? (kd5.e) Q63.getState() : null;
            if (eVar2 != null && eVar2.G) {
                j75.f Q64 = Q6();
                kd5.e eVar3 = Q64 != null ? (kd5.e) Q64.getState() : null;
                if (eVar3 != null && eVar3.N) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDataUIC", "tryOpenFile: file is uploading");
                    Y6 = true;
                } else {
                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                    kotlin.jvm.internal.o.g(activity, "activity");
                    Y6 = ((qe5.h) pf5.z.f353948a.a(activity).a(qe5.h.class)).Y6();
                }
                if (!Y6) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDataUIC", "initData: open file succeed");
                    com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
                    if (P6 != null) {
                        P6.finish();
                    }
                    j75.f Q65 = Q6();
                    if (Q65 != null) {
                        Q65.B3(new kd5.f(false));
                        return;
                    }
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.File.RecordFileDataUIC", "initData: open file failed");
                androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                if (((com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC) pf5.z.f353948a.a(activity2).a(com.tencent.mm.ui.chatting.uic.file.FilePreviewUIC.class)).W6()) {
                    com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
                    if (P62 != null) {
                        P62.finish();
                        return;
                    }
                    return;
                }
            }
        }
        j75.f Q66 = Q6();
        if (Q66 != null) {
            Q66.B3(new kd5.f(true));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new qe5.g2(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        T6(true);
    }
}
