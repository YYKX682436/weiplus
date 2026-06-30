package ll0;

/* loaded from: classes11.dex */
public class a implements com.tencent.mm.sdk.platformtools.a4 {
    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.util.Map map = ll0.c.f319120c;
        synchronized (map) {
            ((java.util.HashMap) map).clear();
        }
        return false;
    }
}
