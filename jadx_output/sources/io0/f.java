package io0;

/* loaded from: classes3.dex */
public final class f extends com.tencent.mm.ui.widget.RoundCornerRelativeLayout {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.rtmp.ui.TXCloudVideoView f293451f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = new com.tencent.rtmp.ui.TXCloudVideoView(context);
        this.f293451f = tXCloudVideoView;
        addView(tXCloudVideoView, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public final com.tencent.rtmp.ui.TXCloudVideoView getVideoView() {
        return this.f293451f;
    }
}
