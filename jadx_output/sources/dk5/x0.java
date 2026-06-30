package dk5;

/* loaded from: classes.dex */
public class x0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f234983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.MMCreateChatroomUI f234984e;

    public x0(com.tencent.mm.ui.transmit.MMCreateChatroomUI mMCreateChatroomUI, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f234984e = mMCreateChatroomUI;
        this.f234983d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f234984e.I = false;
        this.f234983d.a();
    }
}
