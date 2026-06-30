package dk5;

/* loaded from: classes9.dex */
public class s4 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234878d;

    public s4(com.tencent.mm.ui.transmit.SendAppMessageWrapperUI sendAppMessageWrapperUI, java.lang.String str) {
        this.f234878d = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.String str = this.f234878d;
        if (str.isEmpty()) {
            return;
        }
        com.tencent.mm.vfs.w6.h(str);
    }
}
