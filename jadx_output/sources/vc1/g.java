package vc1;

/* loaded from: classes13.dex */
public class g implements com.tencent.tencentmap.mapsdk.map.CancelableCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434966a;

    public g(vc1.p1 p1Var) {
        this.f434966a = p1Var;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.CancelableCallback
    public void onCancel() {
        vc1.p1 p1Var = this.f434966a;
        ((java.util.LinkedList) p1Var.S).poll();
        if (p1Var.S.isEmpty()) {
            return;
        }
        ((java.lang.Runnable) ((java.util.LinkedList) p1Var.S).peek()).run();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.CancelableCallback
    public void onFinish() {
        vc1.p1 p1Var = this.f434966a;
        ((java.util.LinkedList) p1Var.S).poll();
        if (p1Var.S.isEmpty()) {
            return;
        }
        ((java.lang.Runnable) ((java.util.LinkedList) p1Var.S).peek()).run();
    }
}
