package nf4;

/* loaded from: classes4.dex */
public final class i extends l75.n0 implements l75.q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f336855e = {l75.n0.getCreateSQLs(nf4.h.f336853q, "MMStoryHistoryItem")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f336856f = "select * from MMStoryHistoryItem ";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f336857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l75.k0 db6) {
        super(db6, nf4.h.f336853q, "MMStoryHistoryItem", dm.y7.f241212g);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = nf4.h.f336853q;
        this.f336857d = db6;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
    }

    public final nf4.h y0(java.lang.String date) {
        kotlin.jvm.internal.o.g(date, "date");
        android.database.Cursor B = this.f336857d.B(f336856f + " WHERE MMStoryHistoryItem.date = '" + date + '\'', null);
        if (!B.moveToFirst()) {
            B.close();
            return null;
        }
        nf4.h hVar = new nf4.h();
        hVar.convertFrom(B);
        B.close();
        return hVar;
    }

    public final boolean z0(nf4.h storyHistoryInfo) {
        kotlin.jvm.internal.o.g(storyHistoryInfo, "storyHistoryInfo");
        android.database.Cursor B = this.f336857d.B(f336856f + " WHERE MMStoryHistoryItem.date = '" + storyHistoryInfo.t0() + '\'', null);
        int count = B.getCount();
        B.close();
        return count > 0 ? update(storyHistoryInfo, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_DATE) : super.replace(storyHistoryInfo);
    }
}
