package rl2;

/* loaded from: classes10.dex */
public class l extends be2.i {

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f397203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l75.k0 k0Var) {
        super(k0Var, ce2.l.Q, "FinderLiveNotifyExposureInfo", dm.r4.f239608w);
        l75.e0 e0Var = ce2.l.Q;
        this.f397203e = k0Var;
    }

    public ce2.l D0(java.lang.String str) {
        android.database.Cursor B = this.f397203e.B("select *, rowid from FinderLiveNotifyExposureInfo where revokeId = '" + str + "'", null);
        ce2.l lVar = new ce2.l();
        lVar.field_revokeId = str;
        if (B != null) {
            if (B.moveToFirst()) {
                lVar.convertFrom(B);
            }
            B.close();
        }
        return lVar;
    }

    public java.util.ArrayList J0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ae2.in inVar = ae2.in.f3688a;
        long intValue = ((java.lang.Integer) ((lb2.j) ((jz5.n) ae2.in.f3714c5).getValue()).r()).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "[getLast48HourItem] duration = " + intValue);
        android.database.Cursor B = this.f397203e.B("select *, rowid from FinderLiveNotifyExposureInfo where insertTime > " + (((long) c01.id.e()) - intValue), null);
        while (B.moveToNext()) {
            ce2.l lVar = new ce2.l();
            lVar.convertFrom(B);
            arrayList.add(lVar);
        }
        B.close();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            sb6.append(((ce2.l) arrayList.get(i17)).field_tipsId);
            sb6.append(",");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "[getLast48HourItem] result = " + ((java.lang.Object) sb6));
        return arrayList;
    }

    public void L0(long j17, int i17) {
        ce2.l z07 = z0(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "updateLiveStatus ,msgId = " + j17 + ", liveStatus = " + i17);
        if (z07.systemRowid != -1) {
            z07.field_liveStatus = i17;
            updateNotify(z07, false, new java.lang.String[0]);
        }
    }

    public boolean y0(long j17) {
        ce2.l z07 = z0(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "[delByMsgId] msgId = " + j17 + ",tipsId = " + z07.field_tipsId);
        long j18 = z07.systemRowid;
        if (j18 != -1) {
            return deleteNotify(j18, false);
        }
        return false;
    }

    public ce2.l z0(long j17) {
        android.database.Cursor B = this.f397203e.B("select *, rowid from FinderLiveNotifyExposureInfo where msgId = " + j17, null);
        ce2.l lVar = new ce2.l();
        lVar.field_msgId = j17;
        if (B != null) {
            if (B.moveToFirst()) {
                lVar.convertFrom(B);
            }
            B.close();
        }
        return lVar;
    }
}
