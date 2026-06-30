package sb4;

/* loaded from: classes4.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI f405500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb4.h0 f405501e;

    public g0(sb4.h0 h0Var, com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI) {
        this.f405501e = h0Var;
        this.f405500d = snsWsFoldDetailUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = "run";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
        com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI = this.f405500d;
        if (snsWsFoldDetailUI.f167642y) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
            return;
        }
        if (snsWsFoldDetailUI.f167632o != null) {
            android.database.Cursor S1 = com.tencent.mm.plugin.sns.model.l4.Fj().S1(snsWsFoldDetailUI.f167632o, ca4.z0.s0(snsWsFoldDetailUI.f167630m), ca4.z0.s0(snsWsFoldDetailUI.f167631n));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (S1 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsWsFoldDetailAdapter", "cursor == null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                return;
            }
            if (!S1.moveToFirst()) {
                S1.close();
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsWsFoldDetailAdapter", "cursor.moveToFirst == false");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                return;
            }
            if (snsWsFoldDetailUI.f167642y) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                return;
            }
            do {
                try {
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                    snsInfo.convertFrom(S1);
                    arrayList.add(snsInfo);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    str = str2;
                }
            } while (S1.moveToNext());
            int size = arrayList.size();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) it.next();
                int i18 = size;
                java.util.Iterator it6 = it;
                str = str2;
                try {
                    arrayList2.add(ca4.z0.D0(snsInfo2, com.tencent.mm.plugin.sns.model.s5.e(snsInfo2), this.f405500d, this.f405501e.a(), i17 < size, snsWsFoldDetailUI.f167627g, snsWsFoldDetailUI.f167634q, snsWsFoldDetailUI.f167636s, snsWsFoldDetailUI.f167637t, snsWsFoldDetailUI.f167638u));
                    i17++;
                    size = i18;
                    it = it6;
                    str2 = str;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    S1.close();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                    throw th;
                }
            }
            str = str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDetailAdapter", "loadData finish, snsInfoList.size:%s, structlist.size:%s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(arrayList2.size()));
            com.tencent.mm.plugin.sns.model.l4.Tj().post(new sb4.f0(this, arrayList2));
            S1.close();
            str2 = str;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
    }
}
