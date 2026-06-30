package to3;

/* loaded from: classes9.dex */
public class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f420978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f420979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ to3.u f420980f;

    public s(to3.u uVar, com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        this.f420980f = uVar;
        this.f420978d = mMActivity;
        this.f420979e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = this.f420979e;
        com.tencent.mm.ui.MMActivity mMActivity = this.f420978d;
        h45.a0.c(mMActivity, i18);
        to3.v vVar = this.f420980f.f420983c;
        vVar.o(mMActivity, 0, vVar.f213801c);
    }
}
