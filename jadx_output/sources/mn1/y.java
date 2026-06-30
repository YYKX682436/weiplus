package mn1;

/* loaded from: classes12.dex */
public class y implements kn1.l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f329893a = false;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f329894b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final kn1.c f329895c = new mn1.w(this);

    public y() {
        new mn1.z(new mn1.x(this), mn1.d.i().e());
    }

    @Override // kn1.l
    public void a(int i17, long j17, long j18, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveServer", "setBakupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i18));
        if (i17 == 0) {
            j17 = 0;
            j18 = 0;
        }
        mn1.d.i();
        android.content.SharedPreferences.Editor edit = kn1.f.d().edit();
        edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", i17);
        edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", j17);
        edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", j18);
        edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", i18);
        edit.commit();
    }
}
