package wz1;

/* loaded from: classes12.dex */
public class j implements com.tencent.wcdb.repair.RepairKit.Callback {

    /* renamed from: a, reason: collision with root package name */
    public int f450757a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f450758b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f450759c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f450760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wz1.i f450761e;

    public j(wz1.i iVar, int[] iArr) {
        this.f450761e = iVar;
        this.f450760d = iArr;
    }

    @Override // com.tencent.wcdb.repair.RepairKit.Callback
    public int onProgress(java.lang.String str, int i17, android.database.Cursor cursor) {
        int i18 = this.f450757a;
        wz1.i iVar = this.f450761e;
        if (i18 == 0) {
            if (!str.equalsIgnoreCase(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
                return 0;
            }
            this.f450757a = i17;
        } else if (i18 != i17) {
            if (!this.f450759c) {
                this.f450759c = true;
                iVar.publishProgress(3);
            }
            return 0;
        }
        int i19 = this.f450758b;
        this.f450758b = i19 + 1;
        if (i19 % 1000 == 0) {
            iVar.publishProgress(2, java.lang.Integer.valueOf(this.f450758b - 1), java.lang.Integer.valueOf(iVar.f450725q));
        }
        int[] iArr = this.f450760d;
        iArr[0] = iArr[0] + 1;
        return 0;
    }
}
