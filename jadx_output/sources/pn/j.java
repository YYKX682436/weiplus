package pn;

/* loaded from: classes11.dex */
public final class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f356927d;

    public j(com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f356927d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f356927d.a();
    }
}
