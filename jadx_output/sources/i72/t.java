package i72;

/* loaded from: classes4.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.views.FaceNumberItemView f289438d;

    public t(com.tencent.mm.plugin.facedetect.views.FaceNumberItemView faceNumberItemView) {
        this.f289438d = faceNumberItemView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.facedetect.views.FaceNumberItemView faceNumberItemView = this.f289438d;
        int i17 = faceNumberItemView.f100140i;
        if (i17 > 30) {
            faceNumberItemView.f100135d.e();
        } else {
            faceNumberItemView.f100140i = i17 + 1;
            faceNumberItemView.invalidate();
        }
    }
}
