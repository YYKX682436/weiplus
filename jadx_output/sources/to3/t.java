package to3;

/* loaded from: classes9.dex */
public class t implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f420981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ to3.u f420982e;

    public t(to3.u uVar, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f420982e = uVar;
        this.f420981d = mMActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        to3.v vVar = this.f420982e.f420983c;
        vVar.o(this.f420981d, 0, vVar.f213801c);
    }
}
