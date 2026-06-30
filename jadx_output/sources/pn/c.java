package pn;

/* loaded from: classes11.dex */
public final class c implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f356916d;

    public c(com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f356916d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f356916d.a();
    }
}
