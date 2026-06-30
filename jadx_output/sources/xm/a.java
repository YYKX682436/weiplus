package xm;

/* loaded from: classes11.dex */
public class a implements com.tencent.mm.sdk.platformtools.a4 {
    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.util.Map map = xm.c.f455143c;
        synchronized (map) {
            ((java.util.HashMap) map).clear();
        }
        return false;
    }
}
