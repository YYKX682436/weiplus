package hr3;

/* loaded from: classes11.dex */
public class ug implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.m3 f284090d;

    public ug(hr3.sg sgVar, com.tencent.mm.pluginsdk.model.m3 m3Var) {
        this.f284090d = m3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f284090d);
    }
}
