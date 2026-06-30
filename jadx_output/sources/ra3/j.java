package ra3;

/* loaded from: classes5.dex */
public class j implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f393519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.e[] f393520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f393521f;

    public j(boolean[] zArr, com.tencent.mm.plugin.lite.ui.e[] eVarArr, long j17) {
        this.f393519d = zArr;
        this.f393520e = eVarArr;
        this.f393521f = j17;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.f393519d[0]) {
            this.f393520e[0] = null;
            ra3.m.f393522a.remove(java.lang.Long.valueOf(this.f393521f));
        }
    }
}
