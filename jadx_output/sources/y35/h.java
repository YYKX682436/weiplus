package y35;

/* loaded from: classes11.dex */
public class h implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.m3 f459213d;

    public h(y35.d dVar, com.tencent.mm.pluginsdk.model.m3 m3Var) {
        this.f459213d = m3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f459213d);
    }
}
