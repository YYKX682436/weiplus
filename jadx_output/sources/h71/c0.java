package h71;

/* loaded from: classes14.dex */
public class c0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f279382d;

    public c0(h71.d0 d0Var, com.tencent.mm.modelbase.m1 m1Var) {
        this.f279382d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f279382d);
    }
}
