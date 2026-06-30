package e04;

/* loaded from: classes.dex */
public final class h2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f245951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245952e;

    public h2(android.content.Context context, java.lang.String str) {
        this.f245951d = context;
        this.f245952e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context = this.f245951d;
        java.lang.String str = this.f245952e;
        com.tencent.mm.sdk.platformtools.b0.d(context, str, str, null);
    }
}
