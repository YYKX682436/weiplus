package s23;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.e f402301d = new s23.e();

    public e() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        if (z65.c.a() && longValue != s23.n.f402325w) {
            java.lang.ref.WeakReference weakReference = s23.n.f402326x;
            if (weakReference == null) {
                kotlin.jvm.internal.o.o("context");
                throw null;
            }
            android.content.Context context = (android.content.Context) weakReference.get();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = "DEBUG:Maas EventType Update " + longValue;
            e4Var.c();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateHandleNew", "onTipsEntranceEventTypeUpdate from " + s23.n.f402325w + " to " + longValue);
        s23.n.f402325w = longValue;
        return jz5.f0.f302826a;
    }
}
