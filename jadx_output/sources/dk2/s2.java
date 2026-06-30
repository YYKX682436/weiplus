package dk2;

/* loaded from: classes.dex */
public final class s2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234057d;

    public s2(dk2.r4 r4Var) {
        this.f234057d = r4Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mars.xlog.Log.i(this.f234057d.f234009d, "goQQMusic cancel");
    }
}
