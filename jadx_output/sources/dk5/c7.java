package dk5;

/* loaded from: classes12.dex */
public class c7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.ShareImageSelectorUI f234571d;

    public c7(com.tencent.mm.ui.transmit.ShareImageSelectorUI shareImageSelectorUI) {
        this.f234571d = shareImageSelectorUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f234571d.finish();
    }
}
