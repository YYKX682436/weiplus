package hr3;

/* loaded from: classes11.dex */
public class ci implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.m3 f283459d;

    public ci(hr3.ai aiVar, com.tencent.mm.pluginsdk.model.m3 m3Var) {
        this.f283459d = m3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f283459d);
    }
}
