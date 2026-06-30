package m20;

/* loaded from: classes11.dex */
public final class a implements com.tencent.pigeon.ecs.EcsFinderFeedNativeApi {

    /* renamed from: a, reason: collision with root package name */
    public yz5.l f322965a;

    @Override // com.tencent.pigeon.ecs.EcsFinderFeedNativeApi
    public void onClickFeedback(double d17, double d18, double d19, double d27) {
        android.graphics.Rect rect = new android.graphics.Rect((int) d17, (int) d18, (int) (d17 + d19), (int) (d18 + d27));
        com.tencent.mars.xlog.Log.i("EcsFinderFeedNativeApiImpl", "onClickFeedback: rect=" + rect);
        yz5.l lVar = this.f322965a;
        if (lVar != null) {
            lVar.invoke(rect);
        }
    }
}
