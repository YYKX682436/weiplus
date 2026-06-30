package u20;

/* loaded from: classes9.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w05.h f423950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u20.y f423951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f423952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w05.h hVar, u20.y yVar, android.content.Context context) {
        super(1);
        this.f423950d = hVar;
        this.f423951e = yVar;
        this.f423952f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.x7 x7Var = (bw5.x7) obj;
        if (x7Var != null) {
            try {
                java.lang.String encodeToString = android.util.Base64.encodeToString(x7Var.toByteArray(), 2);
                w05.h hVar = this.f423950d;
                kotlin.jvm.internal.o.d(encodeToString);
                hVar.K(encodeToString);
                com.tencent.mars.xlog.Log.i("EcsShareToContactLogicWAAPPMsg", "requestCardJumpInfoAndForward: jumpInfo set to ecsJumpInfoBase64");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("EcsShareToContactLogicWAAPPMsg", "requestCardJumpInfoAndForward: failed to serialize jumpInfo: " + e17);
            }
        } else {
            com.tencent.mars.xlog.Log.i("EcsShareToContactLogicWAAPPMsg", "requestCardJumpInfoAndForward: jumpInfo is null, use original ecsJumpInfoBase64");
        }
        u20.y yVar = this.f423951e;
        android.content.Context context = this.f423952f;
        if (yVar.f423953d != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new u20.t(yVar, context));
        }
        return jz5.f0.f302826a;
    }
}
