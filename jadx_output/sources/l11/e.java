package l11;

@j95.b
/* loaded from: classes8.dex */
public class e extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.n3 f314974d;

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = f314974d;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mm.sdk.platformtools.n3 n3Var = f314974d;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
    }
}
