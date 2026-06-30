package cw3;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f224153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.view.BehaviorStatusView f224154e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, com.tencent.mm.plugin.recordvideo.ui.editor.view.BehaviorStatusView behaviorStatusView) {
        super(0);
        this.f224153d = context;
        this.f224154e = behaviorStatusView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.loading.MMProgressLoading mMProgressLoading = new com.tencent.mm.ui.widget.loading.MMProgressLoading(this.f224153d);
        int i17 = this.f224154e.f156432f.f224161e;
        mMProgressLoading.f212182h = 0;
        mMProgressLoading.f212179e = i17;
        mMProgressLoading.f212180f = 100;
        mMProgressLoading.f212181g = -90;
        mMProgressLoading.invalidate();
        return mMProgressLoading;
    }
}
