package vj5;

/* loaded from: classes7.dex */
public class f extends android.content.MutableContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f437694c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f437695a;

    /* renamed from: b, reason: collision with root package name */
    public vj5.e f437696b;

    public f(android.content.MutableContextWrapper mutableContextWrapper) {
        super(mutableContextWrapper);
        this.f437695a = true;
    }

    @Override // android.content.MutableContextWrapper
    public void setBaseContext(android.content.Context context) {
        if (!this.f437695a) {
            super.setBaseContext(context);
            return;
        }
        if (context == getBaseContext()) {
            return;
        }
        ((android.content.MutableContextWrapper) getBaseContext()).setBaseContext(context);
        vj5.e eVar = this.f437696b;
        if (eVar != null) {
            vj5.c cVar = (vj5.c) eVar;
            cVar.getClass();
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            android.os.Looper myLooper = android.os.Looper.myLooper();
            vj5.h hVar = cVar.f437691a;
            if (mainLooper == myLooper) {
                ((vj5.b) hVar.f437701d).run();
                return;
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(hVar)) {
                hVar.post(hVar.f437701d);
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(hVar.f437701d);
            }
        }
    }
}
