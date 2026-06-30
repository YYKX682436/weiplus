package fg;

/* loaded from: classes7.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final fg.p0 f261801a = new fg.p0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Collection f261802b = new java.util.LinkedHashSet();

    public final void a(boolean z17) {
        java.util.Iterator it = f261802b.iterator();
        while (it.hasNext()) {
            re.b bVar = (re.b) ((fg.h) it.next());
            bVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewKeyboardHeightEmitter", "canDispatchKeyboardStatusChanged: " + z17);
            bVar.f394265i = z17;
        }
    }
}
