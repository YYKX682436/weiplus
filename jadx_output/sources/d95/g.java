package d95;

/* loaded from: classes12.dex */
public class g extends com.tencent.wcdb.database.SQLiteAsyncCheckpointer {
    @Override // com.tencent.wcdb.database.SQLiteAsyncCheckpointer
    public void onCheckpointResult(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, int i17, int i18, long j17) {
        int i19 = i17 == i18 ? 18 : 21;
        d95.f.f227673s.b(i19 + 1, i19 + 2, j17);
        sQLiteDatabase.getPath();
    }
}
