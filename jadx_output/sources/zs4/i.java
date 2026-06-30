package zs4;

/* loaded from: classes9.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f475293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zs4.q f475294e;

    public i(zs4.q qVar, int i17) {
        this.f475294e = qVar;
        this.f475293d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.r1.r0(1, 1, com.tencent.mm.sdk.platformtools.t8.i1(), this.f475293d);
        this.f475294e.c(1, -1, "cancel", false);
    }
}
