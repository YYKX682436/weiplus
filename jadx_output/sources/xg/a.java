package xg;

/* loaded from: classes7.dex */
public class a extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager f454345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xg.c f454346b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xg.c cVar, android.content.Context context, android.view.WindowManager windowManager) {
        super(context);
        this.f454346b = cVar;
        this.f454345a = windowManager;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        int rotation = this.f454345a.getDefaultDisplay().getRotation();
        xg.c cVar = this.f454346b;
        if (cVar.f454348b == rotation) {
            return;
        }
        java.util.Iterator it = cVar.f454350d.iterator();
        while (it.hasNext()) {
            ((xg.b) it.next()).onDisplayOrientationChanged(rotation);
        }
        cVar.f454348b = rotation;
    }
}
