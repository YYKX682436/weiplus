package gm;

@j95.b
/* loaded from: classes4.dex */
public class b extends i95.w implements gm.l {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        gm.a R6 = gm.a.R6();
        R6.getClass();
        boolean O6 = R6.O6(gm0.j1.u().h() + "Basis-1.db");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create basisDB result: ");
        sb6.append(O6);
        com.tencent.mars.xlog.Log.i("MicroMsg.BasisDBService", sb6.toString());
    }
}
