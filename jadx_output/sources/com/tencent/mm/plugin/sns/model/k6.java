package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class k6 {

    /* renamed from: f, reason: collision with root package name */
    public static long f164356f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static long f164357g = -1;

    /* renamed from: h, reason: collision with root package name */
    public static int f164358h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static long f164359i = 300000;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f164360j = false;

    /* renamed from: k, reason: collision with root package name */
    public static int f164361k = 60;

    /* renamed from: a, reason: collision with root package name */
    public long f164362a = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f164363b = "";

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f164364c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f164365d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f164366e = new com.tencent.mm.plugin.sns.model.i6(this);

    public boolean a(long j17, int i17, int i18) {
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkRetryTipExpose", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        boolean z17 = false;
        if (!f164360j) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkRetryTipExpose", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            return false;
        }
        long j18 = f164357g;
        if (j18 == -1) {
            long j19 = f164356f;
            if (j19 != -1 && (i19 = f164358h) != 0 && j17 <= j19 && i17 < i19) {
                z17 = true;
            }
            if (z17) {
                f164357g = i18;
            }
        } else if (i18 == j18) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.C().f61300k++;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsRetryEditTipManager", "checkRetryTipExpose: result=%b, snsId=%s, localId=%s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkRetryTipExpose", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        return z17;
    }

    public void b(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goRetryEdit", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        if (!f164360j) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goRetryEdit", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            return;
        }
        this.f164364c = null;
        this.f164365d = "";
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsRetryEditTipManager", "goRetryEdit draftKey:%s", this.f164363b);
        com.tencent.mm.plugin.sns.storage.b2 D0 = com.tencent.mm.plugin.sns.model.l4.Dj().D0(this.f164363b);
        if (D0 != null) {
            byte[] bArr = D0.field_draft;
            if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                try {
                    android.content.Intent intent = (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(obtain);
                    intent.putExtra("Kis_retry_edit", true);
                    java.lang.String stringExtra = intent.getStringExtra("K_with_together_stat");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                        try {
                            com.tencent.mm.plugin.sns.statistics.j0.f164861a.l(new cl0.g(stringExtra));
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SnsRetryEditTipManager", e17.toString());
                        }
                    }
                    intent.putExtra("Kis_from_sns_drafg_stg", true);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/SnsRetryEditTipManager", "goRetryEdit", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/sns/model/SnsRetryEditTipManager", "goRetryEdit", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    d();
                    com.tencent.mm.sdk.platformtools.u3.l(this.f164366e);
                } catch (java.lang.Exception unused) {
                    com.tencent.mm.plugin.sns.model.l4.Dj().J0(this.f164363b, null, 0);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goRetryEdit", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
    }

    public void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareRetryEditInfo", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        if (!f164360j || snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareRetryEditInfo", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsRetryEditTipManager", "prepareRetryEditInfo: start");
        f164357g = -1L;
        f164356f = snsInfo.field_snsId;
        f164358h = snsInfo.field_createTime;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f164362a = java.lang.System.currentTimeMillis();
        this.f164363b = "draft_retry_edit";
        com.tencent.mm.plugin.sns.storage.c2 Dj = com.tencent.mm.plugin.sns.model.l4.Dj();
        int i17 = snsInfo.localid;
        Dj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genRetryEditDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        com.tencent.mm.plugin.sns.storage.b2 D0 = Dj.D0("draft_sent_" + i17);
        if (D0 != null) {
            Dj.J0("draft_retry_edit", D0.field_draft, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genRetryEditDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        com.tencent.mm.sdk.platformtools.u3.i(this.f164366e, f164359i);
        com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(snsInfo);
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        this.f164365d = s0Var.C().f61297h;
        if (e17 != null) {
            this.f164364c = snsInfo;
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct C = s0Var.C();
            C.f61294e = C.b("PublishId", ca4.z0.s0(snsInfo.field_snsId), true);
            s0Var.C().f61295f = e17.LikeCount;
            s0Var.C().f61296g = e17.CommentCount;
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct C2 = s0Var.C();
            C2.f61298i = C2.b("ActionTimeStamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct t17 = s0Var.t();
            t17.f61294e = t17.b("PublishId", ca4.z0.s0(snsInfo.field_snsId), true);
            s0Var.t().f61295f = e17.LikeCount;
            s0Var.t().f61296g = e17.CommentCount;
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct t18 = s0Var.t();
            t18.f61298i = t18.b("ActionTimeStamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsRetryEditTipManager", "prepareRetryEditInfo draftKey:%s", this.f164363b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareRetryEditInfo", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        f164356f = -1L;
        f164358h = 0;
        f164357g = -1L;
        this.f164363b = "";
        this.f164362a = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
    }
}
