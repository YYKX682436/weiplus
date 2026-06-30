package dt0;

/* loaded from: classes10.dex */
public final class a extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dt0.b f243118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gt0.a f243119b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dt0.b bVar, gt0.a aVar, android.content.Context context) {
        super(context, 3);
        this.f243118a = bVar;
        this.f243119b = aVar;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        ts0.c cVar;
        dt0.b bVar = this.f243118a;
        android.content.Context context = bVar.f243121b;
        char c17 = 0;
        if (context != null) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            int rotation = ((android.app.Activity) context).getWindowManager().getDefaultDisplay().getRotation();
            if (rotation == bVar.f243120a) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PreviewOrientationFit", "last rotation :" + bVar.f243120a + " ,current rotation:" + rotation);
            bVar.f243120a = rotation;
            if (rotation != 0) {
                if (rotation == 1) {
                    c17 = 'Z';
                } else if (rotation == 2) {
                    c17 = 180;
                } else if (rotation == 3) {
                    c17 = 270;
                }
            }
            gt0.a aVar = this.f243119b;
            if (c17 != 0) {
                if (c17 == 180 && (cVar = bVar.f243122c) != null) {
                    ts0.c.f421544d = 90;
                    aVar.getCameraPreviewView().w(cVar);
                    ms0.c cVar2 = at0.t.f13630b;
                    if (cVar2 != null) {
                        cVar2.r(ts0.c.f421544d);
                        return;
                    }
                    return;
                }
                return;
            }
            ts0.c cVar3 = bVar.f243122c;
            if (cVar3 != null) {
                ts0.c.f421544d = 270;
                aVar.getCameraPreviewView().w(cVar3);
                ms0.c cVar4 = at0.t.f13630b;
                if (cVar4 != null) {
                    cVar4.r(ts0.c.f421544d);
                }
            }
        }
    }
}
