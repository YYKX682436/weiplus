package z85;

/* loaded from: classes12.dex */
public class b0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f470784e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.emotion.SmileyInfo.F, "SmileyInfo")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f470785f = {"key", "cnValue", "qqValue", "enValue", "twValue", "thValue", "eggIndex", com.tencent.tmassistantsdk.downloadservice.DownloadInfo.FILENAME};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f470786d;

    public b0(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.emotion.SmileyInfo.F, "SmileyInfo", null);
        this.f470786d = k0Var;
    }

    public boolean y0(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.NewSmileyInfoStorage", "insertSmileyInfoList failed. list is null.");
            return false;
        }
        l75.k0 k0Var = this.f470786d;
        long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : -1L;
        k0Var.delete("SmileyInfo", null, null);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            insert((com.tencent.mm.storage.emotion.SmileyInfo) it.next());
        }
        return (k0Var != null ? k0Var.w(java.lang.Long.valueOf(F)) : -1) >= 0;
    }
}
