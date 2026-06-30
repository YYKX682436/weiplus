package p03;

@j95.b
/* loaded from: classes.dex */
public final class e extends i95.w implements f50.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f350427d;

    public e() {
        kotlinx.coroutines.z0.b();
        this.f350427d = new java.util.LinkedList();
    }

    public void wi() {
        java.util.Iterator it = this.f350427d.iterator();
        while (it.hasNext()) {
            com.tencent.pigeon.settings.FlutterSettingCallback flutterSettingCallback = ((q03.b) ((f50.b0) it.next())).f359365e;
            if (flutterSettingCallback != null) {
                flutterSettingCallback.updateAvatar(q03.a.f359363d);
            }
        }
    }
}
