package lu1;

/* loaded from: classes3.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f321351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f321352e;

    public k(boolean z17, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f321351d = z17;
        this.f321352e = mMActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        if (this.f321351d) {
            this.f321352e.finish();
        }
    }
}
