package th0;

@j95.b
/* loaded from: classes8.dex */
public class a0 extends i95.w implements sh0.e {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        com.tencent.mm.xwebutil.y0.c();
    }

    public void wi(android.content.Context context) {
        android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.xwebutil.t0(new java.lang.ref.WeakReference(context)));
    }
}
