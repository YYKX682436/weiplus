package sz1;

/* loaded from: classes9.dex */
public class h implements com.tencent.mm.sdk.platformtools.k3 {
    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        java.util.Iterator it = ((java.util.ArrayList) sz1.i.f413942c).iterator();
        boolean z17 = false;
        while (it.hasNext() && !(z17 = ((com.tencent.mm.sdk.platformtools.k3) it.next()).handleMessage(message))) {
        }
        return z17;
    }
}
